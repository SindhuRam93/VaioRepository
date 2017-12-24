package testCases;


//import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import wdMethods.ProjectMethods;

public class DeleteLeadWD extends ProjectMethods {
	@Test(groups="sanity",dependsOnGroups ="smoke",dataProvider="fetchData")
	public void Dupilcatelead(String phoneNumber) throws InterruptedException {
		
		
		//click on leads link
		click(locateElement("LinkText", "Leads")) ;
		
		//click on Find leads
		click(locateElement("LinkText", "Find Leads")) ;
		
		
		//click on phone
		
		click(locateElement("xpath", "//span[text()='Phone']")) ;
		
		//Enter phone number
		type(locateElement( "name", "phoneCountryCode"),"91");
		type(locateElement( "name", "phoneAreaCode"),"91");
		type(locateElement( "name", "phoneNumber"),phoneNumber);
		
		//Click find leads button
		click(locateElement("xpath", "//button[text()='Find Leads']")) ;
		
		//Capture lead ID of First Resulting lead
		WebElement ele=locateElement("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[1]");
		String leadID= getText(ele);
		click(locateElement("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[1]"));
		
		//click on Delete
		click(locateElement("LinkText", "Delete"));
		
		//Click Find leads
		click(locateElement("LinkText", "Find Leads"));
		
		//enter the lead ID
		type(locateElement( "name", "id"),leadID);
		
		//click on Find leads button
		click(locateElement("LinkText", "Find Leads"));
		
		//close the browser
		close();
		
	}
	@DataProvider(name="fetchData")
	public Object[][] getData() {
		
		Object[][] data= new Object[2][5];
		
		data[0][0] = "91812343456";
		/*data[0][1]=11270;
		data[0][2]=11291;
		data[0][3]=11270;
*/		
		return data;

	}

	
}
