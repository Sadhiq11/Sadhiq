package com.hrms.TestScripts;
import org.testng.annotations.Test;

import com.hrms.Lib.*;
public class TC_001 {
	
	//public static void main(String[] args)
	@Test
	public void tc_001() throws Exception
	{
		General g =new General();
		g.openApplication();
		g.waitMethod();
		g.verifyTitle();
		g.login();
		g.verifyText();
		g.logout();
		g.closeApplication();
	} 

}
