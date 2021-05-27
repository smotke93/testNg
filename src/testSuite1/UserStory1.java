package testSuite1;

import org.testng.annotations.Test;

public class UserStory1 {

	@Test(dependsOnMethods= {"us1Test4","us1Test2"})
	public void us1Test1()
	{
		System.out.println("User Story 1 TestCase 1");
	}
	
	@Test(groups= {"SMOKE"})
	public void us1Test2()
	{
		System.out.println("User Story 1 TestCase 2 - SMOKE");
	}
	
	@Test(enabled=false)
	public void us1Test3()
	{
		System.out.println("User Story 1 TestCase 3");
	}
	
	@Test(timeOut=4000)
	public void us1Test4()
	{
		System.out.println("User Story 1 TestCase 4");
	}
}
