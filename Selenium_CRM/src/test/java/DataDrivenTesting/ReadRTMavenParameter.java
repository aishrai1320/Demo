package DataDrivenTesting;

import org.testng.annotations.Test;

public class ReadRTMavenParameter {

	@Test
	public void runtimeParameterTest() {
		String url= System.getProperty("url");
		String BROWSER=System.getProperty("browser");
		String USERNAME=System.getProperty("username");
		String PASSWORD=System.getProperty("password");
		 System.out.println("Env data==>url"+ url);
		 System.out.println(" browserdata==>browser"+ BROWSER);
		 System.out.println("username data==>username"+ USERNAME);
		 System.out.println("password data==>password"+ PASSWORD);
		 
	}
}
