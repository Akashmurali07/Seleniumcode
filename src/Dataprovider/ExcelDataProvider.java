package Dataprovider;

import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {

	public static String[][] getexceldata() {
		
		String filelocation = "./test-data/Login-data.xlsx";
		XSSFWorkbook Ebook = null;
		try {
			Ebook = new XSSFWorkbook(filelocation);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}                                 
			XSSFSheet sheet = Ebook.getSheetAt(0);
			
			int Rowcount = sheet.getLastRowNum();					  //used to get the row value without the header row
			System.out.println("Rowcount : " +Rowcount);
			
			int Fullrowcount = sheet.getPhysicalNumberOfRows(); 	  //Used to get the row value with the header row value	
			System.out.println("Full row count : " + Fullrowcount);
			
			short Cellcount = sheet.getRow(0).getLastCellNum();		  //Used to move attention to last value in the cell
			System.out.println("Cell Count : " +Cellcount);
			
			String[][] data = new String[Rowcount][Cellcount];
			
			for (int j = 1; j <= Rowcount; j++) {                     //Calling a forloop to run the row 
				XSSFRow row = sheet.getRow(j);
				for (int k = 0; k < Cellcount; k++) {                 //Calling a forloop to run the cell
					XSSFCell cell = row.getCell(k);
					DataFormatter dft = new DataFormatter();          //Dataformatter as constructor used to covert int to string
					String Value = dft.formatCellValue(cell);		  //FormatCellValue is to pass the int value to change to string	
					//String GetCell = cell.getStringCellValue();
					//System.out.println(Value);
					
					data[j-1][k] = Value;

				}
			} 
			
			try {
				Ebook.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return data;
		}
		
	}

