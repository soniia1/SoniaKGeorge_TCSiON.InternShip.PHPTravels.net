package com.phptravels.customerscripts;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.phptravels.customerpages.*;
import com.phptravels.base.BaseTest;

import com.phptravels.utilities.Loginutility;
import com.phptravels.utilities.Logoututility;

public class LeftSideLinksTest extends BaseTest {
	@BeforeMethod
	public void Login() throws IOException {
		Loginutility.customerlogin();
	}
	@Test
	public void sidelink() {
		LeftSideLinksPage objLink=new LeftSideLinksPage(driver);
		boolean actual=objLink.clickBookings();
		assertTrue(actual);
		boolean actual2=objLink.clickAddFund();
		assertTrue(actual2);
		boolean actual3=objLink.clickProfile();
		assertTrue(actual3);
		boolean actual4=objLink.clickLogout();
		assertTrue(actual4);
	}
	

}
