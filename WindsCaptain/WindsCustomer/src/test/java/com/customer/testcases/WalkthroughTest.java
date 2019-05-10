package com.customer.testcases;

import org.testng.annotations.Test;

import com.customer.base.TestBase;
import com.customer.pages.LanguageSwitcherPage;
import com.customer.pages.LoginPage;
import com.customer.pages.WalkthroughPage;
import com.customer.util.TestUtil;

public class WalkthroughTest extends TestBase{
	 WalkthroughPage obj;

		
		@Test(priority=2)
	  public void setUp() throws InterruptedException {
	 

			long sleepTime=TestUtil.sleepTime;
			Thread.sleep(sleepTime);
			 obj=new WalkthroughPage();
	
	  }  
}
		
