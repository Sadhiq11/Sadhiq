package com.utility;

import org.apache.log4j.Logger;
import org.apache.log4j.BasicConfigurator;
public class Log {
	//Initialize Log4j logs
	private static Logger Log = Logger.getLogger(Log.class.getName());
	// Need to create these methods, so that they can be called
	public static void info(String message) {
		BasicConfigurator.configure();
	Log.info(message); }
}
