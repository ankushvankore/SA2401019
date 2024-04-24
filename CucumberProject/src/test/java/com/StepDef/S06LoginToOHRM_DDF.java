package com.StepDef;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class S06LoginToOHRM_DDF {
	WebDriver driver;
	
	@Given("Open Orange HR Application")
	public void open_orange_hr_application() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@When("I Enter {string} and {string}")
	public void i_enter_and(String un, String ps) {
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(un);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(ps);
	}
	@When("Click on Submit button for login")
	public void click_on_submit_button_for_login() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@Then("Login should successful")
	public void login_should_successful() {
	    Assert.assertTrue(driver.getCurrentUrl().contains("dash"));
	}
}
