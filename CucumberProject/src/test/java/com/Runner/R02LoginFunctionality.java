package com.Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/CucumberProject/CucumberProject/F02LoginFunctionality.feature"},
					glue = {"com.stepDef"})	
public class R02LoginFunctionality {

}
