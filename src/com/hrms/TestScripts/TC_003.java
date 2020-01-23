package com.hrms.TestScripts;
import org.testng.annotations.Test;

import com.hrms.Lib.*;
public class TC_003 {
	
	//public static void main(String[] args)throws Exception
	@Test
	public void tc_003() throws Exception
	{
		General g =new General();
	
		g.openApplication();
		g.login();
		g.searchEmp();
		g.delEmp();
		g.logout();
		g.closeApplication();
	} 

}
