package io.paysky.qc;

import io.paysky.qc.pages.Create_Category.CreateCategory;
import io.paysky.qc.pages.Login.LoginPage;
import io.paysky.qc.pages.OnboardingPage;
import io.qameta.allure.Description;
import io.qameta.allure.Link;
import io.qameta.allure.Owner;
import io.qameta.allure.testng.Tag;

public class Age_Verification {

    final OnboardingPage onboardingPage = new OnboardingPage();
    final LoginPage loginPage = new LoginPage();
    final CreateCategory AgeVerification = new CreateCategory();



    @org.testng.annotations.Test(priority = 1)
    @Description("Check that the operation user can login with valid credentials")
    @Link("https://devops.paysky.io/DefaultCollection/Infinity/_workitems/edit/62811")
    @Owner("Eman Mohamed")
    @Tag("End-To-End")

    public void LoginWithValidOperationUser() throws InterruptedException {
        onboardingPage.setUp();
        loginPage.Login_operation_user();
    }

    @org.testng.annotations.Test(priority = 2)

    public void checkAgeVerificationWithMinAgeIs10() throws InterruptedException{
        AgeVerification.AgeVerificationWithMin10Year();
    }



}
