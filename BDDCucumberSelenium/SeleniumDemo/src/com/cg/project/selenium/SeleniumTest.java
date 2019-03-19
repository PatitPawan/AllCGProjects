package com.cg.project.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
	private static WebDriver driver;
	public static void main(String [] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\SW backup\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.co.in");
		WebElement searchElement = driver.findElement(By.name("q"));
		searchElement.sendKeys("Agile Methodology");
		searchElement.submit();
		
		WebElement imageLink = driver.findElement(By.className("hdtb-mitem"));
		imageLink.click();
	}
}
