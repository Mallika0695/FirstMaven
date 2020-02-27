package com.stepdefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"@F:\\eclipse\\FirstMaven\\src\\test\\resources\\FailedScenario.txt"},glue= {"com.stepdefinition"})
public class Rerun {

	
}
