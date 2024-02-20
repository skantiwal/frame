package Testing_Baba_test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Testing_Baba_pages.Button_Utility_pages;
import baselibrary.Baselibrary;

public class Button_Test extends Baselibrary
{
	Button_Utility_pages ob;	
	@Parameters({"url","browsername"})
	@BeforeTest
	public void launchurl1(String url,String browsername) 
	{
		Launchurl(getreadData(url),browsername);
		ob=new Button_Utility_pages();
	}
	@Test(priority = 0)
	public void verifyonelement() 
	{
		ob.clickonelement();
	}
	@Test(priority = 1)
	public void verifybutton() 
	{
		ob.clickonbutton();
	}
	@Test(priority = 2)
	public void verifydoubleclick() 
	{
		ob.doubleclick();
	}
	@Test(priority = 3)
	public void verifyrightclick() 
	{
		ob.rightclick();
	}
	
	
	
}
