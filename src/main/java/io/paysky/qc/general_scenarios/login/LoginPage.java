package io.paysky.qc.general_scenarios.login;

import io.paysky.qc.utils.AbstractSeleniumActions;
import org.openqa.selenium.By;

public class LoginPage extends AbstractSeleniumActions {

    //Admin-Ops
    private final By selectCountryDropdown = By.id("mat-input-0");
    private final By countrySelection = By.cssSelector("#mat-option-3 .country-list-item");
    private final By emailTextField = By.id("input");
    private final By passwordTextField = By.cssSelector(".input-group > #input");
    private final By loginButton = By.cssSelector(".block");

    public void clickCountryDropdown() throws Exception {
         Thread.sleep(20000);
        clickOnElement(selectCountryDropdown, 25);
    }

    public void selectCountry() throws Exception {
        clickOnElement(countrySelection, 20);
    }


    public void writeEmail(String userName) throws Exception {
        typeText(emailTextField, userName, 20);
    }

    public void writePassword(String password) throws Exception {
        typeText(passwordTextField, password, 20);
        Thread.sleep(5000);
    }


    public void clickLoginButton() throws Exception {
        clickOnElement(loginButton, 20);
        Thread.sleep(5000);
    }











}
