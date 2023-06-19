package Main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsFunctions {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium training\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://letcode.in/");        //IsDisplayed 
		WebElement displayed = driver.findElement(By.linkText("Sign up")); 
		boolean find = displayed.isDisplayed(); 
		System.out.println(find);
		
		
		driver.get("https://letcode.in/buttons"); //IsEnabled 
		WebElement enabled = driver.findElement(By.id("isDisabled"));
		System.out.println(enabled.isEnabled());
		

		driver.get("https://semantic-ui.com/elements/button.html");
		WebElement enable = driver.findElement(By.xpath("//button[@class='ui disabled button']"));
		boolean search = enable.isEnabled();
		System.out.println(search);
		String mainoutput = enable.getAttribute("class"); //Use Attribute when there is no disabled word in html code
		System.out.println(mainoutput.contains("disabled"));
		
		
		driver.get("https://letcode.in/radio");  //IsSelected
		WebElement selected = driver.findElement(By.xpath("//input[@type='checkbox']"));
		System.out.println(selected.isSelected());
		
		driver.quit();

	}

}
