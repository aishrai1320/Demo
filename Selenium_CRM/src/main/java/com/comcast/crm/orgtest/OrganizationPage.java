package com.comcast.crm.orgtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationPage {
	WebDriver driver;
	public OrganizationPage(WebDriver driver) {	
		this.driver =driver;
		PageFactory.initElements(driver, this);
		
	}
	

	@FindBy(xpath = "img[@alt='Create Organization...']")
	private WebElement createNewOrgBtnElement;
	
	public WebElement getCraeteNewOrgBtn() {
		return createNewOrgBtnElement;
}
}




























































