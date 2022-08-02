package com.stepdefinition;
import org.junit.Assert;

import com.pagemanager.PageObjectManager;
import com.pages.BaseclassOMR;

import cucumber.api.java.en.Then;

public class SelectHotelPageStep extends BaseclassOMR {
	PageObjectManager pom = new PageObjectManager();
	
	@Then("User should select the hotel and click continue")
	public void userShouldSelectTheHotelAndClickContinue() {
		pom.getSelectHotel().selectHotel();
	    
	}

	@Then("User should verify after continue and it is navigating to book a hotel page {string}")
	public void userShouldVerifyAfterContinueAndItIsNavigatingToBookAHotelPage(String expectedBookHotelMessage) {

//				System.out.println(pom.getSelectHotel().getTxtBookAHotel().getText());
		
		Assert.assertEquals("Verify error",expectedBookHotelMessage, getText(pom.getSelectHotel().getTxtBookAHotel()));
	}

	@Then("User should not select the hotel and click continue option")
	public void userShouldNotSelectTheHotelAndClickContinueOption() {
		pom.getSelectHotel().ClickContinue();
	  
	}

	@Then("User should verify in select hotel after click continue it shows an error message {string}")
	public void userShouldVerifyInSelectHotelAfterClickContinueItShowsAnErrorMessage(String expectedSelecthotelErrorMessage) {
//		System.out.println(getText(pom.getSelectHotel().getTxtcontinue()));

		Assert.assertEquals("Verify error",expectedSelecthotelErrorMessage, getText(pom.getSelectHotel().getTxtcontinue()));
	
	}

	
	
}
