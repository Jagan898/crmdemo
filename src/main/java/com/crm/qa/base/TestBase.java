package com.crm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.crm.qa.util.TestUtil;

public class TestBase {
	
	public static WebDriver d;
	public static Properties prop; 
	
	public TestBase() {
	try {
		
		prop = new Properties();
		FileInputStream ip = new FileInputStream("C:\\Users\\Jagan\\git\\repository3\\crm\\src\\main\\java\\com\\crm\\qa\\config\\config.properties");
		prop.load(ip);
	}catch (FileNotFoundException e)
	{
		e.printStackTrace();
	}catch (IOException e) 
	{
		e.printStackTrace();
	}
	
	
	}
	
	public static void initialization()
	{
		String browsername= prop.getProperty("browser");
		if (browsername.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",  "D:\\selenium\\driver\\chromedriver.exe");
			d= new ChromeDriver();
		}else if (browsername.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "D:\\selenium\\geckodriver.exe");
			d= new FirefoxDriver();
			
		}
		
		//d.manage().deleteAllCookies();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(TestUtil.Implicit_Wait, TimeUnit.SECONDS);
		d.manage().timeouts().pageLoadTimeout(TestUtil.Page_Load_TimeOuts,TimeUnit.MINUTES);
		d.get(prop.getProperty("url"));
	}

}
