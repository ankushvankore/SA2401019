package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D11LocateByCssSelector_SpecialCharacters {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		//* => Contains
		driver.findElement(By.cssSelector("input[placeholder*=\"phone\"]")).sendKeys("test@gmail.com");
		//$ => Ends With
		driver.findElement(By.cssSelector("input[placeholder$=\"word\"]")).sendKeys("12345678");
		//^ => Starts With
		driver.findElement(By.cssSelector("button[id^=\"u_0_5\"]")).click();
		
	}
}
