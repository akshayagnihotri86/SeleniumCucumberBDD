package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

;

public class HomePage {

	WebDriver driver;

	private By btn_signoff = By.xpath("//a[text()='SIGN-OFF']");

	public HomePage(WebDriver driver)
	{
		this.driver= driver;
	}

	public void checkSignOffIsDisplayed()
	{
		driver.findElement(btn_signoff).isDisplayed();

	}
}
