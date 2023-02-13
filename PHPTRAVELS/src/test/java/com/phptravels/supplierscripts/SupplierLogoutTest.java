package com.phptravels.supplierscripts;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.phptravels.adminpages.AdminLogout;
import com.phptravels.base.BaseTest;
import com.phptravels.supplierpages.SupplierLogout;
import com.phptravels.utilities.Loginutility;

public class SupplierLogoutTest extends BaseTest {
	@BeforeMethod
	public void Login() throws IOException {
		Loginutility.Supplierlogin();
	}
	@Test
	public void logout() {
		SupplierLogout objLogout=new SupplierLogout(driver);
		objLogout.clickperson();
		String Actual=objLogout.clicklogout();
		assertEquals(Actual, "https://phptravels.net/api/supplier");
	}

}
