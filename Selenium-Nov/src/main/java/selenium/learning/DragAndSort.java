package selenium.learning;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndSort {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:/Selenium/drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();

		// enter the URL
		driver.get("http://jqueryui.com/draggable/");
		//maximize the window
		driver.manage().window().maximize();
		//navigate to Frame
		WebElement ele = driver.findElementByClassName("demo-frame");
		driver.switchTo().frame(ele);

		// identify the web element in the Frame and click

		WebElement drag=driver.findElementById("draggable");

		System.out.println(drag.getLocation());

		Actions builder= new Actions(driver);
		builder.dragAndDropBy(drag, 100, 100).perform();
		System.out.println(drag.getLocation());
		driver.switchTo().defaultContent();
		//Sorting
		driver.findElementByLinkText("Sortable").click();
		//navigate to Frame
		WebElement ele1 = driver.findElementByClassName("demo-frame");
		driver.switchTo().frame(ele1);
		
		//select item 1
		WebElement source=driver.findElementByXPath("//li[text()='Item 1']");
		WebElement target=driver.findElementByXPath("//li[text()='Item 4']");
		System.out.println(source.getLocation());
		System.out.println(target.getLocation());
		builder.clickAndHold(source).moveByOffset(11, 130).release().build().perform();
		
		
		
		
	}

}
