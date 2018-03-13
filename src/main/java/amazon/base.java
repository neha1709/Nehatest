package amazon;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {
	public static WebDriver driver;
	 public static String screenshotname;
	
public void login()
	
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nick\\Downloads\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
	}

	public void screenshot(String result) throws IOException
	
	
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Date d = new Date();
	    screenshotname=d.toString().replace(":", "_").replace(" ", "_")+result+".jpg";
		FileUtils.copyFile(src, new File("C://users//Nick//"+screenshotname));
	}

}
