package com.comcast.crm.generic.fileUtilities;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.security.Key;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JsonUtility {
	public String getDataFromJsonFile(Object key) throws Throwable {
		FileReader fileR= new FileReader("./config_AppData/appCommnData.json");
		JSONParser parser=new JSONParser();
		Object obj =parser.parse(fileR);
		JSONObject map=(JSONObject)obj;
		//step 3 getting the value from json file using key
String data	= (String) map.get(key);
return data;

		
	}

}
