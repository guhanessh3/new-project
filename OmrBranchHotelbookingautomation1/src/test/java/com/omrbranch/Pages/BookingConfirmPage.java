package com.omrbranch.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BookingConfirmPage {
	@FindBy(name="booking-code")
	private WebElement textConfirmationNumber;
	
	@FindBy(xpath="//strong[text()='Park Hyatt']")
	private WebElement textHotelName;

	@FindBy(xpath="//button[text()='My Booking")
	private WebElement btnMyBooking;

	public WebElement getTextConfirmationNumber() {
		return textConfirmationNumber;
	}

	public WebElement getTextHotelName() {
		return textHotelName;
	}

	public WebElement getBtnMyBooking() {
		return btnMyBooking;
	}

}
