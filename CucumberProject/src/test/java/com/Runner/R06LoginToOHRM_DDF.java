package com.Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/CucumberProject/CucumberProject/F06LoginToOHRM_DDF.feature"},
					glue = {"com.StepDef", "com.ForHooks"})
public class R06LoginToOHRM_DDF {

}
