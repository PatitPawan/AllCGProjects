package com.cg.project.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.cg.project.pagebeans.RegistrationPage;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GithubRegistrationStepDefinition {
	private WebDriver driver;
	private RegistrationPage registrationPage;
	@Before
	public void setUpTestEnv() {
		System.setProperty("webdriver.chrome.driver", "D:\\SW backup\\chromedriver.exe");
	}
	@Given("^user is on Registration Page$")
	public void user_is_on_Registration_Page() throws Throwable {
	}
	@When("^user enters his details and leaves blank fields$")
	public void user_enters_his_details_and_leaves_blank_fields() throws Throwable {
	}
	@Then("^user gets message to enter the blank fields$")
	public void user_gets_message_to_enter_the_blank_fields() throws Throwable {
	}
	@When("^user enters all his details$")
	public void user_enters_all_his_details() throws Throwable {
	}
	@Then("^user is successfully registered$")
	public void user_is_successfully_registered() throws Throwable {
	}
	@After
	public void tearDownTestEnv() {
		driver.close();
	}
}
