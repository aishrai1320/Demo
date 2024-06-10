package DataDrivenTesting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.mysql.cj.jdbc.Driver;

public class CreateProjectAndVerifyDataInGui {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		//CREATE A PROJECT IN GUI
WebDriver driver =new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
driver.get("http://106.51.90.215:8084/dashboard/projects");
driver.findElement(By.id("username")).sendKeys("rmgyantra");
driver.findElement(By.id("inputPassword")).sendKeys("rmgy@9999");

driver.findElement(By.xpath("//button[text()='Sign in']")).click();
driver.findElement(By.linkText("Projects")).click();
driver.findElement(By.xpath("//span[text()='Create Project']")).click();

driver.findElement(By.name("projectName")).sendKeys("instagramm_1111");
driver.findElement(By.name("createdBy")).sendKeys("Aish");
Select select=new Select(driver.findElement(By.name("status")));
select.selectByIndex(0);
driver.findElement(By.xpath("(//input[@type='submit'])")).click();
Thread.sleep(10);

//VERIFY PROJECT IN DN

String expectedProjectNameString="instagramm_1111";
boolean flag=false;
//step 1 load /register  the database driver
	Driver driverRef=new Driver();
	DriverManager.registerDriver(driverRef);
	//step 2 connect to database
Connection connection=	DriverManager.getConnection("jdbc:mysql://106.51.90.215:3333/projects","root@%","root");
	System.out.println("====done===");
	//step 3:create sql statement 
	Statement statement=connection.createStatement();
	//step 4:execute select query and get result 
	ResultSet resultset =statement.executeQuery("select * from project ");
	resultset.next();
	while(resultset.next()) 
{
	String actualProjectName=resultset.getString(4);
	System.out.println(actualProjectName);
		
	if(expectedProjectNameString==actualProjectName) {
		flag=true;
		System.out.println(expectedProjectNameString+ "Project available,test is passed");
		
	}
}
	if (flag==false) {
		System.out.println(expectedProjectNameString+"project unavailable");
		
	}
	
	//step 5: close the connection
	connection.close();
	



	

	

	

	

}


	
	}

