package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromeSheet{
	public static void main(String[] args) throws Throwable {
		
	FileInputStream fis =new FileInputStream("C:\\Users\\aishr\\Desktop\\JioMart.xlsx");
	Workbook wb=WorkbookFactory.create(fis);
         Sheet sh= wb.getSheet("Sheet1");
	       
	
		int rowcount = sh.getLastRowNum();
		for(int i=0;i<=rowcount;i++)
		{
			 Row    row=  sh.getRow(i);
	           String celString=   row.getCell(0).toString();
	           System.out.println(celString);	
		}
		
		
		
		
		
		
		
		
		
		
		
	}
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
































