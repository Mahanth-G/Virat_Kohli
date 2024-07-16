package TestAnno;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.cucumber.java.Before;

public class BeforeAnnno 
{
	//	login
	//	search
	//	logout
	//	login 
	//	adv serch
	//	logout
	
	/*
	 * 	@BeforeMethod
	public static void login()
	{
		System.out.println("am login"); 
		
	}
	@Test(priority=1)
	public static void search()
	{
		System.out.println("am search"); 
		
	}
	@Test(priority=2)
	public static void Adv_search()
	{
		System.out.println("am adv_search"); 
		
	}
	@AfterMethod
	public static void logout()
	{
		System.out.println("am logout"); 
		
	}*/
	
	@BeforeClass
	public static void login()
	{
		System.out.println("am login"); 
		
	}
	@Test(priority=1)
	public static void search()
	{
		System.out.println("am search"); 
		
	}
	@Test(priority=2)
	public static void Adv_search()
	{
		System.out.println("am adv_search"); 
		
	}
	@AfterClass
	public static void logout()
	{
		System.out.println("am logout"); 
		
	}
	
	
}
