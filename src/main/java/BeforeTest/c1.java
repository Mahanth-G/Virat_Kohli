package BeforeTest;

import org.testng.annotations.Test;
import org.testng.annotations.*;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.cucumber.java.After;

public class c1 
{
	@BeforeSuite
	public static void Beforesuite() {
		System.out.println(" before suite");
		}
	@AfterSuite
	public static void AfterSuite() {
		System.out.println(" After suite");
		}
	
	@Test(priority=1, invocationCount=3)
	void bcd()
	{
		System.out.println("this is bcd method");
	}
	
	@Test(enabled=false)
	void efg()
	{
		System.out.println("this is efg method");
	}
	@BeforeTest
	void boat()
	{
		System.out.println("this is boat test method");
	}
}
