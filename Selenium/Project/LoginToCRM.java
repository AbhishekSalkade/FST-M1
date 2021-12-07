package com.ibm.CRM_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginToCRM {
	
	private WebDriver driver;
	
	//open browser
	
	@BeforeTest
	public void openBrowser()
	{
		driver= new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/crm");
	}
	
	// Login to CRM
	
	@Test
	public void loginToCRM()
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
		
		
        verifyLoginIsSuccessful(driver);		
			
		
	}
	
	// Verify home page
	
	public void verifyLoginIsSuccessful(WebDriver driver)
	{
		WebDriverWait wait=new  WebDriverWait(driver, 6);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='with-label']/span[text()='admin']")));
		System.out.println("Login successful....");
	}
	
	// Close the Browser  
	  
		  @AfterTest
		  public void closeBrowser()
		  {
			  driver.close();
		  }

}
