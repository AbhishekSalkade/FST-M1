package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class AlertTestSteps {
	
	WebDriver driver;
	Alert alert;
	
	@Given("^User is on the page$")
	public void launchBrowser()
	{
		driver = new FirefoxDriver();
		driver.get(" https://www.training-support.net/selenium/javascript-alerts");
		Assert.assertEquals("Javascript Alerts", driver.getTitle());
	}
	
	@When("^User clicks the Simple Alert button$")
	public void clickOnSimpleAlert()
	{
		driver.findElement(By.id("simple")).click();
	}
	
	@When("^User clicks the Confirm Alert button$")
	public void clickOnConfirmAlert()
	{
		driver.findElement(By.id("confirm")).click();
	}
	
	@When("^User clicks the Prompt Alert button$")
	public void clickOnPromptAlert()
	{
		driver.findElement(By.id("prompt")).click();
	}
	
	@Then("^Alert opens$")
	public void alertOpen()
	{
		alert=driver.switchTo().alert();
	}
	
	@And("^Read the text from it and print it$")
	public void readText()
	{
		String simpleAlertText=alert.getText();
		System.out.println(simpleAlertText);
	}
	
	@And("^Write a custom message in it$")
	public void writeText()
	{
		alert.sendKeys("writing in propmt alert");
	}
	
	@And("^Close the alert$")
	public void closeSimpleAlert()
	{
		alert.accept();
	}
	
	@And("^Close the alert with Cancel$")
	public void closeConfirmAlert()
	{
		alert.dismiss();
	}
	
		
	@And("^Close Browser$")
	public void closeBrowser()
	{
		driver.close();
	}

}
