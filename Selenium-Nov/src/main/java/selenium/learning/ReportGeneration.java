package selenium.learning;

import java.io.File;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ReportGeneration {

	@Test
	public void sampleReports() {
		
		// define the location of a report
		ExtentReports report = new ExtentReports("F:\\Selenium\\Selenium -Nov 17\\sampleReport.html",false);
		
		report.assignProject("Test Leaf Project");
		report.loadConfig(new File("./LoadConfig.xml"));
		
	ExtentTest test=report.startTest("CreateLead", "Create a new lead");
	//assign the author and category
	test.assignAuthor("Sindhu");
	test.assignCategory("sanity");
	
	// ExtendTest class to track the log
	 test.log(LogStatus.PASS , "Launch Browser", "Browser Launched Successfully");
	 test.log(LogStatus.FAIL , "Launch Browser", "Browser not Launched Successfully");	
	 //stop test
	 
	 report.endTest(test);
	 report.flush();
		
		
	}
}
