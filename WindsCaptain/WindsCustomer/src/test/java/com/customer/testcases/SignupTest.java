package com.customer.testcases;

import org.testng.annotations.Test;

import com.customer.base.TestBase;
import com.customer.pages.LoginPage;
import com.customer.pages.SignUpPage;

public class SignupTest extends TestBase {
	SignUpPage signup;
	String name=prop.getProperty("name");
	String uname=prop.getProperty("username");
	String pwd=prop.getProperty("password");
	
  //@Test(priority=5)
	public void signUpTest() throws InterruptedException{
		signup = new SignUpPage();
		//signup.signUp(name, uname, otp, pwd);   OTP reading
		
	}

	/*@AfterMethod
	public void tearDown(){
		ad.quit();
	}*/

}

