package io.paysky.qc;

import io.paysky.qc.pages.Login.LoginPage;
import io.paysky.qc.pages.Logout.Logout;
import io.paysky.qc.pages.OnboardingPage;
import io.paysky.qc.pages.Purchase_Product.Purchase_Restricted_Product;
import io.qameta.allure.Description;
import io.qameta.allure.Link;

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
    @Description("Check when user click no from the age confirmation pop-up ")
    @Link("https://devops.paysky.io/DefaultCollection/Infinity/_workitems/edit/65637")
    public void PurchaseRestrictedAgeProductWithInValidAge() throws InterruptedException {
        onboardingPage.setUp();
        loginPage.Login_customer_user();
        purchase.PurchaseRestrictedProductWithInvalidAge();

    }
    @org.testng.annotations.Test(priority = 3)
    @Description("Check when user click no from the age confirmation pop-up ")
    @Link("https://devops.paysky.io/DefaultCollection/Infinity/_workitems/edit/65641")
    public void CheckThatTheConfirmationPoPuPAppearAgainToAllTheProductsWhenDeclinedOnce() throws InterruptedException{
        onboardingPage.setUp();
        loginPage.Login_customer_user();
        purchase.CheckThatTheConfirmationPoPuPAppearAgainToAllTheProductsWhenDeclinedOnce();
    }

    @org.testng.annotations.Test(priority = 4)
    @Description("Check when user click no from the age confirmation pop-up ")
    @Link("https://devops.paysky.io/DefaultCollection/Infinity/_workitems/edit/65638")
    public void CheckAgeRestrictionPopupNotAppearsToProductsThatNotContainAgeRestrictions() throws InterruptedException{
        onboardingPage.setUp();
        loginPage.Login_customer_user();
        purchase.CheckAgeRestrictionPopupNotAppearsToProductsThatNotContainAgeRestrictions();
    }


    @org.testng.annotations.Test(priority = 5)
    @Description("Check when user click no from the age confirmation pop-up ")
    @Link("https://devops.paysky.io/DefaultCollection/Infinity/_workitems/edit/65639")
    public void CheckWhenUserAcceptAgeRestrictionForAgeShouldNotShowPopupForAllItemsThatAgelessThanThisAge()throws InterruptedException{
        onboardingPage.setUp();
        loginPage.Login_customer_user();
        purchase.CheckWhenUserAcceptAgeRestrictionForAgeShouldNotShowPopupForAllItemsThatAgelessThanThisAge();
    }
    @org.testng.annotations.Test(priority = 6)
    @Link("https://devops.paysky.io/DefaultCollection/Infinity/_workitems/edit/65642")
    public void CheckSubCategoryExtendBehaviorFromTheParent() throws InterruptedException{
        onboardingPage.setUp();
        loginPage.Login_customer_user();
        purchase.CheckSubCategoryExtendBehaviorFromTheParent();
    }


}
