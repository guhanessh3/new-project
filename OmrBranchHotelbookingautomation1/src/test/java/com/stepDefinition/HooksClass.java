package com.stepDefinition;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.omrbranch.baseclass.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class HooksClass extends BaseClass {
	@Before
	public static void beforescenario() throws FileNotFoundException, IOException {
		browserLaunch(getPropertyFileValue("browser"));
		maximizewindow();
		launchtheappln(getPropertyFileValue("url"));  
		implicitWait(30);
	}
	@After
	public static void afterscenario(Scenario scenario) {
		scenario.attach(takescreenshot(), "image/png", "Every scenario");
    All();
	}

}
