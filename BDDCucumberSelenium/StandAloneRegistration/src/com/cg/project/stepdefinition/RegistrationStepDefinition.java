package com.cg.project.stepdefinition;

import org.openqa.selenium.WebDriver;
import com.cg.project.pagebeans.RegistrationPage;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class RegistrationStepDefinition {
	private WebDriver driver;
	private RegistrationPage registrationPage;
	@Before
	public void setUpTestEnv() {
		System.setProperty("webdriver.chrome.driver", "D:\\SW backup\\chromedriver.exe");
	}
	
	@After
	public void tearDownTestEnv() {
		driver.close();
	}
}
