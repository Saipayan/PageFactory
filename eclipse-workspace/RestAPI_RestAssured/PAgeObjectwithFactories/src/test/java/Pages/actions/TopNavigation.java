package Pages.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import Base.Page;
import Pages.locators.HomePageLocators;
import Pages.locators.Top_NAvigation_Locators;

public class TopNavigation {

	

	public Top_NAvigation_Locators top_navigation_locators;

	public TopNavigation(WebDriver driver) {
		this.top_navigation_locators= new Top_NAvigation_Locators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(factory, this.top_navigation_locators);
		
	}

	

	public CAr_Rental goto_CarHIRE() {
		top_navigation_locators.CarRENTTAB.click();
		return new CAr_Rental();
	}
}
