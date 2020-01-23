package com.hrms.Lib;

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.utility.Log;
public class General extends Global{
	@BeforeClass
	public void openApplication()
	{
		Log.info("********Start Execution**********");
		driver = new FirefoxDriver();
		driver.navigate().to(url);
		System.out.println("Application opened");
		Reporter.log("Application opened");
		Log.info("********Application Opened**********");
		
	}
	public void capture() throws IOException
	{
		File f1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f1,new File("D:\\Classes\\Selenium WebDriver\\DemoSele.jpg"));
	}
	public void verifyTitle()
	{
	if(driver.getTitle().equals("OrangeHRM - New Level of HR Management"));

	System.out.println("Title Matched");
	Log.info("********Title Matched**********");
	}
	
	public void login() 
	{
		driver.findElement(By.name(txt_loginname)).sendKeys(un);
		driver.findElement(By.name(txt_password)).sendKeys(pw);
		driver.findElement(By.name(btn_login)).click();
		System.out.println("login completed");
		Reporter.log("login completed");
		Log.info("********Login Completed**********");
		
	}
	public void waitMethod()
	{
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	}
	
	public void enterFrame()
	{
		driver.switchTo().frame("rightMenu");
	}
	public void exitFrame()
	{
		driver.switchTo().defaultContent();
	}
	public void verifyText()
	{
		assertTrue(driver.findElement(By.xpath("//ul[@id='option-menu']/li")).getText().matches("Welcome admin"));
	}
	public void addEmployee() 
	{
		
    WebElement element= driver.findElement(By.linkText(link_textpim));
	Actions action = new Actions(driver);
	action.moveToElement(element).perform();
	driver.findElement(By.linkText(link_txtempadd)).click();
	driver.switchTo().frame("rightMenu");
    String s=driver.findElement(By.xpath("//*[@id=\"txtEmployeeId\"]")).getAttribute("value");
	driver.findElement(By.xpath("//*[@id=\"txtEmpLastName\"]")).sendKeys("P");
	driver.findElement(By.xpath("//*[@name='txtEmpFirstName']")).sendKeys("Bharath");
	WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"photofile\"]"));
	fileInput.sendKeys("E:\\hindi Marrage Songes\\AlbumArt_{3229205F-3D6A-48BA-AB70-D2AE8264061A}_Small.jpg");
	driver.findElement(By.xpath("//*[@id=\"btnEdit\"]")).click();
	driver.findElement(By.xpath("/html/body/div[5]/input")).click();
		System.out.println(s);
		driver.switchTo().defaultContent();
	}
	public void searchEmp() throws Exception 
	{
		  WebElement element= driver.findElement(By.linkText(link_textpim));
			Actions action = new Actions(driver);
			action.moveToElement(element).perform();
			driver.findElement(By.linkText("Employee List")).click();
			driver.switchTo().frame("rightMenu");
			Select s=new Select(driver.findElement(By.xpath("//*[@id=\"loc_code\"]")));
			s.selectByVisibleText("Emp. First Name");
			driver.findElement(By.xpath("//*[@id=\"loc_name\"]")).sendKeys("Bharath");
			driver.findElement(By.xpath("//*[@id=\"standardView\"]/div[2]/input[2]")).click();
			Thread.sleep(2000);
			
	}
	public void delEmp()
	{		driver.findElement(By.xpath("//*[@id=\"standardView\"]/table/tbody/tr/td[1]/input")).click();
		driver.findElement(By.xpath("//*[@id=\"standardView\"]/div[3]/div[1]/input[2]")).click();
		System.out.println("Deleted Successfully");
		Reporter.log("Deleted Successfully");
		Log.info("********Deleted Successfully**********");
		driver.switchTo().defaultContent();
	}
 public void logout() throws Exception
 { 
	 Thread.sleep(2000);
	 driver.findElement(By.linkText(link_logout)).click();
	 System.out.println("logout successfully");
	Reporter.log("logout successfully");
	Log.info("********Logout Successfully**********");
	 
 }
 @AfterClass
 public void closeApplication()
	{
		driver.close();
		System.out.println("Application closed");
		Reporter.log("Application closed");
		Log.info("********Application closed**********");
		Log.info("********End Execution**********");
		
	}  
  
}
