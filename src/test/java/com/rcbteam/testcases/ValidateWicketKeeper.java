package com.rcbteam.testcases;



import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.rcbteam.utility.ReadTestData;

public class ValidateWicketKeeper {
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
	 *Verify Wicket-Keeper Count 
	 */
	@Test
	public void test1_verifyWicketKeeperCount(){
		Assert.assertTrue(ReadTestData.wicketKeeper_count>=1);
		System.out.println("Wicket keeper count verification is completed");
	}
}