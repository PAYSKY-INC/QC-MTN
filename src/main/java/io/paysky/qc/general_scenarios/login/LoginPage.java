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




    //CONSUMER


    private final By CONSUMERclickCountryButton = By.xpath("/html/body/modal-container/div[2]/div/app-cookie-modal/div/div/div[4]/button[1]");
    private final By CONSUMERclickCountryButton1 = By.xpath("/html/body/app-root/app-mtn-tenant-configuration/div/div[2]/div[2]/div/div/div[2]/div[3]/img");

    private final By signInPageButton = By.linkText("Sign-In");
    private final By phoneNumberTextField = By.id("phone");
    private final By CONSUMERPasswordTextField = By.cssSelector("input[type='password']");
    private final By CONSUMERLoginButton = By.cssSelector("button[type='button']");


    public void clickCountryButton() throws Exception {
        Thread.sleep(5000);
        clickOnElement(CONSUMERclickCountryButton, 25);
        clickOnElement(CONSUMERclickCountryButton1, 25);
        Thread.sleep(10000);
    }


    public void openSignInPage() throws Exception {
        clickOnElement(signInPageButton,20);
        Thread.sleep(3000);
    }

    public void writePhoneNumber(String phoneNumber) throws Exception {
        typeText(phoneNumberTextField,phoneNumber,20);
    }

    public void CONSUMERWritePassword(String password) throws Exception {
        typeText(CONSUMERPasswordTextField,password,20);

    }




    public void CONSUMERSubmitLogin() throws Exception {
        clickOnElement(CONSUMERLoginButton,20);
        Thread.sleep(10000);
    }








}
