package com.StepDef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class S02LoginFunctionality {
	WebDriver driver;
	
	@Given("Open OHRM")
	public void open_ohrm() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@Then("Enter valid username and valid password")
	public void enter_valid_username_and_valid_password() {
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		
	}

	@Then("Click on Login button")
	public void click_on_login_button() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@Then("Dashboard page shuld display")
	public void dashboard_page_shuld_display() {
		if(driver.getCurrentUrl().contains("board"))
			System.out.println("Dashboard page is displayed");
		else
			System.out.println("Dashboard page is not displayed");
	}

	@Given("Open Orange HRM")
	public void open_orange_hrm() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@Then("Enter invalid username and Enter invalid password")
	public void enter_invalid_username_and_enter_invalid_password() {
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("guru");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("guru123");
	}

	@Then("I Click on Login button")
	public void i_click_on_login_button() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@Then("Error message should display")
	public void error_message_should_display() {
		System.out.println(driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p oxd-alert-content-text']")).getText());
	}

}
