package com.customer.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.customer.base.TestBase;
import com.customer.pages.LanguageSwitcherPage;

public class LanguageSwitcherTest extends TestBase {

  LanguageSwitcherPage obj;

	public LanguageSwitcherTest() {
		
		// TODO Auto-generated constructor stub
		super(); //It will call TestBase() constructor from parent class
		
	
	}
	@Test(priority=1)
  public void setUp() throws InterruptedException {
  initialization();
 
  obj=new LanguageSwitcherPage();
   

    
  }

	
	
	/*@AfterMethod
	public void tearDown()
	{
		ad.quit();
	}*/
}
