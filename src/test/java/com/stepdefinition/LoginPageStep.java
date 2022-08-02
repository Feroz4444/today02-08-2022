package com.stepdefinition;
import java.awt.AWTException;
import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import com.pagemanager.PageObjectManager;
import com.pages.BaseclassOMR;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class LoginPageStep extends BaseclassOMR {
	
	PageObjectManager pom = new PageObjectManager();
	
	
	@Given("User is on the Adactin Page")
	public void userIsOnTheAdactinPage() throws IOException {
	

	}

	@When("User should perform login {string} , {string}")
	public void userShouldPerformLogin(String username, String password) throws IOException {
		
		pom.getLoginpage().login(username,password);

	}

	@When("User should perform login {string} , {string} using Enter key")
	public void userShouldPerformLoginUsingEnterKey(String username, String password) throws AWTException, IOException {
		
		pom.getLoginpage().loginWithEnter(username,password);;
	}

		
	@When("User should verify after login error message which contains {string}")
	public void userShouldVerifyAfterLoginErrorMessageWhichContains(String expectedErrorMessage) {
		
		WebElement txtErrorLogin =pom.getLoginpage().getTxtErrorLogin();
		Assert.assertTrue(txtErrorLogin.getText().contains(expectedErrorMessage));
	
	}
}
