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
    final CreateCategory AgeVerification = new CreateCategory();
    final Logout logout = new Logout();





    @org.testng.annotations.Test(priority = 2)

    public void checkAgeVerificationWithMinAgeIs10() throws InterruptedException{
        onboardingPage.setUp();
        loginPage.Login_operation_user();
        AgeVerification.AgeVerificationWithMin10Year();
        logout.Log_out_operation_portal();
    }




    @org.testng.annotations.Test(priority = 3)
    public void checkAgeVerificationWithMaxAgeIs122() throws InterruptedException{
        onboardingPage.setUp();
        loginPage.Login_operation_user();
        AgeVerification.AgeVerificationWithMax122Year();
        logout.Log_out_operation_portal();
    }
   @AfterTest
    public void CloseDriver() throws InterruptedException {
        logout.Close_driver();
    }


    }





