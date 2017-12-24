package week2.day1;

import java.util.Set;

import org.junit.internal.runners.model.EachTestNotifier;
import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class MergeLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
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
		

		//click on CRMSFA link
		driver.findElementByLinkText("CRM/SFA").click();
		
		//click on Leads link
		driver.findElementByLinkText("Leads").click();
		
		//click on merge leads link
		driver.findElementByLinkText("Merge Leads").click();
		
		Thread.sleep(5000);
		//click on the icon next to From Lead using following-sibling keyword in XPATH
		
		driver.findElementByXPath("//table[@name='ComboBox_partyIdFrom']/following-sibling::a/img").click();
		Thread.sleep(5000);
		
		//move to new window using for each loop
		
		Set<String> allWindowHandles =driver.getWindowHandles();
		
		for (String eachWindowHandle: allWindowHandles)
			{
			
			driver.switchTo().window(eachWindowHandle);
			}
		// maximize the current window handle
		driver.manage().window().maximize();
		
		// enter the lead ID and click on Find Lead button
		driver.findElementByXPath("(//input[contains(@id,'ext')])[1]").sendKeys("12511");
		driver.findElementByXPath("(//button[contains(@id,'ext')])[1]").click();
		
		Thread.sleep(5000);
		// click on the first resultant lead ID
		
		driver.findElementByXPath("//table[@class='x-grid3-row-table']/tbody/tr[1]/td[1]//a").click();
		
		
		
		// move to primary window
		
		Set<String> allWindowHandles1 =driver.getWindowHandles();
		
		for (String eachWindowHandle1: allWindowHandles1) 
			{
			
			driver.switchTo().window(eachWindowHandle1);
			}
		
		// click on the icon near To Lead
		
		driver.findElementByXPath("//table[@name='ComboBox_partyIdTo']/following-sibling::a/img").click();
		
		Thread.sleep(5000);
		
		//move to new window using for each loop
		
		Set<String> allWindowHandles2 =driver.getWindowHandles();
		
		for (String eachWindowHandle2: allWindowHandles2)
		   {
			
			driver.switchTo().window(eachWindowHandle2);
			}
		// maximize the current window handle
		driver.manage().window().maximize();
		
		//Enter the lead ID in the new window and click on Find leads button
		
		driver.findElementByXPath("(//input[contains(@id,'ext')])[1]").sendKeys("12512");
		driver.findElementByXPath("(//button[contains(@id,'ext')])[1]").click();
		
		// click on the resultant lead Id
		Thread.sleep(5000);
		driver.findElementByXPath("//table[@class='x-grid3-row-table']/tbody/tr/td[1]//a").click();
		
		//switch back to primary window
		
		Set<String> allWindowHandles3 =driver.getWindowHandles();
		
		for (String eachWindowHandle3: allWindowHandles3) 
			{
			
			driver.switchTo().window(eachWindowHandle3);
			}
			
		//click on merge button
		
		driver.findElementByLinkText("Merge").click();
		
		// Accept the alert
		
		Alert mergeAlert = driver.switchTo().alert();
		mergeAlert.accept();
		
		//click on Find leads
		
		driver.findElementByLinkText("Find Leads").click();
		Thread.sleep(5000);
		
		//enter the lead ID and click on Find leads
		
		driver.findElementByXPath("//input[(@name='id')]").sendKeys("12511");
		driver.findElementByXPath("//button[contains(text(),'Find Leads')]").click();
	}
}
