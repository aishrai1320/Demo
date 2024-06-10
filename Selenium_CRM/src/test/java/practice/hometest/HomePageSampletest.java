package practice.hometest;

import java.lang.reflect.Method;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HomePageSampletest {
	@Test
	public void homePagetest(Method mtd) {
		//hard assert
	Reporter.log(mtd.getName()+ "Test Start");
		String expectedPage ="Home";
		WebDriver driver = new ChromeDriver();
	SoftAssert assertobj =new SoftAssert();
	
	Reporter.log("Step1",true);
	Reporter.log("Step2",true);
//Assert.assertEquals("Home", "HomePage", "your result is Home");
Reporter.log("Step3",true);
assertobj.assertEquals("Home-crm", "Home-crm");

	Reporter.log(mtd.getName()+"TEST END");
	}
	
	@Test
	public void verifyLogoHomePageTest(Method mtd) {
		//hard assert
		Reporter.log(mtd.getName()+ "Test Start");
	SoftAssert assertobj =new SoftAssert();
	
	Reporter.log("Step1",true);
	Reporter.log("Step2",true);
	assertobj.assertTrue(true);
	Reporter.log("Step3",true);
	Reporter.log("Step4",true);
assertobj.assertAll();
	Reporter.log(mtd.getName()+"TEST END");
		}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

