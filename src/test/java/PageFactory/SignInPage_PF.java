package PageFactory;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class SignInPage_PF {

	WebDriver driver;
	
	@FindBy(partialLinkText = "Demo Tours")
	List<WebElement> mylinks;
	
	
	@FindBy(xpath = "//input[@name='userName']")
	@CacheLookup
	WebElement txt_username;

	@FindBy(xpath = "//input[@name='password']")
	@CacheLookup
	WebElement txt_password;

	@FindBy(xpath = "//input[@name='submit']")
	@CacheLookup
	WebElement btn_submit;
	
		
	public SignInPage_PF(WebDriver driver) {
		
		this.driver = driver;
		//PageFactory.initElements(driver,this);
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,30);
		PageFactory.initElements(factory,this);
		//PageFactory.initElements(new AjaxElementLocatorFactory(driver,30),this);
	}
	public void enter_username(String username) {
		txt_username.sendKeys(username);

	}


	public void enter_password(String password)
	{
		txt_password.sendKeys(password);
	}

	public void click_submit()
	{
		btn_submit.click();

	}


}
