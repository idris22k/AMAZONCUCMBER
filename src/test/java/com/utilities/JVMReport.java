package com.utilities;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport {

public static void generateJVMReport(String json) {
		
		File reportDir = new File("C:\\Users\\User1\\cucumber\\Amazon\\src\\test\\resources\\Report");
		
		Configuration config = new Configuration(reportDir, "Amazon");
		config.addClassifications("AppName", "Amazon");
		config.addClassifications("platformName", "Android");
		config.addClassifications("platformVersion", "8.1.0");
		
		List<String> jsonFiles = new ArrayList<String>();
		jsonFiles.add(json);
		
		ReportBuilder rb = new ReportBuilder(jsonFiles, config);
		rb.generateReports();
	}
	
}
