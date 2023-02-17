package com.phptravels.agentscripts;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.phptravels.agentpages.CurrencyUSD_INR;

import com.phptravels.base.BaseTest;
import com.phptravels.utilities.Loginutility;
import com.phptravels.utilities.Logoututility;

public class CurrencyUSD_INRTest extends BaseTest {
	
	@BeforeMethod
	public void Login() throws IOException {
		Loginutility.Agentlogin();
		
	}
	@Test
	public void Currency() {
		CurrencyUSD_INR objCurrency=new CurrencyUSD_INR(driver);
		objCurrency.clickUSD();
	    String actual=objCurrency.clickINR();
		assertTrue(actual.contains("INR"));
		objCurrency.logout();

}
	@AfterMethod
	public void logout() {
		Logoututility.caLogout();
	}
	
}
