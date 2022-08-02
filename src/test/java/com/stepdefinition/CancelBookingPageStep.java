package com.stepdefinition;

import org.junit.Assert;

import com.pagemanager.PageObjectManager;
import com.pages.BaseclassOMR;

import cucumber.api.java.en.Then;

/**
 * 
 * @author Feroz K
 *@Description Peform Cancel Booking in Adactin Hotel
 *@Date 11/07/2022
 */

public class CancelBookingPageStep extends BaseclassOMR {
	PageObjectManager pom = new PageObjectManager();

	@Then("User should Cancel the Generated OrderID")
	public void userShouldCancelTheGeneratedOrderID() throws Exception {
		String getOrderid = pom.getBookingConfirmation().orderConfirmation();
		pom.getCancelBooking().cancelBook(getOrderid);

	}

	@Then("User should verify the Cancelled message {string}")
	public void userShouldVerifyTheCancelledMessage(String expectedErrorMessage) {

		Assert.assertEquals(expectedErrorMessage, getText(pom.getCancelBooking().getTextcancelerror()));
	}

	@Then("User should Cancel the Booked OrderID {string}")
	public void userShouldCancelTheBookedOrderID(String orderid) throws Exception {
		pom.getCancelBooking().cancelBook(orderid);

	}


}
