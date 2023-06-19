package Main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Login {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		
		//System.setProperty("webdriver.chrome.driver", "D:\\Selenium training\\chromedriver\\chromedriver.exe");
		
		Properties properties = new Properties();                        //Properties File
		properties.load(new FileInputStream("./locators.properties"));
		
		ChromeOptions Options = new ChromeOptions();
		Options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(Options);
		
		driver.get("https://letcode.in/");
		
		driver.findElement(By.linkText("Log in")).click();
		
		driver.findElement(By.name("email")).sendKeys(properties.getProperty("email"));
		
		driver.findElement(By.name("password")).sendKeys(properties.getProperty("password"));
	
		driver.findElement(By.xpath("//button[.='LOGIN']")).click();
		
		System.out.println(driver.getCurrentUrl());

	}

}
