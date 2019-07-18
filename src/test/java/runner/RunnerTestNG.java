package runner;

import cucumber.api.CucumberOptions;

import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(plugin = "json:target/cucumber-report.json",features = {"classpath:Feature/Qa Infotech.feature"},
glue= {"stepdef"}, tags={"@runningtests1","~@Not"})

public class RunnerTestNG extends AbstractTestNGCucumberTests{
	

}
