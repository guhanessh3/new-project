package com.omrbranch.runner;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.omrbranch.Report.Reporting;
import com.omrbranch.baseclass.BaseClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = "json:target//index.json",name="Book Hotel including gst, debitcard with special request",dryRun = true,glue = "com.stepDefinition",features="src\\test\\resources")

public class TestRunnerClass1 extends BaseClass {
	@AfterClass
	public static void afterclass() throws FileNotFoundException, IOException {
    Reporting.generateJvmReport(getProjectPath()+getPropertyFileValue("json"));
	}

}
