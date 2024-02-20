package Testing_Baba_test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Testing_Baba_pages.Widget_TAb_page;
import baselibrary.Baselibrary;

public class WidgetTab_Test extends Baselibrary
{
	Widget_TAb_page ob;
	@BeforeTest
	@Parameters({"url","browsername"})
	public void launchurl(String url,String browsername)
	{
		Launchurl(getreadData(url), browsername);
		ob=new Widget_TAb_page();
	}
	@Test(priority = 0)
	public void clickonwidget() 
	{
		ob.widget();
	}
	@Test(priority = 1)
	public void clickontab() 
	{
		ob.tab1();
		ob.tab2();
		ob.tab3();
	}

}
