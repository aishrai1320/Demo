package DataDrivenTesting;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;


public class ExecuteNonSelectQueryToCaptureData {

	

		public static void main(String[] args) throws Throwable {
			// TODO Auto-generated method stub
			//step 1 load /register  the database driver
			Driver driverRef=new Driver();
			DriverManager.registerDriver(driverRef);
			//step 2 connect to database
		Connection connection=	DriverManager.getConnection("jdbc:mysql://106.51.90.215:3333/projects","root@%","root");
			System.out.println("====done===");
			//step 3:create sql statement 
			Statement statement=connection.createStatement();
			//step 4:execute select query and get result 
			int result =statement.executeUpdate("insert into project values('TekP1_Proj_2024',"
					+ "'Aishwarya','22/05/2024','Ig1','WIP','500');");
System.out.println(result);			
				
		
		
			
			//step 5: close the connection
			connection.close();
			

		
		
			

		}}
