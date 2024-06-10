package com.comcast.crm.orgtest;



import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.comcast.crm.generic.webdriverutility.WebDriverUtility;

public class LoginPage extends WebDriverUtility {
//rule-1 create a separate java class
		//rule-2 object creation
	WebDriver driver;
	/**
	 * go to login page
	 * @param driver
	 */
	public LoginPage(WebDriver driver) {	
		this.driver =driver;
		PageFactory.initElements(driver, this);
		
	}
		@FindBy(name="user_name")
		private WebElement usernameEdt;
		
		@FindBy(name="user_password")
	private WebElement passwordEdt;
		
		@FindBy(id="submitButton") 
		WebElement loginBtn;
//rule 3 object initialization
		//rule 4 object encapsulation
		public WebElement getUsernameEdt1() {
			return usernameEdt;
		}
		private WebElement getPasswordEdt11() {
			// TODO Auto-generated method stub
			return passwordEdt;
		}
		public WebElement getLoginBtn() {
			return loginBtn;
		
		}
		public WebElement getPasswordEdt() {
			// TODO Auto-generated method stub
			return passwordEdt;
		}
			
		
		/**
		 * login to page
		 * @param url
		 * @param username
		 * @param password
		 */
		//rule 5 provide Action
			public void loginToapp(String url, String username , String password) {
				waitForPageToLoad(driver);
				driver.get(url);
				driver.manage().window().maximize();
			usernameEdt.sendKeys(username);	
            passwordEdt.sendKeys(password);
            loginBtn.click();
			}
			
			/**
			 * 
			 * @param uSERNAME
			 * @param pASSWORD
			 */
			public void loginToapp(String uSERNAME, String pASSWORD) {
				// TODO Auto-generated method stub
				
			}
			                
			                                               
			
			 
			
		}


