package Grouping;

import org.testng.annotations.Test;

public class LoginTests 
{
	@Test(priority = 1, groups= {"sanity"})
	void loginByEmail()
	{
		System.out.println("loginByEmail");
	}
	@Test(priority = 2, groups="regression")
	void loginByFacebook()
	{
		System.out.println("loginByFacebook");
	}
	@Test(priority = 3, groups= {"sanity","regression","functional"})
	void loginByTwitter()
	{
		System.out.println("loginByTwitter");
	}
}
