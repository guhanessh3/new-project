package com.omrbranch.Report;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.omrbranch.baseclass.BaseClass;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Reporting extends BaseClass {
	
	public static void generateJvmReport(String jsonFile) throws FileNotFoundException, IOException {
		File jvmFile = new File(getprojectpath()+getPropertyFileValue("jvm"));
		Configuration c = new Configuration(jvmFile, "Omr branch automatiom");
		c.addClassifications("Browser", "chrome");
		c.addClassifications("Browser version", "123");
		c.addClassifications("os","win11");
		c.addClassifications("sprint", "win11");
		List<String>jsonFiles=new ArrayList<>();
		jsonFiles.add(jsonFile);
		ReportBuilder builder = new ReportBuilder(jsonFiles,c);
		builder.generateReports();
		

	}

}


