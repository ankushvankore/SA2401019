package com.TestNGDemos;

import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterTest;

public class D07Parameterization {
	WebDriver driver;
	
	@Parameters({"userName", "password"})
	@Test
	public void login(String un, String ps) {
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/section[1]/div[1]/div[1]/input[1]")).sendKeys(un);
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/section[1]/div[1]/div[2]/input[1]")).sendKeys(ps);
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/section[1]/div[1]/button[1]")).click();
	}

	@AfterMethod
	public void afterMethod() {
		driver.findElement(By.partialLinkText("Log")).click();
	}

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://practicetestautomation.com/practice-test-login/");
	}

	@AfterTest
	public void afterTest() {
		driver.close();
	}

}
