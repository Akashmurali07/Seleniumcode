package Main;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopups {

	public static void main(String[] args) {
		
		System.setProperty("WebDriver.chrome.driver", "D:\\Selenium training\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/alert");
		
		//Simple alert
		driver.findElement(By.id("accept")).click();
		Alert simplealert = driver.switchTo().alert();
		String text = simplealert.getText();
		System.out.println(text);
		simplealert.accept();
		
		//Confirm alert
		driver.findElement(By.id("confirm")).click();
		driver.switchTo().alert().dismiss();
		
		//Prompt alert
		driver.findElement(By.id("prompt")).click();
		Alert promptalert = driver.switchTo().alert();
		promptalert.sendKeys("Akash");
		promptalert.accept();
		
		String finaltext = driver.findElement(By.id("myName")).getText();
		System.out.println(finaltext);
		
		

	}

}
