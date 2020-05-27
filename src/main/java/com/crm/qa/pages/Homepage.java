 package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class Homepage extends TestBase {
	
	
	@FindBy(xpath ="//td[contains(text(),'User: jagan mohan')]")
	WebElement Userlabel;
	
	@FindBy(xpath = "//a[contains(text(),'Contacts')]")
	WebElement Contacts;
	
	@FindBy(xpath = "//a[contains(text(),'Deals')]")
	WebElement Deals;
	
	@FindBy(xpath = "//a[contains(text(),'New Contact')]")
	WebElement newContactLink;
	
	
	@FindBy(xpath = "//a[contains(text(),'Tasks')]")
	WebElement Tasks;

	//private WebElement contactsLink;
	
	public Homepage()
	{
		PageFactory.initElements(d, this);
	}

	
	public String verifyhomepagetitle()
	{
		return d.getTitle();
	}
	
	public ContactsPage clickonContactlink()
	{
		Contacts.click();
		return new ContactsPage();
	}
	
	public DealsPage clickonDeals()
	{
		Deals.click();
		return new DealsPage();
	}
	
	public TaskPage clickonTask()
	{
		Tasks.click();
		return new TaskPage();
	}
	
	public void clickOnNewContactLink(){
		Actions action = new Actions(d);
		action.moveToElement(Contacts).build().perform();
		newContactLink.click();
	
}
}
	