package Utils;

//import java.io.IOException;

import org.testng.annotations.DataProvider;

import Dataprovider.ExcelDataProvider;
//import FrameworksNG.LearnDataProvider;

public class DataUtils {

	@DataProvider(/* , indices = {0,2}*/ parallel = true )
	public String[][] getData() {

		String[][] Exceldata = ExcelDataProvider.getexceldata();

		/*
		 * data[0][0] = "akashmurali05@gmail.com"; data[0][1] = "Jarvisdood@07";
		 * //data[0][2] = "sample1";
		 * 
		 * data[1][0] = "akashajith07@gmail.com"; data[1][1] = "akashmurali05";
		 * //data[1][2] = "sample2";
		 */

		return Exceldata;

	}

}
