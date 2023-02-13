package com.phptravels.utilities;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import com.phptravels.adminpages.AdminLogout;
import com.phptravels.base.BaseTest;
import com.phptravels.customerpages.Logout;
import com.phptravels.supplierpages.SupplierLogout;

public class Logoututility extends BaseTest {
	
	public  static void  caLogout() {
//		Logout objlog=new Logout(driver);
//		String Actual=objlog.clickLogout();
//		String Expected="https://phptravels.net/login";
//		assertEquals(Actual,Expected);
		
		Logout objlog=new Logout(driver);
		String Actual=objlog.clickLogout();
		assertEquals(Actual,"https://phptravels.net/login");
	}
	public static void  adminlogout() {
		AdminLogout objLogout=new AdminLogout(driver);
		objLogout.clickperson();
		String Actual=objLogout.clicklogout();
		String Expected="https://phptravels.net/api/admin";
		assertEquals(Actual, Expected);

	}
	public static void  supplierlogout() {
		SupplierLogout objLogout=new SupplierLogout(driver);
		objLogout.clickperson();
		String Actual=objLogout.clicklogout();
		String Expected="https://phptravels.net/api/supplier";
		assertEquals(Actual, Expected);
		
	}
	

}
