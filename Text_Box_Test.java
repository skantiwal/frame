package Testing_Baba_test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Testing_Baba_pages.Text_box_pages;
import baselibrary.Baselibrary;

public class Text_Box_Test extends Baselibrary
{
	Text_box_pages ob;
	@BeforeTest
	@Parameters({"url","browsername"})
	public void launchurl1(String url,String browsername) 
	{
		Launchurl(getreadData(url),browsername);
		ob=new Text_box_pages();
	}
	@Test(priority = 0)
	public void verifyelement() 
	{
		ob.element();
		
	}
	@Test(priority = 1)
	public void verifytextbox() 
	{
		ob.textbox();
		
	}
	@Test(priority = 2)
	public void verifyfilldetails() 
	{
		ob.filldetails();
		
	}
}
