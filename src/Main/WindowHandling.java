package Main;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		System.getProperty("wedriver.chrome.driver", "D:\\Selenium training\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://letcode.in/windows");
		
		String Windowvalue = driver.getWindowHandle();   //To find the exact window that selenium focused
		System.out.println("Window Handles: " + Windowvalue);
			
		driver.findElement(By.id("home")).click();
		System.out.println("before window switch URL : " +driver.getCurrentUrl());
		
		Set<String> Allwindows = driver.getWindowHandles();  //Window handles to find more than one window
		System.out.println(Allwindows);
		List<String> List = new ArrayList<String>(Allwindows);  //Setting the Set in List so that we can get the return value
		driver.switchTo().window(List.get(1));   //Switching the selenium attention to next window
		
		System.out.println("After window switch URL : " +driver.getCurrentUrl());
		
		driver.switchTo().window(List.get(0)).close(); //Switching and Closing the first window
		
		Set<String> Windowvalue2 = driver.getWindowHandles(); //get the new window after closing the first window
		List.clear();
		List.addAll(Windowvalue2);
		driver.switchTo().window(List.get(0));
		String NewURL = driver.getCurrentUrl();
		System.out.println("Current URL : " + NewURL);
		
		driver.quit();

	}

}
