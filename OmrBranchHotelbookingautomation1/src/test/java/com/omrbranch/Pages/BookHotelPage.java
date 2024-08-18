package com.omrbranch.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omrbranch.baseclass.BaseClass;

public class BookHotelPage extends BaseClass {
	public BookHotelPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[text()='Guest Details']")
	private WebElement scrollDown;
	
	@FindBy(id="own")
	private WebElement btnOwn;
	
	@FindBy(id="user_title")
	private WebElement ddnMr;
	
	@FindBy(id="first_name")
	private WebElement txtFirstname;
	
	@FindBy(id="last_name")
	private WebElement txtLastname;
	
	@FindBy(id="user_phone")
	private WebElement txtPhoneNumber;
	
	@FindBy(id="user_email")
	private WebElement txtEmail;
	
	@FindBy(id="gst")
	private WebElement btnGst;
	
	@FindBy(id="gst_registration")
	private WebElement txtRegNumber;
	
	@FindBy(id="company_name")
	private WebElement txtGstCompanyname;
	
	@FindBy(id="company_address")
	private WebElement Address;
	
	@FindBy(id="step1next")
	private WebElement btnNext;
	
	@FindBy(id="step2next")
	private WebElement btnNext2;
	
	@FindBy(xpath="//h5[text()='Credit/Debit/ATM Card']")
	private WebElement btnCardPayment;
	
	@FindBy(id="payment_type")
	private WebElement ddnCard;
	
	@FindBy(id="card_type")
	private WebElement ddnCardType;
	
	@FindBy(id="card_no")
	private WebElement txtCardNumber;
	
	@FindBy(id="card_name")
	private WebElement txtCardname;
	
	@FindBy(xpath = "//h2[@class='px-3 py-2']")
	private WebElement BookHotelText;
	 
    public WebElement getBookHotelText() {
	return BookHotelText;
    }
	public WebElement getScrollDown() {
		return scrollDown;
	}

	public WebElement getBtnOwn() {
		return btnOwn;
	}

	public WebElement getDdnMr() {
		return ddnMr;
	}

	public WebElement getTxtFirstname() {
		return txtFirstname;
	}

	public WebElement getTxtLastname() {
		return txtLastname;
	}

	public WebElement getTxtPhoneNumber() {
		return txtPhoneNumber;
	}

	public WebElement getTxtEmail() {
		return txtEmail;
	}

	public WebElement getBtnGst() {
		return btnGst;
	}

	public WebElement getTxtRegNumber() {
		return txtRegNumber;
	}

	public WebElement getTxtGstCompanyname() {
		return txtGstCompanyname;
	}

	public WebElement getAddress() {
		return Address;
	}

	public WebElement getBtnNext() {
		return btnNext;
	}

	public WebElement getBtnNext2() {
		return btnNext2;
	}

	public WebElement getBtnCardPayment() {
		return btnCardPayment;
	}

	public WebElement getDdnCard() {
		return ddnCard;
	}

	public WebElement getDdnCardType() {
		return ddnCardType;
	}

	public WebElement getTxtCardNumber() {
		return txtCardNumber;
	}

	public WebElement getTxtCardname() {
		return txtCardname;
	}
	public boolean getBookHotelText(String Book) {
		String text = BookHotelText.getText();
		System.out.println(text);
		boolean contains = text.contains(Book);
		return contains;
	}
	private void addGuestDetails(String Salutation, String FirstName, String LastName,String MobileNo, String Email) {
		
		
		

	}
	
		

	}
	

