package FrameworksNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Sample1 {

		@Test(invocationCount = 2, invocationTimeOut = 1000000)
		public void findElements () {
			
			
			System.getProperty("wedriver.chrome.driver", "D:\\Selenium training\\chromedriver\\chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("https://www.google.com/");
			
			driver.findElement(By.name("q")).sendKeys("cricket", Keys.ENTER );
			
			List<WebElement> Allcricket = driver.findElements(By.xpath("//*[contains(text(), 'cricket') or contains(text(), 'Cricket')]"));
			
			System.out.println(Allcricket.size());
			
			driver.quit();

		}

	}
