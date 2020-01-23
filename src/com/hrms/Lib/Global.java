package com.hrms.Lib;

import org.openqa.selenium.WebDriver;

public class Global {
	//=============================Varible Info==========================
	 public WebDriver driver;
	  public String url ="http://localhost/orangehrm/orangehrm-2.6/orangehrm-2.6/login.php";
	  public String un ="admin";
	  public String pw ="admin";
	  
	  
  //=================================Object Info============================
	  public String txt_loginname = "txtUserName";
	  public String txt_password = "txtPassword";
	  public String btn_login = "Submit";
	  public String link_logout = "Logout";
	  public String link_textpim ="PIM";
	  public String link_txtempadd ="Add Employee";
	  public String link_txtEmpList ="Employee List"; 
}
