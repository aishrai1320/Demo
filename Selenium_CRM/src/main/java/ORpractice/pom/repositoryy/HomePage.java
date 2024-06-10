package ORpractice.pom.repositoryy;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	public HomePage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
	}

  @FindBy(linkText = "Organization")	
	private WebElement orgLinkElement;

public WebDriver getDriver() {
	return driver;
}

public WebElement getOrgLinkElement() {
	return orgLinkElement;
}


public WebElement getContactElement() {
	return contactElement;
}

@FindBy(linkText = "Contacts")	
	private WebElement contactElement;
	
@FindBy(linkText="campaigns")
private WebElement campaignlnk;
	
@FindBy(linkText="More")
private WebElement Morelink;

public WebElement getCampaignlnk() {
	return campaignlnk;
}

 public WebElement getMorelink() {
	return Morelink;
 }
@FindBy(xpath="img[@src='themes/softed/image/user.PNG']")
private WebElement adminImg;
	
@FindBy(linkText = "Sign Out")
private WebElement signOutlnk;
 
public void navigateToCampaignPage() {
	Actions act = new Actions(driver);
	act.moveToElement(Morelink).perform();
campaignlnk.click();
}

public void logout() {
	Actions act = new Actions(driver);
	act.moveToElement(adminImg).perform();
	signOutlnk.click();
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
