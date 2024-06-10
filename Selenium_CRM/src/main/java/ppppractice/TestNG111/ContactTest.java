package ppppractice.TestNG111;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ContactTest  {

	@Test(priority = -1)
	public void createContactTest() {
		System.out.println("execute creatContact --> HDFC");
	}
@Test(dependsOnMethods = "createContactTest")
public void  modifyContactTest() {
	//System.out.println("execute query insert contact in DB==> ICICI");
	System.out.println("execute modifyContactTest--->HDFC=>ICICI_1111");
}

@Test(dependsOnMethods = "modifyContactTest")
public void  deleteContactTest() {
	System.out.println("execute query insert contact in DB==> UPI");
	System.out.println("execute deleteContactTest UPI");
}
public Object getCreateNewOrgBtn11() {
	// TODO Auto-generated method stub
	return null;
}
public WebElement getHeaderMsg() {
	// TODO Auto-generated method stub
	return null;
}
public WebElement getCreateNewOrgBtn() {
	// TODO Auto-generated method stub
	return null;
}
public WebElement getCreateNewOrgBtn1() {
	// TODO Auto-generated method stub
	return null;
}

















}





































































































