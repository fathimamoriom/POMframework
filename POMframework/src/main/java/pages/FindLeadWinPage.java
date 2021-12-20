package pages;

import wrapper.ProjectSpecificWrapper;

public class FindLeadWinPage extends ProjectSpecificWrapper{
	
	public FindLeadWinPage enterLeadId(String entLeadId) {
		enterByXpath("(//div[@class='x-form-element']/input)[1]", entLeadId);
		return this;
	}

	public FindLeadWinPage clickFindLeadBtn() {
		clickByXpath("//button[text()='Find Leads']");
		return this;
	}

	public MergeLeadsPage clickFstResLead() {
		clickByXpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]");
		switchToParentWindow();
		return new MergeLeadsPage();
	}

	public FindLeadWinPage clickFstResLead1() {
		clickByXpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]");
		return this;
	}

}
