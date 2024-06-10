package ppppractice.TestNG111;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateContact_DP2 {
	@Test(dataProvider = "getData")
	public void createContactTest(String firstName, String lastName,long contactNum)
	{
			System.out.println("FirstName :"+ firstName +",LastName:"+ lastName + ", contact num:"+contactNum);	
	}

	@DataProvider
	public Object[][] getData() {
	Object[][] objarr= new Object[3][3];
	objarr[0][0]="Deepak";
	objarr[0][1]="hr";
	objarr[0][2]=89474296926l;

	
	objarr[1][0]="sam";
	objarr[1][1]="sh";
	objarr[1][2]=98345092850l;

	
	objarr[2][0]="thor";
	objarr[2][1]="stev";
	objarr[2][2]=97897654433l;


	return objarr;


			}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


