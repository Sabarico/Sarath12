package com.financeDomain.adfdatafinance.Scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import com.financeDomain.adfdatafinance.GenericLibraries.BaseClass;
import com.financeDomain.adfdatafinance.PomPages.CoreJavaPage;
import com.financeDomain.adfdatafinance.PomPages.LoginPage;
import com.financeDomain.adfdatafinance.PomPages.WishlistPage;

public class TestCase3 extends BaseClass{
	@Test
	public void testcase3() throws  IOException, InterruptedException {
		test=reports.createTest("testcase3");
		LoginPage lp=new LoginPage(driver);
	CoreJavaPage c=lp.searchcourse(driver,fu.getPropertyFile("cn"));
				WishlistPage ad=c.corejavaselenium(driver);
				ad.getClose();
				utilities.switchframe(driver);
		Thread.sleep(2000);
		ad.playvideo();
		/*utilities.switchBackFrame(driver);
		ad.addtowishlist();
	Assert.assertEquals(driver.getTitle(),fu.getPropertyFile("title"));
	}*/
	}
}
