package io.paysky.qc;

import io.paysky.qc.pages.Login.LoginPage;
import io.paysky.qc.pages.Logout.Logout;
import io.paysky.qc.pages.OnboardingPage;

public class Purchase_Product {

    final OnboardingPage onboardingPage = new OnboardingPage();
    final LoginPage loginPage = new LoginPage();
    final Logout logout = new Logout();
    final Purchase_Product purchase = new Purchase_Product();


    @org.testng.annotations.Test(priority = 1)
    public void PurchaseRestrictedAgeProduct() throws InterruptedException {
        onboardingPage.setUp();
        loginPage.Login_customer_user();
        purchase.PurchaseRestrictedAgeProduct();
    }
}
