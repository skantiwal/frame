package Testing_Baba_test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Testing_Baba_pages.Upload_document_pages;
import baselibrary.Baselibrary;

public class Upload_Document_Page_Test extends Baselibrary
{
	Upload_document_pages ob;
	@BeforeTest
	@Parameters({ "url", "browsername" })
	
	public void launchurl1(String url, String browsername) {
		Launchurl(getreadData(url), browsername);
		ob = new Upload_document_pages();
	}
	
	@Test(priority =1)
	public void clikonelement() throws InterruptedException 
	{
		ob.clickonelement();
		Thread.sleep(1000);
		ob.upload1();
	}
	@Test(priority = 2)
	public void verifyupload() throws InterruptedException 
	{		
		ob.choosefile();
	}
	@Test(priority = 3)
	public void Download() 
	{
		ob.download();
	}
	

}
