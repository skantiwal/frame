package Testing_Baba_test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Testing_Baba_pages.WebTable_Page;
import baselibrary.Baselibrary;

public class WebTable_Test extends Baselibrary
{
	WebTable_Page ob;
	@BeforeTest
	@Parameters({"url","browsername"})
	public void getlaunch(String url,String browsername) 
	{
		Launchurl(getreadData(url), browsername);
		ob= new WebTable_Page(); 
	}
	@Test(priority = 0)
	public void clikelement() 
	{
		ob.clikelement();
	}
	@Test(priority = 1)
	public void verifywebtable() 
	{
		ob.webTablE();	
	}
	@Test(priority = 2)
	public void filldetTails() throws InterruptedException 
	{
		ob.filldetTails();
		ob.GetRaedInWebTable();
	}
	@Test(priority = 3)
	public void editTest() throws InterruptedException 
	{
		ob.Editable1();
	}
	@Test(priority = 4)
	public void verifydelet() 
	{
		ob.verifydelete();
	}
	

}
