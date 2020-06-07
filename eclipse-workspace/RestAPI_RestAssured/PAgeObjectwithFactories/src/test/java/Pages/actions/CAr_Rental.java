package Pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import Base.Page;
import Pages.locators.CAR_REntal_Locators;
import Pages.locators.HomePageLocators;

public class CAr_Rental extends Page{

	
	
public CAR_REntal_Locators carRentalLOC ;
	
	public CAr_Rental()
	{
		carRentalLOC = new CAR_REntal_Locators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,10);
		PageFactory.initElements(factory, this.carRentalLOC);
	}
	public void RENT_A_CAR(String pickUP,String dropOFF,String pickUPDate, String DropDAte,String pickuptime,String dropTime,String AGE)
	{
		carRentalLOC.CAR_PICKUP.sendKeys(pickUP);
		carRentalLOC.CAR_DROP.sendKeys(dropOFF);
		carRentalLOC.PICKUP_DATE.sendKeys(pickUPDate);
		carRentalLOC.DROP_DATE.sendKeys(DropDAte);
		carRentalLOC.PICKUP_TIME.sendKeys(pickuptime);
		carRentalLOC.DROP_TIME.sendKeys(dropTime);
		carRentalLOC.AGE.sendKeys(AGE);
		
		carRentalLOC.SearchBOX.click();
		
		
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
