package ppppractice.TestNG111;

import java.time.Duration;
import java.util.List;

import javax.swing.text.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class GetProductionInfoTest {

	@Test(dataProvider = "getData")
	public void getProductionInfoTest(String brandname, String productName) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.amazon.in/");

		// search product
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(brandname, Keys.ENTER);
		// capture product info

//		String price_val = "(//span[@class='a-price-whole'])[]";
//		WebElement name_value =driver.findElement(By.xpath("//span[text()='" + productName + "']"));
//		Actions actions= new Actions(driver);
//		actions.moveToElement(name_value).click().perform();
//		
//		 WebElement price = driver.findElement(RelativeLocator.with(By.xpath("(//span[@class='a-price-whole'])")).below(name_value));
//		String pricetext=price.getText();
//			System.out.println(price);
		
		String price=driver.findElement(By.xpath("//span[text()='"+productName+"']/../../../..//span[@class='a-price-whole']")).getText();
		System.out.println(price);
		driver.quit();
	}

	@DataProvider
	public Object[][] getData() {
		Object[][] objarr = new Object[3][2];
		objarr[0][0] = "iphone";
		objarr[0][1] = "Apple iPhone 13 (128GB) - Midnight";

		objarr[1][0] = "iphone";
		objarr[1][1] = "Apple iPhone 13 (128GB) - Pink";

		objarr[2][0] = "iphone";
		objarr[2][1] = "Apple iPhone 15 (128 GB) - Black";

		return objarr;

	}

}
