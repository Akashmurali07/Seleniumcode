package Main;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class WebTable {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium training\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/table");
		
		//Finding the table and printing the table header text
		WebElement Table = driver.findElement(By.id("simpletable"));
		List<WebElement> Headers = Table.findElements(By.tagName("th")); //Finding the header values
		for (WebElement AllHeaders : Headers) {
			System.out.println(AllHeaders.getText());
		}
		
		
		//Printing the size of the row exclude header
		List<WebElement> allrows = Table.findElements(By.cssSelector("tbody tr")); //Focusing the body of the table
		int size = allrows.size();
		System.out.println("Row size : " + size);
		if(size == 3) {
			System.out.println("Same Size Passed");
		}else 
			System.out.println("Same Size Failed");
		
		
		//Printing the first column of every row
		for (WebElement firstrows : allrows) {    
		    List<WebElement> Firstcolumn = firstrows.findElements(By.tagName("td")); //Printing the first column
			WebElement column = Firstcolumn.get(0);
			System.out.println(column.getText());
		}
		
		
		//Finding the name Raj and marking as present
		for (int i = 0; i < size; i++) {
			List<WebElement> rows = allrows.get(i).findElements(By.tagName("td"));
			WebElement lastname = rows.get(1);
			String text = lastname.getText();
			System.out.println(text);
			if(text.equals("Raj")) {
				WebElement checkbox = rows.get(3).findElement(By.tagName("input"));
				checkbox.click();
				break;
			}
			
			
		}
		
	}

}
