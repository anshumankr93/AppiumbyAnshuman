package com.customer.testcases;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.junit.runner.Description;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.customer.base.TestBase;
import com.customer.pages.LoginPage;
import com.customer.util.ExcelUtil;

public class LoginTest extends TestBase {
	LoginPage log=new LoginPage();
	
	/*String uname=prop.getProperty("username");
	String pwd=prop.getProperty("password");*/
	

	public LoginTest(){
		
	}

	/*@BeforeMethod
	public void setUp() throws InterruptedException{
		initialization();
		log = new LoginPage();	
	}*/
	
	@Test(priority=5, description=" invalid username ")
	public void loginTest() throws InterruptedException{
		
		    XSSFRow row=ExcelUtil.getRowData(0);
			log.login(row);
			}
	
	//@Test(priority=6)    
	public void signUp_from_login_Test() throws InterruptedException{
	
		log.signUp();
		
	}
	
	
	/*@AfterMethod
	public void tearDown(){
		ad.quit();
	}*/

}
