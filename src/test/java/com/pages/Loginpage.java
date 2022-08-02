package com.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage extends BaseclassOMR {

	public Loginpage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "username")
	private WebElement txtUserName;

	@FindBy(id = "password")
	private WebElement txtPassword;

	@FindBy(id = "login")
	private WebElement btnLogin;

	@FindBy(xpath = "//div[@class='auth_error']")
	private WebElement txtErrorLogin;

	public WebElement getTxtUserName() {
		return txtUserName;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}

	public WebElement getTxtErrorLogin() {
		return txtErrorLogin;
	}

	public void login(String username, String password) throws IOException {
		String userName = getPropertyFileValue(username);
		String password1 = getPropertyFileValue(password);
		type(getTxtUserName(), userName);
		type(getTxtPassword(), password1);
		Click(getBtnLogin());
	}

	// Login with Enter Key
	public void loginWithEnter(String username, String password) throws AWTException, IOException {
		String userName = getPropertyFileValue(username);
		String password1 = getPropertyFileValue(password);
		type(getTxtUserName(), username);
		type(getTxtPassword(), password1);

		Robot robot = new Robot();

		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_TAB);

		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_TAB);

		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyPress(KeyEvent.VK_ENTER);
	}


}