package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage {

	WebDriver driver;

	private By txt_username = By.xpath("//input[@name='userName']");
	private By txt_password = By.xpath("//input[@name='password']");
	private By btn_submit = By.xpath("//input[@name='submit']");

	public SignInPage(WebDriver driver)
	{
		this.driver = driver;
//		if (! driver.getTitle().equals("Welcome:Mercury Tours"));{
//			throw new IllegalStateException("This is not login page. The current page is "+driver.getCurrentUrl());	
//		}
		
	}

	public void enter_username(String username) {
		driver.findElement(txt_username).sendKeys(username);

	}
	public void enter_password(String password)
	{
		driver.findElement(txt_password).sendKeys(password);
	}

	public void click_submit()
	{
		driver.findElement(btn_submit).click();

	}

	public void loginValidUser(String username,String password)
	{
		driver.findElement(txt_username).sendKeys(username);
		driver.findElement(txt_password).sendKeys(password);
		driver.findElement(btn_submit).click();
	}
}
