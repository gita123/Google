package com.kids.ads.Steps;

import java.net.MalformedURLException;
import com.kids.ads.code.UsingGoogle;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Feature1Steps{
	
	UsingGoogle pageFact = new UsingGoogle();

@Given("^I am on site$")
public void i_am_on_site() throws InterruptedException, MalformedURLException
	{
		pageFact.navigate();
	
	}

@Then("^I should see \"([^\"]*)\" on header$")
public void i_should_see_on_header(String text) throws Throwable 
	{
		assert pageFact.verify_elements(text);
		pageFact.quit();
	}

@When("^I click on Try Google Keep$")
public void i_click_on_Try_Google_Keep()
	{
		pageFact.click();

	}

@Then("^I should see different versions$")
public void i_should_see_different_versions()
	{
		pageFact.get_all_versions();
		pageFact.quit();
	}

}
