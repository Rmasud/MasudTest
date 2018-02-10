package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import testbase.TestBase;

public class FlightPage extends TestBase {

	public FlightPage(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "flight-origin-flp")
	WebElement originInput;

	public void flightFromInput(String originInput) {

		this.originInput.sendKeys(originInput);

	}

	@FindBy(id = "flight-destination-flp")
	WebElement destinationInput;

	public void flightToInput(String destinationInput) {
		this.destinationInput.sendKeys(destinationInput);

	}

	@FindBy(id = "flight-adults-flp")
	WebElement SelectAdultsPass;

	public void InputadultsDropdown(String SelectAdultsPass) {

		Select adultsDropDown = new Select(this.SelectAdultsPass);

		adultsDropDown.selectByVisibleText(SelectAdultsPass);

	}

	@FindBy(xpath = "//div[@class='cols-nested']//button[@type='submit']")
	WebElement clickSearchButton;

	public void clickSearchFlight() {
		clickSearchButton.click();
	}
	
	@FindBy(id="flight-departing-flp")
	WebElement departInput;  
	
	public void inputDepartDate(String departInput) {
		
		this.departInput.sendKeys(departInput);
	
		
	}
    
	
	@FindBy (id = "flight-returning-flp")
	WebElement returnInput;
	
	public void inputReturn (String returnInput) {
		this.returnInput.click();
		this.returnInput.clear();
		
		this.returnInput.sendKeys(returnInput);
	}
	
	
	
	
	
	
}


