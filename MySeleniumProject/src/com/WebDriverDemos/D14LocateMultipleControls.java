package com.WebDriverDemos;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D14LocateMultipleControls {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.echotrak.com/Login.aspx?ReturnUrl=%2f");
		
		List<WebElement>txtBoxes = driver.findElements(By.cssSelector("input[class=\"form-control\"]"));
		txtBoxes.get(0).sendKeys("dhanshri");
		txtBoxes.get(1).sendKeys("dhanshri123");
		driver.findElement(By.xpath("//*[@id=\"Butsub\"]")).click();
		
	}

}
