package com.stepdefinition;

import java.net.MalformedURLException;
import java.util.List;

import com.pojo.LaunchPojo;
import com.utilities.Base;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.MobileElement;

public class StepDefinition extends Base {
	
	@Given("userbshould launch the mobile application")
	public void userbshould_launch_the_mobile_application() throws MalformedURLException {
		getDriver();
		
		LaunchPojo l = new LaunchPojo();
	
	}

	@When("user should tab English Icon")
	public void user_should_tab_English_Icon() throws InterruptedException {
	 
		LaunchPojo l = new LaunchPojo();
		Thread.sleep(4000);
		MobileElement englishBtn = l.getEnglishBtn();
		click(englishBtn);
	
	}

	@When("user should  tab Skip sign in")
	public void user_should_tab_Skip_sign_in() throws InterruptedException {
		LaunchPojo l = new LaunchPojo();
		Thread.sleep(4000);
		MobileElement skipBtn = l.getSkipBtn();
		click(skipBtn);
	 }

	@When("user  should scoll down until  explore")
	public void user_should_scoll_down_until_explore() throws InterruptedException {
		LaunchPojo l = new LaunchPojo(); 
		
		Thread.sleep(4000);
	List<MobileElement> explore = l.getExplore();
	scrollDownList(explore);
	
	}

	@Then("i should  generate the JVM report")
	public void i_should_generate_the_JVM_report() {
	 }

}
