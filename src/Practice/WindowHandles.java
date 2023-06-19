package Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		System.getProperty("wedriver.chrome.driver", "D:\\Selenium training\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://letcode.in/windows");
		
		driver.findElement(By.id("home")).click();
		
		Set<String> HomeWindow = driver.getWindowHandles();
		List<String> mylist = new ArrayList<String>(HomeWindow);
		driver.switchTo().window(mylist.get(1));
		
		WebElement Headertext = driver.findElement(By.tagName("h1"));
		System.out.println("Header text : " + Headertext.getText());
		
		driver.close();
		
		Set<String> Mainwindow = driver.getWindowHandles();
		mylist.clear();
		mylist.addAll(Mainwindow);
		//List<String> list = new ArrayList<String>(Mainwindow);
		driver.switchTo().window(mylist.get(0));
		
		
		driver.findElement(By.id("multi")).click();
		
		Set<String> Multiwindow = driver.getWindowHandles();
		List<String> Newlist = new ArrayList<String>(Multiwindow);
		driver.switchTo().window(Newlist.get(2));
		
		List<WebElement> Alertheadings = driver.findElements(By.tagName("label"));
		
		for (WebElement Allheadtext : Alertheadings) {
			System.out.println(Allheadtext.getText());
		}
		
		driver.quit();
		

	}

}
