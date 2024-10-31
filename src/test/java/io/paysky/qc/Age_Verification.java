package io.paysky.qc;

import io.paysky.qc.pages.Create_Category.CreateCategory;
import io.paysky.qc.pages.Login.LoginPage;
import io.paysky.qc.pages.Logout.Logout;
import io.paysky.qc.pages.OnboardingPage;
import io.qameta.allure.Description;
import io.qameta.allure.Link;
import io.qameta.allure.Owner;
import io.qameta.allure.testng.Tag;
import org.testng.annotations.AfterTest;

public class Age_Verification {

    final OnboardingPage onboardingPage = new OnboardingPage();
    final LoginPage loginPage = new LoginPage();
    final CreateCategory CreateCategory = new CreateCategory();
    final Logout logoutPage = new Logout();

    @org.testng.annotations.Test(priority = 1)
    @Description("Creating an age-restricted category/subcategory > Create Category with adding age verification with valid value")
    @Link("https://devops.paysky.io/DefaultCollection/MTN%20PRODUCT/_workitems/edit/65530")
    @Owner("Eman Mohamed")
    @Tag("End-To-End")

    public void checkAgeVerificationWithMinAgeIs10() throws InterruptedException{
        onboardingPage.setUp();
        loginPage.Login_operation_user();
        CreateCategory.AgeVerificationWithMin10Year();
        logoutPage.Log_out_operation_portal();
    }

    @org.testng.annotations.Test(priority = 2)
    @Description("Creating an age-restricted category/subcategory > Create Category with adding age verification with valid value")
    @Link("https://devops.paysky.io/DefaultCollection/MTN%20PRODUCT/_workitems/edit/65530")
    @Owner("Eman Mohamed")
    @Tag("End-To-End")

    public void checkAgeVerificationWithMaxAgeIs122() throws InterruptedException{
        onboardingPage.setUp();
        loginPage.Login_operation_user();
        CreateCategory.AgeVerificationWithMax122Year();
        logoutPage.Log_out_operation_portal();
    }

    @AfterTest
    public void CloseDriver() throws InterruptedException {
        logoutPage.Close_driver();
    }
}