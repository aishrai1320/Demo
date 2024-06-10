package com.comcast.crm.orgtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateNewOrganization {
	
	WebDriver driver;
	public CreateNewOrganization(WebDriver driver) {	
		this.driver =driver; 
		PageFactory.initElements(driver, this);
			}
	
private WebElement orgNameEdtElement;

@FindBy(name="accountname")
private WebElement orgNaElement;

@FindBy(name="industry")
private WebElement industryDB;

@FindBy(xpath = "//input[@title='save[Alt+s]']")
private  WebElement saveBtnElement;

public WebElement getOrgNameEdt() {
	return orgNameEdtElement;
}
public WebElement getSaveBtnElement() {
	return saveBtnElement;
	
}
public void createOrg(String orgName) {
orgNaElement.sendKeys(orgName);
saveBtnElement.click();
}

public void createOrg(String  orgName , String industry) {
	orgNameEdtElement.sendKeys(orgName);
	Select sel=new Select(industryDB);
	sel.selectByVisibleText(industry);
  saveBtnElement.click();
  
  
}

































}
