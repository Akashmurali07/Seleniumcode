package Main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium training\\Chrome driver 108\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/dropdowns");
		driver.manage().window().maximize();
		
		WebElement myfruits = driver.findElement(By.id("fruits"));
		Select fruitselect = new Select(myfruits); //Select = Class
		fruitselect.selectByVisibleText("Mango"); //selecting the dropdown option
		
		WebElement myheros = driver.findElement(By.id("superheros"));
		Select herosselect = new Select(myheros); 
		boolean isMul = herosselect.isMultiple();
		System.out.println(isMul); //Checking the dropdown is applicable to select multiple option
		herosselect.selectByIndex(2);
		herosselect.selectByIndex(5);
		herosselect.selectByIndex(6);
		herosselect.deselectByIndex(2); //Deselecting the dropdown option
		
		WebElement mylang = driver.findElement(By.id("lang"));
		Select langselect = new Select(mylang);
		langselect.selectByValue("swift");
		WebElement langprint = langselect.getFirstSelectedOption(); //Printing the first selected option in dropdown
		System.out.println(langprint.getText());
		
	}

}
