package Main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium training\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/buttons");
		
		//Printing the current URL
		String buttonURL = driver.getCurrentUrl();
		System.out.println("Button URL is" + buttonURL);
		
		//clicking the homepage
		driver.findElement(By.id("home")).click();
		
		String HomeURL = driver.getCurrentUrl();
		System.out.println("Home URL is " + HomeURL);
		
		//Slow down the automation output action
		Thread.sleep(3000);
		
		//back
		driver.navigate().back();
		
		String returnURL = driver.getCurrentUrl();
		System.out.println("Return URL is " + returnURL);
		
		//Refresh
		driver.navigate().refresh();
		
		//Navigate to particular URL
		driver.navigate().to("https://letcode.in/signin");
		
		//Close
		driver.close();

	}

}
