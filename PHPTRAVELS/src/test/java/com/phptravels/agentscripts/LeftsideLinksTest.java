package com.phptravels.agentscripts;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import com.phptravels.agentpages.LeftSideLinksPage;
import com.phptravels.base.BaseTest;

import com.phptravels.utilities.Loginutility;
import com.phptravels.utilities.Logoututility;

    public class LeftsideLinksTest extends BaseTest {

	@BeforeMethod
	public void Login() throws IOException {
		Loginutility.Agentlogin();
		//Loginutility.customerlogin();
	}
	@Test
	public void leftsidelinks() {
		LeftSideLinksPage objLinksPage=new LeftSideLinksPage(driver);
		boolean actual=objLinksPage.clickBookings();
		assertTrue(actual);
		boolean actual2=objLinksPage.clickAddFund();
		assertTrue(actual2);
		boolean actual3=objLinksPage.clickProfile();
		assertTrue(actual3);
		boolean actual4=objLinksPage.clickLogout();
		assertTrue(actual4);
	}
	
}
