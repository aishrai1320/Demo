package com.comcast.crm.generic.databaseUtility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.mysql.cj.jdbc.Driver;

public class DataBaseUtility {
Connection conn=null;

public void getDbconnection(String url,String username,String password) throws Throwable	{
	try {
	Driver driver= new Driver();
	DriverManager.registerDriver(driver);
	
	 conn=DriverManager.getConnection(url,username ,password);
 	}
	catch(Exception e) {	
	}
}
public void getDbconnection() throws SQLException{
	try {
		Driver driver= new Driver();
		DriverManager.registerDriver(driver);
		
		 conn=DriverManager.getConnection("jdbc:mysql://106.51.90.215:3333/projects","root@%","root");
	 	}
		catch(Exception e) {	
		}
		
}
public void closeDbconnection()throws SQLException{
	conn.close();
}

public ResultSet executeConSelectQuery(String query) throws Throwable {
	ResultSet result=null;
	try {
Statement stat=	 conn.createStatement();
ResultSet resultSet =stat.executeQuery(query);
	}catch (Exception e) {
		
	}
	return result;	
}
public int executeNonselectQuery(String query) {
	int result =0;
	try {
		Statement statement=conn.createStatement();
		result=statement.executeUpdate(query);
	}
	catch (Exception e) {
		// TODO: handle exception
	}
	
return result;
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
