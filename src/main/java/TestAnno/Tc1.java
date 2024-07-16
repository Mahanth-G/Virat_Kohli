package TestAnno;

import org.testng.annotations.Test;

public class Tc1
{
	@Test
	void login()
	{
		System.out.println("in");
	}
	@Test
	void logout()
	{
		System.out.println("out");
	}
}
