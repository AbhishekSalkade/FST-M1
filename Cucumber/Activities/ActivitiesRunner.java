package com.ibm.cucumber;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Features" ,
		glue = {"stepDefinitions"},
		//tags = "@activity1_1",plugin={"pretty","html:target/cucumber-reports/Cucumber.html"}, monochrome=true
		//tags = "@activity1_2",plugin={"pretty","html:target/cucumber-reports/Cucumber.html"}, monochrome=true
		//tags = "@SmokeTest",plugin={"pretty","html:target/cucumber-reports/Cucumber.html"}, monochrome=true
		//tags = "@SimpleAlert or @ConfirmAlert",plugin={"pretty","html:target/cucumber-reports/Cucumber.html"}, monochrome=true
		//tags = "@PromptAlert",plugin={"pretty","html:target/cucumber-reports/Cucumber.html"}, monochrome=true
		tags = "@activity1_3",plugin={"pretty","html:target/cucumber-reports/Cucumber.html"}, monochrome=true
		)

public class ActivitiesRunner {
	
}
