package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.HomePage;
import Pages.SignInPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class LoginStepsPOM {

//	WebDriver driver = null;
//	SignInPage login;
//	HomePage hpage;
//
//	@Given("user is on the login page")
//	public void user_is_on_the_login_page() {
//		System.out.println("POM Inside Step : User is on login page");
//		String ProjectPath = System.getProperty("user.dir");
//		//System.setProperty("webdriver.chrome.driver","C:/Users/admin/Desktop/Java Root Base/Selenium Java Projects/ProjectMyStoreCucumberBDD/src/test/resources/Drivers/chromedriver.exe");
//		System.setProperty("webdriver.chrome.driver",ProjectPath+"/src/test/resources/Drivers/chromedriver.exe");
//
//
//
//		driver= new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
//		driver.manage().window().maximize();
//
//
//
//
//		driver.navigate().to("https://demo.guru99.com/test/newtours/");
//		//driver.findElement(By.xpath("//a[@class='login']")).click();
//
//
//
//	}
//
//	@When("^user enters (.*) and (.*)$")
//	public void user_enters_username_and_password(String username,String password) {
//		System.out.println("POM   === Inside Step : User enters username and password");
//		login = new SignInPage(driver);
//		login.enter_username(username);
//		login.enter_password(password);
//		//driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(username);
//		//driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
//	}
//
//	@And("clicks on sign in button")
//	public void clicks_on_sign_in_button() {
//		System.out.println("Inside Step : User clicks on sign in button");
//		login.click_submit();
//		//driver.findElement(By.xpath("//input[@name='submit']")).click();
//
//
//	}
//
//	@Then("user is navigated to home page")
//	public void user_is_navigated_to_home_page() throws InterruptedException {
//		Thread.sleep(2000);
//		System.out.println("Inside Step : User is navigated to home page");
//		hpage = new HomePage(driver);
//		hpage.checkSignOffIsDisplayed();
//		//String actual = driver.findElement(By.xpath("//a[text()='SIGN-OFF']")).getText();
//		//System.out.println("actual value of string is "+actual);
//		//String expected = "SIGN-OFF";
//		//Assert.assertEquals(expected, actual);
//		driver.close();
//		driver.quit();
//
//	}



}
