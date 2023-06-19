package FrameworksNG;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Parameters {
	RemoteWebDriver driver;
	@org.testng.annotations.Parameters({"email", "password", "Browser"})
	@Test
	public void Param(String mail, String Pass, String browser) {
		
		switch (browser) {
		case "chrome":
			driver = new ChromeDriver();
			break;

		case "firefox":
			driver = new FirefoxDriver();
			break;
			
		default:
			System.out.println("Nothing is there");
			break;
		}
		
		driver.get("https://letcode.in/");
		
		driver.findElement(By.linkText("Log in")).click();
		
		driver.findElement(By.name("email")).sendKeys(mail);
		
		driver.findElement(By.name("password")).sendKeys(Pass);
	
		driver.findElement(By.xpath("//button[.='LOGIN']")).click();
		
		
		//driver.close();
		

	}

}
