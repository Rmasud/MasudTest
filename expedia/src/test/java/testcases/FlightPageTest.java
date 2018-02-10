package testcases;

import org.testng.annotations.BeforeClass;

import pages.FlightPage;

import org.testng.annotations.*;

import testbase.TestBase;

public class FlightPageTest extends TestBase {
	
	

	@BeforeClass
	public void openBrowser() {

		initBrowser();
	}

	@Test
	public void testCase() throws InterruptedException {
		
		FlightPage pageTest = new FlightPage(driver);

		pageTest.flightFromInput("Brooklyn, New York");
		
		Thread.sleep(2000);
		
		pageTest.flightToInput("Australia");
		
		Thread.sleep(2000);
		
		pageTest.InputadultsDropdown("3");
		
		Thread.sleep(2000);
		
		pageTest.inputDepartDate("12/02/2018");
		
		pageTest.inputReturn("12/07/2018");
		
		pageTest.clickSearchFlight();
		
		
		
	}
	
	@AfterClass
	public void endBrowser() throws Exception {
		
		Thread.sleep(2000);
		
		driver.quit();
	}

}










