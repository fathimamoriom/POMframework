package pages;

import wrapper.ProjectSpecificWrapper;

public class MergeLeadsPage extends ProjectSpecificWrapper {
	
	public FindLeadWinPage clickIconNearFormLead() {
		clickByXpath("(//img[@alt='Lookup'])[1]");
		switchToLastWindow();
		return new FindLeadWinPage();
	}
	public FindLeadWinPage ClickIconNearToLead() {
		clickByXpath("(//img[@alt='Lookup'])[2]");
		switchToLastWindow();
		return new FindLeadWinPage();
	}
	public ViewLeadPage clickMerge() {
		clickByXpath("//a[text()='Merge']");
		acceptAlert();
		return new ViewLeadPage();
	}

}
