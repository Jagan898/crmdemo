package com.crm.qa.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	//need to define object repoitary
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement loginbutton;
	
	
	
	@FindBy(name = "username")
	WebElement uname;
	
	@FindBy(name ="password")
	WebElement password;
	
	@FindBy(linkText = "Sign Up")
	WebElement  signupLink;
	
	@FindBy(linkText = "Pricing")
	WebElement pricingLink;
	
	@FindBy(linkText = "Features")
	WebElement featuresLink;
	
	@FindBy(xpath = "//img [contains(@class ,'img-responsive')]")
	
	WebElement logo;
	
	
	//Need to create constructor to initilize these elemets withthe help of page factor
	
	public LoginPage()
	{
		PageFactory.initElements(d, this);  //here this current class objects.
		
	}
	
	public  String  validatelogintitle()
	{
		return d.getTitle();
	}
	
	public   boolean validatelogo()
	{
		return logo.isDisplayed();
	}
	
	public void validatesigulink()
	{
	  signupLink.click();	
	}
	
	public void loginbutton()
	{
		
	}
	public Homepage  login(String un, String pw) throws Exception
	//now we want return home page we have given retrun type as home page class object
	
	{
		uname.sendKeys(un);		
		Thread.sleep(3000);
		password.sendKeys(pw);
		Thread.sleep(3000);
		loginbutton.click();
		
																					//JavascriptExecutor js = (JavascriptExecutor)d;
																					//js.executeScript("arguments[0].click();", loginbutton);
		Thread.sleep(3000);
		return new Homepage();
	
	}
	
}
