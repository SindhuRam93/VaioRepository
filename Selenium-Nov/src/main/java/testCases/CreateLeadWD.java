package testCases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import wdMethods.ProjectMethods;

public class CreateLeadWD extends ProjectMethods{

	@Test(groups="smoke",dataProvider="fetchdata")
	public void createLead(String cmpName,String fName, String lastName, int index, String mCampaign) {

		
		//click on create lead
		click(locateElement("LinkText", "Create Lead"));

		//Enter the mandatory fields 
		type(locateElement("id", "createLeadForm_companyName"), cmpName);
		type(locateElement("id", "createLeadForm_firstName"), fName);

		type(locateElement("id", "createLeadForm_lastName"), lastName);
		
		//Enter the value of all fields in the form
		selectDropDownUsingIndex(locateElement("id","createLeadForm_dataSourceId" ),  index);
		// Enter the value of Marketing Campaign
		selectDropDownUsingText(locateElement("id","createLeadForm_marketingCampaignId" ), mCampaign);
		
		type(locateElement("id","createLeadForm_firstNameLocal"),"LocalFirstName");
		type(locateElement("id","createLeadForm_lastNameLocal"),"LocalLastName");
		type(locateElement("id","createLeadForm_personalTitle"),"SalutationTitle");
		type(locateElement("id","createLeadForm_birthDate"),"11/12/17"); 
		type(locateElement("id","createLeadForm_generalProfTitle"),"Title2");
		type(locateElement("id","createLeadForm_departmentName"),"DepartmentName");
		type(locateElement("id","createLeadForm_annualRevenue"),"7");
		//drop down selection
		selectDropDownUsingText(locateElement("id","createLeadForm_currencyUomId"),"AFA - Afghani");   
		selectDropDownUsingText(locateElement("id","createLeadForm_industryEnumId"),"Aerospace");    
		
		type(locateElement("id","createLeadForm_numberEmployees"),"23");
		selectDropDownUsingText(locateElement("id","createLeadForm_ownershipEnumId"),"Sole Proprietorship"); 
		
		type(locateElement("id","createLeadForm_sicCode"),"Sole123");
		type(locateElement("id","createLeadForm_tickerSymbol"),"TickerSymbol");
		type(locateElement("id","createLeadForm_description"),"Description - Create Lead");
		type(locateElement("id","createLeadForm_importantNote"),"Important - Create Lead");
		type(locateElement("id","createLeadForm_primaryPhoneCountryCode"),"91");
		type(locateElement("id","createLeadForm_primaryPhoneAreaCode"),"91");
		type(locateElement("id","createLeadForm_primaryPhoneNumber"),"91812343456");
		type(locateElement("id","createLeadForm_primaryPhoneExtension"),"33456");
		type(locateElement("id","createLeadForm_primaryPhoneAskForName"),"SGK");
		type(locateElement("id","createLeadForm_primaryEmail"),"SGK@leaftaps.com");
		type(locateElement("id","createLeadForm_primaryWebUrl"),"http://leaftaps.com");
		type(locateElement("id","createLeadForm_generalToName"),"ToName");
		type(locateElement("id","createLeadForm_generalAttnName"),"AttnName");
		type(locateElement("id","createLeadForm_generalAddress1"),"Line1");
		type(locateElement("id","createLeadForm_generalAddress2"),"Line2");
		type(locateElement("id","createLeadForm_generalCity"),"City");
		type(locateElement("id","createLeadForm_generalPostalCode"),"60002");
		selectDropDownUsingText(locateElement("id","createLeadForm_generalStateProvinceGeoId"),"Alabama"); //dropdown
		type(locateElement("id","createLeadForm_generalPostalCodeExt"),"1234");
		selectDropDownUsingText(locateElement("id","createLeadForm_generalCountryGeoId"),"United Kingdom");
		
		//Click on Create Lead
		click(locateElement("class", "smallSubmit"));
		
		// Capture the lead ID
		String compName = getText(locateElement("id","viewLead_companyName_sp"));
		String leadId=compName.substring(compName.indexOf("(")+1,compName.length()-1);
		System.out.println("leadId is: "+leadId);
		
		
		
	}
	
	@DataProvider(name="fetchdata")
	public  Object[][] getData() {
		Object[][] data= new Object[2][5];
		
		data[0][0] = "Infosys";
		data[0][1] = "firstName";
		data[0][2] = "lastName";
		data[0][3] = 9;
		data[0][4] = "Road and Track";
		
		data[1][0] = "Infosys";
		data[1][1] = "firstName1";
		data[1][2] = "lastName1";
		data[1][3] = 9;
		data[1][4] = "Automobile";
		
		
		return data;
	}
}
