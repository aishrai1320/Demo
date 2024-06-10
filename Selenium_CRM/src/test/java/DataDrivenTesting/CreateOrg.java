package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CreateOrg {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream("C:\\Users\\aishr\\Desktop\\commdata.properties");
		//using properties class ,load all the keys
		Properties pobj=new Properties();
	pobj.load(fis);
	String browserString=pobj.getProperty("browser");
	String url=pobj.getProperty("serverUrl");
	String username=pobj.getProperty("username");
	String password=pobj.getProperty("password");


		//to get the value from the file
WebDriver driver =null;
if(browserString.equals("chrome")) {
driver=new ChromeDriver();
}
else if (browserString.equals("edge")) {
	driver=new EdgeDriver();}
	else if  (browserString.equals("firefox")) {
		driver=new FirefoxDriver();
	}
	else {driver=new ChromeDriver();
		
	}



driver.get(url);
driver.findElement(By.name("user_name")).sendKeys(username);
driver.findElement(By.name("user_password")).sendKeys(password);
driver.findElement(By.id("submitButton")).click();
driver.findElement(By.linkText("Organizations")).click();
driver.quit();	}

}
