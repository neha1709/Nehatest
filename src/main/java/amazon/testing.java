package amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testing {
	
	WebDriver driver;
	
	base b= new base();
	
	@Test
	public void test1()
	
	{
		b.login();
		Assert.assertEquals(driver.getTitle(), "abcd");
		
	}

	
	@Test
	public void test2()
	
	{
		System.out.println("test2");
		
	}

}
