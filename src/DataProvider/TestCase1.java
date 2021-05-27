package DataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestCase1 {

	@DataProvider
	public Object[][] dataProviderMethod()
	{
		Object[][] data = new Object[3][2];
		data[0][0] = "user1";
		data[0][1] = "pwd1";
		
		data[1][0] = "user2";
		data[1][1] = "pwd2";
		
		data[2][0] = "user3";
		data[2][1] = "pwd3";
		
		return data;
	}
	
	
	@Test(dataProvider="dataProviderMethod")
	public void testCaseExecution(String username, String pwd)
	{
	System.out.println("Username - "+username+ "\n pwd - "+pwd);	
	}
}
