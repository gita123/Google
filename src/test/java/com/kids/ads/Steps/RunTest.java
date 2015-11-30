package com.kids.ads.Steps;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		format = {"pretty", 
				"html:target/cucumber",
				"json:target/cucumber.json"},
		features = {"src/test/resources"}
		)
public class RunTest {

}
