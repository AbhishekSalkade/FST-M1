package com.ibm.CRM_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Verify_website_title {
	private WebDriver driver;
	
// Open the browser
	
  @BeforeTest
  public void openBrowser()  {
	  driver=new FirefoxDriver();
	  driver.get("https://alchemy.hguy.co/crm");
	  
  }
  
// get title of website and verify
  
  @Test
  public void getTheTitle()
  {
	  String title=driver.getTitle();
	  System.out.println("The page title is :- "+title);
	  Assert.assertEquals("SuiteCRM", title);
	  
  }
  
// Close the Browser  
  
  @AfterTest
  public void closeBrowser()
  {
	  driver.close();
  }
}
