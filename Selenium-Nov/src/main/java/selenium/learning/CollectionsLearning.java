package selenium.learning;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CollectionsLearning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:/Selenium/drivers/chromedriver.exe");
		
		//initialize the Chrome driver
		
		ChromeDriver driver= new ChromeDriver();
		
		// enter the URL
		driver.get("https://erail.in");
		//maximize the window
		driver.manage().window().maximize();
		
		//add implicit wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElementById("txtStationFrom").clear();
		driver.findElementById("txtStationFrom").sendKeys("MS",Keys.TAB);
		
		driver.findElementById("txtStationTo").clear();
		driver.findElementById("txtStationTo").sendKeys("SBC",Keys.TAB);
		
		driver.findElementById("buttonFromTo").click();
		
		WebElement table =driver.findElementByXPath("//table[@class='DataTable TrainList']");
		
		List<WebElement> row=table.findElements(By.tagName("tr"));
		List<String> beforeSort = new ArrayList<String>();
		List<String> afterSort = new ArrayList<String>();
		int rowCount = row.size();
		System.out.println(rowCount);
		
	for (int i=0;i<rowCount-1;i++) {
		
		String columnsBeforeSort=row.get(i).findElements(By.tagName("td")).get(1).getText();
		beforeSort.add(columnsBeforeSort);
		
	}
	
	Collections.sort(beforeSort);
	driver.findElementByLinkText("Train Name").click();
	
	
	
	for (int j = 0; j <rowCount-1; j++) {
		
		String columnsAfterSort=row.get(j).findElements(By.tagName("td")).get(1).getText();
		 afterSort.add(columnsAfterSort);
		 
	}
	Collections.sort(afterSort);	
	
	if(beforeSort.equals(afterSort)) {
		System.out.println("Lists are same");
	}
	else {
		
		System.out.println("Lists are not same");
	}
		
		
	}

}
