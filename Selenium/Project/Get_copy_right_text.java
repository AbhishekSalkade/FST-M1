package com.ibm.CRM_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Get_copy_right_text {
	
	private WebDriver driver;
	
	// Open browser
	
	@BeforeTest
	public void openBrowser()
	{
		driver=new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/crm");
	}
	
	// Get copyright text
	
	@Test
	public void getCopyRightText()
	{
	   String copyRightText = driver.findElement(By.id("admin_options")).getText();
	   System.out.println("Copy right text in footer id :- "+copyRightText);
	}
	
   // Close browser
	
	@AfterTest
	public void closeBrowser()
	{
		driver.close();
	}
}
