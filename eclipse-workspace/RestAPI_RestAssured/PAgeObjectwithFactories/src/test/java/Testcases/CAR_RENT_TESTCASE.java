package Testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import Base.Page;
import Pages.actions.CAr_Rental;
import Pages.actions.HomePage;
import Utilities.TestUtil;

public class CAR_RENT_TESTCASE {
	
	
	public static WebDriver driver;
	public static WebDriverWait wait;
	
	@Test
	public static void carRENTTESTCASE()
	{
		
		Page.init_Configuration();
		CAr_Rental myCARREBTAL_PAGE = Page.topnavigation.goto_CarHIRE();
		
		//Assert.assertEquals(4, 5);
		try {
			Page.verifyEquals("5", "5");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		myCARREBTAL_PAGE.RENT_A_CAR("Delhi (DEL-Indira Gandhi Intl.)", "Delhi (DEL-Indira Gandhi Intl.)", "20/06/2020", "20/06/2020","10:30" , "11:30", "25");
	
		Page.Quitting_Browser();
		
	
	}

}
