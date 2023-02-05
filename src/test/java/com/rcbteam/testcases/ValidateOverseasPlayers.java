package com.rcbteam.testcases;



import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.rcbteam.utility.ReadTestData;

public class ValidateOverseasPlayers {
	/**
	 * Execute before @Test,
	 * Read JSON File and Fetch JSON Array data one time
	 */
	@BeforeTest
	public void preSetUp(){
		ReadTestData.read_Json_File("TeamRCB");
		ReadTestData.fetch_Data();
		System.out.println("Json file read is completed");
	}

	/**
	 *Verify Overseas Players Count 
	 */
	@Test
	public void test1_verifyForeignPlayersCount() {
		Assert.assertTrue(ReadTestData.overseas_Player_count==4);
		System.out.println("Overseas players count verification is completed");
	}

	
}
