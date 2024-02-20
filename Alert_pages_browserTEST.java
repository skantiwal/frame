package Testing_Baba_test;

import java.awt.AWTException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Testing_Baba_pages.Alert_pages_browser;
import baselibrary.Baselibrary;

public class Alert_pages_browserTEST extends Baselibrary
{
	Alert_pages_browser ob;
	@BeforeTest
	@Parameters({"url","browsername"})
	public void getlaunch(String url,String browsername) 
	{
		Launchurl(getreadData(url), browsername);
		ob=new Alert_pages_browser();		
	}
	@Test(priority = 0)
	public void valert() 
	{
		ob.Alert();
	}
	@Test(priority = 1)
	public void browser() 
	{
		ob.clikonbrowser();
	}
	@Test(priority = 2)
	public void newtab() throws InterruptedException 
	{
		ob.clickonNewTab();
	}
	@Test(priority = 3)
	public void newwindow() throws InterruptedException, AWTException 
	{
	
		ob.clikonnewwindow();
	}
	@Test(priority = 4)
	public void newmessage() throws InterruptedException, AWTException 
	{
		
		ob.clikonnewwindowmessage();
	}
	
	
	
}
