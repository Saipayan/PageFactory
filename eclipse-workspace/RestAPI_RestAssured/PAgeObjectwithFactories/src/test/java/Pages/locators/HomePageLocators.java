package Pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageLocators {

	
	
	@FindBy(xpath = "//*[@id=\"tab-flight-tab-hp\"]")
	public WebElement flightTAB;
	
	@FindBy(xpath = "//*[@id=\"flight-origin-hp-flight\"]")
	public WebElement From;
	
	@FindBy(xpath = "//*[@id=\"flight-destination-hp-flight\"]")
	public WebElement To;
	
	@FindBy(xpath = "//*[@id=\"flight-departing-hp-flight\"]")
	public WebElement FromDATE;
	
	@FindBy(xpath = "//*[@id=\"flight-returning-hp-flight\"]")
	public WebElement ToDATE;
	
	@FindBy(xpath = "//*[@id=\"traveler-selector-hp-flight\"]/div/ul/li/button")
	public WebElement NOOFAdults;
	
	
	
	@FindBy(xpath = "//*[@id=\"gcw-flights-form-hp-flight\"]")
	public WebElement BLOCK;
	
	
	
	@FindBy(xpath = "//*[@id=\"gcw-flights-form-hp-flight\"]/div[9]/label/button")
	public WebElement SearchBOX;
	
	
	
}
