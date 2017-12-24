package week1.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class LeafTapsLogin {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:/Sel-Nov2017/drivers/chromedriver.exe");
		
		// initialize the chrome driver
			ChromeDriver driver = new ChromeDriver();
		//	invoke browser
			driver.get("http://leaftaps.com/opentaps");
		//maximize the browser	
			driver.manage().window().maximize();
			
			driver.findElementById("username").sendKeys("DemoSalesManager");
			driver.findElementById("password").sendKeys("crmsfa");
			driver.findElementByClassName("decorativeSubmit").click();
			
			//click on crmsfa link
			driver.findElementByLinkText("CRM/SFA").click();
			
			//click on create lead
			
			driver.findElementByLinkText("Create Lead").click();
			
			//enter mandatory fields and click on create lead
			driver.findElementById("createLeadForm_companyName").sendKeys("Sind");
			driver.findElementById("createLeadForm_firstName").sendKeys("Sree");
			driver.findElementById("createLeadForm_lastName").sendKeys("Ram");
			driver.findElementByClassName("smallSubmit").click();
			
		driver.close();	
	}
		
}
