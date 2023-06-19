package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class ManipalUniversity {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium training\\Chrome webdriver\\chromedriver.exe");
		ChromeOptions Options = new ChromeOptions();
		Options.addArguments("--remote-allow-origins=*");
		
		ChromeDriver driver = new ChromeDriver(Options);
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("q")).sendKeys("manipal university bangalore"+ Keys.ENTER);
		
		driver.findElement(By.xpath("//*[starts-with(@class,'CCgQ5')]")).click();
		
		driver.findElement(By.id("Name")).sendKeys("Akash M");
		
		driver.findElement(By.id("Email")).sendKeys("akashmurali07@gmail.com");
		
		driver.findElement(By.id("Mobile")).sendKeys("9008757898");
		
		WebElement State = driver.findElement(By.id("StateId"));
		Select StateSelect = new Select(State);
		StateSelect.selectByVisibleText("Tamil Nadu");
		
		WebElement City = driver.findElement(By.id("CityId"));
		System.out.println(City.isEnabled());
		
//		Select CitySelect = new Select(City);
//		CitySelect.selectByVisibleText("Chennai");			   
		
		WebElement University = driver.findElement(By.id("UniversityId"));
		Select UniSelect = new Select(University);
		UniSelect.selectByValue("261599");
		
		WebElement Stream = driver.findElement(By.id("CourseId"));
		Select StreamSelect = new Select(Stream);
		StreamSelect.selectByValue("261681");
		
//		WebElement Program = driver.findElement(By.id("SpecializationId"));
//		Select ProgramSelect = new Select(Program);
//		ProgramSelect.selectByVisibleText("MA Multimedia and Communication");
		

		
		//driver.quit();

	}

}
