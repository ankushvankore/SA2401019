package com.TestNGDemos;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class D08KeywordDrivenFramework {
	WebDriver driver;
	File file;
	FileInputStream fis;
	Properties prop;
	
	@Test
	public void login() {
		driver.findElement(By.id(prop.getProperty("emailTxtBoxID"))).sendKeys("9890742718");
		driver.findElement(By.name(prop.getProperty("passwordTxtBoxName"))).sendKeys("1234");
		driver.findElement(By.xpath(prop.getProperty("submitBtnXPath"))).click();
	}

	@BeforeTest
	public void beforeTest() throws IOException {
		file = new File("D:\\StarAgile\\Demos\\SA2401019\\MySeleniumProject\\src\\com\\TestNGDemos\\MyData.properties");
		fis = new FileInputStream(file);
		prop = new Properties();
		prop.load(fis);
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(prop.getProperty("url"));
	}

	@AfterTest
	public void afterTest() {
	}

}
