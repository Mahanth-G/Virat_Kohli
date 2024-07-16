package Grouping;

import org.testng.annotations.Test;

public  class SignupTests 
{
	@Test(priority = 1,groups= {"sanity"})
	void signupByEmail()
	{
		System.out.println("This is email signup");
	}
	@Test(priority = 2, groups="regression")
	 void signupByFacebook()
	{
		System.out.println("this is facebook signup");
	}
	@Test(priority = 3,groups= {"sanity","regression","functional"})
	void signupByTwitter()
	{
		System.out.println("this is Twitter signup");
	}
}
