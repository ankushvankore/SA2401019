package com.StepDef;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class S03AmazonTest {
	WebDriver driver;

	@Given("Open Amazon")
	public void open_amazon() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
	}

	@When("I click on Sell link")
	public void i_click_on_sell_link() {
		driver.findElement(By.partialLinkText("Sell")).click();
	}

	@Then("Sell page should open")
	public void sell_page_should_open() {
		System.out.println("Title: " + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("CrossShop1"));
		
		driver.close();
	}

	@When("I Click on Best Seller link")
	public void i_click_on_best_seller_link() {
		driver.findElement(By.partialLinkText("Best")).click();
	}

	@Then("Best Sellers page should open")
	public void best_sellers_page_should_open() {
		System.out.println("Title: " + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Bestsellers"));
		
		driver.close();
	}

	@When("I Click on Mobile link")
	public void i_click_on_mobile_link() {
		driver.findElement(By.partialLinkText("Mobile")).click();
	}

	@Then("Mobile Page should open")
	public void mobile_page_should_open() {
		System.out.println("Title: " + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Mobile"));
		
		driver.close();
	}

	@When("I Click on Electronics Link")
	public void i_click_on_electronics_link() {
		driver.findElement(By.partialLinkText("Electro")).click();
	}

	@Then("Electronis page should dispaly")
	public void electronis_page_should_dispaly() {
		System.out.println("Title: " + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Electronics"));
		
		driver.close();
	}
}
