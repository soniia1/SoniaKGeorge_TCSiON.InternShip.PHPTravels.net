package com.phptravels.supplierscripts;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.phptravels.base.BaseTest;
import com.phptravels.supplierpages.RevenueBreakdownDisplay;
import com.phptravels.utilities.Loginutility;
import com.phptravels.utilities.Logoututility;

public class RevenueBreakdownDisplayTest extends BaseTest {
	@BeforeMethod
	public void Login() throws IOException {
		Loginutility.Supplierlogin();
	}
	@Test
	public void revBkDwnDisplay() {
		RevenueBreakdownDisplay objDispaly=new RevenueBreakdownDisplay(driver);
		
		boolean actual=objDispaly.rbDisplay();
		System.out.println(actual);
		assertTrue(actual);
	}
	@AfterMethod
	public void logout() {
		Logoututility.supplierlogout();
	}

}
