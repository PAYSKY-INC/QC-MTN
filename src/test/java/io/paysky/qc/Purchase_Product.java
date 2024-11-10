package io.paysky.qc;

import io.paysky.qc.pages.Login.LoginPage;
import io.paysky.qc.pages.Logout.Logout;
import io.paysky.qc.pages.OnboardingPage;
import io.paysky.qc.pages.Purchase_Product.Purchase_Restricted_Product;

public class Purchase_Product {

    final OnboardingPage onboardingPage = new OnboardingPage();
    final LoginPage loginPage = new LoginPage();
    final Logout logout = new Logout();
    final Purchase_Restricted_Product purchase = new Purchase_Restricted_Product();


    @org.testng.annotations.Test(priority = 1)
    public void PurchaseRestrictedAgeProductWithValidAge() throws InterruptedException {
        onboardingPage.setUp();
        loginPage.Login_customer_user();
        purchase.PurchaseRestrictedProductWithValidAge();

    }

    @org.testng.annotations.Test(priority = 2)
    public void PurchaseRestrictedAgeProductWithInValidAge() throws InterruptedException {
        onboardingPage.setUp();
        loginPage.Login_customer_user();
        purchase.PurchaseRestrictedProductWithInvalidAge();

    }


}
