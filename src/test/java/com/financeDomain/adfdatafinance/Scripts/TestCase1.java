package com.financeDomain.adfdatafinance.Scripts;

import org.testng.annotations.Test;

import com.financeDomain.adfdatafinance.GenericLibraries.BaseClass;
import com.financeDomain.adfdatafinance.PomPages.AddToCartPage;
import com.financeDomain.adfdatafinance.PomPages.LoginPage;
import com.financeDomain.adfdatafinance.PomPages.SkillraryDemoLoginPage;

public class TestCase1 extends BaseClass{
	@Test
	public void testcase1() {
	test=reports.createTest("testcase1");
	LoginPage l=new LoginPage(driver);
	SkillraryDemoLoginPage s=l.demoApp(driver);
	utilities.switchTabs(driver);
	utilities.mouseHover(driver,s.getcoursebtn());
	AddToCartPage cart=s.course(driver);
	utilities.doubleclick(driver, cart.getAddbtn());
	cart.getAddtocartbtn().click();
	utilities.alertPopupok(driver);
	driver.quit();
	}
}
