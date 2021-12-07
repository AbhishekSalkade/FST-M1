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

public class Traversing_table_2 {
	
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
	public void traversingTable1()
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
		readingTableColumns();
		//readPopupText();
	}
	
	public void VerifyLeadsPageOpensUp()
	{
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("moduleTab_Leads")));
	    System.out.println("Lead page opens up...");
	}
	
	public void readingTableColumns()
	{
		
		for(int i=1;i<=10;i++)
		{
			String name=driver.findElement(By.xpath("(//tr/td[@type='name'])["+i+"]")).getText();
			String user=driver.findElement(By.xpath("(//tr/td[@type='relate'])["+i+"]")).getText();
		   	System.out.println("user name is :- "+name+" and role is :- "+user);
		}
		
		
	}
	
	// Close the Browser  
	  
	  @AfterTest
	  public void closeBrowser()
	  {
		  driver.close();
	  }


}
