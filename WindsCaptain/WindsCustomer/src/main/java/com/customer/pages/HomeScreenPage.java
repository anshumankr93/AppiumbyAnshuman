package com.customer.pages;

import com.customer.base.TestBase;

import io.appium.java_client.MobileElement;

public class HomeScreenPage extends TestBase {

		
	public HomeScreenPage() throws InterruptedException {

	click_Hb_Menu();
	
	click_Login_btn();
	//click_signup_btn();   
	}
    
    public void click_Hb_Menu() throws InterruptedException
    {
    	Thread.sleep(5000);
    	MobileElement hamburger_menu=(MobileElement)ad.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.winds.customer:id/img_main_menu\")");    
    	hamburger_menu.click();
    }
    public void click_Login_btn()
    {
    MobileElement login_btn=(MobileElement)ad.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.winds.customer:id/txt_login\")"); 
    login_btn.click();
    }
    public void click_signup_btn()
    {
    MobileElement signup_btn=(MobileElement)ad.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.winds.customer:id/txt_sign_up\")"); 
    signup_btn.click();
    }
}
