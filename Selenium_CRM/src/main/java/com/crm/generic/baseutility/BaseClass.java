package com.crm.generic.baseutility;

import java.sql.SQLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.comcast.crm.generic.databaseUtility.DataBaseUtility;
import com.comcast.crm.generic.fileUtilities.ExcelUtility;
import com.comcast.crm.generic.fileUtilities.FileUtillity;
import com.comcast.crm.generic.webdriverutility.javaUtility;
import com.comcast.crm.orgtest.HomePage;
import com.comcast.crm.orgtest.LoginPage;
import com.mysql.cj.protocol.a.authentication.AuthenticationWebAuthnClient;

public class BaseClass {
	
	
	public ExcelUtility elib=new ExcelUtility();
	public javaUtility jlib=new javaUtility();
	public DataBaseUtility dbliB =new DataBaseUtility();
	public FileUtillity flib = new FileUtillity();
	public WebDriver driver = null;
	public HomePage homePage= new HomePage(driver);

	@BeforeSuite
	public void configBS()throws SQLException {
		System.out.println("*****connect to db , report config*****");
		dbliB.getDbconnection();
	}
	
	@AfterSuite
	public void closedbconnect() {
		System.out.println("*****db-connection closed*****");
	}
	
	@BeforeClass
	public void configbc() throws Throwable{
		System.out.println("===launch the browser===");
		String browserString= flib.getDataFromPropertiesFile("browser");	
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
		}
	@AfterClass
	public void executeafterclass(){
		System.out.println("===close the  browser===");
		driver.quit();
	}
	
	
	
	@BeforeMethod
	public void config() throws Throwable {
		System.out.println("---login----");
		String URL =flib.getDataFromPropertiesFile("url");
		String USERNAME=flib.getDataFromPropertiesFile("username");
		String PASSWORD =flib.getDataFromPropertiesFile("password");

		LoginPage lP =new LoginPage(driver);
		lP.loginToapp(URL, USERNAME, PASSWORD);
	}
@AfterMethod
public void passmethod() {
	System.out.println("---logout---");
	HomePage hPage=new HomePage(driver);
	hPage.logout();
	
}
@BeforeTest
public void  executeBeforeTest() {
	System.out.println("excuted before test");
}
		

	}
	
	


