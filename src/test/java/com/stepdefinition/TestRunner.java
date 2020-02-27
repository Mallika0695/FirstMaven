package com.stepdefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(features= {"src\\test\\resources"},glue= {"com.stepdefinition"},dryRun=false,plugin= {"html:F:\\eclipse\\FirstMaven\\Report",
"json:Report\\ouput.json"})
public class TestRunner
{

	}
	
  //  @AfterClass
	//public static void reportgeneration() {
      //  JvmReport.generateJvmReport("Report\\ouput.json");

	