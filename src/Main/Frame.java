package Main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

	public static void main(String[] args) {
		
		
		System.setProperty("Webdriver.chrome.driver", "D:\\Selenium training\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); //to maximize the screen
		driver.get("https://letcode.in/frame");
		
		driver.switchTo().frame(0);
		driver.findElement(By.name("fname")).sendKeys("Akash");
		driver.findElement(By.name("lname")).sendKeys("M");
		
		//WebElement myframe = driver.findElement(By.xpath("//iframe[@src='innerFrame']"));
		driver.switchTo().frame(0); //Frame kula frame so 0 dhan varum
		driver.findElement(By.name("email")).sendKeys("akashmurali05@gmail.com");
		
		driver.switchTo().parentFrame(); //switch 1 frame behind
		driver.findElement(By.name("lname")).sendKeys("urali");
		
		driver.switchTo().defaultContent(); //switch to main frame
		driver.findElement(By.xpath("//a[@class = 'card-footer-item']")).click();

	}

}
