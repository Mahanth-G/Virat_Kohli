package DependencyMethods;

import org.testng.Assert;
import org.testng.annotations.Test;

public class dependencyMeth 
{
	@Test(priority=1)
	void openApp()
	{
		System.out.println("openApp");
		Assert.assertTrue(true);
	}
	
	@Test(priority=2, dependsOnMethods = "openApp")
	void login()
	{
		System.out.println("login");
		Assert.assertTrue(true);
	}
	
	@Test(priority=3, dependsOnMethods = "login")
	void search() 
	{
		System.out.println("search");
		Assert.assertTrue(false);//or 
		//Assert.fail();
	}
	
	@Test(priority=4,dependsOnMethods = {"openApp","login"})
	void AdvSeacrh()
	{
		System.out.println("Adv_searc");
		Assert.assertTrue(true);
	}
	
	@Test(priority=5)
	void logout()
	{
		System.out.println("logout");
		Assert.assertTrue(true);
	}
}
