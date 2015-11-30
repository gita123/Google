package com.kids.ads.code;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.kids.ads.config.EnvironmentSetup;

public class UsingGoogle {
	
	public WebDriver driver;
	Google googlePO;
	EnvironmentSetup env = new EnvironmentSetup();
	
	public void navigate() throws MalformedURLException{
		
		env.open_browser();
		googlePO = PageFactory.initElements(env.getDriver(), Google.class);
		
	}
	
	public void click(){
		
		googlePO.click_on_google_keep();
	}
	
	public void get_all_versions(){
		
		googlePO.get_goole_keep_versions();
	}
	
	public boolean verify_elements(String ele){
		return googlePO.elementExists(ele);
	}
	
	public void quit(){
		googlePO.close();
	}

}
