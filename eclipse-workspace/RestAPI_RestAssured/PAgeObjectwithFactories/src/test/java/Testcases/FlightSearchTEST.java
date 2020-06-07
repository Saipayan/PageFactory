package Testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Base.Page;
import Pages.actions.HomePage;
import Utilities.TestUtil;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FlightSearchTEST {
	
	public static WebDriver driver;
	public static WebDriverWait wait;
	
	
	
	@Test
	public static void flightSEARCHTEST()
	{
		
		Page.init_Configuration();
		HomePage home = new HomePage();
		
		home.goTO_flights().Book_A_Flight("Kolkata (CCU-Netaji Subhash Chandra Bose Intl.)", "Delhi (DEL-Indira Gandhi Intl.)", "03/06/2020", "28/06/2020", "1");
		//home.goTO_flights().Book_A_Flight(FROM,TO, FROM_DATE, TO_DATE, NO_of_ADULTS);
		
		Page.Quitting_Browser();
	}

}
