package com.phptravels.customerscripts;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.phptravels.base.BaseTest;
import com.phptravels.customerpages.UpdateAddressPage;
import com.phptravels.utilities.Excelutility;
import com.phptravels.utilities.Loginutility;
import com.phptravels.utilities.Logoututility;

public class UpdateAddressTest extends BaseTest {
	@BeforeMethod
	public void Login() throws IOException {
		Loginutility.customerlogin();
	}
	@Test
	public void updateAddress() throws IOException {
		UpdateAddressPage objUpdate=new UpdateAddressPage(driver);
		String add1=Excelutility.getCellData("Address", 0, 0);
		String add2=Excelutility.getCellData("Address", 0, 1);
		objUpdate.clickProfile();
		objUpdate.setAddress1(add1);
		objUpdate.setAddress2(add2);
		boolean actual=objUpdate.clickUpdate();
		assertTrue(actual);
	}
	@AfterMethod
	public void logut() {
		Logoututility.caLogout();
	}

}
