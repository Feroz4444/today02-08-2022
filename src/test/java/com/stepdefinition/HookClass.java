package com.stepdefinition;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.pages.BaseclassOMR;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HookClass extends BaseclassOMR {
	
	@Before
	public void beforeclass() throws IOException {
		getDriver("chromeDriver");
		String url = getPropertyFileValue("url");
		loadUrl(url);
		maximize();
		implicit();
	}
		
	@After
	public void afterClasss(Scenario s) {
	TakesScreenshot screenshot = (TakesScreenshot) driver;
	byte[] scrennshotAs =  screenshot.getScreenshotAs(OutputType.BYTES);
	s.embed(scrennshotAs, "Scenario");
	closeCurrentWindow();
		
	
	}
}
