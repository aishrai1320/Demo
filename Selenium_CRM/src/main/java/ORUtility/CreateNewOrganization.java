package ORUtility;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	import org.openqa.selenium.support.ui.Select;
	public class CreateNewOrganization {

		WebDriver driver;

		public CreateNewOrganization() {
			// TODO Auto-generated constructor stub
	 
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(xpath = "//img[@title='Create Organization...']")
		private WebElement createorgPlusBtn;
		@FindBy(xpath ="//input[@id='phone']")
		private WebElement phoneEdt;
		@FindBy(name = "accountname")
		private WebElement orgNameEdt;

		@FindBy(xpath = "//input[@title='Save [Alt+S]']")
		private WebElement createorgPlusBtn1;
		@FindBy(xpath ="//input[@id='phone']")
		private WebElement phoneEdt1;
		@FindBy(name = "accountname")
		private WebElement orgNameEdt1;

		@FindBy(xpath = "//input[@title='Save [Alt+S]']")
		private WebElement saveBtn;
		@FindBy(name = "industry")
		private WebElement industryDB;
		@FindBy(name = "accounttype")
		private WebElement acctypeDB;
		public WebElement getOrgNameEdt() {
			return orgNameEdt;
		}

		public WebElement getSaveBtn() {
			return saveBtn;
		}

		public void createOrg(String orgName) {
			orgNameEdt.sendKeys(orgName);saveBtn.click();
		}

		public void createOrg(String orgName, String industry) {
			orgNameEdt.sendKeys(orgName);
			Select sel = new Select(industryDB);
			sel.selectByVisibleText(industry);
			saveBtn.click();
		}

		public void getCreateNewOrgBtn() {
			createorgPlusBtn.click();
		}

		public void createOrgPhoneNumber(String orgName, String phoneNumber) {
			// TODO Auto-generated method stub
			orgNameEdt.sendKeys(orgName);
			phoneEdt.sendKeys(phoneNumber);
			saveBtn.click();

		}

		public void createOrg(String orgName, String industry, String type) {
			// TODO Auto-generated method stub
			orgNameEdt.sendKeys(orgName);
			Select sel = new Select(industryDB);
			sel.selectByVisibleText(industry);
			Select sel2=new Select(acctypeDB);
			sel2.selectByVisibleText(type);
			saveBtn.click();
		}
		
		
		
	}

