package testSuite1;

import javax.swing.plaf.synth.SynthSplitPaneUI;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class UserStory2 {

	@Parameters({"URL4TestLevel", "URL4TestLevelAPIKey"})
	@Test(groups= {"SMOKE"})
	public void us2Test1(String testCaseLevelParamter, String APIKey)
	{
		System.out.println("The test case parameter passed is "+ testCaseLevelParamter + "\n API Key is "+APIKey);
		System.out.println("User Story 2 TestCase 1 - SMOKE");
	}

	@Parameters({"URL4SuiteLevel"})
	@Test
	public void us2Test2(String suiteLevelParameter)
	{
		System.out.println("The suite parameter passed is "+ suiteLevelParameter);
		System.out.println("User Story 2 TestCase 2");
	}
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("---  Before Class ---");
	}

	@AfterClass
	public void afterClass()
	{
		System.out.println("---  After Class ---");
	}
}
