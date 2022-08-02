package com.stepdefinition;

import org.junit.Assert;

import com.pagemanager.PageObjectManager;
import com.pages.BaseclassOMR;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchHotelPageStep extends BaseclassOMR {
	PageObjectManager pom = new PageObjectManager();
	
	@When("User should search hotels {string}, {string}, {string}, {string}, {string}, {string}, {string} and {string}")
	public void userShouldSearchHotelsAnd(String location, String hotels, String roomType, 
							String roomNos, String DatePickIn,String DatePickout,
							String adultRoom, String childRoom) {

	pom.getSearchHotel().searchHotels(location, hotels, roomType, roomNos, DatePickIn, DatePickout, adultRoom, childRoom);
	}

	@Then("User should verify it is navigating to select hotel page {string}")
	public void userShouldVerifyItIsNavigatingToSelectHotelPage(String expectedSelectHotelMessage) {
		
		Assert.assertEquals("Verify error",expectedSelectHotelMessage, getText(pom.getSearchHotel().getTxtselect()));
	}

	@When("User should search hotels {string}, {string}, {string}, {string} and {string}")
	public void userShouldSearchHotelsAndEnterMandatoryFields(String location,
			String roomNos,String DatePickIn,String DatePickout, String adultRoom) {
		
	pom.getSearchHotel().searchHotels(location, roomNos, DatePickIn, DatePickout, adultRoom);

	}

	@Then("User should verify after searching hotel get date error message as {string}, {string}:")
	public void userShouldVerifyAfterSearchingHotelGetDateErrorMessageAs(String expectedDateInErrorMessage, String expectedDateOutErrorMessage) {

		Assert.assertEquals(expectedDateInErrorMessage, getText(pom.getSearchHotel().getDateCheckin()));
		Assert.assertEquals(expectedDateOutErrorMessage, getText(pom.getSearchHotel().getDateCheckOut()));
	}

	@When("User should search hotels without entering any of the fields")
	public void userShouldSearchHotelsWithoutEnteringAnyOfTheFields() {
		
		pom.getSearchHotel().searchHotels();

	}

	@Then("User should verify search hotel page error message as {string}")
	public void userShouldVerifySearchHotelPageErrorMessageAs(String expectedSearchHotelErrorMessage) {
				
		Assert.assertEquals(expectedSearchHotelErrorMessage, getText(pom.getSearchHotel().getLocationnerror()));

	}

}
