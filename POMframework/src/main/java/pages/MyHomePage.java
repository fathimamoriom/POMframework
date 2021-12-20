package pages;

import wrapper.ProjectSpecificWrapper;

public class MyHomePage extends ProjectSpecificWrapper{
	
	
	public MyLeadsPage clickLeadsLink() {
		clickByLinkText("Create Lead");
		return new MyLeadsPage();
	}

}
