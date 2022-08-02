package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @Description To find the locators and to generate getters for book hotel page
 * @author Lenovo
 * @Date 8/7/2022
 */
public class BookHotelPage extends BaseclassOMR {


	public BookHotelPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="first_name")
	private WebElement txtFirstName;

	@FindBy(id="last_name")
	private WebElement txtLastName;

	@FindBy(id="address")
	private WebElement txtAddress;

	@FindBy(id="cc_num")
	private WebElement txtcreditCardNo;

	@FindBy(id="cc_type")
	private WebElement dDnccType;

	@FindBy(id="cc_exp_month")
	private WebElement dDnccExpMonth;

	@FindBy(id="cc_exp_year")
	private WebElement dDnExpYear;

	@FindBy(id="cc_cvv")
	private WebElement txtCVV;

	@FindBy(id="book_now")
	public WebElement btnBook;

	@FindBy(xpath="//td[text()='Booking Confirmation ']")
	private WebElement txtconfirmation;

	@FindBy(id="first_name_span")
	public WebElement txtfirstnamenew;

	@FindBy(id="last_name_span")
	public WebElement txtlastnamenew;

	@FindBy(id="address_span")
	public WebElement txtaddressnew;

	@FindBy(id="cc_num_span")
	public WebElement txtcardnonew;

	@FindBy(id="cc_type_span")
	public WebElement txtcctypenew;

	@FindBy(id="cc_expiry_span")
	public WebElement txtexpirynew;

	@FindBy(id="cc_cvv_span")
	public WebElement txtcvvnew;


	public WebElement getTxtFirstName() {
		return txtFirstName;
	}

	public WebElement getTxtLastName() {
		return txtLastName;
	}

	public WebElement getTxtAddress() {
		return txtAddress;
	}

	public WebElement getTxtcreditCardNo() {
		return txtcreditCardNo;
	}

	public WebElement getdDnccType() {
		return dDnccType;
	}

	public WebElement getdDnccExpMonth() {
		return dDnccExpMonth;
	}

	public WebElement getdDnExpYear() {
		return dDnExpYear;
	}

	public WebElement getTxtCVV() {
		return txtCVV;
	}

	public WebElement getBtnBook() {
		return btnBook;
	}

	public WebElement getTxtconfirmation() {
		return txtconfirmation;
	}

	public WebElement getTxtfirstnamenew() {
		return txtfirstnamenew;
	}

	public WebElement getTxtlastnamenew() {
		return txtlastnamenew;
	}

	public WebElement getTxtaddressnew() {
		return txtaddressnew;
	}

	public WebElement getTxtcardnonew() {
		return txtcardnonew;
	}

	public WebElement getTxtcctypenew() {
		return txtcctypenew;
	}

	public WebElement getTxtexpirynew() {
		return txtexpirynew;
	}

	public WebElement getTxtcvvnew() {
		return txtcvvnew;
	}


	//book hotel page by selecting all fields
	/**
	 * @Description To Book Hotel by using the actions
	 * @param firstName
	 * @param lastName
	 * @param billingAddress
	 * @param creditCardNo
	 * @param creditCardType
	 * @param expiryMonth
	 * @param expiryYear
	 * @param cVVNumber
	 * @throws InterruptedException
	 */
	public void bookHotel(String firstName, String lastName, String billingAddress, 
			String creditCardNo, String creditCardType, String expiryMonth,
			String expiryYear, String cVVNumber) throws InterruptedException {
		type(getTxtFirstName(), firstName);
		type(getTxtLastName(), lastName);
		type(getTxtAddress(), billingAddress);
		type(getTxtcreditCardNo(), creditCardNo);
		SelectOptionByText(getdDnccType(), creditCardType);
		SelectOptionByText(getdDnccExpMonth(), expiryMonth);
		SelectOptionByText(getdDnExpYear(), expiryYear);
		type(getTxtCVV(), cVVNumber);
		Click(getBtnBook());
		Thread.sleep(1000);
	}

	//book hotel page without selecting any fields
	public void bookHotelWithoutDatas() {
		Click(getBtnBook());

	}
}