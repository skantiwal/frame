package Testing_Baba_test;

import static org.junit.Assert.fail;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Testing_Baba_pages.Button_Utility_pages;
import Testing_Baba_pages.Links_Page_Utility;
import baselibrary.Baselibrary;

public class Link_pageTest_utility extends Baselibrary {
	Links_Page_Utility ob;

	@Parameters({ "url", "browsername" })
	@BeforeTest
	public void launchurl1(String url, String browsername) {
		Launchurl(getreadData(url), browsername);
		ob = new Links_Page_Utility();
	}

	@Test(priority = 1)
	public void verifyelement()
	{
		ob.clickonelement();
	}
	
	@Test(priority = 2)
	public void verifylink() {
		ob.clickonlink();
		
	}

	@Test(priority = 3)
	public void verifycreated() {
		ob.Created();
	}

	@Test(priority = 4)
	public void verifcontent() {
		ob.Content();
	}

	@Test(priority = 5)
	public void verifyMoved() {
		ob.Moved();
	}

	@Test(priority = 6)
	public void verifybadrequest() {
		ob.badrequest();
	}

	@Test(priority = 7)
	public void verifyunauthorized() {
		ob.Unauthorized();
	}

	@Test(priority = 8)
	public void verifyforbidden() {
		ob.Forbidden();
	}

	@Test(priority = 9,enabled = false)
	public void verifynotfound() {
		ob.Notfound();
	}
	@Test(priority = 10)
	public void Demo() 
	{
		ob.DemoPage();
	}

}
