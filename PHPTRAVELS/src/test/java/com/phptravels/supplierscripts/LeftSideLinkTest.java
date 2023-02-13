package com.phptravels.supplierscripts;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import com.phptravels.base.BaseTest;
import com.phptravels.supplierpages.LeftSideLinks;
import com.phptravels.utilities.Loginutility;
import com.phptravels.utilities.Logoututility;

public class LeftSideLinkTest extends BaseTest {
	
	@BeforeMethod
	public void Login() throws IOException {
		Loginutility.Supplierlogin();
	}
	@Test
	public void leftSideLink() throws InterruptedException  {
		
	LeftSideLinks objLink=new LeftSideLinks(driver);
	boolean[] a=new boolean[2];
	a=objLink.booking();
	assertTrue(a[0]);
	a=objLink.hotel();
	assertTrue(a[0]);
	assertTrue(a[1]);
	a= objLink.tour();
	assertTrue(a[0]);
	assertTrue(a[1]);
	
			}
	@AfterMethod
	public void logout() {
	Logoututility.supplierlogout();
	}
	
	
	

}
