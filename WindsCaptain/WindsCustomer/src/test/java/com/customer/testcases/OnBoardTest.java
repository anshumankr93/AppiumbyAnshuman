package com.customer.testcases;

import org.testng.annotations.Test;

import com.customer.base.TestBase;
import com.customer.pages.OnBoardPage;
import com.customer.pages.WalkthroughPage;
import com.customer.util.TestUtil;



	public class OnBoardTest extends TestBase{
		 OnBoardPage obj;

			
			@Test(priority=3)
		  public void setUp() throws InterruptedException {
		 

				long sleepTime=TestUtil.sleepTime;
				Thread.sleep(sleepTime);
		  obj=new OnBoardPage();
		


		  }  
	}
			
