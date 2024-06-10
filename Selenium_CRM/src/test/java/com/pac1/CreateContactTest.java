package com.pac1;

import org.apache.poi.hpsf.HPSFException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.comcast.crm.orgtest.HomePage;
import com.crm.generic.baseutility.BaseClass;

public class CreateContactTest extends BaseClass{

	
		
	@Test
	public void createContact() throws Throwable {
		System.out.println("execute create contact and verify");
		String lastName = elib.getDataFromExcel("contact", 1, 2)+ jlib.getRandomNumber();
	}
	//step 2- navigate to contact module
	 HomePage hP =new HomePage(driver);	 
	 

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
