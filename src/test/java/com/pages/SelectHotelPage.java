package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotelPage extends BaseclassOMR {
	
	public SelectHotelPage() {
		PageFactory.initElements(driver, this);
	}

	//Select hotel page by selecting a hotel

		@FindBy(id="radiobutton_0")
		private WebElement btnRadio;

		@FindBy(id="continue")
		private WebElement btnContinue;
		
		@FindBy(xpath="//td[text()='Book A Hotel ']")
		private WebElement txtBookAHotel;
		
		@FindBy(id="radiobutton_span")
		private WebElement txtcontinue;

		
		public WebElement getBtnRadio() {
			return btnRadio;
		}


		public WebElement getBtnContinue() {
			return btnContinue;
		}


		public WebElement getTxtBookAHotel() {
			return txtBookAHotel;
		}


		public WebElement getTxtcontinue() {
			return txtcontinue;
		}


		public void selectHotel() {
			Click(getBtnRadio());
			Click(getBtnContinue());
		}


		//Select hotel page by not selecting any hotel
		public void ClickContinue() {
			Click(getBtnContinue());

		}
	}
