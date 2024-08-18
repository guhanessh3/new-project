package com.stepDefinition;

import org.junit.Assert;

import com.omrbranch.pagemanager.PageObjectManager;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Tc3_SelectHotelsStep {

	PageObjectManager pom = new PageObjectManager();
	
	

	@When("User save first hotel name and hotel price")
	public void user_save_first_hotel_name_and_hotel_price() {
	 pom.getSelecthotelpage().getFirstHotelName();
	 pom.getSelecthotelpage().getFirstHotelPrice();
	}
	@When("User Should select first hotel name and accept alert")
	public void user_should_select_first_hotel_name_and_accept_alert() {
		pom.getSelecthotelpage().clickFirstHotel();
	    
	}
	@Then("User Should verify {string} select message after select hotel")
    public void user_should_verify_select_message_after_select_hotel(String string) {
    Assert.assertTrue(pom.getBookhotelpage().getBookHotelText(string));
    
}
	
	@When("User save last hotel name and hotel price")
	public void user_save_last_hotel_name_and_hotel_price() {
	 pom.getSelecthotelpage().getlastHotelName();
	 pom.getSelecthotelpage().getLastHotelPrice();
	}
	@When("User Should select last hotel name and accept alert")
	public void user_should_select_last_hotel_name_and_accept_alert() {
		pom.getSelecthotelpage().clickLastHotel();   
	}




}

