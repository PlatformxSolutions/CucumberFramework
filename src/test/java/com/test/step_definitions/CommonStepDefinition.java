package com.test.step_definitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;



import com.test.modules.SignInAction;
import com.test.modules.SignoutAction;



import com.test.pageobjects.LoginPage;
import com.test.pageobjects.LogoutPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CommonStepDefinition extends SuperUsedDefinition{

	public CommonStepDefinition()
	{
		super();
	}
	
	
	@Given("^User direct to the application$")
	public void user_direct_to_the_application() throws Throwable {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		System.out.println("url >"+url);
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}


	@When("^User log in$")
	public void user_log_in() throws Throwable {
		
		PageFactory.initElements(driver, LoginPage.class);
		SignInAction.Execute(driver,datamap.get(0));
	}
	@Then("^User log out$")
	public void user_log_out()throws Throwable{
		PageFactory.initElements(driver, LogoutPage.class);
		SignoutAction.Execute(driver);
	}
	
	
	//@When("^User click the name text box to edit \"(.*)\"$")
}	
	