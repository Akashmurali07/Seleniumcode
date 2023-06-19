package FrameworksNG;

import org.testng.annotations.Test;

public class LearnAttributes {

	@Test(invocationCount = 3, invocationTimeOut = 1)
	public void ManchesterUnited() {
		System.out.println("Manchester United");
	}
	
	@Test(dependsOnMethods = "ManchesterUnited")
	public void Arsenal() {
		System.out.println("Arsenal");
		
		throw new RuntimeException();   //Throwing runtime Exception
	}
	
	@Test(dependsOnMethods = "Arsenal")
	public void Liverpool() {
		System.out.println("Liverpool");
	}
	
	@Test(priority = 4)
	public void Mancity() {
		System.out.println("Manchester Shitty");
	}
	
	@Test(priority = -5)
	public void Chelsea() {
		System.out.println("Chelshit");
	}
}
