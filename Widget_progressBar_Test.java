package Testing_Baba_test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Testing_Baba_pages.Widget_progressBar_Page;
import baselibrary.Baselibrary;

public class Widget_progressBar_Test extends Baselibrary
{
	Widget_progressBar_Page ob;
	@BeforeTest
	@Parameters({"url","browsername"})
	public void launchurl(String url,String browsername) 
	{
		Launchurl(getreadData(url), browsername);
		ob=new Widget_progressBar_Page();
	}
	@Test(priority = 1)
	public void clickonwidget() 
	{
		ob.widget();
	}
	@Test(priority = 2)
	public void progressbar() 
	{
		ob.progressbar();
	}

}
