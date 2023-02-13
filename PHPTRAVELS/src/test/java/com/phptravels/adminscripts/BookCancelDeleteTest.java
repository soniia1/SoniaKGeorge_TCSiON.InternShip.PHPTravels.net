package com.phptravels.adminscripts;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.phptravels.adminpages.BookCancelDelete;
import com.phptravels.adminpages.InvoiceSuccess;
import com.phptravels.base.BaseTest;
import com.phptravels.utilities.Loginutility;
import com.phptravels.utilities.Logoututility;

public class BookCancelDeleteTest extends BaseTest {
	
	@BeforeMethod
	public void Login() throws IOException {
		Loginutility.Adminlogin();
	}
	@Test
	public void bookCancelDelete() {
		BookCancelDelete objDelete=new BookCancelDelete(driver);
		objDelete.clickCancel();
		String actualMsg=objDelete.clickDelete();
		if(actualMsg!=null) {
		assertTrue(actualMsg.contains("Are you sure to delete?"));
		}
		
	}
	@AfterMethod
	public void logout() {
		Logoututility.adminlogout();
	}


}
