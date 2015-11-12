package com.kids.ads;

import org.openqa.selenium.WebDriver;

import com.kids.ads.PageObjects.Google;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Feature1Steps{
	
	WebDriver driver;
	Google po = new Google(driver);

@Given("^I am on site \"([^\"]*)\" on \"([^\"]*)\"$")
public void i_am_on_site(String url, String browser) throws InterruptedException{
	
	po.open(url, browser);
    
}

@Then("^I should see \"([^\"]*)\" on header$")
public void i_should_see_on_header(String text) throws Throwable {
    assert po.elementExists(text);
}

@Then("^I should see \"([^\"]*)\" logo on header$")
public void i_should_see_logo_on_header(String logo) throws Throwable {
	assert po.elementExists(logo);
	po.close();
}

}
