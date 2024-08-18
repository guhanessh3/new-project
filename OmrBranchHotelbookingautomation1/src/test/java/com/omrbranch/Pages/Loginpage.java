package com.omrbranch.Pages;

import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.management.loading.PrivateClassLoader;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omrbranch.baseclass.BaseClass;

public class Loginpage extends BaseClass{
	
	public Loginpage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id ="email")
	private WebElement username;
	
	@FindBy(id = "pass")
	private WebElement pass;
	
	@FindBy(xpath = ("//button[text()='Login']"))
	private WebElement login;
	
	@FindBy(id="errorMessage")
	private WebElement txterrormsg;

	
	public WebElement getUsername() {
		return username;
	}
	public WebElement getPass() {
		return pass;
	}
	public WebElement getLogin() {
		return login;
	}
	public WebElement getTxterrormsg() {
		return txterrormsg;
	}
	public void login(String emailId, String password) throws FileNotFoundException, IOException {
		elementSendKeys(username,emailId);
		elementSendKeys(pass, password);
		elementClick(login);
		
		
	}
	public void loginwithenterkey(String emailId,String password) throws AWTException {
		elementSendKeys(username, emailId);
		elementSendKeys(pass, password);
		pressenterkey();
	}
	public String geterrormsg() {
		String elementGetText = elementGetText(txterrormsg);
		return elementGetText;

	}

}
