package com.test.pageobjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LogoutPage extends BaseClass{

	public LogoutPage(WebDriver driver){
		super(driver);
	}    

	@FindBy(how=How.CLASS_NAME, className="logout")
	public static WebElement signout_button;
	
		
}
