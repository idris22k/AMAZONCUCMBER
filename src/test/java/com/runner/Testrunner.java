package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.utilities.JVMReport;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src\\test\\resources\\Feature"},glue = "com.stepdefinition", monochrome = true, snippets = SnippetType.CAMELCASE, strict = true, plugin = { "pretty",
		"json:src\\test\\resources\\Report\\cucumber.json"})

public class Testrunner {
	
	@AfterClass
	public static void afterClass() {
		JVMReport.generateJVMReport("C:\\Users\\User1\\cucumber\\Amazon\\src\\test\\resources\\Report\\cucumber.json");
	}

}
