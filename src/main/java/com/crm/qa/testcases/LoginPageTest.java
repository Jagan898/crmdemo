package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.Homepage;
import com.crm.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {
	
	LoginPage loginpage;  //need to create object for loginpage(or) to use those elements
	Homepage homepage;   // for return hoempage for login method.
	
	public LoginPageTest()
	
	{
		super();
	//calling super call constructore(TestBase constructior
	
	}
	
	
	@BeforeMethod
	
	public void setup()
	{
		initialization();
		 loginpage = new LoginPage();
		
	}
	
	
	@Test(priority = 1)
	
	public void logintitletest()
	{
	String Title= loginpage.validatelogintitle();
	System.out.println(Title);
	Assert.assertEquals(Title, "CRMPRO - CRM software for customer relationship management, sales, and support.");
	}
	
	
	
	@Test(priority = 2)
	
	public void crmlogotest()
	{
		boolean logo = loginpage.validatelogo();
		Assert.assertTrue(logo);
	}
	
	@Test(priority = 3)
	
	public void login() throws Exception
	{
		Thread.sleep(3000);
		loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
		Thread.sleep(3000);
	}
	
	
	
	
	@AfterMethod
	
	public void teardown()
	{
		d.quit();
	}

}
