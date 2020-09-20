package com.test.testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "json:target/cucumber-reports/Cucumber2.json"}, 
		features = "src/test/resources/features",
		glue = "com.test.stepdefinitions",
		//dryRun=true,
				//tags = {"@SmokeTest or @RegressionTest"})
		monochrome=true)

public class TestRunner {
}
