package com.utilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class Base {
	
	public static AndroidDriver<MobileElement> driver;
	
	
	public static void getDriver() throws MalformedURLException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "redmi");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "8.1.0");
		cap.setCapability("appPackage", "in.amazon.mShop.android.shopping");
		cap.setCapability("appActivity", "com.amazon.mShop.home.HomeActivity"
		);



		URL url = new URL("http://localhost:4723/wd/hub");
		 driver = new AndroidDriver<MobileElement>(url,cap);

	}



	public static void click(MobileElement element) {
element.click();
		
		
	}

public void scrollDownList(List<MobileElement> element) {
	
	while (element.size() == 0) {
		
		Dimension size = driver.manage().window().getSize();
		Double startHeight = size.getHeight()*0.5;
		int start = startHeight.intValue();
		Double endSize=size.getHeight()*0.2;
	int end = endSize.intValue();
	
	TouchAction tc = new TouchAction(driver);	
	tc.press(PointOption.point(0,start)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3))).moveTo(PointOption.point(0,end)).release().perform();
		
}





}}
