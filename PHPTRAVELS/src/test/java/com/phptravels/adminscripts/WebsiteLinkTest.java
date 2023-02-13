package com.phptravels.adminscripts;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.phptravels.adminpages.WebsiteLinkPage;
import com.phptravels.base.BaseTest;
import com.phptravels.utilities.Loginutility;
import com.phptravels.utilities.Logoututility;

public class WebsiteLinkTest  extends BaseTest{

	@BeforeMethod
	public void Login() throws IOException {
		Loginutility.Adminlogin();
	}
	@Test
	public void websiteLink()  {
		WebsiteLinkPage objLink=new WebsiteLinkPage(driver);
		String actual=objLink.clickWebsie();
		assertEquals(actual, "https://phptravels.net/sd");
		
	}
	@AfterMethod
	public void logout() {
		Logoututility.adminlogout();
	}

}
