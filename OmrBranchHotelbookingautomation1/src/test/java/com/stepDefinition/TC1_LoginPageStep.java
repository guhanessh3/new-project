package com.stepDefinition;

import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.omrbranch.Pages.Loginpage;
import com.omrbranch.Pages.SearchHotelPage;
import com.omrbranch.baseclass.BaseClass;
import com.omrbranch.pagemanager.PageObjectManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC1_LoginPageStep extends BaseClass {
	PageObjectManager pom = new PageObjectManager();
	
	@Given("user is on OMR Branch Hotel Page")
	public void user_is_on_omr_branch_hotel_page() throws FileNotFoundException, IOException {
		
	}
	@When("user Login {string},{string}")
	public void user_login(String emailId, String password) throws FileNotFoundException, IOException {
		
		pom.getLoginpage().login(emailId, password);
	    
	}
	@Then("user should verify success message after login {string}")
	public void user_should_verify_success_message_after_login(String string) {
	    
	    String actual = pom.getSearchhotelpage().txtWelcome();
	    Assert.assertEquals("Verify welcome Message", string, actual);
	   
	}

	@When("user Login {string},{string} with enter key")
	public void user_login_with_enter_key(String string, String string2) throws AWTException {
	   pom.getLoginpage().loginwithenterkey(string, string2);
	   
	}
	
	@Then("user should verify error message after login {string}")
	public void user_should_verify_error_message_after_login(String string) throws InterruptedException {
		Thread.sleep(3000);
		   String geterrormsg = pom.getLoginpage().geterrormsg();
		   boolean contains = geterrormsg.contains(string);
		   Assert.assertTrue("verify error msg",contains);
	   
	}




	





	

}
