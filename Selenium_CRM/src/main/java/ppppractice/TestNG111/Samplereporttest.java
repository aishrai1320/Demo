package ppppractice.TestNG111;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Samplereporttest {

	ExtentReports report;
@BeforeSuite	
public void createContactTest() {
	// spark report config 
	ExtentSparkReporter spark=new ExtentSparkReporter("./AdvanceReport/report.html");
	spark.config().setDocumentTitle("CRM Test Suite Results");
	spark.config().setReportName("crm report");
	spark.config().setTheme(Theme.DARK);
	
	//add env information &create test
	report = new ExtentReports();
	report.attachReporter(spark);
	report.setSystemInfo("os","window-10");
	report.setSystemInfo("BROWSER","CHROME-100");
}
	
@AfterSuite
public void configAs() {
	report.flush();
}
@Test
public void createContactWithPhoneNumber() {

	ExtentTest test= report.createTest("CreateContacttest");
	
	test.log(Status.INFO,"login to app");
		test.log(Status.INFO,"navigate to contact page");
		test.log(Status.INFO," create contact");
	if("Hdfc".equals("Hdfc")) {
		test.log(Status.PASS," contact created");

	}
	else {
		test.log(Status.FAIL,"contact is not created");

	}
	System.out.println("login in app");
	
	}}
	
	
	

	
	
	

