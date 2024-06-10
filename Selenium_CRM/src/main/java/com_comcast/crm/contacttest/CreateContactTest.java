package com_comcast.crm.contacttest;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;
import java.util.Random;

import javax.print.attribute.standard.Finishings;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.internal.BaseClassFinder;

import com.comcast.crm.orgtest.OrganizationPage;

import ppppractice.TestNG111.ContactTest;
/**
 * 
 * @author aishr
 *
 */


public class CreateContactTest extends com.crm.generic.baseutility.BaseClass {
	WebDriver driver;
	
	
@Test(groups="regressionTest,smoke test")
public  void  CreateContactWthOrgTesteg4()throws Throwable {
	// TODO Auto-generated method stub

	//ntegraton test case
	//read common data from command line
	
	
	//read testscrpt from excel fle
	String orgName=elib.getDataFromExcel("contact", 7, 2) + jlib.getRandomNumber();
	String contactLastName=elib.getDataFromExcel("contact", 7, 3);
	//when change te type nto inter i.e without 'using this if we using it takes as a string n  that partcular cell
	ORpractice.pom.repositoryy.HomePage hp=new ORpractice.pom.repositoryy.HomePage(driver);
	hp.getOrgLinkElement().click();
	
	OrganizationPage cnp=new OrganizationPage(driver);
	cnp.getCraeteNewOrgBtn().click();
	
	com_comcast.crm.contacttest.CreatingNewContactPage cnop=new com_comcast.crm.contacttest.CreatingNewContactPage();
	cnop.createOrg(orgName);
	
	//step2:navigate to organization module
	
	String	actOrgName=driver.findElement(By.id("mouseArea_Organization Name")).getText();
	System.out.println(actOrgName);
	 
	if(actOrgName.trim().equals(orgName))
		System.out.println(orgName + "nfo is created==PASS");
	else
		System.out.println(orgName + "nfo is created==FAIL");
	//navgate to conatct module	
hp.getContactElement().click();
//step:6 clc on create contact buttonn'
ContactTest cp=new ContactTest();
((WebElement) cp.getCreateNewOrgBtn1()).click();
//step7:eneter all the detals and new contact
CreatingNewContactPage ccp=new CreatingNewContactPage();
ccp.createContactWithOrg(contactLastName, orgName);
	actOrgName=driver.findElement(By.id("mouseArea_Organization Name")).getText();
System.out.println(actOrgName);
 
if(actOrgName.trim().equals(orgName))
	System.out.println(orgName + "nfo is created==PASS");
else
	System.out.println(orgName + "nfo is created==FAIL");


}
}

