package com.crm.qa.util;

import com.crm.qa.base.TestBase;

public class TestUtil extends TestBase {
	
	public static long Page_Load_TimeOuts = 5;
	public static long Implicit_Wait = 10;
	public static String TEST_SHEET_PATH = "E:\\Java Workspace\\FreeCRMTest\\src\\main\\java\\com\\crm\\qa\\testdata\\freecrm.xlsx";

	public  void frames() 
	{
	d.switchTo().frame("mainpanel");
	}
	
	
}
