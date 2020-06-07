package Pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CAR_REntal_Locators {
	
	

	@FindBy(xpath = "//*[@id=\"car-pickup-clp\"]")
	public WebElement CAR_PICKUP;
	
	@FindBy(xpath = "//*[@id=\"car-dropoff-clp\"]")
	public WebElement CAR_DROP;
	
	@FindBy(xpath = "//*[@id=\"car-pickup-date-clp\"]")
	public WebElement PICKUP_DATE;
	
	@FindBy(xpath = "//*[@id=\"car-dropoff-date-clp\"]")
	public WebElement DROP_DATE;
	
	@FindBy(xpath = "//*[@id=\"car-pickup-time-clp\"]")
	public WebElement PICKUP_TIME;
	
	@FindBy(xpath = "//*[@id=\"car-dropoff-time-clp\"]")
	public WebElement DROP_TIME;
	
	
	@FindBy(xpath = "//*[@id=\"car-age-of-driver-clp\"]")
	public WebElement AGE;
	
	
	@FindBy(xpath = "//*[@id=\"gcw-submit-car\"]")
	public WebElement SearchBOX;
	
	
	
	
	

}
