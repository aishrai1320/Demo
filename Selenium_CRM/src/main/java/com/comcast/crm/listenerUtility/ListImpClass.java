package com.comcast.crm.listenerUtility;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.mysql.cj.jdbc.Driver;

public class ListImpClass  implements ITestListener,ISuiteListener{
public 	ExtentReports report;
public static ExtentSparkReporter spark;

public void onStart(ISuite suite ) {
	// spark report config 
	
	
	
		ExtentSparkReporter spark=new ExtentSparkReporter("./AdvanceReport/report.html");
		spark.config().setDocumentTitle("CRM Test Suite Results");
		spark.config().setReportName("crm report");
		spark.config().setTheme(Theme.DARK);
		
		//add env information &create test
		ExtentReports report = new ExtentReports();
		report.attachReporter(spark);
		report.setSystemInfo("os","window-10");
		report.setSystemInfo("BROWSER","CHROME-100");
}
	
	
public void onFinish(ISuite suite ) {
report.flush();
}
		
public void onTestStart(ITestResult result ) {
	System.out.println("===>>"+result.getMethod()+"===START====");

}
		
public void onTestSuccess(ITestResult result ) {
	System.out.println("===>>"+result.getMethod()+"===END====");

}
		

public void onTestFailure(ITestResult result) {
	String testName =result.getMethod().getMethodName();
	WebDriver driver=new ChromeDriver();
EventFiringWebDriver eDriver=new EventFiringWebDriver(driver);
File srcFile =eDriver.getScreenshotAs(OutputType.FILE);
String time =new Date().toString().replace(" ", "_").replace(":", "_");
try {
	FileUtils.copyFile(srcFile, new File("./Screenshot/"+testName+ "+"+time+".png"));
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
}
	
public void onTestSkippped(ITestResult result) {
	System.out.println("===>>"+result.getMethod()+"===RETRY====");
 
}
	
	
	
}	
	
	










































































