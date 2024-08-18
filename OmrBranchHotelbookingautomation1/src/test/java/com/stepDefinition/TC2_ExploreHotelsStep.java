package com.stepDefinition;

import org.junit.Assert;

import com.omrbranch.pagemanager.PageObjectManager;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC2_ExploreHotelsStep {
	PageObjectManager pom = new PageObjectManager();
	
	
	
	
	@When("User Search hotels {string}, {string}, {string}, {string}, {string}, {string}, {string} and {string}")
	public void user_search_hotels_and(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) {
	    pom.getSearchhotelpage().selectddnelements(string, string2, string3, string4, string5, string6, string7, string8);
	}





	@Then("User Should verify after Search hotels success message {string}")
	public void user_should_verify_after_search_hotels_success_message(String string) {
		String selectHotelTxt = pom.getSelecthotelpage().getSelectHotelTxt();
		System.out.println(selectHotelTxt);
		boolean contains = selectHotelTxt.contains(string);
		System.out.println(contains);
		Assert.assertTrue("verify txt", contains);
	}
	
	@When("User Search hotels {string}, {string}, {string}, {string}, {string} and {string}")
	public void user_search_hotels_and(String state, String city, String checkInDate, String checkOutDate, String noOfRoom, String noOfAdult) {
	    pom.getSearchhotelpage().searchHotelwithonlyMandatoryFields(state, city, checkInDate, checkOutDate,noOfRoom, noOfAdult);
	}
	
	@When("User click Search button")
	public void user_click_search_button() {
	 pom.getSearchhotelpage().clickonlysearchbutton();  
	}
	@Then("User Should verify {string},{string},{string},{string},{string} and {string}")
	public void user_should_verify_and(String string, String string2, String string3, String string4, String string5, String string6) {
		Assert.assertEquals("Verify the state error msg", string, pom.getSearchhotelpage().getstateerrormsg());
	    Assert.assertEquals("Verify the city error msg", string2, pom.getSearchhotelpage().getcityerrormsg());
	    Assert.assertEquals("Verify the checkin error msg", string3,pom.getSearchhotelpage().getcheckindateerrormsg());
	    Assert.assertEquals("Verify the checkOut error msg", string4, pom.getSearchhotelpage().getcheckouterrormsg());
	    Assert.assertEquals("Verify the noRoom error msg", string5, pom.getSearchhotelpage().getnoofroomserrormsg());
	    Assert.assertEquals("Verify the noAdult error msg", string6, pom.getSearchhotelpage().getnoofadultserrormsg());
	  
	}

	

	@When("User click price low to high option")
	public void user_click_price_low_to_high_option() throws InterruptedException {
	pom.getSelecthotelpage().clickHotelPriceLowToHigh();   
	}
	@Then("User should verify the hotel prices are sorted from low to high")
	public void user_should_verify_the_hotel_prices_are_sorted_from_low_to_high() {
	 Assert.assertTrue(pom.getSelecthotelpage().verifyHotelPricesLowToHigh());   
	}

	

	@When("User click price high to low option")
	public void user_click_price_high_to_low_option() throws InterruptedException {
	 pom.getSelecthotelpage().clickhotelpricesHighTolow();   
	}
	@Then("User should verify the hotel prices are sorted from high to low")
	public void user_should_verify_the_hotel_prices_are_sorted_from_high_to_low() {
	 Assert.assertTrue(pom.getSelecthotelpage().verifypricesHighTOLow());   
	}
	
	@When("User click name assending order")
	public void user_click_name_assending_order() {
	 pom.getSelecthotelpage().VerifyHotelNameAsc();   
	}
	@Then("User should verify the hotel prices are sorted from assending order")
	public void user_should_verify_the_hotel_prices_are_sorted_from_assending_order() {
	  Assert.assertTrue(pom.getSelecthotelpage().VerifyHotelNameAsc()); 
	}

	
	@When("User click name descending order")
	public void user_click_name_descending_order() {
	 pom.getSelecthotelpage().VerifyHotelNamedes(); 
	}
	@Then("User should verify the hotel prices are sorted from descending order")
	public void user_should_verify_the_hotel_prices_are_sorted_from_descending_order() {
	Assert.assertTrue(pom.getSelecthotelpage().VerifyHotelNamedes());    
	}
	

	@Then("User should verify the header contains only the selected roomtype {string}")
	public void user_should_verify_the_header_contains_only_the_selected_roomtype(String string) {
	  Assert.assertEquals("Verify RoomType in header", string, pom.getSelecthotelpage().getRoomTypeInHeader());
	}

	

	@Then("User Should verify the hotel names ends with selected room type {string}")
	public void user_should_verify_the_hotel_names_ends_with_selected_room_type(String string) {
	    Assert.assertFalse(pom.getSelecthotelpage().getHotelNamesEndsWithRoomType(string));
	}















}
