package Main;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium training\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://letcode.in/edit");
		
		List<WebElement> heading = driver.findElements(By.tagName("label")); //Using findelements function
		
		for (WebElement Allheading : heading) {    //printing all the heading text by foreach loop
			System.out.println(Allheading.getText());
		}
		
		int size = heading.size();  //checking the size in ifelse condition
		if(size == 5)
		{
			System.out.println("Test size Passed");
		}else System.out.println("size Failed");
		
		WebElement lastheading = heading.get(heading.size()-1);  //Printing the last heading text
		System.out.println("Lastheading :" + lastheading.getText());
		
		driver.quit();
		
	}

}
