package com.omrbranch.Pages;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.omrbranch.baseclass.BaseClass;

public class SearchHotelPage extends BaseClass {

	public SearchHotelPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@data-testid='username']")
	private WebElement txtWelcomeMsg;
	@FindBy(id = "state")
	private WebElement state;
	@FindBy(id = "city")
	private WebElement city;
	@FindBy(id = "room_type")
	private WebElement roomtype;
	@FindBy(name = "check_in")
	private WebElement selectdate;
	@FindBy(xpath = "(//a[@class='ui-state-default'])[1]")
	private WebElement checkindate;
	@FindBy(name = "check_out")
	private WebElement selectdate2;
	@FindBy(xpath = "(//a[@class='ui-state-default'])[3]")
	private WebElement checkoutdate;
	@FindBy(id = "no_rooms")
	private WebElement rooms;
	@FindBy(id = "no_adults")
	private WebElement noofadults;
	@FindBy(id = "hotelsearch_iframe")
	private WebElement frame;
	@FindBy(id = "no_child")
	private WebElement child;
	@FindBy(id = "searchBtn")
	private WebElement btnsearch;
	@FindBy(id="invalid-state")
	private WebElement invalidstate;
	@FindBy(id="invalid-city")
	private WebElement invalidcity;
	@FindBy(id="invalid-check_in")
	private WebElement invalidchechin;
	@FindBy(id="invalid-check_out")
	private WebElement invalidcheckout;
	@FindBy(id="invalid-no_rooms")
	private WebElement invalidnorooms;
	@FindBy(id="invalid-no_adults")
	private WebElement invalidnoadults;
	
	

	public WebElement getTxtWelcomeMsg() {
		return txtWelcomeMsg;
	}

	public WebElement getState() {
		return state;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getSelectdate() {
		return selectdate;
	}

	public WebElement getCheckindate() {
		return checkindate;
	}

	public WebElement getSelectdate2() {
		return selectdate2;
	}

	public WebElement getCheckoutdate() {
		return checkoutdate;
	}

	public WebElement getRooms() {
		return rooms;
	}

	public WebElement getNoofadults() {
		return noofadults;
	}

	public WebElement getFrame() {
		return frame;
	}

	public WebElement getChild() {
		return child;
	}

	public WebElement getBtnsearch() {
		return btnsearch;
	}

	public WebElement getInvalidstate() {
		return invalidstate;
	}

	public WebElement getInvalidcity() {
		return invalidcity;
	}

	public WebElement getInvalidchechin() {
		return invalidchechin;
	}

	public WebElement getInvalidcheckout() {
		return invalidcheckout;
	}

	public WebElement getInvalidnorooms() {
		return invalidnorooms;
	}

	public WebElement getInvalidnoadults() {
		return invalidnoadults;
	}

	public String txtWelcome() {
		String text = txtWelcomeMsg.getText();
		return text;

	}

	public void selectddnelements(String txtstate, String txtcity, String txtroomType, String txtcheckInDate,
			String txtcheckOutDate, String txtnoofRoom, String txtNoOfAdult, String txtnoofChild) {

		elementDdnVisibleText(state, txtstate);
		elementDdnVisibleText(city, txtcity);
		selectRoomType(txtroomType);
		sendValuesJs(txtcheckInDate, selectdate);
		sendValuesJs(txtcheckOutDate, selectdate2);
		elementDdnVisibleText(rooms, txtnoofRoom);
		elementDdnVisibleText(noofadults, txtNoOfAdult);
		elementSendKeys(child, txtnoofChild);
		driver.switchTo().frame(frame);
		elementClick(btnsearch);

	}
	public void searchHotelwithonlyMandatoryFields(String txtstate, String txtcity, String txtcheckInDate,
			String txtcheckOutDate,String txtnoofRoom, String txtNoOfAdult) {
		elementDdnVisibleText(state, txtstate);
		elementDdnVisibleText(city, txtcity);
		sendValuesJs(txtcheckInDate, selectdate);
		sendValuesJs(txtcheckOutDate, selectdate2);
		elementDdnVisibleText(rooms, txtnoofRoom);
		elementDdnVisibleText(noofadults, txtNoOfAdult);
		driver.switchTo().frame(frame);
		elementClick(btnsearch);
		

	}
	public void clickonlysearchbutton() {
		driver.switchTo().frame(frame);
		elementClick(btnsearch);
	}
	public String getstateerrormsg() {
		driver.switchTo().parentFrame();
		return elementGetText(invalidstate);
		
       
	}
	public String getcityerrormsg() {
		return elementGetText(invalidcity);

	}
	public String getcheckindateerrormsg() {
		return elementGetText(invalidchechin);
	       
	}
	public String getcheckouterrormsg() {
	return elementGetText(invalidcheckout);	
	       
	}
	public String getnoofroomserrormsg() {
		return elementGetText(invalidnorooms);
		
	       
	}
	public String getnoofadultserrormsg() {
		return elementGetText(invalidnoadults);
	       
	}
	public void selectRoomType(String roomType) {
		String[] split = roomType.split("/");
		List<String> room = Arrays.asList(split);
		for (int i = 0; i < room.size();i++) {
			String string = room.get(i);
			if (string.equals("Room Type"))	{
				continue;
			}
			elementDdnVisibleText(getRoomtype(), string);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

