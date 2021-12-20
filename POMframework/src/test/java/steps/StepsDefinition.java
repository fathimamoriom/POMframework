package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepsDefinition {
	
   public ChromeDriver driver;
	
	@Given("Launch Chrome Browser and load url")
	public void launch_Chrome_Browser_and_load_url() {
		
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumSoft\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("The chrome browser launched successfully");
	}

	@Given("Enter Username as (.*)")
	public void enter_Username_as_DemoSalesManager(String Uname) {
	    driver.findElementById("username").sendKeys(Uname);
	}

	@Given("Enter Password as (.*)")
	public void enter_Password_as_crmsfa(String pwd) {
		driver.findElementById("password").sendKeys(pwd);
	}

	@When("Click the Login Button")
	public void click_the_Login_Button() {
		driver.findElementByClassName("decorativeSubmit").click();
	}

	@Then("Its navigate homepage")
	public void its_navigate_homepage() {
	    System.out.println(driver.getTitle());
	}

	@Then("Click the Logout Button")
	public void click_the_Logout_Button() {
	driver.findElementByClassName("decorativeSubmit").click();
		    
	}

	@Then("Close Browser")
	public void close_Browser() {
	 driver.quit();   
	}

	//@Given("Enter Username as DemoSales")
	//public void enter_Username_as_DemoSales() {
		//driver.findElementById("username").sendKeys("DemoSales");
	    
	//}

	@Then("its navigate samepage")
	public void its_navigate_samepage() {
		System.out.println(driver.getTitle());
		
	   
	}

	@Then("verify error message")
	public void verify_error_message() {
		String errormsg = driver.findElementById("errorDiv").getText();
		if(errormsg.contains("The Following Errors Occurred:")) {
			System.out.println("The given credentials is wrong");
			
		}
	    
	}
	
	@Given("Click CRMSFA Link")
	public void clickCRMSFALink() {
		driver.findElementByLinkText("CRM/SFA").click();
	    
	}

	@Given("Click Leads Link")
	public void clickLeadsLink() {
		driver.findElementByLinkText("Leads").click();
	    
	}

	@When("Click CreateLead")
	public void clickCreateLead() {
		driver.findElementByLinkText("Create Lead").click();
	    
	}

	@When("Enter the company Name As (.*)")
	public void enterTheCompanyNameAsCompany(String company) {
		 driver.findElementById("createLeadForm_companyName").sendKeys(company);
	    
	}

	@When("Enter the firstname as (.*)")
	public void enterTheFirstnameAsFirstname(String fname) {
		 driver.findElementById("createLeadForm_firstName").sendKeys(fname);
	    
	}

	@When("Enter the lastname as (.*)")
	public void enterTheLastnameAsLastname(String lname) {
		driver.findElementById("createLeadForm_lastName").sendKeys(lname);
	    
	}

	@When("Choose source website")
	public void chooseSourceWebsite() {
		WebElement source = driver.findElementById("createLeadForm_dataSourceId");
		Select dd = new Select(source);
		dd.selectByVisibleText("Website");
	    
	}

	@When("Click the CreateLead button")
	public void clickTheCreateLeadButton() {
		 driver.findElementByName("submitButton").click();
	      
	   
	}

	@Then("its navigated viewLeadpage")
	public void itsNavigatedViewLeadpage() {
		System.out.println(driver.getTitle());
	    
	}

	@Then("verify the firstname")
	public void verifyTheFirstname() {
		
			String fname = driver.findElementById("viewLead_firstName_sp").getText();
			if(fname.equals("Hema")) {
				System.out.println("Firstname is matched");
			}else
			System.out.println("Firstname is not matched");
		}
	
	@When("Click Find Leads Button")
	public void clickFindLeadsButton() {
		driver.findElementByLinkText("Find Leads").click();
	   
	}

	@When("Enter firstname")
	public void enterFirstname() {
		driver.findElementByXPath("(//div[@class='x-form-element']/input)[14]").sendKeys("Gopi");
	   
	}

	@When("Click first resulting lead")
	public void clickFirstResultingLead() throws InterruptedException {
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").click();

		Thread.sleep(2000);
	    
	}

	@Then("verify title of the page")
	public void verifyTitleOfThePage() {
		System.out.println(driver.getTitle());
	    
	}

	@Then("Click on edit")
	public void clickOnEdit() {
		driver.findElementByLinkText("Edit").click();
	   
	}

	@Then("its navigated edit lead page")
	public void itsNavigatedEditLeadPage() {
		System.out.println(driver.getTitle());
	    
	}

	@Then("Change the company name")
	public void changeTheCompanyName() {
		driver.findElementByXPath("//input[@id='updateLeadForm_companyName']").clear();
		driver.findElementByXPath("//input[@id='updateLeadForm_companyName']").sendKeys("CTS");
	
	    
	}

	@Then("Click update")
	public void clickUpdate() {
		driver.findElementByXPath("//input[@value='Update']").click();
	    
	}

	@Then("confirm changed name appears")
	public void confirmChangedNameAppears() {
		System.out.println("name");
	    
	}
	
	@When("Click on phone")
	public void clickOnPhone() {
		driver.findElementByXPath("//span[text()='Phone']").click();
	    
	}

	@When("Enter phone number")
	public void enterPhoneNumber() {
		driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys("9597704568");
		
	}
	

	@When("Capture lead ID of first resulting lead")
	public void captureLeadIDOfFirstResultingLead() throws InterruptedException {
		String leadId = driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").getText();
		System.out.println(leadId);
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").click();
		Thread.sleep(2000);
	    
	}

	@When("Click delete")
	public void clickDelete() {
		driver.findElementByXPath("//a[text()='Delete']").click();
	    
	}

	@Then("its navigated MyLeadsPage")
	public void itsNavigatedMyLeadsPage() {
		System.out.println(driver.getTitle());
	    
	}

	@Then("Enter captured lead ID")
	public void enterCapturedLeadID() {
		driver.findElementByXPath("(//div[@class='x-form-element']/input)[13]").sendKeys("10035");
	    
	}

			
		
	    
	}

	




