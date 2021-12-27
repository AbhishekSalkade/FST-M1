package stepDefinitions;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class GoogleSearchSteps {

	WebDriver driver;
	WebDriverWait wait;

	@Given("^User is on Google Home Page$")
	public void launchGoogle() {
		driver = new FirefoxDriver();

		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		String title = driver.getTitle();
		Assert.assertEquals(title, "Google");
	}

	@When("^User types in Cheese and hits ENTER$")
	public void typeText() {
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Cheese");
		driver.findElement(By.name("btnk")).click();
	}

	@Then("^Show how many search results were shown$")
	public void verifySearch() {
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("result-stats")));

		String results = driver.findElement(By.id("result-stats")).getText();

		System.out.println("Number of results found: " + results);
	}

	@And("^Close the browser$")
	public void closeBrowser() {
		driver.close();
	}

	/*
	 * @After public void teardown(Scenario sen) throws IOException, Throwable {
	 * if(sen.isFailed()) { byte[] screen= takeScreenShot(); sen.attach(screen,
	 * "image/png", "fail"); }
	 * 
	 * driver.close(); }
	 * 
	 * public byte[] takeScreenShot() throws IOException, Throwable {
	 * 
	 * File f= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 * FileUtils.copyFile(f,new File(
	 * "C:\\Users\\AbhishekSalkade\\Documents\\FST_IBM_Eclipse_project\\cucumber\\target\\screen.png"
	 * )); Thread.sleep(1000);
	 * 
	 * 
	 * final byte screenshot[]=
	 * ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES); return
	 * screenshot; }
	 */

}
