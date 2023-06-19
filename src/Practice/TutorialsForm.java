package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TutorialsForm {

	public static void main(String[] args) {
		
		System.setProperty("Webdriver.Chrome.driver", "D:\\Selenium training\\Chrome webdriver\\chromedriver.exe");
		ChromeOptions Options = new ChromeOptions();
		Options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(Options);
		driver.get("https://letcode.in/radio");
		
		driver.findElement(By.name("answer")).click();
		driver.findElement(By.xpath("//input[@name='one' and @id='two']")).click();
		driver.findElement(By.name("nobug")).click();
		


	}

}
