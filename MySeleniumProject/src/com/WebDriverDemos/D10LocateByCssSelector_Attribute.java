package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D10LocateByCssSelector_Attribute {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.cssSelector("input[data-testid=\"royal_email\"]")).sendKeys("test@gmail.com");
		driver.findElement(By.cssSelector("input[placeholder=\"Password\"][aria-label=\"Password\"]")).sendKeys("12345678");
		driver.findElement(By.cssSelector("button[data-testid=\"royal_login_button\"]")).click();
	}

}
