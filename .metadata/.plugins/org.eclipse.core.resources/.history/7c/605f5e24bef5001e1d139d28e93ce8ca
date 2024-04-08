package com.WebDriverDemos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class D22Synchronization_ExplicitWait {

	public static void main(String[] args) {
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--disable-notifications");
		
		WebDriver driver = new ChromeDriver(op);
		driver.manage().window().maximize();
		
		driver.get("https://www.redbus.in/");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		//From
		driver.findElement(By.id("src")).sendKeys("Kolh");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"autoSuggestContainer\"]/div/div[1]/div/div[1]/ul/li[1]/div/text"))).click();
		//driver.findElement(By.xpath("//*[@id=\"autoSuggestContainer\"]/div/div[1]/div/div[1]/ul/li[1]/div/text")).click();
		//To
		driver.findElement(By.id("dest")).sendKeys("Chen");
		driver.findElement(By.xpath("//*[@id=\"autoSuggestContainer\"]/div/div[3]/div[1]/ul/li[1]/div/text")).click();
		//Date
		driver.findElement(By.xpath("//*[@id=\"onwardCal\"]/div/i")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[2]/main[1]/div[3]/div[1]/div[2]/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]/div[3]/div[6]/span[1]/div[2]/span[1]")).click();
		//Search Bus
		driver.findElement(By.id("search_button")).click();
		//Result
		System.out.println(driver.findElement(By.xpath("//*[@id=\"29948242\"]/div/div[1]/div[1]/div[1]/div[1]")).getText());
		
		driver.close();
	}

}
