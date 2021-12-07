package com.ibm.CRM_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Get_header_image_url {
	
	private WebDriver driver;
	
	// Open the browser
	
	@BeforeTest
	public void openBrowser()
	{
		  driver=new FirefoxDriver();
		  driver.get("https://alchemy.hguy.co/crm");
	}
	
	// get url of image
	
	@Test
	public void getHeaderImageURL()
	{
		String url=driver.findElement(By.xpath("//div[@class='companylogo']/img")).getAttribute("src");
		System.out.println("Header image url is :- "+url);
	}
	
	// Close the Browser  
	  
	  @AfterTest
	  public void closeBrowser()
	  {
		  driver.close();
	  }
	

}
