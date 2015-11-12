package com.kids.ads;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		format = {"pretty", 
				"html:target/cucumber-report"},
		features = {"src/test/resources"}
//		tags = { "@test" }
		)
public class RunTest {

}
