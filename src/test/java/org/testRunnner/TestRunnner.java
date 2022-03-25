package org.testRunnner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Lenovo\\eclipse-workspace\\CucumberMultipleLoginswithMultiscenario\\src\\test\\resources\\FEatures\\Adac.feature",glue = "ord.stepDefi",
monochrome = true,plugin = {"pretty","json:C:\\Users\\Lenovo\\eclipse-workspace\\CucumberMultipleLoginswithMultiscenario\\src\\test\\resources\\report\\cucumber.json",
		"html:C:\\Users\\Lenovo\\eclipse-workspace\\CucumberMultipleLoginswithMultiscenario\\src\\test\\resources\\report\\cucumber.html",
		"junit:C:\\Users\\Lenovo\\eclipse-workspace\\CucumberMultipleLoginswithMultiscenario\\src\\test\\resources\\report\\cucumber.xml"},dryRun = false,
snippets = SnippetType.CAMELCASE,strict = true)




public class TestRunnner {

	
	@AfterClass
	public static void afterclass() {
		ord.stepDefi.JVMReports.reportGenerate("C:\\Users\\Lenovo\\eclipse-workspace\\CucumberMultipleLoginswithMultiscenario\\src\\test\\resources\\report\\cucumber.json");

	}
	
}
