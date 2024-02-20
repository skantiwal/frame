package Testing_Baba_test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Testing_Baba_pages.SelectMenu_Page;
import baselibrary.Baselibrary;

public class SelectMenu_Test extends Baselibrary
{
	SelectMenu_Page ob;
	@BeforeTest
	@Parameters({"url","browsername"})
	public void launch(String url,String browsername) 
	{
		Launchurl(getreadData(url), browsername);
		ob=new SelectMenu_Page();
	}
	@Test(priority = 1)
	public void widget() 
	{
		ob.clickonwidget();
	}
	@Test(priority = 2)
	public void clickOnSelectMenu() 
	{
		ob.clickOnSelectMenu();
		ob.SelectDropDownValue();
	}

	@Test(priority = 3)
	public void SelectDropone() 
	{
		ob.SelectDropone();
	}
	@Test(priority = 4)
	public void oldstyle() 
	{
		ob.oldstyle();
	}
	@Test(priority = 5)
	public void multiselect() 
	{
		ob.multiselect();
	}

}
