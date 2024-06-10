package DataDrivenTesting;

import org.testng.annotations.Test;
import org.testng.xml.XmlTest;

public class ReadDataFromXmlFile {

	@Test
	public void sampletest(XmlTest data) {
		System.out.println("executed sampletest");
		System.out.println(data.getParameter("browser"));
		System.out.println(data.getParameter("url"));
		System.out.println(data.getParameter("username"));
		System.out.println(data.getParameter("password"));

		
		
		
		
		
	}
}
