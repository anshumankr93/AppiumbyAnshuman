package com.customer.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.customer.util.ExcelUtil;
import com.customer.util.TestUtil;
import com.customer.util.WebEventListener;

import io.appium.java_client.android.AndroidDriver;

public class TestBase {

	public static AndroidDriver ad;
	public static Properties prop;
	public  static EventFiringWebDriver e_driver;
	public static WebEventListener eventListener;
	
	public TestBase() {
		
		System.out.println("Testbase");
		// TODO Auto-generated constructor stub
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+ "/src/main/java/com/customer"
					+ "/config/config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void initialization() throws InterruptedException{
		
		System.out.println("initialization");
		// ExcelUtil.setExcelFileSheet("LoginData");
		DesiredCapabilities caps = new DesiredCapabilities();
	
		
		 String deveiceName=prop.getProperty("deviceName");
		 String udId=prop.getProperty("udid");
		 String platformName=prop.getProperty("platformName");
		 String platformVersion=prop.getProperty("platformVersion");
		 String appPackage=prop.getProperty("appPackage");
		 String appActivity=prop.getProperty("appActivity");
		 String noReset=prop.getProperty("noReset");
		
		 caps.setCapability("deviceName", deveiceName);
		 //System.out.println("uid:"+udId);
		 //caps.setCapability("udid", udId);
		 
		 caps.setCapability("platformName", platformName);
		 caps.setCapability("platformVersion", platformVersion);
		 caps.setCapability("appPackage", appPackage);
		 caps.setCapability("appActivity", appActivity);
		 caps.setCapability("devicenoReset", noReset);
		 
		 
		String url=prop.getProperty("url");
		try {
			ad=new AndroidDriver(new URL(url), caps);
		}
		catch(Exception e)
		{
			System.out.println("Exception  "+e.getMessage());
		}
		long sleepTime=TestUtil.sleepTime;
		Thread.sleep(sleepTime);
		System.out.println("end of initialization");
	}
	
}
