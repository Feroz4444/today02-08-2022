package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotelPage extends BaseclassOMR {

	public SearchHotelPage() {
		PageFactory.initElements(driver, this);
	}
	//Search hotel by selecting all fields
	@FindBy (id="location")
	private WebElement dDnLocation;

	@FindBy (id="hotels")
	private WebElement dDnHotels;

	@FindBy (id="room_type")
	private WebElement dDnRoomType;

	@FindBy (id="room_nos")
	private WebElement dDnRoomNo;

	@FindBy (id="datepick_in")
	private WebElement txtCheckInDate;

	@FindBy (id="datepick_out")
	private WebElement txtCheckOutDate;

	@FindBy (id="adult_room")
	private WebElement dDnAdultsPerRoom;

	@FindBy (id="child_room")
	private WebElement dDnChildrenPerRoom;

	@FindBy (id="Submit")
	private WebElement btnsubmit;

	@FindBy(xpath="//td[text()='Select Hotel ']")
	private WebElement txtselect;

	@FindBy (id="checkin_span")
	private WebElement dateCheckin;

	@FindBy (id="checkout_span")
	private WebElement dateCheckOut;

	@FindBy (id="location_span")
	private WebElement locationnerror;


	public WebElement getdDnLocation() {
		return dDnLocation;
	}

	public WebElement getdDnHotels() {
		return dDnHotels;
	}

	public WebElement getdDnRoomType() {
		return dDnRoomType;
	}

	public WebElement getdDnRoomNo() {
		return dDnRoomNo;
	}

	public WebElement getTxtCheckInDate() {
		return txtCheckInDate;
	}

	public WebElement getTxtCheckOutDate() {
		return txtCheckOutDate;
	}

	public WebElement getdDnAdultsPerRoom() {
		return dDnAdultsPerRoom;
	}

	public WebElement getdDnChildrenPerRoom() {
		return dDnChildrenPerRoom;
	}

	public WebElement getBtnsubmit() {
		return btnsubmit;
	}

	public WebElement getTxtselect() {
		return txtselect;
	}

	public WebElement getDateCheckin() {
		return dateCheckin;
	}

	public WebElement getDateCheckOut() {
		return dateCheckOut;
	}

	public WebElement getLocationnerror() {
		return locationnerror;
	}

	public void searchHotels(String location, String hotels, String roomType, 
			String noOfRooms, String checkIndate, String checkOutDate, 
			String adultsPerRoom, String childrenPerRoom) {

		SelectOptionByText(getdDnLocation(), location);
		SelectOptionByText(getdDnHotels(), hotels);
		SelectOptionByText(getdDnRoomType(), roomType);
		SelectOptionByText(getdDnRoomNo(), noOfRooms);
		txtClear(getTxtCheckInDate());
		type(getTxtCheckInDate(), checkIndate);
		txtClear(getTxtCheckOutDate());
		type(getTxtCheckOutDate(), checkOutDate);
		SelectOptionByText(getdDnAdultsPerRoom(), adultsPerRoom);
		SelectOptionByText(getdDnChildrenPerRoom(), childrenPerRoom);
		Click(getBtnsubmit());

	}

	//Search hotel page by only entering mandatory fields 
	public void searchHotels(String location,String noOfRooms,String checkIndate, 
			String checkOutDate, String adultsPerRoom) {
		SelectOptionByText(getdDnLocation(), location);
		SelectOptionByText(getdDnRoomNo(), noOfRooms);
		type(getTxtCheckInDate(), checkIndate);
		type(getTxtCheckOutDate(), checkOutDate);
		SelectOptionByText(getdDnAdultsPerRoom(), adultsPerRoom);
		Click(getBtnsubmit());
	}

	//Search hotel page without entering any data
	public void searchHotels() {
		Click(getBtnsubmit());

	}
}
