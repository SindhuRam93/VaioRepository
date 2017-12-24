package selenium.learning;

import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:/Selenium/drivers/chromedriver.exe");
		
		//initialize the Chrome driver
		
		ChromeDriver driver= new ChromeDriver();
		
		// enter the URL
		driver.get("http://leaftaps.com/opentaps");
		//maximize the window
		driver.manage().window().maximize();
		
		
	}

}
