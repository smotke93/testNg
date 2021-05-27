package testSuite2;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class UserStory4 {

	@Test
	public void us4Test1()
	{
		System.out.println("User Story 4 TestCase 1");
	}

	@Test
	public void us4Test2()
	{
		System.out.println("User Story 4 TestCase 2");
	}
	
	@Test
	public void MobileTestUs4Test1()
	{
		System.out.println("Mobile test User Story 4 TestCase 1");
	}
	
	@Test
	public void MobileTestUs4Test2()
	{
		System.out.println("Mobille Test User Story 4 TestCase 2");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("=== @BeforeMethod=====");
	}
	
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("=== @AfterMethod ===");
	}
	
	@BeforeTest
	public void TestSetup()
	{
		System.out.println("=== Test Setup Code =====");
	}
	
	
	@AfterTest
	public void TestCleanup()
	{
		System.out.println("=== Test Cleanup ===");
	}
	
	@BeforeSuite
	public void beforeSuiteSetup()
	{
		System.out.println("=== beforeSuiteSetup =====");
	}
	
	
	@AfterSuite
	public void afterSuiteSetup()
	{
		System.out.println("=== afterSuiteSetup ===");
	}
}
