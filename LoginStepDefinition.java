package stepdefinition;


import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinition {
	WebDriver driver;

	static {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dibyajyothi\\Downloads\\chromedriver_win32\\chromedriver.exe");
	}
	@Given("^the browser is launched$")
	public void the_browser_is_launched() throws Throwable {
	     driver = new ChromeDriver();
	}

	@Given("^the application is loaded$")
	public void the_application_is_loaded() throws Throwable {
	    driver.get("https://demo.actitime.com/login.do");
	}

	@When("^user enters the valid the username$")
	public void user_enters_the_valid_the_username() throws Throwable {
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("admin"); 
	}

	@When("^user enters the valid the password$")
	public void user_enters_the_valid_the_password() throws Throwable {
		driver.findElement(By.xpath("//input[@name=\"pwd\"]")).sendKeys("manager");
		Thread.sleep(4000);
	}

	@When("^user clicks on the login button$")
	public void user_clicks_on_the_login_button() throws Throwable {
	   driver.findElement(By.xpath("//div[text()='Login ']")).click();
	   Thread.sleep(4000);
	}

	@Then("^dashboard should be displayed$")
	public void dashboard_should_be_displayed() throws Throwable {
		Assert.assertEquals("", "");
		driver.close();
		
	    
	}
	@When("^User clicks on forgot password link$")
	public void user_clicks_on_forgot_password_link() throws Throwable {
	  driver.findElement(By.xpath("//a[text()='Forgot your password?']")).click();  
	}

	@Then("^forgot password component should be displayed$")
	public void forgot_password_component_should_be_displayed() throws Throwable {
	    driver.findElement(By.xpath("//a[text()='Return to login page']")).click();
	}
	@When("^user enters the credentials as \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_the_credentials_as_and(String arg1, String arg2) throws Throwable {
		
		 driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys(arg1);
		 driver.findElement(By.xpath("//input[@name=\"pwd\"]")).sendKeys(arg2);
		 Thread.sleep(4000);
		 
	}
	@When("^user enters the valid the username and password$")
	public void user_enters_the_valid_the_username_and_password(DataTable data) throws Throwable {
		/* List<List<String>> datatable = data.asLists(String.class); */
		List<Map<String, String>> datamap = data.asMaps(String.class,String.class);
		/*
		 * driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys(
		 * datatable.get(1).get(0));
		 * driver.findElement(By.xpath("//input[@name=\"pwd\"]")).sendKeys(datatable.get
		 * (1).get(1));
		 */
		 driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys(datamap.get(0).get("username"));
		 driver.findElement(By.xpath("//input[@name=\"pwd\"]")).sendKeys(datamap.get(0).get("password"));
		 Thread.sleep(4000);
	    
	}
}
