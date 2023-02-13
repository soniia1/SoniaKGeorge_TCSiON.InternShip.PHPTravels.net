package com.phptravels.adminscripts;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.phptravels.adminpages.InvoiceSuccess;
import com.phptravels.base.BaseTest;
import com.phptravels.utilities.Loginutility;
import com.phptravels.utilities.Logoututility;

public class InvoiceSuccessTest extends BaseTest {
	@BeforeMethod
	public void Login() throws IOException {
		Loginutility.Adminlogin();
	}
	@Test
	public void bookInvoice() throws InterruptedException {
		InvoiceSuccess objInvoice=new InvoiceSuccess(driver);
		objInvoice.clickBooking();
		int confirmBookCount=objInvoice.confirmBookCount();
		
		if(confirmBookCount>0) {
		boolean actual=objInvoice.clickInvoice();
		System.out.println("a="+actual);
		assertTrue(actual);
		}
		
	}
	@AfterMethod
	public void logout() {
		Logoututility.adminlogout();
	}

}
