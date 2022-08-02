package com.Report;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Reporting {

	public static void generateJVMReport(String jsonFile) {

		//1. Mention the path of JVM report to store
		File file = new File("C:\\Users\\Lenovo\\eclipse-workspace\\OMRBranchAdactinAutomation\\target\\JVMreports");

		//2. Create object for Configuration
		Configuration configuration = new Configuration(file, "OMR Adactin Automation");

		//3. Add browser,version,OS details
		configuration.addClassifications("Browser", "Chrome");
		configuration.addClassifications("Version", "108.1");
		configuration.addClassifications("OS", "WIN10");
		
		//4.Create the object for ReportBuilderClass-->pass the json file
		List<String>jsonfiles = new ArrayList<String>();
		jsonfiles.add(jsonFile);
		ReportBuilder reportbuilder = new ReportBuilder(jsonfiles,configuration);
		
		//5.Fetch results from jsonfile--->pass & fail
		reportbuilder.generateReports();
		
	}


}
