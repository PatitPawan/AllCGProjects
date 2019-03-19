package com.cg.project.stepdefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchStepDefinition {
	private WebDriver driver;
	@Given("^user is on the google homepage$")
	public void user_is_on_the_google_homepage() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "D:\\SW backup\\chromedriver.exe");
		driver = (WebDriver) new ChromeDriver();
		driver.get("https://www.google.co.in");
	}
	@When("^user search for 'Agile Methodology$")
	public void user_search_for_Agile_Methodology() throws Throwable {
		WebElement searchElement = driver.findElement(By.name("q"));
		searchElement.sendKeys("Agile Methodology");
		searchElement.submit();
	}
	@Then("^all links should display with 'Agile Methodology'$")
	public void all_links_should_display_with_Agile_Methodology() throws Throwable {
	    String actualTitle = driver.getTitle();
	    String expectedTitle = "Agile Methodology - Google Search";
	    Assert.assertEquals(expectedTitle, actualTitle);
	    driver.close();
	}
	
}
