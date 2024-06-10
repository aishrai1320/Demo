package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


public class SamplePractice {

	public static void main(String[] args) throws IOException {
		//get the java representation obj of the physical file
		FileInputStream fis=new FileInputStream("C:\\Users\\aishr\\Desktop\\commdata.properties");
		//using properties class ,load all the keys
		Properties pobj=new Properties();
	pobj.load(fis);
	
		//to get the value from the file
	System.out.println(pobj.getProperty("password"));
		
	}
}
