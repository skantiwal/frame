package Testing_Baba_test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Testing_Baba_pages.Frame_page;
import baselibrary.Baselibrary;

public class Frame_Test extends Baselibrary
{Frame_page ob;
@BeforeTest
@Parameters({"url","browsername"})
public void getlaunch(String url,String browsername) 
{
	Launchurl(getreadData(url), browsername);
	ob=new Frame_page();
	
}
  @Test(priority = 1)
  public void first() 
  {
	  ob.clickonalert();
	  ob.enterframe();
  }
  @Test(priority = 2)
  public void ggg() 
  {
	  ob.ggg();
  }
	

}
