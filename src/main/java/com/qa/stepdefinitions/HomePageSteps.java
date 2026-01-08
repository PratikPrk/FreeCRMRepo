package com.qa.stepdefinitions;

import org.testng.Assert;

import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.util.TestBase;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class HomePageSteps extends TestBase{
	LoginPage loginpage;
    HomePage homepage;
	
	@Given("^user opens browser$")
	public void user_opens_browser()
	{
		initialization();
		loginpage = new LoginPage();
	}
	
	@Then("^user is on login page$")
	public void user_is_on_login_page()
	{
		String title = loginpage.ValidateLoginPageTitle();
		Assert.assertEquals(title, "Free CRM");   //(actual,expected)
	}
	
	@Then("^user enters username and password$")
	public void user_enters_username_and_password() {

	    homepage = loginpage.login(
	            prop.getProperty("email"),
	            prop.getProperty("password")
	    );

	    Assert.assertNotNull(homepage);
	}

	
	@Then("^validate home page title$")
	public void validate_home_page_is_displayed() {

	    String title = homepage.VerifyHomePageTitle();
	    Assert.assertEquals("Free CRM", title);
	}
	
	@Then("^validate logged in username$")
	public void validate_logged_in_username()
	{
		Assert.assertTrue(homepage.VerifyCorrectUserName());
	}

}
