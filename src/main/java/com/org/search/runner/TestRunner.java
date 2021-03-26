package com.org.search.runner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;

@CucumberOptions(
        features = "src/main/java/com/org/search/features",
        glue = {"com.org.search.stepDefinitions"},
        tags = {"~@Ignore"},
        format = {
        		   "pretty",
                   "html:target/cucumber-reports/cucumber-pretty",
                   "json:target/cucumber-reports/CucumberTestReport.json",
                   "rerun:target/cucumber-reports/rerun.txt"
        },plugin =  { "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"})

public class TestRunner extends AbstractTestNGCucumberTests {
	
	 private TestNGCucumberRunner testNGCucumberRunner;
	    @BeforeClass(alwaysRun = true)
	    public void setUpClass() throws Exception {
	        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());	       
	    }
	    
	 
	    @Test(groups = "cucumber", description = "Runs Cucumber Feature", dataProvider = "features")
	    public void feature(CucumberFeatureWrapper cucumberFeature) {
	        testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
	    }
	 
	    @DataProvider
	    public Object[][] features() {
	        return testNGCucumberRunner.provideFeatures();
	    }
	 
	    @AfterClass(alwaysRun = true)
	    public void tearDownClass() throws Exception {
	        testNGCucumberRunner.finish();
	    }

}
