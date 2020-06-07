package Base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import Pages.actions.TopNavigation;
import Utilities.POIHelper;
import io.github.bonigarcia.wdm.WebDriverManager;
import Utilities.TestUtil;


public class Page {
	
	
	public static WebDriver driver;
	public static FileInputStream fis;
	public static Logger log = Logger.getLogger("devpinoyLogger");
	public static FileInputStream fi_OR;
	public POIHelper myPOIHelper=null;
	public static WebDriverWait wait;
	public static TopNavigation topnavigation;
	
	
	public static void init_Configuration()
	{
		if(Constants.Browser.equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			log.debug("Chrome launched..");
		}
		driver.get(Constants.URL);
		log.debug("NAvigated the the required page.");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wait=new WebDriverWait(driver,5);
		
		topnavigation=new TopNavigation(driver);
		
	}
	
	
	public static void verifyEquals(String actual,String Expected) throws IOException
	{
		try
		{
			Assert.assertEquals(actual, Expected);
		}
		catch(Exception e)
		{
			TestUtil.CAptureScreenShot();
			
		}
	}
	
	public static void Quitting_Browser()
	{
		driver.quit();
	}

}
