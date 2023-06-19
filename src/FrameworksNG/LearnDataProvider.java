package FrameworksNG;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
/*import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;*/
import org.testng.annotations.Test;

import Utils.DataUtils;

public class LearnDataProvider { // We can use "Extends DataUtils" also

	// @Parameters({"email"})
	@Test(dataProvider = "getData", dataProviderClass = DataUtils.class) // To fetch info/code from other class
	public void letCodelogin(String data[]) {
		

		System.out.println("id :" + data[0]);
		System.out.println("mail :" + data[1]);
		// System.err.println("password :" +data[2]);

		
		  System.setProperty("webdriver.chrome.driver","D:\\Selenium training\\Chrome webdriver\\chromedriver.exe");
		  ChromeOptions Options = new ChromeOptions();
		  Options.addArguments("--remote-allow-origins=*");
		  ChromeDriver driver = new ChromeDriver(Options); 
		  driver.get("https://letcode.in/");
		  
		  driver.findElement(By.linkText("Log in")).click();
		  
		  driver.findElement(By.name("email")).sendKeys(data[0]);
		  
		  driver.findElement(By.name("password")).sendKeys(data[1]);
		  
		  driver.findElement(By.xpath("//button[.='LOGIN']")).click();
		  
		  System.out.println(driver.getCurrentUrl());
		 

		// driver.quit();

	}
}
