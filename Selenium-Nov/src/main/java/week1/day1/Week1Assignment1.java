package week1.day1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Week1Assignment1 {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "D:/Sel-Nov2017/drivers/chromedriver.exe");
	
		//to remove the additional tab
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-infobars");
		
		// Create object for ChromeDriver
		
		ChromeDriver driver = new ChromeDriver();
	
		// invoke browser and navigate to URL
		
		driver.get("http://leaftaps.com/opentaps");
		
		//Maximize the window
		
		driver.manage().window().maximize();
		
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		
		//click on crmsfa link
		driver.findElementByLinkText("CRM/SFA").click();
		
		//click on create lead
		
		driver.findElementByLinkText("Create Lead").click();

		//enter All the fields and click on create lead
		
		driver.findElementById("createLeadForm_companyName").sendKeys("ind1");
		driver.findElementById("createLeadForm_parentPartyId").sendKeys("12345");
		driver.findElementById("createLeadForm_firstName").sendKeys("Sri");
		driver.findElementById("createLeadForm_lastName").sendKeys("Ram");
		
		// selecting by Index
		WebElement source= driver.findElementById("createLeadForm_dataSourceId");
		Select dd1 = new Select(source);
		dd1.selectByIndex(12);
		
		//driver.findElementById("createLeadForm_dataSourceId").sendKeys("Cold Call");
		
		//selecting by visible text
		 WebElement marketingCampaign= driver.findElementById("createLeadForm_marketingCampaignId");
		 Select dd2 = new Select(marketingCampaign);
		 dd2.selectByVisibleText("Road and Track");
		 
		 
		//driver.findElementById("createLeadForm_marketingCampaignId").sendKeys("Affiliate Sites");   //dropdown
		driver.findElementById("createLeadForm_firstNameLocal").sendKeys("LocalFirstName");
		driver.findElementById("createLeadForm_lastNameLocal").sendKeys("LocalLastName");
		driver.findElementById("createLeadForm_personalTitle").sendKeys("SalutationTitle");
		driver.findElementById("createLeadForm_birthDate").sendKeys("11/12/17");                  //date
		driver.findElementById("createLeadForm_generalProfTitle").sendKeys("Title2");
		driver.findElementById("createLeadForm_departmentName").sendKeys("DepartmentName");
		driver.findElementById("createLeadForm_annualRevenue").sendKeys("7");
		driver.findElementById("createLeadForm_currencyUomId").sendKeys("AFA - Afghani");   //dropdown
		driver.findElementById("createLeadForm_industryEnumId").sendKeys("Aerospace");    //dropdown
		driver.findElementById("createLeadForm_numberEmployees").sendKeys("23");
		driver.findElementById("createLeadForm_ownershipEnumId").sendKeys("Sole Proprietorship"); 
		driver.findElementById("createLeadForm_sicCode").sendKeys("Sole123");
		driver.findElementById("createLeadForm_tickerSymbol").sendKeys("TickerSymbol");
		driver.findElementById("createLeadForm_description").sendKeys("Description - Create Lead");
		driver.findElementById("createLeadForm_importantNote").sendKeys("Important - Create Lead");
		driver.findElementById("createLeadForm_primaryPhoneCountryCode").sendKeys("91");
		driver.findElementById("createLeadForm_primaryPhoneAreaCode").sendKeys("91");
		driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("91812343456");
		driver.findElementById("createLeadForm_primaryPhoneExtension").sendKeys("33456");
		driver.findElementById("createLeadForm_primaryPhoneAskForName").sendKeys("SGK");
		driver.findElementById("createLeadForm_primaryEmail").sendKeys("SGK@leaftaps.com");
		driver.findElementById("createLeadForm_primaryWebUrl").sendKeys("http://leaftaps.com");
		driver.findElementById("createLeadForm_generalToName").sendKeys("ToName");
		driver.findElementById("createLeadForm_generalAttnName").sendKeys("AttnName");
		driver.findElementById("createLeadForm_generalAddress1").sendKeys("Line1");
		driver.findElementById("createLeadForm_generalAddress2").sendKeys("Line2");
		driver.findElementById("createLeadForm_generalCity").sendKeys("City");
		
		// Selecting by value
		WebElement country= driver.findElementById("createLeadForm_generalCountryGeoId");
		Select dd3 = new Select(country);
		dd3.selectByValue("DZA");
		//driver.findElementById("createLeadForm_generalCountryGeoId").sendKeys("United States"); //dropdown
		driver.findElementById("createLeadForm_generalPostalCode").sendKeys("60002");
		driver.findElementById("createLeadForm_generalStateProvinceGeoId").sendKeys("Alabama"); //dropdown
		driver.findElementById("createLeadForm_generalPostalCodeExt").sendKeys("1234");
		driver.findElementByClassName("smallSubmit").click();	
		//Close the driver
		driver.close();
	}

}
