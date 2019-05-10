package com.customer.pages;

import com.customer.base.TestBase;

import io.appium.java_client.MobileElement;

public class OnBoardPage  extends TestBase {

	
	MobileElement next=(MobileElement)ad.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.winds.customer:id/btnSkip\")");    

     public OnBoardPage() {

    
		// TODO Auto-generated constructor stub

	clickSkip();
	
	}
    
    public void clickSkip()
    {
    	next.click();
    }
}
