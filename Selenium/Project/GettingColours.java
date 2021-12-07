package com.ibm.CRM_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GettingColours {
	

	private WebDriver driver;
	
	//open browser
	
	@BeforeTest
	public void openBrowser()
	{
		driver= new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/crm");
	}
	
	// Getting colour
	
	@Test
	public void gettingColours()
	{
		
		loginToCRM(driver);
		
		if(driver.findElement(By.id("toolbar")).isDisplayed())
		{
			String color=driver.findElement(By.id("toolbar")).getCssValue("background-color");
			System.out.println("header color is :- "+color);
		}
	}
	
	public void loginToCRM(WebDriver driver)
	{
		
		if(driver.findElement(By.id("user_name")).isDisplayed() && driver.findElement(By.id("user_name")).isEnabled())
		{
			driver.findElement(By.id("user_name")).sendKeys("admin");
		}
		if(driver.findElement(By.id("username_password")).isDisplayed() && driver.findElement(By.id("username_password")).isEnabled())
		{
			driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
		}
		if(driver.findElement(By.id("bigbutton")).isDisplayed() && driver.findElement(By.id("bigbutton")).isEnabled())
		{
			driver.findElement(By.id("bigbutton")).submit();
		}
		
		LoginToCRM obj=new LoginToCRM();
		obj.verifyLoginIsSuccessful(driver);		
			
		
	}
	
	// Close the Browser  
	  
		  @AfterTest
		  public void closeBrowser()
		  {
			  driver.close();
		  }
	

}
