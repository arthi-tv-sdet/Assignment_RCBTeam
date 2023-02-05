package com.rcbteam.utility;

import java.io.FileReader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.rcbteam.utils.Reporter;

public class ReadTestData extends Reporter{
	public static JSONObject rcb_team_Obj;
	public static int overseas_Player_count=0;
	public static int wicketKeeper_count=0;
	
	/**
	 * Read the JSON file,parse and get JSONObject 
	 * 
	 * @param fileName - String type
	 * @return void
	 */
	public static void read_Json_File(String fileName) {
		try {
			JSONParser jsonparser = new JSONParser();
			FileReader reader = new FileReader("./src/test/resources/testdata/" + fileName + ".json");
			Object obj = jsonparser.parse(reader);
			rcb_team_Obj = (JSONObject) obj;
		}catch(Exception e) {
			printException(e);
		}
	}

	/**
	 * Fetch data from JSON Array
	 * 
	 * @return void
	 */
	public static void fetch_Data(){
		try {
			if(rcb_team_Obj!=null) {
				JSONArray playerArr = (JSONArray) rcb_team_Obj.get("player");
				for(int i=0;i<playerArr.size();i++) { 
					JSONObject player=(JSONObject)playerArr.get(i);
					String role=(String)player.get("role");
					if(role.equals("Wicket-keeper")) wicketKeeper_count++;			
					String country=(String)player.get("country");
					if(!country.equals("India")) overseas_Player_count++;}
			}else {
				System.out.println("Unable to fetch data");
			}
		}catch(Exception e) {
			printException(e);
		}
	}

	/**
	 * Print exception message and stack trace
	 */
	private static void printException(Exception e) {
		System.out.println("Exception Message: "+e.getMessage());
		System.out.println("Stack Trace: "+e.getStackTrace());		
	}
}
