package com.Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class DemoQA {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		ChromeOptions op = new ChromeOptions();

		op.addArguments("--disable-notifications");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

		driver.get("https://demoqa.com/automation-practice-form");

		WebElement fname = driver.findElement(By.id("firstName"));

		fname.sendKeys("Aparna");

		WebElement lname = driver.findElement(By.id("lastName"));

		lname.sendKeys("Kadam");

		WebElement email = driver.findElement(By.id("userEmail"));

		email.sendKeys("aparna.jdhv@gmail.com");

		WebElement gen = driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[2]"));

		gen.click();

		WebElement mob = driver.findElement(By.id("userNumber"));

		mob.sendKeys("7709432979");

		WebElement dob = driver.findElement(By.id("dateOfBirthInput"));

		dob.click();

//	dob.sendKeys("22 Nov 1989");

		Select month = new Select(driver.findElement(
				By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select")));

		month.selectByValue("10");

		Select yr = new Select(driver.findElement(
				By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/select")));

		yr.selectByValue("1989");

		WebElement dobClick = driver
				.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[4]/div[4]"));

		dobClick.click();

		WebElement sub = driver.findElement(By.id("subjectsInput"));

		sub.sendKeys("Test");

		WebElement hobbies = driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[1]/label"));

		hobbies.click();

		WebElement hobbies2 = driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[3]/label"));

		hobbies2.click();

		WebElement fileInput = driver.findElement(By.id("uploadPicture"));

		fileInput.click();

//    fileInput.sendKeys("C:\\Users\\INDIA\\OneDrive\\Pictures\\Saved Pictures\\1.jpeg");

//	Robot robot = new Robot();

//	robot.keyPress()

		WebElement state = driver.findElement(By.xpath("//*[@id=\"state\"]/div"));

		state.click();
	}
}
