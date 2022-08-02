package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.Report.Reporting;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(tags = "@Login", dryRun= false, snippets = SnippetType.CAMELCASE, plugin = { "pretty",
		"json:target/reports1.json" }, monochrome = true, features = {
				"src\\test\\resources\\" }, glue = { "com.stepdefinition" })

public class TestRunnerClass {

	@AfterClass
	public static void afterclass() {
		Reporting.generateJVMReport(
				"C:\\Users\\Lenovo\\eclipse-workspace\\OMRBranchAdactinAutomation\\target\\reports1.json");

	}
}