package com.customer.testcases;

import org.testng.annotations.Test;

import com.customer.base.TestBase;
import com.customer.pages.HomeScreenPage;
import com.customer.pages.WalkthroughPage;
import com.customer.util.TestUtil;


public class HomeScreenTest  extends TestBase{
	 HomeScreenPage obj;

		
		@Test(priority=4)
	  public void setUp() throws InterruptedException {


			long sleepTime=TestUtil.sleepTime;
			Thread.sleep(sleepTime);
	  obj=new HomeScreenPage();
	   

	  }
}
		
