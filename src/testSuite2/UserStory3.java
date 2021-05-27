package testSuite2;

import org.testng.annotations.Test;

public class UserStory3 {
	@Test
	public void us3Test1()
	{
		System.out.println("User Story 3 TestCase 1");
	}

	@Test
	public void us3Test2()
	{
		System.out.println("User Story 3 TestCase 2");
	}
	
	@Test(groups= {"SMOKE"})
	public void MobileTestUs3Test1()
	{
		System.out.println("Mobile test User Story 3 TestCase 1 - SMOKE");
	}
	
	@Test
	public void MobileTestUs2Test2()
	{
		System.out.println("Mobille Test User Story 3 TestCase 2");
	}
}
