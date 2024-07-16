package BeforeTest;

import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class c2 
{
	@Test(priority=5)
	public void abc()
	{
		System.out.println("this is abc method");
	}
	@Test(priority = 4)
	public void fish()
	{
		System.out.println("this is fish method");
	}
	
	
	@AfterTest
	public void at()
	{
		System.out.println("this is after test method");
	}
	@BeforeTest
	void apple()
	{
		System.out.println("this is before test method");
	}
	@BeforeSuite
	public static void Beforesuite() {
		System.out.println(" before suite c2");
		}
}
