package com.test.step_definitions;

import java.util.ArrayList;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.test.entity.SignInUser;
import com.test.entity.WebUrl;
import com.test.helpers.DataHelper;


public class SuperUsedDefinition 
{
	 public WebDriver driver;
	 public static List<HashMap<String,String>> datamap = null;
	 public static String url = null;
	 
	public SuperUsedDefinition() {
		// initializing driver
    	driver = Hooks.driver;
    	// adding list to map
    	datamap = new ArrayList<HashMap<String,String>>();
    	SignInUser dUser = DataHelper.getUserFromPropertiesFile();
    	HashMap<String,String> sampleData = new HashMap<String,String>();
    	sampleData.put("username",dUser.getEmail());
    	sampleData.put("password",dUser.getPassword());
    	datamap.add(sampleData);
    	
    	WebUrl dUrl = DataHelper.getUrlFromPropertiesFile();
    	url = dUrl.getTarget_url();
    	
    	
    	// for loading CommonPage class at once 
    	//PageFactory.initElements(driver, PurchasePageObject.class);
	}

}
