package Testing_Baba_test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Testing_Baba_pages.widget_ToolPages;
import baselibrary.Baselibrary;

public class Widget_ToolTest extends Baselibrary
{
	widget_ToolPages ob;
	@BeforeTest
	@Parameters({"url","browsername"})
	public void launchurl(String url,String browsername)
	{
		Launchurl(getreadData(url), browsername);
		ob=new widget_ToolPages();
	}
	@Test(priority = 0)
	public void widget() 
	{
		ob.widget();
	}
	@Test(priority = 1)
	public void tooltip() 
	{
		ob.tooltip();
	}
	@Test(priority = 2)
	public void mouseover() 
	{
		ob.mouseover();
	}
	
	
	

}
