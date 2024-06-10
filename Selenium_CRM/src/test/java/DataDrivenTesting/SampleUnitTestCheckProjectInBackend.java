package DataDrivenTesting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLDataException;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;

public class SampleUnitTestCheckProjectInBackend {
	@Test
	public void projectCheckTest()throws SQLException{
		String expectedProjectNameString="Ig";
		boolean flag=false;
	//step 1 load /register  the database driver
			Driver driverRef=new Driver();
			DriverManager.registerDriver(driverRef);
			//step 2 connect to database
		Connection connection=	DriverManager.getConnection("jdbc:mysql://106.51.90.215:3333/projects","root@%","root");
			System.out.println("====done===");
			//step 3:create sql statement 
			Statement statement=connection.createStatement();
			//step 4:execute select query and get result 
			ResultSet resultset =statement.executeQuery("select * from project ");
			resultset.next();
			while(resultset.next()) 
		{
			String actualProjectName=resultset.getString(4);
			System.out.println(actualProjectName);
				
			if(expectedProjectNameString==actualProjectName) {
				flag=true;
				System.out.println(expectedProjectNameString+ "Project available,test is passed");
				
			}
		}
			if (flag==false) {
				System.out.println(expectedProjectNameString+"project unavailable");
				
			}
			
			//step 5: close the connection
			connection.close();
			

		
		
			

		}

	}


