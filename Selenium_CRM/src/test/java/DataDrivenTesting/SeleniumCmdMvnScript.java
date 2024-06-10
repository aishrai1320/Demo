package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.collect.Table.Cell;

public class SeleniumCmdMvnScript {

public void creatobj() throws EncryptedDocumentException, IOException, Throwable {
	//read common data from json file
	JSONParser parser=new JSONParser();
	Object obj =parser.parse(new FileReader("‪C:\\Users\\aishr\\Desktop\\data\\appCommnData.json"));
	
	
	JSONObject map= (JSONObject)obj;
			
		String browserString=map.get("browser").toString();
		String url=map.get("url").toString();
		String username=map.get("username").toString();
		String password=map.get("password").toString();
//generate the random number
		Random random=new Random();
		int randomint= random.nextInt(1000);
		//read  the data from the excel sheet
FileInputStream fis=new FileInputStream("C:\\Users\\aishr\\Desktop\\Book1111.xlsx");
Workbook wb=WorkbookFactory.create(fis);
 Sheet sh =wb.getSheet("Sheet1");
 Row row=sh.getRow(1);
String firstname= row.getCell(0).toString()+ randomint;
 String lastname= row.getCell(1).toString()+randomint;
 
wb.close();
		
		
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

