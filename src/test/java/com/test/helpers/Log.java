package com.test.helpers;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.Logger;

public class Log {
	
	public static DateFormat dateFormat;
	public static Date date;
	private static Logger Log = Logger.getLogger(Log.class.getName()); 
	
	public static void startTestCase(String sTestCaseName){
		Log.info("Started Test case");
		
	}


	public static void endTestCase(String sTestCaseName){
		Log.info("Ended Test Case");
		
	}

	public static void info(String message)
	{
		Log.info(message);
		dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		date = new Date();
		System.out.println("Start Time for Test Step Name : "+message+" --> "+dateFormat.format(date));
	}

}