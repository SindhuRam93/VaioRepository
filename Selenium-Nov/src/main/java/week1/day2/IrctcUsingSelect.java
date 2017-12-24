package week1.day2;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IrctcUsingSelect {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:/Sel-Nov2017/drivers/chromedriver.exe");

		// Create object for ChromeDriver

		ChromeDriver driver = new ChromeDriver();

		// invoke browser and navigate to URL

		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");

		//Maximize the window

		driver.manage().window().maximize();

		// enter the fields in IRCTC Signup page

		driver.findElementById("userRegistrationForm:userName").sendKeys("uName");
		driver.findElementById("userRegistrationForm:password").sendKeys("1234");
		driver.findElementById("userRegistrationForm:confpasword").sendKeys("1234");
		
		// Store the identified element in a  WebElement object 
		WebElement dd1= driver.findElementById("userRegistrationForm:securityQ");
		// Create an object of Select class and Pass the Webelement to Select Class
		Select securityQ = new Select(dd1);
		// Call the method name of the select Class to select a value from drop down
		securityQ.selectByVisibleText("What is your pet name?"); 
		
		driver.findElementById("userRegistrationForm:securityAnswer").sendKeys("Pet");
		driver.findElementById("userRegistrationForm:prelan").sendKeys("English");

		driver.findElementById("userRegistrationForm:firstName").sendKeys("Uname");
		driver.findElementById("userRegistrationForm:lastName").sendKeys("LastName");

		driver.findElementById("userRegistrationForm:gender:0").click();   //radio
		driver.findElementById("userRegistrationForm:maritalStatus:0").click(); //radio
		//drop down - DoB
		WebElement dd2 = driver.findElementById("userRegistrationForm:dobDay");
		Select dobDay = new Select(dd2);
		dobDay.selectByIndex(3);

		//drop down - dobMonth
		WebElement dd3 = driver.findElementById("userRegistrationForm:dobMonth");
		Select dobMonth = new Select(dd3);
		dobMonth.selectByIndex(10);

		//drop down - dobYear
		WebElement dd4 = driver.findElementById("userRegistrationForm:dateOfBirth");
		Select dobYear = new Select(dd4);
		dobYear.selectByValue("1978");
		
		//drop down occupation
		WebElement dd5= driver.findElementById("userRegistrationForm:occupation");
		Select occupation = new Select(dd5);
		occupation.selectByIndex(7);
		
		
		driver.findElementById("userRegistrationForm:uidno").sendKeys("123456789876");
		driver.findElementById("userRegistrationForm:idno").sendKeys("AXOGF8456N");
		
		// drop down country
		WebElement dd6 = driver.findElementById("userRegistrationForm:countries");
		Select country = new Select(dd6);
		country.selectByValue("94");
		
		driver.findElementById("userRegistrationForm:email").sendKeys("abc@gmail.com");
		driver.findElementById("userRegistrationForm:mobile").sendKeys("1234567890");
		
		//drop down nationality
		WebElement dd7 = driver.findElementById("userRegistrationForm:nationalityId");
		Select nationality = new Select(dd7);
		nationality.selectByValue("94");;
		
				
		driver.findElementById("userRegistrationForm:address").sendKeys("Door1");
		driver.findElementById("userRegistrationForm:pincode").sendKeys("680002");
		WebElement tab = driver.findElementById("userRegistrationForm:pincode");
		tab.sendKeys(Keys.TAB);
		Thread.sleep(5000);
		driver.findElementById("userRegistrationForm:cityName").sendKeys("Thrissur");
		Thread.sleep(5000);
		driver.findElementById("userRegistrationForm:postofficeName").sendKeys("Punkunnu S.O");
		driver.findElementById("userRegistrationForm:landline").sendKeys("4872568965");
		
		//driver.close();


	}

}
