package com.comcast.crm.generic.webdriverutility;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class WebDriverUtility {

public void waitForPageToLoad(WebDriver driver) {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
}
public void waitForElementPresent(WebDriver driver,WebElement element)  {
	WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(20));
	wait.until(ExpectedConditions.visibilityOf(element));
	
}
public void switchToTabOnURL (WebDriver driver, String partialURL) {
	Set<String> set= driver.getWindowHandles();
	Iterator<String> iter = set.iterator();
	
	while(iter.hasNext()) {
		String windowID= iter.next();
		driver.switchTo().window(windowID);
		 String actUrlString=driver.getCurrentUrl();
		 
		if(actUrlString.contains(partialURL)) {
			 break;
		 }
	}
		
	}
public void switchtoFrame(WebDriver driver,int index) {
	
	driver.switchTo().frame(index);
}	
  public void switchtoFrame(WebDriver driver,String nameID) {
	
	driver.switchTo().frame(nameID);
}	
  public void switchtoFrame(WebDriver driver,WebElement element) {
		
		driver.switchTo().frame(element);
	}	
  public void switchtoAlertAndAccept(WebDriver driver) {
	  driver.switchTo().alert().accept();
	
}
	
  public void switchtoAlertAndCancel(WebDriver driver) {
	  driver.switchTo().alert().dismiss();;
	
}	
	
public void select(WebElement element, int index) {
	Select select =new Select(element);
	select.selectByIndex(index);
}
public void mousemoveOnElement(WebDriver driver, WebElement element) {
	Actions actions=new Actions(driver);
	actions.doubleClick(element).perform();      
	
}
	
	
	
	
}

















































