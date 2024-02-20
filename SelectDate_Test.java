package Testing_Baba_test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Testing_Baba_pages.SelectDate_pages;
import baselibrary.Baselibrary;

public class SelectDate_Test extends Baselibrary
{
	SelectDate_pages ob;
	@BeforeTest
	@Parameters({"url","browsername"})
	public void getlaunch(String url,String browsername) 
	{
		Launchurl(getreadData(url), browsername);
		ob=new SelectDate_pages();		
	}
	
	@Test(priority = 1)
	public void clickonwidget() 
	{
		ob.clickonwidget();
	}
	@Test(priority = 2)
	public void clickondate() 
	{
		ob.selectDate();
	}

}
