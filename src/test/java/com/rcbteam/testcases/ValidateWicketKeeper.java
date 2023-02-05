package com.rcbteam.testcases;



import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.rcbteam.utility.ReadTestData;

public class ValidateWicketKeeper extends ReadTestData {
	/**
	 * Execute before @Test,
	 * Start reporting tool
	 * Read JSON File and Fetch JSON Array data one time
	 */
	
	@BeforeTest
	public void setUp(){
		testcaseName = "ValidateWicketKeeper";
		testDescription = "Validate the team has atleast 1 wicket keeper";
		category = "Positive";
		ReadTestData.read_Json_File("TeamRCB");
		ReadTestData.fetch_Data();
		System.out.println("Json file read is completed");
	}

	

	/**
	 *Verify Wicket-Keeper Count 
	 */
	@Test
	public void verifyWicketKeeperCount(){
		Assert.assertTrue(ReadTestData.wicketKeeper_count>=1);
		System.out.println("Wicket keeper count verification is completed");
		reportLog("JSON read is completed","PASS");
		reportLog("Wicket keeper count is successfully verified","PASS");
	}
}
