package com.test.pageobjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
public class LoginPage extends BaseClass{

	public LoginPage(WebDriver driver){
		super(driver);
	}    
	/* @FindBy(how=How.XPATH, xpath=".//*[@id='header']/div[2]/div/div/nav/div[1]/a")
	 public static WebElement signin_button;*/
	 
	 @FindBy(how=How.XPATH, xpath="//*[@required=\"Please Enter Username\"]")
	 public static WebElement email;
		
	 @FindBy(how=How.XPATH, xpath="//*[@required=\"Please Enter Password\"]")
	 public static WebElement password;
	 
	 @FindBy(how=How.XPATH, xpath="//*[@onclick='login()']")
	 public static WebElement submit_button;

	
}