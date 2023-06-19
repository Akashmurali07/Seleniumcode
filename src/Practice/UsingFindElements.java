package Practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingFindElements {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		
		System.getProperty("wedriver.chrome.driver", "D:\\Selenium training\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("cricket", Keys.ENTER );
		
		List<WebElement> Allcricket = driver.findElements(By.xpath("//*[contains(text(), 'cricket') or contains(text(), 'Cricket')]"));
		
		System.out.println(Allcricket.size());
		
		driver.quit();

	}

}
