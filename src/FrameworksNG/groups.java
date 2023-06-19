package FrameworksNG;

import org.testng.annotations.Test;

public class groups {

	@Test(groups = {"Bestest"}, priority = 1)
	public void Premierleague() {
		System.out.println("PL is 1st best");
	}
	
	@Test(groups = {"Bestest"}, priority = 3)
	public void Laliga() {
		System.out.println("Laliga is 2nd");
	}
	
	@Test(groups = {"Average"}, dependsOnMethods = "Laliga")
	public void Bundesliga() {
		System.out.println("Budesliga is 3rd");
	}
	
	@Test(groups = {"Average"}, dependsOnMethods = "Bundesliga")
	public void SerieA() {
		System.out.println("Serie A is 4th");
	}
	
	@Test(groups = {"shit"}, priority = 2)
	public void Indiansuperleague() {
		System.out.println("ISL is ok");
	}
}
