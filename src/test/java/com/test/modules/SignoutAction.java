package com.test.modules;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import com.test.helpers.Log;

import com.test.pageobjects.LogoutPage;

public class SignoutAction extends SleepFunctionality{

	public static void Execute(WebDriver driver) throws Exception{
		
		Log.info("Click action is performed on Dropdown icon");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Log.info("Click action is performed on Signout button");
		LogoutPage.signout_button.click();
		sleepTime();
		Reporter.log("Sign out is performed");

	}
	
	
}
