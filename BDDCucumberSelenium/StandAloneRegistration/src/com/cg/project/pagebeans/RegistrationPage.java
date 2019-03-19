package com.cg.project.pagebeans;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RegistrationPage {
	@FindBy(how=How.NAME, name = "userid")
	private WebElement userid;
	@FindBy(how=How.NAME, name ="passid")
	private WebElement passid;
	@FindBy(how=How.NAME, name ="username")
	private WebElement username;
	@FindBy(how=How.NAME, name ="address")
	private WebElement address;
	@FindBy(how=How.NAME, name ="country")
	private WebElement country;
	@FindBy(how=How.NAME, name ="zip")
	private WebElement zip;
	@FindBy(how=How.NAME, name ="email")
	private WebElement email;
	@FindBy(how=How.NAME, name ="sex")
	private WebElement sex;
	@FindBy(className="submit")
	private WebElement button;
	public RegistrationPage() {}
	public String getUserid() {
		return userid.getAttribute("value");
	}
	public void setUserid(WebElement userid) {
		this.userid = userid;
	}
	public String getPassid() {
		return passid.getAttribute("value");
	}
	public void setPassid(WebElement passid) {
		this.passid = passid;
	}
	public String getUsername() {
		return username.getAttribute("value");
	}
	public void setUsername(String username) {
		this.username.sendKeys(username);;
	}
	public String getAddress() {
		return address.getAttribute("value");
	}
	public void setAddress(String address) {
		this.address.sendKeys(address);
	}
	public String getCountry() {
		return country.getAttribute("value");
	}
	public void setCountry(String country) {
		this.country.sendKeys(country);;
	}
	public String getZip() {
		return zip.getAttribute("value");
	}
	public void setZip(String zip) {
		this.zip.sendKeys(zip);
	}
	public String getEmail() {
		return email.getAttribute("value");
	}
	public void setEmail(String email) {
		this.email.sendKeys(email);
	}
	public String getSex() {
		return sex.getAttribute("value");
	}
	public void setSex(String sex) {
		this.sex.sendKeys(sex);
	}
	public WebElement getButton() {
		return button;
	}
	public void clickSignUp() {
		button.submit();
	}
}
