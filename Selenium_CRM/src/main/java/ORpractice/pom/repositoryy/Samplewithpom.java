package ORpractice.pom.repositoryy;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Samplewithpom {

	@FindBy(name="user_name")
	WebElement ele1;
	
	@FindBy(name="user_password")
	WebElement ele2;
	
	@FindBy(id="submitButton")
	WebElement ele3;
	
	@Test
	public void sampleTest() {
		WebDriver driver =new ChromeDriver();
		driver.get("http://localhost:8888");
		
	Samplewithpom s=	PageFactory.initElements(driver,Samplewithpom.class);
		s.ele1.sendKeys("admin");
		s.ele2.sendKeys("manager");
		driver.navigate().refresh();
		s.ele1.sendKeys("admin");
		s.ele2.sendKeys("manager");
		s.ele3.click();

	}
	
}

