package Testing_Baba_test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Testing_Baba_pages.Text_box_pages;
import Testing_Baba_pages.login_page;
import baselibrary.Baselibrary;

public class login_test extends Baselibrary
{
	login_page ob;
	@BeforeTest
	@Parameters({"url","browsername"})
	public void launchurl1(String url,String browsername) 
	{
		Launchurl(getreadData(url),browsername);
		ob=new login_page();
	}
	@Test
	public void gettilte() 
	{
		ob.gettitle();
	}

	
}
