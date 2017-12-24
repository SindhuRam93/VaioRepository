package wdMethods;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class ProjectMethods extends SeMethods {
    
	@Parameters({"Browser","URL","Uname","PSW"})
	
	@BeforeMethod(groups="common")
	
	public void login(String Browser,String URL,String Uname ,String PSW )
	{
		//Invoke the browser and enter the credentials
		startApp(Browser, URL);
		type(locateElement("id", "username"), Uname);
		type(locateElement("id", "password"), PSW);
		click(locateElement("class", "decorativeSubmit"));
		//click on CRMSFA link
				click(locateElement("LinkText", "CRM/SFA"));
	}
	
	@AfterMethod(groups="common")
	
	public void close()
	{
		closeAllBrowsers();
	}
	
}
