package selenium.learning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverWaitDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:/Selenium/drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();

		// enter the URL
		driver.get("https://www.flipkart.com/");
		//maximize the window
		driver.manage().window().maximize();
		//mouseover electronics
		
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		WebElement ele =driver.findElementByXPath("//span[text()='Electronics']");
		//mouse overing using actions class
		Actions builder = new Actions(driver);
		builder.moveToElement(ele).perform();
		
		//dynamic wait
		WebDriverWait wait =new WebDriverWait(driver, 10);
		WebElement ele3 =driver.findElementByXPath("//span[text()='Apple']");
		wait.until(ExpectedConditions.elementToBeClickable(ele3));
		ele3.click();
	}

}
