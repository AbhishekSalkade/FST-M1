package stepDefinitions;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTestSteps {

	WebDriver driver;

	@Given("^User is on Login page$")
	public void launchLoginPage() {
		driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/login-form");
		Assert.assertEquals("Login Form", driver.getTitle());

	}

	@When("^User enters username and password$")
	public void enterCred() {
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("password");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@Then("^Read the page title and confirmation message$")
	public void readMsg() {
		Assert.assertEquals("Login Form", driver.getTitle());
		String msg = driver.findElement(By.id("action-confirmation")).getText();
		System.out.println(msg);
		Assert.assertEquals("Welcome Back, admin", msg);
	}

	@And("^Close the Browser$")
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
