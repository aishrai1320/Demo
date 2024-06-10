package com.comcast.crm.orgtest;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class CreateOrganizationTest {
	public static void main(String[] args) throws IOException {


	FileInputStream fis=new FileInputStream("./config_Appdata/commdata.properties");
	//using properties class ,load all the keys
	Properties pobj=new Properties();
      pobj.load(fis);

	//to get the value from the file

String browserString=pobj.getProperty("browser");
String url=pobj.getProperty("serverUrl");
String username=pobj.getProperty("username");
String password=pobj.getProperty("password");
  
Random random=new Random();
int randomint= random.nextInt(1000);
//read  the data from the excel sheet
FileInputStream fiss=new FileInputStream("./testdata/testcasedata 1(1).xlsx");

Workbook wb=WorkbookFactory.create(fiss);
Sheet sh =wb.getSheet("Sheet1");
Row row=sh.getRow(1);
String orgName= row.getCell(0).toString()+ randomint;
String lastname= row.getCell(1).toString()+randomint;


                
wb.close();

	//to get the value from the file
WebDriver driver = null;

if(browserString.equals("chrome")) {
driver=new ChromeDriver();
}
else if (browserString.equals("edge")) {
driver=new EdgeDriver();}
else if  (browserString.equals("firefox")) {
	driver=new FirefoxDriver();
}
else {driver=new ChromeDriver();
	
}



driver.get(url);
driver.findElement(By.name("user_name")).sendKeys(username);
driver.findElement(By.name("user_password")).sendKeys(password);
driver.findElement(By.id("submitButton")).click();
driver.findElement(By.linkText("Organizations")).click();
//click on "create organization" Button
driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
//enter all details and create new organization

driver.findElement(By.name("accountname")).sendKeys("abcspider");
driver.findElement(By.xpath("//input[@title='Save [Alt+S]'])[1]")).click();

//verify Header msg expected result
String headerInfo=driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
if(headerInfo.contains("abcspider")){
	System.out.println("abcspider" +"is created=====pass");
	}
else {
	System.out.println("abcspider"+"not created====fail");
}
String actOrgNam= driver.findElement(By.id("dtlview_Organization Name")).getText();
if(actOrgNam.equals("abcspider")) {
	System.out.println("abcspider" +"is created=====pass");
}
else {
System.out.println("abcspider"+"not created====fail");}


//verify orgname info expected result 


//step 5:logout











driver.quit();	
	
	
	
	
}
	
}












































































