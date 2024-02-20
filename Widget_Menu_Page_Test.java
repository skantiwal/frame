package Testing_Baba_test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Testing_Baba_pages.Button_Utility_pages;
import Testing_Baba_pages.Widget_menuPage;
import baselibrary.Baselibrary;

public class Widget_Menu_Page_Test extends Baselibrary
{
	Widget_menuPage ob;	
	@Parameters({"url","browsername"})
	@BeforeTest
	public void launchurl1(String url,String browsername) 
	{
		Launchurl(getreadData(url),browsername);
		ob=new Widget_menuPage();
	}
	@Test(priority = 1)
	public void widget() 
	{
		ob.widget();
	}
	@Test(priority = 2)
	public void clickonmenu() 
	{
		ob.clickonmenu();
	}
	
	
	

}
