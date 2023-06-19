package Main;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingButtons {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium training\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/buttons");
		
		//Get the X and Y Value
		//driver.findElement(By.id("position")).getLocation();
		WebElement element = driver.findElement(By.id("position"));
		org.openqa.selenium.Point point = element.getLocation();
		int X = point.getX();
		int Y = point.getY();
		System.out.println("X is " + X + " ,Y is " + Y );
		
		//Find the color of the button
		WebElement findcolour = driver.findElement(By.id("color"));
		String colour = findcolour.getCssValue("background-color");
		System.out.println(colour);
		
		//Find the height and width of button
		Rectangle rect = driver.findElement(By.id("property")).getRect();
		System.out.println("Height is " + rect.getHeight());
		System.out.println("Width is " + rect.getWidth());
		System.out.println(rect.getPoint());
		
	}

}
