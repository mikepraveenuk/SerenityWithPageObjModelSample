package com.serenity.pages;

import org.openqa.selenium.support.ui.Select;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class CreateAccountPage extends PageObject{
	private static final Logger log = LoggerFactory.getLogger(CreateAccountPage.class);

	@FindBy(id = "id_gender1")
	WebElementFacade title;
	
	@FindBy(id = "customer_firstname")
	WebElementFacade firstName;
	
	@FindBy(id = "customer_lastname")
	WebElementFacade lastName;
	
	@FindBy(id = "passwd")
	WebElementFacade password;
	
	@FindBy(id = "address1")
	WebElementFacade address;
	
	@FindBy(id = "city")
	WebElementFacade city;
	
	@FindBy(id = "id_state")
	WebElementFacade state;
	
	@FindBy(id = "postcode")
	WebElementFacade zipCode;
	
	@FindBy(id = "id_country")
	WebElementFacade country;
	
	@FindBy(id = "phone_mobile")
	WebElementFacade mobilePhone;
	
	@FindBy(id = "alias")
	WebElementFacade aliasAddress;
	
	@FindBy(id = "submitAccount")
	WebElementFacade register_button;
	
	public void enterFirstName(String firstName) {
		this.firstName.sendKeys(firstName);
	}
	
	public void enterLastName(String lastName) {
		this.lastName.sendKeys(lastName);
	}
	
	public void enterPassword(String password) {
		this.password.sendKeys(password);
	}
	
	public void enterAddress(String address) {
		this.address.type(address);
	}
	
	public void selectCountry(String country) {
		new Select(this.country).selectByVisibleText(country);
	}
	
	public void selectState(String state) {
		new Select(this.state).selectByVisibleText(state);
	}
	
	public void enterZipCode(String zipCode) {
		this.zipCode.sendKeys(zipCode);
	}
	
	public void enterCity(String city) {
		this.city.sendKeys(city);
	}
	
	public void enterMobilePhone(String mobilePhone) {
		this.mobilePhone.sendKeys(mobilePhone);
	}
	
	public void enterAliasAddress(String aliasAddress) {		
		this.aliasAddress.type(aliasAddress);
	}
	
	public void clickOnRegisterButton() {
		this.register_button.click();
	}
}