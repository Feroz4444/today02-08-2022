package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CancelBooking extends BaseclassOMR {
	
	public CancelBooking() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="order_id_text")
	private WebElement searchOrderID;

	@FindBy(id="search_hotel_id")
	private WebElement clickGo;

	@FindBy(id="check_all")
	private WebElement clickCheckBox;

	@FindBy(xpath="//input[contains(@name,'btn_id')]")
	private WebElement clickCancel;
	
	@FindBy(xpath="//a[text()='Booked Itinerary']")
	private WebElement bookedIternary;
	
	@FindBy(id="search_result_error")
	private WebElement textcancelerror;

	public WebElement getBookedIternary() {
		return bookedIternary;
	}

	public WebElement getTextcancelerror() {
		return textcancelerror;
	}

	private WebElement getSearchOrderID() {
		return searchOrderID;
	}

	public WebElement getClickGo() {
		return clickGo;
	}

	public WebElement getClickCheckBox() {
		return clickCheckBox;
	}

	public WebElement getClickCancel() {
		return clickCancel;
	}
	
	

	public void cancelBook(String searchID) throws Exception {
		Click(getBookedIternary());
		type(getSearchOrderID(), searchID);
		Click(getClickGo());
		Click(getClickCheckBox());
		Click(getClickCancel());
		acceptAlert();
	}

}
