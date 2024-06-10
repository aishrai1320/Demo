package practice.hometest;

import static org.testng.Assert.assertEquals;

import java.lang.reflect.Method;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



public class HomePageVerificationtest {	
	
	@Test
	public void homePagetest(Method mtd) {
		//hard assert
	System.out.println(mtd.getName()+ "Test Start");
		String expectedPage ="Home";
		WebDriver driver = new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://localhost:8888");
	driver.findElement(By.name("user_username")).sendKeys("admin");
	driver.findElement(By.name("user_username")).sendKeys("manager");
	driver.findElement(By.id("submitButton")).click();
	String actTitle= driver.findElement(By.xpath("//a[contains(text(),'Home']")).getText();
	
	Assert.assertEquals(actTitle, expectedPage);
	System.out.println(mtd.getName()+"TEST END");
	}
	
	@Test
	public void verifyLogoHomePageTest(Method mtd) {
		//hard assert
		System.out.println(mtd.getName()+ "Test Start");
		WebDriver driver = new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://localhost:8888");
	driver.findElement(By.name("user_username")).sendKeys("admin");
	driver.findElement(By.name("user_username")).sendKeys("manager");
	driver.findElement(By.id("submitButton")).click();
	String actTitle= driver.findElement(By.xpath("//a[contains(text(),'Home']")).getText();
	
boolean status=	driver.findElement(By.xpath("//img[@title='vtiger-crm-logo.gif")).isEnabled();
Assert.assertTrue(status);
driver.close();
	
	System.out.println(mtd.getName()+"TEST END");
	}
}
		
		
