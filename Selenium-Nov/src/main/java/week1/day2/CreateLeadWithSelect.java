package week1.day2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateLeadWithSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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

		// Enter user name and pw and click on Login button
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		
		//click on crmsfa link
		driver.findElementByLinkText("CRM/SFA").click();
		
		//click on create lead
		
		driver.findElementByLinkText("Create Lead").click();

		//enter All the fields and click on create lead
		
		driver.findElementById("createLeadForm_companyName").sendKeys("ind2");
		driver.findElementById("createLeadForm_parentPartyId").sendKeys("123456");
		driver.findElementById("createLeadForm_firstName").sendKeys("Sri");
		driver.findElementById("createLeadForm_lastName").sendKeys("Ram");
		
		// selecting drop down by Index
		WebElement source= driver.findElementById("createLeadForm_dataSourceId");
		Select dd1 = new Select(source);
		dd1.selectByIndex(12);
		

		
		//selecting drop down by visible text
		 WebElement marketingCampaign= driver.findElementById("createLeadForm_marketingCampaignId");
		 Select dd2 = new Select(marketingCampaign);
		 dd2.selectByVisibleText("Road and Track");
		 
		 

		driver.findElementById("createLeadForm_firstNameLocal").sendKeys("LocalFirstName");
		driver.findElementById("createLeadForm_lastNameLocal").sendKeys("LocalLastName");
		driver.findElementById("createLeadForm_personalTitle").sendKeys("SalutationTitle");
		driver.findElementById("createLeadForm_birthDate").sendKeys("11/12/17");                  //date
		driver.findElementById("createLeadForm_generalProfTitle").sendKeys("Title2");
		driver.findElementById("createLeadForm_departmentName").sendKeys("DepartmentName");
		driver.findElementById("createLeadForm_annualRevenue").sendKeys("7");
		
		//Preferred Currency using Select class
		 WebElement preferredCurrency= driver.findElementById("createLeadForm_currencyUomId");
		 Select pc = new Select(preferredCurrency);
		 pc.selectByValue("DZD");

		 //Industry value selection using Select class
		 WebElement industry = driver.findElementById("createLeadForm_industryEnumId");
		 Select industrySelect = new Select(industry);
		 industrySelect.selectByIndex(12);
		 
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
		
		// Selecting drop down option by value
		WebElement country= driver.findElementById("createLeadForm_generalCountryGeoId");
		Select dd3 = new Select(country);
		dd3.selectByValue("USA");
		
		driver.findElementById("createLeadForm_generalPostalCode").sendKeys("60002");
		
		//Selecting province using Select class
		WebElement state = driver.findElementById("createLeadForm_generalStateProvinceGeoId");
		Select province = new Select(state);
		province.selectByVisibleText("Delaware");
		
		driver.findElementById("createLeadForm_generalPostalCodeExt").sendKeys("1234");
		driver.findElementByClassName("smallSubmit").click();	
		
		//Close the driver
		driver.close();
	}

}
