package com.ibm.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
        driver.get(" https://training-support.net/selenium/simple-form");
        
        //Get the title of the page
        String title = driver.getTitle();
        System.out.println("Page title is: " + title);
        WebElement firstName = driver.findElement(By.id("firstName"));
    	firstName.sendKeys("Abhishek");
        WebElement lastName = driver.findElement(By.id("lastName"));
        lastName.sendKeys("Salkade");
        WebElement email=driver.findElement(By.id("email"));
        email.sendKeys("abhi@gmail.com");
        WebElement num=driver.findElement(By.id("number"));
    	num.sendKeys("1234567");
    	WebElement button=driver.findElement(By.cssSelector(".ui.green.button"));  // 3 different class names (ui and green and button)
    	button.click();
	    driver.close();

	}

}
