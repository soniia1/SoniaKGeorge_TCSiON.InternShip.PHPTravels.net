package com.phptravels.customerscripts;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.phptravels.base.BaseTest;
import com.phptravels.customerpages.PaymentPayPalPage;
import com.phptravels.utilities.Loginutility;
import com.phptravels.utilities.Logoututility;

public class PaymentPayPalTest extends BaseTest {
	
	@BeforeMethod
	public void Login() throws IOException {
		Loginutility.customerlogin();
	}
	@Test
	public void paynowpaypal() throws InterruptedException {
		PaymentPayPalPage objPayNow=new PaymentPayPalPage(driver);
		objPayNow.clickAddFund();
	}

	@AfterMethod
	public void logout() {
		Logoututility.caLogout();
	}
}
