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
    final CreateCategory createCategory= new CreateCategory();
    final Logout logout = new Logout();





    @org.testng.annotations.Test(priority = 1)
    @Description("Check that the use can add age verification with valid min age ")
    @Link("https://devops.paysky.io/DefaultCollection/Infinity/_workitems/edit/65530")
    @Owner("Eman Mohamed")
    @Tag("End-To-End")

    public void checkAgeVerificationWithMinAgeIs10() throws InterruptedException{
        onboardingPage.setUp();
        loginPage.Login_operation_user();
        createCategory.AgeVerificationWithMin10Year();
        logout.Log_out_operation_portal();
    }




    @org.testng.annotations.Test(priority = 2)
    @Description("Check that the use can add age verification with valid max age ")
    @Link("https://devops.paysky.io/DefaultCollection/Infinity/_workitems/edit/65530")
    @Owner("Eman Mohamed")
    @Tag("End-To-End")

    public void checkAgeVerificationWithMaxAgeIs122() throws InterruptedException{
        onboardingPage.setUp();
        loginPage.Login_operation_user();
        createCategory.AgeVerificationWithMax122Year();
       // logout.Log_out_operation_portal();
    }

    @org.testng.annotations.Test(priority = 3)
    @Description("Check that the use can add age verification with Invalid min age ")
    @Link("https://devops.paysky.io/DefaultCollection/Infinity/_workitems/edit/65629")
    @Owner("Eman Mohamed")
    @Tag("End-To-End")
    public void checkAgeVerificationWithInvalidMinAge() throws Exception {
        onboardingPage.setUp();
        loginPage.Login_operation_user();
        createCategory.AgeVerificationWithInvalidMinValue();
      //  logout.Log_out_operation_portal();

    }
    @org.testng.annotations.Test(priority = 4)
    @Description("Check that the use can add age verification with Invalid max age ")
    @Link("https://devops.paysky.io/DefaultCollection/Infinity/_workitems/edit/65629")
    @Owner("Eman Mohamed")
    @Tag("End-To-End")
    public void checkAgeVerificationWithInvalidMaxAge() throws Exception {
        onboardingPage.setUp();
        loginPage.Login_operation_user();
        createCategory.AgeVerificationWithInvalidMaxValue();
      //  logout.Log_out_operation_portal();

    }

    @org.testng.annotations.Test(priority = 4)
    @Description("Create Category without adding Age Verification ")
    @Link("https://devops.paysky.io/DefaultCollection/Infinity/_workitems/edit/65631")
    @Owner("Eman Mohamed")
    @Tag("End-To-End")
    public void checkCreateCategoryWithoutAgeVerification() throws Exception {
        onboardingPage.setUp();
        loginPage.Login_operation_user();
        createCategory.CreateCategoryWithoutAgeVerification();
        //  logout.Log_out_operation_portal();

    }




   @AfterTest
    public void CloseDriver() throws InterruptedException {
        logout.Close_driver();
    }






    }





