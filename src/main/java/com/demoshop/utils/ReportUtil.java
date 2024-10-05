package com.demoshop.utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ReportUtil {

	public ExtentReports generateReport() {
		String reportPath= System.getProperty("user.dir")+"//Reports//AutomationReport.html";
		ExtentSparkReporter reporter= new ExtentSparkReporter(reportPath);
		reporter.config().setReportName("Obsqura Automation");
		reporter.config().setDocumentTitle("Obsqura Zone");
		
		ExtentReports  extent =new  ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("QA", "Adithya");
		extent.setSystemInfo("Environment", "STAGING");
		return extent;
	}
}
