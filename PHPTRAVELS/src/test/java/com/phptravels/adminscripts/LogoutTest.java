package com.phptravels.adminscripts;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.phptravels.adminpages.AdminLogout;
import com.phptravels.base.BaseTest;
import com.phptravels.utilities.Loginutility;

public class LogoutTest extends BaseTest {
	@BeforeMethod
	public void Login() throws IOException {
		Loginutility.Adminlogin();
	}
	@Test
	public void logout() {
		AdminLogout objLogout=new AdminLogout(driver);
		objLogout.clickperson();
		String Actual=objLogout.clicklogout();
		System.out.println(Actual);
		String Expected="https://phptravels.net/api/admin";
		assertEquals(Actual, Expected);

	}

}
