package Grouping;

import org.testng.annotations.Test;

public class PaymentTests 
{
	@Test(priority=1,groups= {"sanity"})
	void paymentByRupees()
	{
		System.out.println("This is payment by rupees");
	}
	@Test(priority=2, groups="regression")
	void paymentByDollars()
	{
		System.out.println("This is payment by dollar");
	}
	@Test(priority=3, groups={"sanity","regression","functional"})
	void paymentByPounds()
	{
		System.out.println("This is payment by pounds");
	}
}
