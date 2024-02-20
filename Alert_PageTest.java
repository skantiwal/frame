package Testing_Baba_test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Testing_Baba_pages.Alert_page;
import baselibrary.Baselibrary;

public class Alert_PageTest extends Baselibrary
{
	Alert_page ob;
	@BeforeTest
	@Parameters({"url","browsername"})
	public void getlaunch(String url,String browsername) 
	{
		Launchurl(getreadData(url), browsername);
		ob=new Alert_page();
	}
	
	
	@Test(priority = 1)
	public void vAlert()
	{
		ob.clickonalert();
	}
	@Test(priority = 2)
	public void clickon() throws InterruptedException
	{
		ob.ClickonTab();
		ob.clickon1();
        ob.clickon5();
        ob.clickon2();
        ob.clickon4();
	}
	
	

}
