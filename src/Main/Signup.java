package Main;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Signup {

	public static void main(String[] args) {
		
		
		//System.setProperty("webdriver.chrome.driver", "D:\\Selenium training\\chromedriver\\chromedriver.exe");
		ChromeOptions Options = new ChromeOptions();
		Options.addArguments("--remote-allow-origins=*");
		
		ChromeDriver driver = new ChromeDriver(Options);
		driver.get("https://letcode.in");
		
		driver.findElement(By.linkText("Sign up")).click();
		
		driver.findElement(By.id("name")).sendKeys("akashmurali");
		
		driver.findElement(By.id("email")).sendKeys("porambokuraja@gmail.com");
		
		driver.findElement(By.id("pass")).sendKeys("Jarvisdood@07");
		
		driver.findElement(By.id("agree")).click();
		
		driver.findElement(By.xpath("//button[.='SIGN UP']")).click();
		

	}

}
