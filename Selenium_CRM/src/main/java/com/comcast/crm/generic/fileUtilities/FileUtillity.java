package com.comcast.crm.generic.fileUtilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class FileUtillity {

public String getDataFromPropertiesFile(String key)throws Throwable {
	
	FileInputStream fis=new FileInputStream("./config_AppData/commdata.properties");
Properties pObj =new Properties();
pObj.load(fis);
String dataString =pObj.getProperty(key);
return dataString;
}

public static void copyFile(File srcFile, File file) {
	// TODO Auto-generated method stub
	
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


