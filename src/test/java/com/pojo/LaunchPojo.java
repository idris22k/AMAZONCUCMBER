package com.pojo;

import java.util.List;

import org.openqa.selenium.support.PageFactory;

import com.utilities.Base;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LaunchPojo extends Base {

	
	 public MobileElement getEnglishBtn() {
		return englishBtn;
	}


	public MobileElement getSkipBtn() {
		return skipBtn;
	}


	public List<MobileElement> getExplore() {
		return explore;
	}


	public LaunchPojo() {
	
		 PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		 
	}
	
	@AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Continue in English\"]")
	private MobileElement englishBtn;
	
	
	@AndroidFindBy(id = "in.amazon.mShop.android.shopping:id/skip_sign_in_button")
	
	private MobileElement skipBtn;
	
	
	@AndroidFindBy(xpath="hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.ViewAnimator/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[10]")
	private List<MobileElement> explore;
	
}
