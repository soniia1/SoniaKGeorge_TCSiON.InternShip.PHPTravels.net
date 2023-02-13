package com.phptravels.supplierscripts;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.phptravels.base.BaseTest;
import com.phptravels.supplierpages.BookPendConfirm;

import com.phptravels.utilities.Loginutility;
import com.phptravels.utilities.Logoututility;

public class BookPendConfirmTest extends BaseTest {
	
	@BeforeMethod
	public void Login() throws IOException {
		Loginutility.Supplierlogin();
	}
	@Test
	public void dashboard()  {
	BookPendConfirm objconfirm=new BookPendConfirm(driver);
	int PCountNow=objconfirm.dashBoardCount();
	if(PCountNow >0) {
	objconfirm.clickPendBook();
	objconfirm.clickConfirm();
	boolean actual=objconfirm.clickDashBoard();
	assertTrue(actual);
	}
	}
	@AfterMethod
	public void logout() {
		Logoututility.supplierlogout();
	}

}
