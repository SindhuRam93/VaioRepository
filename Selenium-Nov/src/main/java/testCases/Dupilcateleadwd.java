package testCases;

//import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import wdMethods.ProjectMethods;

public class Dupilcateleadwd extends ProjectMethods{
	@Test(groups= "regression", dataProvider="fetchData")
	public void Dupilcatelead(String emailID) throws InterruptedException{

		// TODO Auto-generated method stub
		
		click(locateElement("LinkText", "Leads")) ;
		
		click(locateElement("LinkText", "Find Leads")) ;
		

		// Click on Email Tab
		click(locateElement("xpath", "//span[contains(text(),'Email')]"));
		//Enter the Email
		type(locateElement("name", "emailAddress"),emailID);
		//Click on Find leads button
		click(locateElement("xpath", "//button[contains(text(),'Find Leads')]"));
		
		//Store the firstName value to a WebElement and click on the WebElement
		WebElement ele=locateElement("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a[1]");
		String name = getText(ele);
		click(ele);
		

		
		
			//Click on Duplicate lead link, verify the title and click on duplicate lead button
		click(locateElement("LinkText", "Duplicate Lead"));

		//verify the title
		
		verifyTitle("Duplicate Lead | opentaps CRM");

		//click create lead button

		click(locateElement("xpath", "//input[@class='smallSubmit']"));
		
		
		//capture the first name and compare with the value captured before
		
		verifyPartialText(locateElement("id", "viewLead_firstName_sp"), name);

	}
		@DataProvider(name="fetchData")
		
		public Object[][] getData() {
			Object[][] data= new Object[2][5];
			
			data[0][0] = "SGK@leaftaps.com";
			
			return data;
		}

	}

	


