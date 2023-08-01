package org.sample.test;

import org.sample.pages.Loginpage;
import org.testng.annotations.Test;

public class TC01_Loginpage {
	
	@Test
	public void logintest() {
		
	Loginpage lp = new Loginpage();
	
	lp.enterusername("standard_user");
	lp.enterpassword("secret_sauce");
	lp.clickloginbutton();
	}	
	

}
