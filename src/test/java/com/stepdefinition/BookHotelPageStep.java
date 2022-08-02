package com.stepdefinition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.pagemanager.PageObjectManager;
import com.pages.BaseclassOMR;

import cucumber.api.java.en.Then;

public class BookHotelPageStep extends BaseclassOMR {
	PageObjectManager pom = new PageObjectManager();

	@Then("User should Book a hotel {string},{string},{string}")
	public void userShouldBookAHotel(String firstName, String lastName, 
			String address,io.cucumber.datatable.DataTable dataTable) throws InterruptedException {

		List<Map<String, String>> asMaps = dataTable.asMaps();
		Map<String, String> map = asMaps.get(2);
		String cardno = map.get("cardno");
		String cardType = map.get("cardType");
		String cardMonth = map.get("cardMonth");
		String cardYear = map.get("cardYear");
		String cardCvv = map.get("cardCvv");

		pom.getBookAHotel().bookHotel(firstName, lastName, address, cardno, cardType, cardMonth, cardYear, cardCvv);

	}

	@Then("User should verify after Book now it is navigating to Booking Confirmation Page {string}")
	public void userShouldVerifyAfterBookNowItIsNavigatingToBookingConfirmationPage(String expectedBookingMessage) {

	Assert.assertEquals("Verify booking message",expectedBookingMessage, getText(pom.getBookAHotel().getTxtconfirmation()));
	}

	@Then("User should not enter any fields and click Book now option")
	public void userShouldNotEnterAnyFieldsAndClickBookNowOption() {

		pom.getBookAHotel().bookHotelWithoutDatas();



	}

	@Then("User should verify in Book hotel after click Book now it shows an error message {string}, {string}, {string},{string}, {string}, {string} and {string} ")
	public void userShouldVerifyInBookHotelAfterClickBookNowItShowsAnErrorMessage(String expectedFirstNameErrorMessage, 
			String expectedLasttNameErrorMessage, String expectedAddressErrorMessage, String expectedCardNumberErrorMessage,
			String expectedCardTypeErrorMessage,String expectedExpiryMonthErrorMessage, String expectedCvvErrorMessage) {

		Assert.assertEquals("Verify",expectedFirstNameErrorMessage, getText(pom.getBookAHotel().getTxtfirstnamenew()));
		Assert.assertEquals("Verify",expectedLasttNameErrorMessage, getText(pom.getBookAHotel().getTxtlastnamenew()));
		Assert.assertEquals("Verify",expectedAddressErrorMessage, getText(pom.getBookAHotel().getTxtaddressnew()));
		Assert.assertEquals("Verify",expectedCardNumberErrorMessage, getText(pom.getBookAHotel().getTxtcardnonew()));
		Assert.assertEquals("Verify",expectedCardTypeErrorMessage, getText(pom.getBookAHotel().getTxtcctypenew()));
		Assert.assertEquals("Verify",expectedExpiryMonthErrorMessage, getText(pom.getBookAHotel().getTxtexpirynew()));
		Assert.assertEquals("Verify",expectedCvvErrorMessage, getText(pom.getBookAHotel().getTxtcvvnew()));
	}

}
