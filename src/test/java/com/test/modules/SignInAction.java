package com.test.modules;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import com.test.helpers.Log;
import com.test.pageobjects.LoginPage;


public class SignInAction extends SleepFunctionality{

	public static void Execute(WebDriver driver,HashMap<String,String> map) throws Exception{
		
		Log.info("Click action is perfromed on My Account link" );
		
		//LoginPage.signin_button.click();
		
		LoginPage.email.sendKeys(map.get("username"));

		Log.info(" is entered in UserName text box" );
		
		LoginPage.password.sendKeys(map.get("password"));
		Log.info(" is entered in Password text box" );

		LoginPage.submit_button.click();
		sleepTime();
		
		Log.info("Click action is performed on Submit button");

		Reporter.log("SignIn Action is successfully perfomred");

	}
	
	
}
