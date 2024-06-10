package com.comcast.crm.orgtest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import com.comcast.crm.generic.fileUtilities.ExcelUtility;
import com.comcast.crm.generic.fileUtilities.FileUtillity;
import com.comcast.crm.generic.webdriverutility.javaUtility;

import ORpractice.pom.repositoryy.info_org;

public class CreateOrganizationTest8 {
WebDriver driver;
	public static void main(String[] args)throws Throwable {
		// TODO Auto-generated method stub
/* Create object */
		
FileUtillity flib=new FileUtillity();
ExcelUtility elib=new ExcelUtility();
javaUtility jlib=new javaUtility();

// read common data from Json file
String BROWSER=flib.getDataFromPropertiesFile("browser");
String URL=flib.getDataFromPropertiesFile("url");
String USERNAME=flib.getDataFromPropertiesFile("username");
String PASSWORD=flib.getDataFromPropertiesFile("password");

//read testscript data from excel file
String orgNameString= elib.getDataFromExcel("org", 1, 2)+jlib.getRandomNumber();
WebDriver driver=null;
if(BROWSER.equals("chrome")) {
driver=new ChromeDriver();
}
else if (BROWSER.equals("edge")) {
driver=new EdgeDriver();}
else if  (BROWSER.equals("firefox")) {
	driver=new FirefoxDriver();
}
else {driver=new ChromeDriver();
}

	//step 1: login to app 
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
driver.get(URL);

LoginPage lp=new LoginPage(driver);
lp.loginToapp(URL,USERNAME, PASSWORD);
//step 2 : navigate to organization module

HomePage hp=new HomePage(driver);
hp.getOrgLinkElement();

//steps 3: click on "create Organization  " Button
OrganizationPage cnPage= new OrganizationPage(driver);
cnPage.getCraeteNewOrgBtn().click();
//step 4 enter all the details and create new organization

CreateNewOrganization cnop= new CreateNewOrganization(driver);
cnop.createOrg(orgNameString);

//verify header msg Expected Result 
Organization_InformationPage oip =new Organization_InformationPage(driver);
oip.getHeaderMsg().getText();
String actorgName= oip.getHeaderMsg().getText();
if(actorgName.contains(orgNameString)) {
	System.out.println(orgNameString+ "name is verified== pass");
}else {

System.out.println(orgNameString+"name is not verified==failed");
}
//logout
hp.logout();
driver.quit();
}
	}


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
