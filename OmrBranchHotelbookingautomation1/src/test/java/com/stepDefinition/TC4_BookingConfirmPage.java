package com.stepDefinition;

import com.omrbranch.pagemanager.PageObjectManager;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC4_BookingConfirmPage {
	PageObjectManager pom = new PageObjectManager();
	

	@When("User add guest details {string}, {string}, {string}, {string} and {string}")
	public void user_add_guest_details_and(String string, String string2, String string3, String string4, String string5) {
	   
	}
	@When("User add gst details {string}, {string} and {string}")
	public void user_add_gst_details_and(String string, String string2, String string3) {
	    
	}
	@When("User add special request {string}")
	public void user_add_special_request(String string) {
	    
	}
	@When("User enter payment details proceed with card payment {string}")
	public void user_enter_payment_details_proceed_with_card_payment(String string, io.cucumber.datatable.DataTable dataTable) {
	   
	}
	@Then("User should verify booking is confirmed {string} and save order id")
	public void user_should_verify_booking_is_confirmed_and_save_order_id(String string) {
	   
	}
	@Then("User should verify whether same selected hotel name is displayed after booking")
	public void user_should_verify_whether_same_selected_hotel_name_is_displayed_after_booking() {
	 
	}




}
