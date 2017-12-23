package week2.day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsAndFrames {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:/Sel-Nov2017/drivers/chromedriver.exe");
		
		// create driver class for chrome driver
		
		ChromeDriver driver = new ChromeDriver();
		
		//maximize the window
		
		driver.manage().window().maximize();
		
		//enter the URL
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		
		//navigate to Frame
		
		driver.switchTo().frame("iframeResult");
		
		// identify the webelement in the Frame and click
		
	WebElement button=	driver.findElementByXPath("//button[contains(text(), 'Try it')]");
	
	button.click();
	
		
		//handle the prompt alert
		
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Testing Alerts");
		alert.accept();
		
		// verifying the text in the frame
		
		String text = driver.findElementById("demo").getText();
		
		if(text.equalsIgnoreCase("Hello Testing Alerts! How are you today?")){
		System.out.println("Pass");
		
		}
		else{
			
			System.out.println("Text is not matching with the input");
		}
			
	}
		
			
	}


