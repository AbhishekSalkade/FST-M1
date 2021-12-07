package com.ibm.CRM_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ReadingAdditionalInfo {
	
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
	public void redingAdditionalInfo()
	{
		GettingColours obj=new GettingColours();
		obj.loginToCRM(driver);
		
		LoginToCRM obj1=new LoginToCRM();
		obj1.verifyLoginIsSuccessful(driver);	
		
		if(driver.findElement(By.id("grouptab_0")).isDisplayed() && driver.findElement(By.id("grouptab_0")).isEnabled())
		{
	       Actions builder = new Actions(driver);
	       Action actToDo = builder.moveToElement(driver.findElement(By.id("grouptab_0"))).build();
	       actToDo.perform();
	       if(driver.findElement(By.id("moduleTab_9_Leads")).isDisplayed() && driver.findElement(By.id("moduleTab_9_Leads")).isEnabled())
		   {
		      builder.moveToElement(driver.findElement(By.id("moduleTab_9_Leads"))).build().perform();
		      driver.findElement(By.id("moduleTab_9_Leads")).click();
	    	   try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		      
		   }
				
		}
		VerifyLeadsPageOpensUp();
		VerifyIcon();
		readPopupText();
	}
	
	public void VerifyLeadsPageOpensUp()
	{
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("moduleTab_Leads")));
	    System.out.println("Lead page opens up...");
	}
	
	public void VerifyIcon()
	{
		
		
	    if(driver.findElement(By.id("adspan_683f9f93-9423-1a6e-4a4d-5fd8a89ceaab")).isEnabled())
		{ System.out.println("table icon found");
	    	driver.findElement(By.xpath("//*[@id='adspan_683f9f93-9423-1a6e-4a4d-5fd8a89ceaab']")).click();
	    	System.out.println("icon clicked");
	    	try {
				Thread.sleep(20000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	     
	}
	
	public void readPopupText()
	{
		  WebDriverWait wait=new WebDriverWait(driver, 20);	
		  wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("/html/body/div[4]/div/div[9]/div[2]/span")));
	      String num=driver.findElement(By.xpath("/html/body/div[4]/div/div[9]/div[2]/span")).getText();
		  System.out.println("The phone number is :- "+num);
		      
		   
	}
	
	// Close the Browser  
	  
	  @AfterTest
	  public void closeBrowser()
	  {
		  driver.close();
	  }

}
