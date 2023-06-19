package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class ExplicityWaitFlipkart {

	public static void main(String[] args) {
		
		
		System.setProperty("Webdriver.chrome.driver", "D:\\Selenium training\\chromedriver\\chromedriver.exe");
		ChromeOptions Options = new ChromeOptions();
		Options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(Options);
//		driver.get("https://www.flipkart.com/");
//		
//		driver.findElement(By.xpath("//button[.='✕']")).click();
//		WebElement electric =  driver.findElement(By.xpath("//div[.='Electronics']"));
//		Actions builder = new Actions(driver);
//		builder.moveToElement(electric).perform();
//		driver.findElement(By.linkText("Electronics GST Store")).click();
		
		
		driver.get("https://www.flipkart.com/apple-products-store?otracker=nmenu_sub_Electronics_0_Apple&otracker=nmenu_sub_Electronics_0_Apple&otracker=nmenu_sub_Electronics_0_Apple&otracker=nmenu_sub_Electronics_0_Apple&otracker=nmenu_sub_Electronics_0_Apple&otracker=nmenu_sub_Electronics_0_Apple");
		WebElement Mobiles = driver.findElement(By.xpath("//span[.='Men']"));
		Actions Object = new Actions(driver);
		Object.moveToElement(Mobiles).perform();
		driver.findElement(By.linkText("Jackets")).click();
		
		
	}

}
