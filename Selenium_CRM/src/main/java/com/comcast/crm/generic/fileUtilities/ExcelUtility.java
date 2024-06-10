package com.comcast.crm.generic.fileUtilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;

public class ExcelUtility {
	public String getDataFromExcel(String sheetName,int rowNum,int celNum) throws Throwable{
		File file = new File("./testdata/testcasedata1(1).xlsx");
	FileInputStream fiss=new FileInputStream(file);
	Workbook wb=WorkbookFactory.create(fiss);
	String data=wb.getSheet(sheetName).getRow(rowNum).getCell(celNum).getStringCellValue();
	wb.close();
	return data;

	}
	
	public int getRowcount(String sheetName) throws Throwable{
		File file = new File("./testdata/testcasedata1(1).xlsx");
		FileInputStream fiss=new FileInputStream(file);
		Workbook wb=WorkbookFactory.create(fiss);
		int rowCount=wb.getSheet(sheetName).getLastRowNum();
		wb.close();
		return rowCount;

	}
	public void setDataIntoExcel(String sheetName,int rowNum,int celNum,String data)throws Throwable{
		File file = new File("./testdata/testcasedata1(1).xlsx");
		FileInputStream fiss=new FileInputStream(file);
		Workbook wb=WorkbookFactory.create(fiss);
		wb.getSheet(sheetName).getRow(rowNum).createCell(celNum);		
		
		FileOutputStream fos=new FileOutputStream("./testdata/testcasedata1(1).xlsx");
		wb.write(fos);
		wb.close();
		
		
		
		
		
	}
	
	
	
	
	
	

	
}
