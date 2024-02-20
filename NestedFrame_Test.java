package Testing_Baba_test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Testing_Baba_pages.NestedFrame_Page;
import baselibrary.Baselibrary;

public class NestedFrame_Test extends Baselibrary
{
	NestedFrame_Page ob;
	@BeforeTest
	@Parameters({"url","browsername"})
	public void getlaunch(String url,String browsername) 
	{
		Launchurl(getreadData(url), browsername);
		ob=new NestedFrame_Page();
	}
	@Test(priority = 1)
	public void first() 
	{
		ob.clickonalert();
       ob.clickonnested();
	}
	@Test(priority = 2)
	public void first1() 
	{
		
		ob.firstFrame();
	}
	

}
