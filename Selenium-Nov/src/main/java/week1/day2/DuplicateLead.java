package week1.day2;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:/Selenium/drivers/chromedriver.exe");
		
		
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
		Thread.sleep(5000);
		//click on CRMSFA link
		driver.findElementByLinkText("CRM/SFA").click();
		
		//click on Leads link
		
		driver.findElementByLinkText("Leads").click();
		
		
		//Click on find leads link
		
		driver.findElementByLinkText("Find Leads").click();
		
		//Click on Email tab
		
		driver.findElementByXPath("//span[contains(text(),'Email')]").click();
		
		//enter email id and click on find leads button
		
		driver.findElementByName("emailAddress").sendKeys("SGK@leaftaps.com");
		driver.findElementByXPath("//button[contains(text(),'Find Leads')]").click();
		Thread.sleep(4000);
		//capture the  first name of first Resulting lead and click
		
		WebElement ele=driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a[1]");
		String str= ele.getText();
		System.out.println("captured firstName" + str);
		ele.click();
		
		//click on duplicate lead
		
		driver.findElementByLinkText("Duplicate Lead").click();
		
		//verify the title using getTitle() method
		String title= driver.getTitle();
		if(title.equalsIgnoreCase("Duplicate Lead | opentaps CRM"))
		{
			System.out.println("Title macthed");
		}
		else
		{
			System.out.println("Title not macthed");
		}
		
		
		//click on create lead
		
		driver.findElementByClassName("smallSubmit").click();
		
		//verify whether the first name is unaltered after Duplication
		String str1=driver.findElementById("viewLead_firstName_sp").getText();
		System.out.println("firstName after"+ str1);
		if(str.equalsIgnoreCase(str1))
		{
			System.out.println("first name is unaltered");
		}
		else
			System.out.println("Firstname is altered");
		//Close the browser
		
		driver.close();
		
	}

}
