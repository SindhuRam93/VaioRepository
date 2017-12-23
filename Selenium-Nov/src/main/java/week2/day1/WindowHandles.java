package week2.day1;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:/Sel-Nov2017/drivers/chromedriver.exe");

		// Create object for ChromeDriver

		ChromeDriver driver = new ChromeDriver();

		// invoke browser and navigate to URL

		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");

		//Maximize the window

		driver.manage().window().maximize();
		
		//Click on Contact US link
		driver.findElementByLinkText("Contact Us").click();
		
		// Get all the Window handles
		
		Set<String> allWindows =driver.getWindowHandles();
		
		int noOfWindows= allWindows.size();
		System.out.println(noOfWindows); 
		// navigate to 2nd Window handle using For each loop
		
		for (String eachWindow : allWindows) {
			
			driver.switchTo().window(eachWindow);
			}
		
		System.out.println(driver.getCurrentUrl());
		
		driver.close();
		// to print 2nd URL after closing the first one
		
		Set<String> allWindows1 =driver.getWindowHandles();
		
		//use for each to print the second URL
		
		for (String eachWindow1 : allWindows1) {
			
			driver.switchTo().window(eachWindow1);
			}
		
		System.out.println(driver.getCurrentUrl()); 
	}

}
