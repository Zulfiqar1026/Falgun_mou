package com.Mou.Frame.TestRunner;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.Mou.Frame.Utility.Amazon_Base__Class;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"src/test/resourcesSS/FeaturesM"} , 
plugin = {"json:target/cucumber.json"},
glue = "StepDefinitionsSs")//tags= {"@S"})


public class testRunner_Class extends AbstractTestNGCucumberTests {

	@BeforeTest
	 public void startURL () {
		 
		Amazon_Base__Class test= new Amazon_Base__Class ();
		test.initBrowser();
	 }
    
	@AfterTest
	 public void closeURL () {
		Amazon_Base__Class test= new Amazon_Base__Class ();
		test.driver.quit();
		 
	 }
	 
}
