package com.crm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.crm.qa.base.TestBase;

public class ContactsPage extends TestBase {
	
	public  ContactsPage()
	{
		PageFactory.initElements(d, this);
	}
	
	@FindBy(xpath= "//a[contains(text(),'Contacts')]")
	WebElement contactsLabel;
	

	@FindBy(id="first_name")
	WebElement firstName;
	
	@FindBy(id="surname")
	WebElement lastName;
	
	@FindBy(name="client_lookup")
	WebElement company;
	
	@FindBy(xpath = "//input[@type='submit' and @value='Save']")
	WebElement saveBtn;
	
	
public void createNewContcat(String title, String fname ,String Lname) throws Exception

{
	Select select = new Select(d.findElement(By.name("title")));
	
	select.selectByVisibleText(title);
	
	firstName.sendKeys(fname);
	Thread.sleep(2000);
	lastName.sendKeys(Lname);
	Thread.sleep(2000);
	saveBtn.click();
	
}



}


