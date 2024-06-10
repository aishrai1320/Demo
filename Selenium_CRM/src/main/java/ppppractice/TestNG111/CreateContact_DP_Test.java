package ppppractice.TestNG111;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateContact_DP_Test {

@Test(dataProvider = "getData")
public void createContactTest(String firstName, String lastName)
{
		System.out.println("FirstName :"+ firstName +",LastName:"+ lastName);	
}

@DataProvider
public Object[][] getData() {
Object[][] objarr= new Object[3][2];
objarr[0][0]="Deepak";
objarr[0][1]="hr";

objarr[1][0]="sam";
objarr[1][1]="sh";

objarr[2][0]="thor";
objarr[2][1]="Deepak";

return objarr;


		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
