package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class ServiceNow {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium training\\Chrome webdriver\\chromedriver.exe");
		ChromeOptions Options = new ChromeOptions();
		Options.addArguments("--remote-allow-origins=*");
		
		ChromeDriver driver = new ChromeDriver(Options);
		driver.manage().window().maximize();
		driver.get("https://www.servicenow.com/lpdem/demonow-all.html?campid=119699&cid=p:all:dg:b:rmkt:exa:GOOG_APJ_ALL_ALBU_RLSA_Brand_EXA_AITextAdCaseStudy:apj:all&s_kwcid=AL!11692!3!649798296149!e!!g!!servicenow&ds_c=GOOG_APJ_IN_EN_DEMANDGEN_ALBU_RLSA_Brand_EXA_Top&cmcid=71700000088739082&ds_ag=ServiceNow_EXA&cmpid=58700007491569375&ds_kids=p67391387031&gclid=CjwKCAjwitShBhA6EiwAq3RqA8wxUJHEvepUi_KtHnt9xod-Ma-uF4azY9plY2ceHJvhaEIoSUULIBoCyW4QAvD_BwE&gclsrc=aw.ds");
		
		driver.findElement(By.id("truste-consent-button")).click();
		
		driver.findElement(By.id("field6")).sendKeys("Akash"+ Keys.TAB);
		driver.findElement(By.id("field7")).sendKeys("Murali"+ Keys.TAB);
		driver.findElement(By.id("field8")).sendKeys("akashmurali05@gmail.com"+ Keys.TAB);
		driver.findElement(By.name("company")).sendKeys("Manchester United Company" + Keys.TAB);
		driver.findElement(By.name("businessPhone")).sendKeys("9080418442");
		
		WebElement dropdown1 = driver.findElement(By.id("field10"));
		Select joblevel = new Select(dropdown1);
		joblevel.selectByVisibleText("Individual Contributor");
		
		WebElement dropdown2 = driver.findElement(By.id("field11"));
		Select Department = new Select(dropdown2);
		Department.selectByVisibleText("IT");
		
		WebElement dropdown3 = driver.findElement(By.id("field12"));
		Select jobFunction = new Select(dropdown3);
		jobFunction.selectByVisibleText("IT - Other");
		
		WebElement dropdown4 = driver.findElement(By.id("field14"));
		Select Country = new Select(dropdown4);
		Country.selectByVisibleText("IN - India");
		
		WebElement dropdown5 = driver.findElement(By.id("field15"));
		Select State = new Select(dropdown5);
		State.selectByVisibleText("Tamil Nadu");
		
		WebElement dropdown6 = driver.findElement(By.id("field60"));
		Select Interested = new Select(dropdown6);
		Interested.selectByVisibleText("IT Service Management");
		
		WebElement Terms = driver.findElement(By.xpath("//*[@id=\"form1091\"]/ul/li[12]/div/label"));
		Terms.click();
		
		WebElement button = driver.findElement(By.xpath("//button[@class='uf-submit-form']"));
		button.click();
		
	}

}
