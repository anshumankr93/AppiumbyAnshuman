package com.customer.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.customer.base.TestBase;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class LanguageSwitcherPage extends TestBase{


	//@AndroidFindBy(uiAutomator="new UiSelector().resourceId(\"com.template:id/btn_next\")")
	
	MobileElement next=(MobileElement)ad.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.winds.customer:id/btn_next\")");    

	
     public LanguageSwitcherPage() {

    
		// TODO Auto-generated constructor stub

	clickNext();
	
	}
    
    public void clickNext()
    {
    	next.click();
    }
}
