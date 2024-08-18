package com.omrbranch.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyBookingPage {
	@FindBy(xpath="//h4[contains(text(),'Bookings')]")
	private WebElement textMyBooking;
	
	@FindBy(xpath="(//h5[text()='Park Hyatt Studio'])[1]")
	private WebElement textHotelName;
	
	@FindBy(className="room-code")
	private WebElement textRoomCode;

	@FindBy(className="total-prize")
	private WebElement textTotalPrice;
	
	@FindBy(xpath="(//button[text()='Edit'])[1]")
	private WebElement btnEdit;
	
	@FindBy(name="check_in")
	private WebElement checkInTable;
	
	@FindBy(xpath="//a[text()='18']")
	private WebElement dateCheckIn;
	
	@FindBy(xpath="//button[text()='Confirm']")
	private WebElement btnConfirm;
	
	@FindBy(className="alertMsg")
	private WebElement textAlertMsg;
	
	@FindBy(xpath="//h4[contains(text(),'Bookings')]")
	private WebElement textAfterButton;
	
	@FindBy(xpath="(//h5[text()='Park Hyatt Studio'])[1]")
	private WebElement textHotelNameAfterUpdate;
	
	@FindBy(className="room-code")
	private WebElement textRoomCodeAfterUpdate;
	
	@FindBy(className="total-prize")
	private WebElement textRoomPriceAfterUpdate;

	public WebElement getTextMyBooking() {
		return textMyBooking;
	}

	public WebElement getTextHotelName() {
		return textHotelName;
	}

	public WebElement getTextRoomCode() {
		return textRoomCode;
	}

	public WebElement getTextTotalPrice() {
		return textTotalPrice;
	}

	public WebElement getBtnEdit() {
		return btnEdit;
	}

	public WebElement getCheckInTable() {
		return checkInTable;
	}

	public WebElement getDateCheckIn() {
		return dateCheckIn;
	}

	public WebElement getBtnConfirm() {
		return btnConfirm;
	}

	public WebElement getTextAlertMsg() {
		return textAlertMsg;
	}

	public WebElement getTextAfterButton() {
		return textAfterButton;
	}

	public WebElement getTextHotelNameAfterUpdate() {
		return textHotelNameAfterUpdate;
	}

	public WebElement getTextRoomCodeAfterUpdate() {
		return textRoomCodeAfterUpdate;
	}

	public WebElement getTextRoomPriceAfterUpdate() {
		return textRoomPriceAfterUpdate;
	}

}
