package com.financeDomain.adfdatafinance.Scripts;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

import org.testng.annotations.Test;

import com.financeDomain.adfdatafinance.GenericLibraries.BaseClass;
import com.financeDomain.adfdatafinance.PomPages.LoginPage;
import com.financeDomain.adfdatafinance.PomPages.SkillraryDemoLoginPage;
import com.financeDomain.adfdatafinance.PomPages.Testing;

public class TestCase6 extends BaseClass{
	@Test
	public void testcase6() throws SQLException, FileNotFoundException, IOException {
		test=reports.createTest("testcase6");
		LoginPage l=new LoginPage(driver);
		SkillraryDemoLoginPage s=l.demoApp(driver);
		utilities.switchTabs(driver);
		utilities.dropdown(s.getDropdown(),fu.getPropertyFile("dd"));
		Testing t=new Testing(driver);
		String query="select * from Asp";
		String data2 = fu.queryExecution(query,3,"INR 500.00");
		}
}
