package testCases;

//import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import wdMethods.ProjectMethods;

public class EditLeadWD extends ProjectMethods {

	@Test(groups="smoke",dataProvider="fetchData")
	
	public void EditLead(String firstName, String assignedName){
		
		//click on leads link
		click(locateElement("LinkText", "Leads")) ;
		
		//Click on Find leads link
		click(locateElement("LinkText", "Find Leads")) ;
		
		//Enter the first Name
		type(locateElement("xpath", "(//input[@name='firstName'])[3]"),firstName);
		
		//Click on Find Leads button
		click(locateElement("xpath", "//button[contains(text(),'Find Leads')]"));
		//click on first resultant ID
		click(locateElement("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[1]"));

		//verify the title
		verifyTitle("View Lead | opentaps CRM");
		
		//Click on Edit lead
		click(locateElement("LinkText", "Edit"));

		//Change the company Name
		type(locateElement("id", "updateLeadForm_companyName"),assignedName);

		//click on Update button

		click(locateElement("xpath", "//input[@class='smallSubmit']"));

		//verify the changed name
		WebElement ele =locateElement("id","viewLead_companyName_sp");
		verifyPartialText(ele, assignedName);

		}

	@DataProvider(name="fetchData")
	public Object[][] getData() {
		
		Object[][] data= new Object[1][2];
		
		
		data[0][0]="firstName";
		data[0][1]="Bajaj";
		return data;

	}
	
}
