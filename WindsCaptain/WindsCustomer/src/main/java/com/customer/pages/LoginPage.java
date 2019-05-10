package com.customer.pages;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.customer.base.TestBase;

import io.appium.java_client.MobileElement;

public class LoginPage extends TestBase{

	

	/*@FindBy(id="com.template:id/edt_email")
	WebElement un;
	@FindBy(id="com.template:id/edt_password")
	WebElement pwd;
	@FindBy(name="Sign in")
	WebElement sign_btn;  */
	 
	
    public LoginPage() {
	
    	
	}
    
    public void login(XSSFRow row)
    {
    	
    	MobileElement un=(MobileElement)ad.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.winds.customer:id/edt_email\")");
        MobileElement pwd=(MobileElement)ad.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.winds.customer:id/edt_password\")");
        MobileElement signin_btn=(MobileElement)ad.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.winds.customer:id/btn_signup\")");
       String username=row.getCell(3).toString();
       String pswd=row.getCell(4).toString();
        un.sendKeys(username);
    	pwd.sendKeys(pswd);
    	signin_btn.click();
    }
    
  /*  public void login(String uname,String pswd)
    {
    	
    	MobileElement un=(MobileElement)ad.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.winds.customer:id/edt_email\")");
        MobileElement pwd=(MobileElement)ad.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.winds.customer:id/edt_password\")");
        MobileElement signin_btn=(MobileElement)ad.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.winds.customer:id/btn_signup\")");
    	un.sendKeys(uname);
    	pwd.sendKeys(pswd);
    	signin_btn.click();
    }*/
    
    public void signUp()
    {
    	 MobileElement signup_btn=(MobileElement)ad.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.winds.customer:id/tv_register\")");
    	signup_btn.click();
    }
	
	public void rememberMe()
	{
		  MobileElement remember_checkbox=(MobileElement)ad.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.winds.customer:id/radiobutton_remberme\")");
		remember_checkbox.click();
	}
}
