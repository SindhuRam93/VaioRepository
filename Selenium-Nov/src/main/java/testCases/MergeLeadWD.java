package testCases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

//import org.junit.Test;

import wdMethods.ProjectMethods;
import wdMethods.SeMethods;

public class MergeLeadWD extends ProjectMethods {

	@Test(groups="sanity",dependsOnGroups="smoke", enabled=false,dataProvider="fetchData")
	public void MergeLead(String lead1, String lead2) throws InterruptedException{

		
	
		//click on Leads link
		click(locateElement("LinkText", "Leads")) ;
		//click on merge leads link
		click(locateElement("LinkText", "Merge Leads")) ;
		

		//click on the icon next to From Lead using following-sibling keyword in XPATH
		click(locateElement("xpath","//table[@name='ComboBox_partyIdFrom']/following-sibling::a/img"));
		

		//move to new window
		switchToWindow(1);


		//enter the lead ID and click on Find Lead button
		type(locateElement( "xpath", "//input[@name='id']"),lead1);
		click(locateElement( "xpath", "(//button[contains(@id,'ext')])[1]"));
		

		//click on the first resultant lead ID
		click(locateElement( "xpath", "//table[@class='x-grid3-row-table']/tbody/tr/td[1]//a"));
		//move to primary window
		switchToWindow(0);

		// click on the icon near To Lead
		click(locateElement("xpath","//table[@name='ComboBox_partyIdTo']/following-sibling::a/img"));
		

		//move to new window
		switchToWindow(1);
		//Enter the lead ID in the new window and click on Find leads button
		type(locateElement( "xpath", "//input[@name='id']"),lead2);
		click(locateElement( "xpath", "(//button[contains(@id,'ext')])[1]"));

		// click on the resultant lead Id
		
		click(locateElement( "xpath", "//table[@class='x-grid3-row-table']/tbody/tr/td[1]//a"));

		//switch back to primary window
		switchToWindow(0);

		//click on merge button
		click(locateElement( "LinkText", "Merge"));

		// Accept the alert
		acceptAlert();

		//click on Find leads
		click(locateElement( "LinkText","Find Leads"));
		

		//enter the lead ID and click on Find leads
		type(locateElement( "xpath", ("//input[(@name='id')]")),lead1);
		click(locateElement("xpath","//button[contains(text(),'Find Leads')]"));

	}

	@DataProvider(name="fetchData")
	public Object[][] getData() {
		
		Object[][] data= new Object[2][5];
		
		
		data[0][0]=11270;
		data[0][1]=11291;
		return data;

	}





}
