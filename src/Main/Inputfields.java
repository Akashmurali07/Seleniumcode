package Main;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Inputfields {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium training\\Chrome webdriver\\chromedriver.exe");
		ChromeOptions Options = new ChromeOptions();
		Options.addArguments("--remote-allow-origins=*");
		
		ChromeDriver driver = new ChromeDriver(Options);
		driver.get("https://letcode.in/edit");
		
		driver.findElement(By.id("fullName")).sendKeys("Akash M");
		
		driver.findElement(By.id("join")).sendKeys(" player", Keys.TAB);
		
		String myvalue = driver.findElement(By.id("getMe")).getAttribute("value");
		System.out.println(myvalue);
		
		driver.findElement(By.id("clearMe")).clear();
		
		boolean enable = driver.findElement(By.id("noEdit")).isEnabled();
		System.out.println(enable);
		
		String isread = driver.findElement(By.id("dontwrite")).getAttribute("readonly");
		System.out.println(isread);

	}

}
