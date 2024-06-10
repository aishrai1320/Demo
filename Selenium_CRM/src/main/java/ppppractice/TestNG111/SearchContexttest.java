package ppppractice.TestNG111;
/**
 * test class for Contact Module
 * @author aishr
 *
 */

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.comcast.crm.orgtest.LoginPage;
import com.crm.generic.baseutility.BaseClass;

public class SearchContexttest extends BaseClass {
WebDriver driver;

	@Test
	public void searchcontactTest() {
		
		LoginPage lPage=new LoginPage(driver);
		lPage.loginToapp("admin"," admin");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
