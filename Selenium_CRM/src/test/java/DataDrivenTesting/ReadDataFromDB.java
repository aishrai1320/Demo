package DataDrivenTesting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;


public class ReadDataFromDB {
	 static Connection connection=null;

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub	
	//step 1 load /register  the database driver

		try {
		
		Driver driverRef=new Driver();
		DriverManager.registerDriver(driverRef);
		//step 2 connect to database
	 connection=	DriverManager.getConnection("jdbc:mysql://106.51.90.215:3333/projects","root@%","root");
		System.out.println("====done===");
		//step 3:create sql statement 
		Statement statement=connection.createStatement();
		//step 4:execute select query and get result 
		ResultSet resultset =statement.executeQuery("select * from project ");
		resultset.next();
		while(resultset.next()) 
	{
				System.out.println(resultset.getString(1)+ "\t" + resultset.getString(2)+ "\t" + resultset.getString(3)+ "\t" 
	                   + resultset.getString(4)+ "\t" + resultset.getString(5)+ "\t" + resultset.getString(6));
			           
			
	}
		}
		catch(Exception e) {
			System.out.println("EXCEPTION HANDLED");
		}
		
		finally {
			//step 5: close the connection
			connection.close();
			System.out.println("*******CLOSURE*******");
		}
	
		

		
	
		

	}

}
