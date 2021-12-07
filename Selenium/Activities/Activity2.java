package com.ibm.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2  {
    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net");
        
        //Get the title of the page
        String title = driver.getTitle();
        System.out.println("Page title is: " + title);
        //Find the About Us link using id()
        WebElement e1 = driver.findElement(By.id("about-link"));
        System.out.println("Text in element: " + e1.getText());
        
        //Find the About Us link using className()
        WebElement e2 = driver.findElement(By.className("green"));
        System.out.println("Text in element: " + e2.getText());
        
        //Find the About Us link using cssSelector()
        WebElement e3 = driver.findElement(By.cssSelector(".green"));
        System.out.println("Text in element: " + e3.getText());
        
        //Find the About Us link using linkText()
        WebElement e4 = driver.findElement(By.linkText("About Us"));
        System.out.println("Text in element: " + e4.getText());
        
        //Close the browser
        driver.close();
    }
}