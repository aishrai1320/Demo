package DataDrivenTesting;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;

import org.apache.poi.common.usermodel.fonts.FontHeader.PanoseSerif;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadDataFromJsonFile {
	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
		// TODO Auto-generated method stub

		//step1: parse JSON physical file in to java object using JSonParse class
		JSONParser parser=new JSONParser();
		Object obj =parser.parse(new FileReader("C:\\Users\\aishr\\Desktop\\data\\appCommnData.json"));
		
		//step 2 
		//downcasting java obj into jsonobject, jsonobject is similar to hashmap with get and put method ,
		//its easy to read the data
		JSONObject map=(JSONObject)obj;
		//step 3 getting the value from json file using key
		System.out.println(map.get("url"));
		System.out.println(map.get("browser"));
		System.out.println(map.get("username"));
		System.out.println(map.get("password"));
		
	}

}
