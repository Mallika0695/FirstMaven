package com.stepdefinition;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;





public class JvmReport {

	
	public static void generateJvmReport(String json) {
		
   File loc =new File("F:\\eclipse\\FirstMaven\\Report\\Jvm");
   Configuration com=new Configuration(loc,"Facebook login fuctionality");
   com.addClassifications("platform","windows");
   com.addClassifications("browser","chrome");
   com.addClassifications("version","79.0");
   com.addClassifications("sprint","2");
   
   List<String> jsonFiles=new ArrayList<String>();
   jsonFiles.add(json);
		
		ReportBuilder r = new ReportBuilder(jsonFiles, com);
		r.generateReports();
		

	}
}
