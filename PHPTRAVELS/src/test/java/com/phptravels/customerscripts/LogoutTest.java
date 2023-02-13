package com.phptravels.customerscripts;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.phptravels.base.BaseTest;
import com.phptravels.customerpages.Logout;
import com.phptravels.utilities.Loginutility;

public class LogoutTest extends BaseTest {
	
	@BeforeMethod
	public void Login() throws IOException {
		Loginutility.customerlogin();
	}
	@Test
	public void logout() {
		Logout objlog=new Logout(driver);
		String Actual=objlog.clickLogout();
		assertEquals(Actual,"https://phptravels.net/login");
	}

}
