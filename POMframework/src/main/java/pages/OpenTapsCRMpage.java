package pages;

import wrapper.ProjectSpecificWrapper;

public class OpenTapsCRMpage extends ProjectSpecificWrapper{
	
	public OpenTapsCRMpage changeCompanyName(String ComName) {
		
		enterById("updateLeadForm_companyName", ComName);
		return this;
	}	
 public ViewLeadPage clickUpdate() {
	 clickByXpath("//input[@value='Update']");
		return new ViewLeadPage();	 
 }

}
