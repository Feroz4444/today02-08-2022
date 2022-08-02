package com.pagemanager;

import com.pages.BookHotelPage;
import com.pages.BookingConfirmation;
import com.pages.CancelBooking;
import com.pages.Loginpage;
import com.pages.SearchHotelPage;
import com.pages.SelectHotelPage;

public class PageObjectManager {
	
	private Loginpage loginpage;
	private SearchHotelPage searchHotel;
	private SelectHotelPage selectHotel;
	private BookHotelPage bookAHotel;
	private BookingConfirmation bookingConfirmation;
	private CancelBooking cancelBooking;
	
	
	public Loginpage getLoginpage() {
		return (loginpage==null)?loginpage = new Loginpage(): loginpage;
	}
	public SearchHotelPage getSearchHotel() {
		return(searchHotel==null)?searchHotel = new SearchHotelPage(): searchHotel;
	}
	public SelectHotelPage getSelectHotel() {
		return(selectHotel==null)?selectHotel = new SelectHotelPage(): selectHotel;
	}
	public BookHotelPage getBookAHotel() {
		return(bookAHotel==null)?bookAHotel = new BookHotelPage(): bookAHotel;
	}
	public BookingConfirmation getBookingConfirmation() {
		return(bookingConfirmation==null)?bookingConfirmation = new BookingConfirmation(): bookingConfirmation;
	}
	public CancelBooking getCancelBooking() {
		return(cancelBooking==null)?cancelBooking = new CancelBooking(): cancelBooking;
	}
	

	}
	
		


