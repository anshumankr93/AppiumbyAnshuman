package com.customer.pages;

import com.customer.base.TestBase;
import com.customer.util.TestUtil;

import io.appium.java_client.MobileElement;

public class WalkthroughPage extends TestBase {

	
	MobileElement next=(MobileElement)ad.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.winds.customer:id/btnSkip\")");    

     public WalkthroughPage() {

    
		// TODO Auto-generated constructor stub

	clickSkip();
	
	}
    
    public void clickSkip()
    {
    	next.click();
    }
}


