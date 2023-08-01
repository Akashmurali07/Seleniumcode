package org.sample.pages;

import org.openqa.selenium.By;
import org.sample.base.Loginpagebase;

public class Loginpage extends Loginpagebase {
	
	
	//actions
	public void enterusername(String Username){
		driver.findElement(By.id("user-name")).sendKeys(Username);
	}
	
	public void enterpassword(String Password){
		driver.findElement(By.id("password")).sendKeys(Password);
	}
		
	
	public void clickloginbutton(){
		driver.findElement(By.id("login-button")).click();
	}
	
}
