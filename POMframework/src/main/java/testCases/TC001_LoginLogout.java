package testCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrapper.ProjectSpecificWrapper;

public class TC001_LoginLogout extends ProjectSpecificWrapper{
	
	@BeforeTest
	public void setData() {
		excelfile = "TC001_LoginLogOut";
	}
	
	@Test(dataProvider = "getData")
	public void LoginLogOut(String uName, String pwd) {
		
		/*LoginPage lp = new LoginPage();
		lp.enterUserName(uName);
		lp.enterPassword(pwd);
		lp.clickLogin();*/
		
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogin();
		
		
		
		
	}

	
}
