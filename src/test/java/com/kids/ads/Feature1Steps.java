package com.kids.ads;

import java.net.MalformedURLException;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.kids.ads.PageObjects.Google;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Feature1Steps{
	
	WebDriver driver;
	Google po = new Google(driver);

@Given("^I am on site$")
public void i_am_on_site() throws InterruptedException, MalformedURLException{

	po.open();
    
}

@Then("^I should see \"([^\"]*)\" on header$")
public void i_should_see_on_header(String text) throws Throwable {
    assert po.elementExists(text);
    po.close();
}

@When("^I click on Try Google Keep$")
public void i_click_on_Try_Google_Keep(){
	po.click_on_google_keep();
}

@Then("^I should see different versions$")
public void i_should_see_different_versions(){
	po.get_goole_keep_versions();
	po.close();
}

}
