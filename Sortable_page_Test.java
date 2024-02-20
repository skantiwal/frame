package Testing_Baba_test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Testing_Baba_pages.Sortable_pages;
import baselibrary.Baselibrary;

public class Sortable_page_Test extends Baselibrary
{
	Sortable_pages ob;
	@BeforeTest
	@Parameters({"url","browsername"})
	public void launchurl(String url,String browsername) 
	{
		Launchurl(getreadData(url), browsername);
		ob =new Sortable_pages();
	}
	@Test(priority = 1)
	public void clickonintreaction() 
	{
		ob.clickonintreaction();
	}
	@Test(priority = 2)
	public void clickonsortable() 
	{
		ob.clickonsortable();
	}
	@Test(priority = 3)
	public void gettext() 
	{
		ob.sortdata();
	}
}
