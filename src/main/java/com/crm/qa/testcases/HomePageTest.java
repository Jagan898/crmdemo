package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.Homepage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.*;

public class HomePageTest extends TestBase {

	LoginPage loginpage;
	Homepage homepage;
	TestUtil testutil;
	ContactsPage contactpage;
	
	public HomePageTest() {
		super();
	}
	
		@BeforeMethod
		
		public void setup() throws Exception
		{
			initialization();
			testutil = new TestUtil();
			loginpage = new LoginPage(); 
			homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
			contactpage = new ContactsPage();
			
		}
	
	 
	@Test
	
	public void verifytitleTest()
	{
		String homepagetitle = homepage.verifyhomepagetitle();
		Assert.assertEquals(homepagetitle, "CRMPRO","home page not mached");  // here home page not matched will dispalyed when name is notmatched
	}
		
	@Test(priority=3)
	public void verifyContactsLinkTest(){
		testutil.frames();
		contactpage = homepage.clickonContactlink();
	}
		
		
		
		
		@AfterMethod
		
		public void teardown()
		{
			d.quit();
		}
}
