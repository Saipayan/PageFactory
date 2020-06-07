package Pages.actions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import Base.Page;
import Pages.locators.HomePageLocators;

public class HomePage extends Page{
	
	
	public HomePageLocators home ;
	
	public HomePage()
	{
		home = new HomePageLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,10);
		PageFactory.initElements(factory, this.home);
	}
	
	public HomePage goTO_flights()
	{
		home.flightTAB.click();
		return this;
	}
	
	
	public void goTO_hotels()
	{
		
	}
	
	
	public void goTO_flightsand_hotels()
	{
		
	}
	
	
	public void Book_A_Flight(String from, String To,String fromDATE,String toDATE,String no_OF_ADULTS)
	{
		home.From.sendKeys(from);
		home.To.sendKeys(To);
		home.FromDATE.sendKeys(fromDATE);
		home.ToDATE.sendKeys(toDATE);
		
		Actions action =new Actions(driver);
		action.sendKeys(Keys.ESCAPE).perform();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		home.BLOCK.click();
		action.sendKeys(Keys.PAGE_DOWN).perform();	
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		home.SearchBOX.click();
	}
	
	

}
