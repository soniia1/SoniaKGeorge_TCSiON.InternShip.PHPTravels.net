package com.phptravels.adminscripts;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.phptravels.adminpages.BookPendConfirm;
import com.phptravels.adminpages.InvoiceSuccess;
import com.phptravels.base.BaseTest;
import com.phptravels.utilities.Loginutility;
import com.phptravels.utilities.Logoututility;

public class BookPendConfirmTest extends BaseTest {
	@BeforeMethod
	public void Login() throws IOException {
		Loginutility.Adminlogin();
	}
	@Test
	public void dashboard()  {
	BookPendConfirm objconfirm=new BookPendConfirm(driver);
	int pendcount=objconfirm.dashBoardCount();
	if(pendcount>0) {
	objconfirm.clickPendBook();
	objconfirm.clickConfirm();
	boolean actual=objconfirm.clickDashBoard();
	assertTrue(actual);
	}
	}
	@AfterMethod
	public void logout() {
		
     Logoututility.adminlogout();
		
	}



}
