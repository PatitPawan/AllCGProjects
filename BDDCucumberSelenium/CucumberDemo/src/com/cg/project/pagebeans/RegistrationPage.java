package com.cg.project.pagebeans;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RegistrationPage {
	@FindBy(how=How.ID, id = "user_login")
	private WebElement userLogin;
	@FindBy(how=How.ID, id = "user_email")
	private WebElement userEmail;
	@FindBy(how=How.ID, id = "user_password")
	private WebElement userPassword;
	@FindBy(className="btn")
	private WebElement button;
	public RegistrationPage() {}
	public String getUserLogin() {
		return userLogin.getAttribute("value");
	}
	public void setUserLogin(String userLogin) {
		this.userLogin.sendKeys(userLogin);;
	}
	public String getUserEmail() {
		return userEmail.getAttribute("value");
	}
	public void setUserEmail(String userEmail) {
		this.userEmail.sendKeys(userEmail);;
	}
	public String getUserPassword() {
		return userPassword.getAttribute("value");
	}
	public void setUserPassword(String userPassword) {
		this.userPassword.sendKeys(userPassword);
	}
	public void clickSignIn() {
		button.submit();
	}
}
