package com.phptravels.customerscripts;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.phptravels.base.BaseTest;
import com.phptravels.customerpages.ViewVoucherPage;
import com.phptravels.utilities.Loginutility;
import com.phptravels.utilities.Logoututility;

public class ViewVoucherTest extends BaseTest {
	@BeforeMethod
	public void Login() throws IOException {
		Loginutility.customerlogin();
	}
	@Test
	public void viewVoucher() {
	ViewVoucherPage objVoucher=new ViewVoucherPage(driver);
		objVoucher.clickBookings();
		boolean actual=objVoucher.clickViewVoucher();
		System.out.println("ta="+actual);
		assertTrue(actual);
	}
	
	@AfterMethod
	public void logout() {
		Logoututility.caLogout();
	}

}
