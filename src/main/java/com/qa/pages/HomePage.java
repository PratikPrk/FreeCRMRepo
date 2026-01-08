package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class HomePage extends TestBase{
	
	@FindBy(xpath = "//span[contains(text(),'Pratik Naidu')]")
	WebElement UserNameLabel;
	
	@FindBy(xpath = "//a[@href='/contacts']/following-sibling::button")
	WebElement ContactsAddBtn;
	
	@FindBy(xpath = "//a[@href='/deals']/following-sibling::button")
	WebElement DealsAddBtn;
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);

	}
	
	public String VerifyHomePageTitle()
	{
		return driver.getTitle();
	}
	
	public boolean VerifyCorrectUserName()
	{
		return UserNameLabel.isDisplayed();
	}
	
	public void ClickOnNewContactlnk()
	{
		Actions action = new Actions(driver);
		action.moveToElement(ContactsAddBtn).build().perform();
		ContactsAddBtn.click();
	}
}
