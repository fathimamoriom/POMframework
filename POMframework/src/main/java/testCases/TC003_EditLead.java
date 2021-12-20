package testCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrapper.ProjectSpecificWrapper;

public class TC003_EditLead extends ProjectSpecificWrapper {
	
	@BeforeTest
	public void setData() {
		excelfile = "TC003_EditLead";
	}
	
	@Test(dataProvider = "getData")
	public void editLead(String uName, String pwd, String fName) {
		
	new LoginPage()
	.enterUserName(uName)
	.enterPassword(pwd)
	.clickLogin()
	.clickCRMSFA()
	.clickLeadsLink()
	.clickFindLeads()
	.enterFirstName(fName)
	.clickFindLeadsBtn();
	
	

}
}