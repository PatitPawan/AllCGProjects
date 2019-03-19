package com.cg.project.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import com.cg.project.pagebeans.LoginPage;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GitHubStepDefinition {
	private WebDriver driver;
	private LoginPage loginPage;
	@Before
	public void setUpTestEnv() {
		System.setProperty("webdriver.chrome.driver", "D:\\SW backup\\chromedriver.exe");
	}
	@Given("^user is on the login page of github\\.com in browser$")
	public void user_is_on_the_login_page_of_github_com_in_browser() throws Throwable {
		driver = new ChromeDriver();
		driver.get("https://github.com/login");
		loginPage = PageFactory.initElements(driver, LoginPage.class);
	}
	@When("^user enter invalid credentials in Username and Password$")
	public void user_enter_invalid_credentials_in_Username_and_Password() throws Throwable {
		loginPage.setUsername("pp1197barik@gmail.com");
		loginPage.setPassword("temp@1197");
		loginPage.clickSignIn();
	}
	@Then("^user views the login page asking to re-enter credentials$")
	public void user_views_the_login_page_asking_to_re_enter_credentials() throws Throwable {
		String expectedErrorMessage = "Incorrect Username or Password";
		Assert.assertEquals(expectedErrorMessage, loginPage.getActualErrorMessage());
	}
	@When("^user enter valid credentials in Username and Password$")
	public void user_enter_valid_credentials_in_Username_and_Password() throws Throwable {
		loginPage.setUsername("pp1197barik@gmail.com");
		loginPage.setPassword("temp@1197");
		loginPage.clickSignIn();
	}
	@Then("^user views the github dashboard$")
	public void user_views_the_github_dashboard() throws Throwable {
		String actualTitle = driver.getTitle();
	    String expectedTitle = "PatitPawan";
	    Assert.assertEquals(expectedTitle, actualTitle);
	}
	@After
	public void tearDownTestEnv() {
		driver.close();
	}
}
