package Testing_Baba_test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Testing_Baba_pages.Widget_AutoComplete_page;
import baselibrary.Baselibrary;

public class widget_AutoTab_Test extends Baselibrary
{
	Widget_AutoComplete_page ob;
	@BeforeTest
	@Parameters({"url","browsername"})
	public void getlaunch(String url,String browsername) 
	{
		Launchurl(getreadData(url), browsername);
		ob=new Widget_AutoComplete_page();		
	}
	@Test(priority = 1)
	public void clickonwidget() 
	{
		ob.clickonwidget();
		ob.clickonAutoTab();
	}
	@Test(priority = 2)
	public void entry() 
	{
		ob.india();
	}
	

}
