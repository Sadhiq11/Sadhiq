package com.hrms.TestScripts;
import org.testng.annotations.Test;

import com.hrms.Lib.*;
public class TC_002 {
	@Test
	public void tc_002() throws Exception 
	{
		General g =new General();
		
		g.openApplication();
		g.waitMethod();
		g.login();
		g.addEmployee();
		g.logout();
		g.closeApplication();
	} 

}
