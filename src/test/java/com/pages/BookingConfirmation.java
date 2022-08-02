package com.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingConfirmation extends BaseclassOMR {
	
	public BookingConfirmation() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//td[@class='login_title']")
	private WebElement txtBookConfirmation;

	@FindBy(id="order_no")
	private WebElement orderID;


	public WebElement getTxtConfirmation() {
		return txtBookConfirmation;
	}

	public WebElement getOrderID() {
		return orderID;
	}

	public WebElement getBookedHistory() {
		return getBookedHistory();
	}

	public String orderConfirmation() throws IOException, InterruptedException {

		String attribute = getAttribute(orderID, "value");
		System.out.println(attribute);
		return attribute;
	}
}

