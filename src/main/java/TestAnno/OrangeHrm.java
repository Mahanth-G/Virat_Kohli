package TestAnno;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OrangeHrm 
{
	/*open app
	 * test logo presence
	 * login close
	 */
	WebDriver driver;
	@Test(priority = 11)
	  public void OpenApp()
	  {
		  driver=new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		  driver.manage().window().maximize();
	
		  
	  }
	@Test(priority = 21)
	  public void Logo_Presence() throws InterruptedException
	  {
		Thread.sleep(3000);
		boolean status=driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		System.out.println(status);
	  }
	
	@Test(priority = 45)
	  public void close()
	  {
		  driver.close();
	  }
}
