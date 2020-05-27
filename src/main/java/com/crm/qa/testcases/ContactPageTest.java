package com.crm.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.Homepage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;

public class ContactPageTest extends TestBase {
	
	LoginPage loginpage;
	TestUtil util;
	Homepage homepage;
	ContactsPage contactspage;
	
	public  ContactPageTest()
	{
		super();
	}

	@BeforeMethod
	
	public void setup() throws Throwable
	{
		initialization();
		loginpage = new LoginPage();
		util = new TestUtil();
		homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		contactspage = homepage.clickonContactlink();
	}
	
	@Test
	
	public void CreateNewContact() throws Exception
	{
		 homepage.clickOnNewContactLink();
		 contactspage.createNewContcat("Mr", "Vinod", "Kumar");
		 
		 
	}
	
	@DataProvider
	
	
	public void getTestData()
	{
		
	}
	
	
	@AfterMethod
	
	public void teardown()
	{
		
		d.quit();
	}
	
}
