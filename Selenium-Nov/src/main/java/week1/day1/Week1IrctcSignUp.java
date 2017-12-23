package week1.day1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Week1IrctcSignUp {

	public static void main(String[] args) throws InterruptedException {

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
		driver.findElementById("userRegistrationForm:securityQ").sendKeys("What is your pet name?"); //drop down
		driver.findElementById("userRegistrationForm:securityAnswer").sendKeys("Pet");
		driver.findElementById("userRegistrationForm:prelan").sendKeys("English");

		driver.findElementById("userRegistrationForm:firstName").sendKeys("Uname");
		driver.findElementById("userRegistrationForm:lastName").sendKeys("LastName");

		driver.findElementById("userRegistrationForm:gender:0").click();   //radio
		driver.findElementById("userRegistrationForm:maritalStatus:0").click(); //radio
		
		driver.findElementById("userRegistrationForm:dobDay").sendKeys("10"); //drop down
		driver.findElementById("userRegistrationForm:dobMonth").sendKeys("DEC"); //DROP DOWN
		driver.findElementById("userRegistrationForm:dateOfBirth").sendKeys("1998"); //drop down
		driver.findElementById("userRegistrationForm:occupation").sendKeys("Professional"); //drop down
		
		driver.findElementById("userRegistrationForm:uidno").sendKeys("123456789876");
		driver.findElementById("userRegistrationForm:idno").sendKeys("AXOGF8456N");
		
		driver.findElementById("userRegistrationForm:countries").sendKeys("India"); //dropdown
		driver.findElementById("userRegistrationForm:email").sendKeys("abc@gmail.com");
		driver.findElementById("userRegistrationForm:mobile").sendKeys("1234567890");
		driver.findElementById("userRegistrationForm:nationalityId").sendKeys("India");
		
		driver.findElementById("userRegistrationForm:address").sendKeys("Door1");
		driver.findElementById("userRegistrationForm:pincode").sendKeys("680002",Keys.TAB);
		/*WebElement tab = driver.findElementById("userRegistrationForm:pincode");
		tab.sendKeys(Keys.TAB);*/
		Thread.sleep(5000);
		driver.findElementById("userRegistrationForm:cityName").sendKeys("Thrissur");
		Thread.sleep(5000);
		driver.findElementById("userRegistrationForm:postofficeName").sendKeys("Punkunnu S.O");
		driver.findElementById("userRegistrationForm:landline").sendKeys("4872568965");
		
		driver.close();

	}

}
