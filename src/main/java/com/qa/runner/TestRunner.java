package com.qa.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	    features = "C:/Users/Prk/eclipse-workspace-2024/CucumberPOM/src/main/java/com/qa/features/freecrm.feature",
	    glue = {"com.qa.stepdefinitions"},
	    plugin = {"pretty", "html:target/cucumber-report.html"},
	    monochrome = true
	)

public class TestRunner {
}
