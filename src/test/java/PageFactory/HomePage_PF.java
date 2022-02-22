package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage_PF {

	WebDriver driver;

	@FindBy (xpath= "//a[text()='SIGN-OFF']")
	@CacheLookup
	WebElement btn_SignOff;


	public HomePage_PF(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver,this);
	}

	public void checkSignOffIsDisplayed(){

		btn_SignOff.isDisplayed();
	}

}
