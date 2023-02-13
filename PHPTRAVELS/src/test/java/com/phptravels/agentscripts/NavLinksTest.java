package com.phptravels.agentscripts;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.phptravels.agentpages.NavLinksPage;
import com.phptravels.base.BaseTest;
import com.phptravels.utilities.Loginutility;
import com.phptravels.utilities.Logoututility;

public class NavLinksTest extends BaseTest {
	

	@BeforeMethod
	public void Login() throws IOException {
		Loginutility.Agentlogin();
		//Loginutility.customerlogin();
	}
	
	@Test
	public void navlinks() {
		NavLinksPage objLink=new NavLinksPage(driver);
		boolean actual1=objLink.clickFlight();
		assertTrue(actual1);
		boolean actual2=objLink.clickHotel();
		assertTrue(actual2);
		boolean actual3=objLink.clickVisa();
		assertTrue(actual3);
		boolean actual4=objLink.clickTour();
		assertTrue(actual4);
		boolean actual5=objLink.clickBlog();
		assertTrue(actual5);
		boolean actual6=objLink.clickOffers();
		assertTrue(actual6);				
				
	}
	@AfterMethod
	public void logout() {
		Logoututility.caLogout();
	}

}
