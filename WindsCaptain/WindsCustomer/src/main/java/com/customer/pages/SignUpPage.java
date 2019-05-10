package com.customer.pages;

import com.customer.base.TestBase;

import io.appium.java_client.MobileElement;

public class SignUpPage extends TestBase{

	
	
	
	MobileElement name_txt=(MobileElement)ad.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.winds.customer:id/edt_name\")");
   
     MobileElement uname_txt=(MobileElement)ad.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.winds.customer:id/edt_email\")");
   
    MobileElement otp_btn=(MobileElement)ad.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.winds.customer:id/tv_send_otp\")");
  
    
    MobileElement otp_txt=(MobileElement)ad.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.winds.customer:id/edt_otp\")");
    MobileElement pwd_txt=(MobileElement)ad.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.winds.customer:id/edt_password\")");
    MobileElement confirm_pwd_txt=(MobileElement)ad.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.winds.customer:id/edt_confirm_password\")");
    MobileElement referral_txt=(MobileElement)ad.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.winds.customer:id/edt_name_referal\")");
    MobileElement create_btn=(MobileElement)ad.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.winds.customer:id/btn_create_account\")");
    MobileElement terms_checkbox=(MobileElement)ad.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.winds.customer:id/chk_terms_and_conditions\")");
    
    public SignUpPage() {
	
		
	
	}
    
    public void signUp(String name,String uname,String otp,String password) throws InterruptedException
    {
    	name_txt.sendKeys(name);
    	uname_txt.sendKeys(uname);
    	otp_btn.click();
    	Thread.sleep(10000);
    	otp_txt.sendKeys(otp);
    	pwd_txt.sendKeys(password);
    	confirm_pwd_txt.sendKeys(password);
    	//referral_txt.sendKeys(refer);   optional
    	terms_checkbox.click();
    	create_btn.click();
    }
	
	
}
