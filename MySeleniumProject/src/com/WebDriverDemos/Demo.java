package com.WebDriverDemos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Demo {

	public static void main(String[] args) {
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--headless");
		WebDriver driver = new ChromeDriver(op);
		
		driver.get("https://www.google.com");
		
		System.out.println("Title: " + driver.getTitle());
		
		driver.close();
	}

}
