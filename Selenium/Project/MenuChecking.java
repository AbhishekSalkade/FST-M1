package com.ibm.CRM_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MenuChecking {
	
private WebDriver driver;
	
	//open browser
	
	@BeforeTest
	public void openBrowser()
	{
		driver= new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/crm");
	}
	
	// Menu checking
	
	@Test
	public void menuChecking()
	{
		GettingColours obj=new GettingColours();
		obj.loginToCRM(driver);
		
		LoginToCRM obj1=new LoginToCRM();
		obj1.verifyLoginIsSuccessful(driver);	
		
		if(driver.findElement(By.xpath("//a[@id='grouptab_3'][text()='Activities']")).isDisplayed() && driver.findElement(By.xpath("//a[@id='grouptab_3'][text()='Activities']")).isEnabled())
		{
	       System.out.println("Activities tab is found and enabled..");		
		}
	}
	
	// Close the Browser  
	  
	  @AfterTest
	  public void closeBrowser()
	  {
		  driver.close();
	  }

}
