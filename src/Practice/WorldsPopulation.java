package Practice;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class WorldsPopulation {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		
		//String xpath_current_pops = "//div[@class='maincounter-number']/span[@class='rts-counter']";
		//String xpath_todays_pops = "//div[text()='Today']//parent::div//span[@class='rts-counter']";
		//String xpath_year_pops = "//div[text()='This year']//parent::div//span[@class='rts-counter']";
		String xpath_today_year_pops = "//div[text()='This year' or text()='Today']//parent::div//span[@class='rts-counter']";
		
		//System.setProperty("webdriver.chrome.driver", "D:\\Selenium training\\chromedriver\\chromedriver.exe");
		ChromeOptions Options = new ChromeOptions();
		Options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(Options);
		driver.get("https://www.worldometers.info/world-population/");
		
		int count = 1;
		while(count<=20); {
			System.out.println(count + " sec");
			if(count == 21)
		
		//PrintPopulationData(xpath_current_pops);
		PrintPopulationData(xpath_today_year_pops);
		
		Thread.sleep(1000);
		count++;
				
		}
		
	}	
		public static void PrintPopulationData(String locator) {
			
			while(true) {
				List<WebElement> Worldspop = driver.findElements(By.xpath(locator));
				
				for (WebElement pops : Worldspop) 
				{		
					System.out.println(pops.getText());
				}
							}
		}
		
}
