package com.Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/CucumberProject/CucumberProject/F03AmazonTest.feature"},
						glue = {"com.StepDef"},
						tags = "@AmazonLinks")
public class R03AmazonTest {
	
	/*
	 * Single Scenario > 	tags = "@BestSellerLink"
	 * Multiple Scenarios > tags = "@MobileLink or @ElectronicsLink"
	 * Skip Scenario >		tags = "not @ElectronicsLink"
	 *  
	 */

}
