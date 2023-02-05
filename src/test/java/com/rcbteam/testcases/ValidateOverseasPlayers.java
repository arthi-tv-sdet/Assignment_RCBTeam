package com.rcbteam.testcases;



import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.rcbteam.utility.ReadTestData;

public class ValidateOverseasPlayers extends ReadTestData  {
	/**
	 * Execute before @Test,
	 * Start reporting tool
	 * Read JSON File and Fetch JSON Array data one time
	 */
	
	@BeforeTest
	public void setUp(){
		testcaseName = "ValidateOverseasPlayers";
		testDescription = "Validate the team has only 4 Overseas players";
		category = "Positive";
		ReadTestData.read_Json_File("TeamRCB");
		ReadTestData.fetch_Data();
		System.out.println("Json file read is completed");
	}

	/**
	 *Verify Overseas Players Count 
	 */
	@Test
	public void verifyOverseasPlayersCount() {
		Assert.assertTrue(ReadTestData.overseas_Player_count==4);
		System.out.println("Overseas players count verification is completed");
		reportLog("JSON read is completed","PASS");
		reportLog("Overseas players count is successfully verified","PASS");
	}

	
}
