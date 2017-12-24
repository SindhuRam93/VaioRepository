package wdMethods;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class SeMethods implements WdMethods{

	int i =1;
	RemoteWebDriver driver = null ;
	WebElement ele = null;
	Alert alert = null;

	public void startApp(String browser, String url) {
		try {
			if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "F:/Selenium/drivers/chromedriver.exe");
				driver = new ChromeDriver();
			} else if (browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", "F:/Selenium/drivers/chromedriver.exe");
				driver = new FirefoxDriver();
			}
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			System.out.println("Browser "+browser+" Launched successfully");
		} catch (WebDriverException  e) {
			// TODO Auto-generated catch block
			System.err.println("Driver not found");
		}
		finally{
			takeSnap();
		}

	}





	public void startApp(String browser) {



	}

	public WebElement locateElement(String locator, String locValue) {

		try {
			switch (locator) {
			case "id": 
				ele = driver.findElementById(locValue);
				break;
			case "name": 
				ele = driver.findElementByName(locValue);
				break;
			case "xpath": 
				ele = driver.findElementByXPath(locValue);
				break;	
			case "class": 
				ele = driver.findElementByClassName(locValue);
				break;
			case "LinkText": 
				ele = driver.findElementByLinkText(locValue);
				break;
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.err.println("No such element is found");
		}
		catch (WebDriverException e)
		{
			System.err.println("Driver not found");
		}
		return ele;
	}

	public WebElement locateElement(String locValue) {

		return null;
	}

	public void type(WebElement ele, String data) {
		try {
			ele.clear();
			ele.sendKeys(data);
			System.out.println("Given Value :"+data+" Is Entered Successfully");
		} catch ( NoSuchElementException e) 
		{
			// TODO Auto-generated catch block
			System.err.println("No such element found");
		}
		finally{
			takeSnap();
		}
	}
	public void click(WebElement ele) {
		ele.click();
		System.out.println("Element is Clicked Successfully");

		takeSnap();
	}

	public String getText(WebElement ele) {

		return ele.getText();

	}

	public void selectDropDownUsingText(WebElement ele, String value) {
		Select dd2 = new Select(ele);
		dd2.selectByVisibleText(value);

		takeSnap();
	}

	public void selectDropDownUsingIndex(WebElement ele, int index) {

		Select dd1 = new Select(ele);
		dd1.selectByIndex(index);
		takeSnap();
	}

	public boolean verifyTitle(String expectedTitle) {
		// TODO Auto-generated method stub
		try
		{
			if(driver.getTitle().equalsIgnoreCase(expectedTitle))
			{
				System.out.println("Title Verified and it is: "+ driver.getTitle());

			}
			else
			{
				System.out.println("The title does not match with the expected Title");
				return false;
			}
		}catch(WebDriverException e)
		{
			System.err.println("Driver not found");
		}
		return true ;
	}

	public void verifyExactText(WebElement ele, String expectedText) {
		// TODO Auto-generated method stub

		String actualText= ele.getText();
		if(actualText.equalsIgnoreCase(expectedText))
		{
			System.out.println("Actual Text matches with the Expected text");
		}
		else
		{
			System.out.println("Actual Text  does not match with the Expected text");
		}
		takeSnap();
	}
	// TODO Auto-generated catch block



	public void verifyPartialText(WebElement ele, String expectedText) {
		// TODO Auto-generated method stub

		String actualText= ele.getText();

		if(actualText.contains(expectedText))
		{
			System.out.println("Partial text matches with Expected text");
		}
		else
		{
			System.out.println("Partial text does not match with Expected text");
		}
		takeSnap();
	} 

	public void verifyExactAttribute(WebElement ele, String attribute, String value) {
		// TODO Auto-generated method stub


		String actualAttribute=ele.getAttribute(attribute);

		if(actualAttribute.equalsIgnoreCase(value))
		{
			System.out.println("Actual attribute matches with expected attribute ");
		}

		else
		{
			System.out.println("Actual attribute does not match with expected attribute ");
		}
		takeSnap();
	}


	public void verifyPartialAttribute(WebElement ele, String attribute, String value) {
		// TODO Auto-generated method stub

		String partialAttribute=ele.getAttribute(attribute);

		if(partialAttribute.contains(value))
		{
			System.out.println("Partial attribute matches with expected attribute ");
		}

		else
		{
			System.out.println("Partial attribute does not match with expected attribute ");
		}
		takeSnap();
	}



	public void verifySelected(WebElement ele) {
		// TODO Auto-generated method stub
		if (ele.isSelected())
			System.out.println("The Webelement is selected");
		else
			System.out.println("The webelement is not selected");
	}

	public void verifyDisplayed(WebElement ele) {
		// TODO Auto-generated method stub
		if(ele.isDisplayed())
			System.out.println("The WebElement is displayed");
		else
			System.out.println("The WebElement is not displayed");
		takeSnap();
	}

	public void switchToWindow(int index) {
		// TODO Auto-generated method stub

		try {
			Set<String> allWindowHandles = driver.getWindowHandles();

			List<String> allHandles = new ArrayList<>();

			allHandles.addAll(allWindowHandles);

			driver.switchTo().window(allHandles.get(index));
			driver.manage().window().maximize();
		} catch (NotFoundException e) 
		{
			// TODO Auto-generated catch block
			System.err.println("Not Found Exception is thrown");
		}
		catch (WebDriverException e)
		{
			// TODO Auto-generated catch block
			System.err.println("Driver not found");
		}

	}



	public void switchToFrame(WebElement ele) {
		// TODO Auto-generated method stub
		try {
			driver.switchTo().frame(ele);
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			System.err.println("Driver not found");
		}
		finally{
			takeSnap();
		}
	}

	public void acceptAlert() {
		// TODO Auto-generated method stub
		try {
			alert = driver.switchTo().alert();
			alert.accept();
		} catch (NotFoundException e) {
			// TODO Auto-generated catch block
			System.err.println("Not found exception is thrown");
		}
	}

	public void dismissAlert() {
		// TODO Auto-generated method stub
		try {
			alert = driver.switchTo().alert();
			alert.dismiss();
		} catch (NotFoundException e) {
			// TODO Auto-generated catch block
			System.err.println("Not found exception is thrown");
		}
	}

	public String getAlertText() {
		// TODO Auto-generated method stub
		try 
		{
			alert = driver.switchTo().alert();

		} catch (NotFoundException e) 
		{
			// TODO Auto-generated catch block
			System.err.println("Not found exception is thrown");
		}
		return alert.getText();
	}



	public long takeSnap() {
		// TODO Auto-generated method stub

		try {
			File src=driver.getScreenshotAs(OutputType.FILE);
			File desc= new File("./snaps/snap"+i+".jpeg");
			FileUtils.copyFile(src, desc);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.err.println("File not found");
			throw new RuntimeException();
		}catch(WebDriverException e){
			System.err.println("driver not found");
		}
		return i++;
	}

	public void closeBrowser() {
		// TODO Auto-generated method stub
		driver.close();
	}

	public void closeAllBrowsers() {
		// TODO Auto-generated method stub
		driver.quit();

	}

}
