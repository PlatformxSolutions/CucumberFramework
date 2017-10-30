package com.test.step_definitions;

import org.apache.maven.reporting.MavenReportException;
import org.junit.runner.RunWith;

import com.github.mkolisnyk.cucumber.reporting.CucumberResultsOverview;
import com.github.mkolisnyk.cucumber.reporting.CucumberUsageReporting;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "classpath:features",
	//plugin = {"pretty", "html:target/cucumber-html-report"},
		plugin = {"pretty", "html:target/reports/", "json:target/reports/index.json"},

		
		//tags = {"@RegressionTest"}
			tags = {"@pallavi"}
				//tags = {"@P1"}
				//tags = {"@P2"}
				//tags = {"@P3"}
				  
				
		
		
		)
/*CucumberResultsOverview results = new CucumberResultsOverview();
results.setOutputDirectory("target");
results.setOutputName("cucumber-results");
results.setSourceFile("./src/test/resources/cucumber.json");
results.executeFeaturesOverviewReport();*/

public class RunCukesTest{

	}
	

