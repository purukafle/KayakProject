package com.testrunners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/features/"},
		glue = "com.stepdefinitions",
		dryRun=true,
		monochrome=true,
		plugin = { "pretty","html:target/test-output"  
		  
} 
 )
public class CucumberRunnerTest {

}