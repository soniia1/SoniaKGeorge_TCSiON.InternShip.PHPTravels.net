package com.phptravels.supplierscripts;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.phptravels.base.BaseTest;
import com.phptravels.supplierpages.DashboardPage;
import com.phptravels.utilities.Loginutility;
import com.phptravels.utilities.Logoututility;

public class DashboardTest extends BaseTest {
	
	@BeforeMethod
	public void Login() throws IOException {
		Loginutility.Supplierlogin();
	}
	@Test
	public void dashboard()  {
	DashboardPage objDash=new DashboardPage(driver);
	
	boolean[] actual=new boolean[2];
	
	boolean actual1=objDash.salesOverviewTextDisplay();
	assertTrue(actual1);
	
	boolean actual2=objDash.RevBkDwnbarchartDisplay();
	assertTrue(actual2);
	
	boolean actual3=objDash.pieChartDisplay();
	assertTrue(actual3);
	
	actual=objDash.confirmBookDisplay();
	assertTrue(actual[0]);
	assertTrue(actual[1]);
	
    actual=objDash.pendBookDisplay();
	assertTrue(actual[0]);
	assertTrue(actual[1]);
	
	actual=objDash.CancelBookDisplay();
	assertTrue(actual[0]);
	assertTrue(actual[1]);
	
    actual=objDash.paidBookDisplay();
	assertTrue(actual[0]);
	assertTrue(actual[1]);
	
    actual=objDash.unPaidBookDisplay();
	assertTrue(actual[0]);
	assertTrue(actual[1]);
	
    actual=objDash.RefundBookDisplay();
	assertTrue(actual[0]);
	assertTrue(actual[1]);
			}
	
	@AfterMethod
	public void logout() {
	Logoututility.supplierlogout();
	}
	
	

}
