package selenium.learning;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LearningAnnotations {

	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("BeforeSuite");
	}
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("BeforeTest");
	}

	@BeforeClass
	public void beforeClass()
	{
		System.out.println("BeforeClass");
	}

	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("BeforeMethod");
	}

	@Test
	public void Test()
	{
		System.out.println("test1");
	}
	@org.junit.Test
	public void Test1()
	{
		System.out.println("testjunit");
	}

	@AfterMethod
	public void afterMethod()
	{
		System.out.println("afterMethod");
	}

	@AfterClass
	public void afterClass()
	{
		System.out.println("afterClass");
	}

	@AfterSuite
	public void AfterSuite()
	{
		System.out.println("@fterSuite");
	}

	
}
