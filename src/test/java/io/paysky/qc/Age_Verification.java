package io.paysky.qc;

import io.paysky.qc.pages.Create_Category.CreateCategory;
import io.paysky.qc.pages.Login.LoginPage;
import io.paysky.qc.pages.Logout.Logout;
import io.paysky.qc.pages.OnboardingPage;
import io.paysky.qc.pages.Products.Edit_Product;
import io.qameta.allure.Description;
import io.qameta.allure.Link;
import io.qameta.allure.Owner;
import io.qameta.allure.testng.Tag;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Age_Verification {

    final OnboardingPage onboardingPage = new OnboardingPage();
    final LoginPage loginPage = new LoginPage();
    final CreateCategory createCategory= new CreateCategory();
    final Edit_Product edit = new Edit_Product();
    final Logout logout = new Logout();


    @org.testng.annotations.Test(priority = 1)
    @Description("Modify current value of age verification with valid min value ")
    @Link("https://devops.paysky.io/DefaultCollection/MTN%20PRODUCT/_workitems/edit/65530")
    @Owner("Eman Mohamed")
    @Tag("End-To-End")
    public void CreateCategoryWithAgeRestriction() throws InterruptedException{
        onboardingPage.setUp();
        loginPage.Login_operation_user();
        createCategory.createCategoryWithAgeRestriction();
        logout.Log_out_operation_portal();
    }

    @org.testng.annotations.Test(priority = 2)
    @Description("Modify current value of age verification with valid min value ")
    @Link("https://devops.paysky.io/DefaultCollection/MTN%20PRODUCT/_workitems/edit/65649")
    @Owner("Eman Mohamed")
    @Tag("End-To-End")

    public void ModifyAgeVerificationWithMinValidAgeIs10() throws InterruptedException{
        onboardingPage.setUp();
        loginPage.Login_operation_user();
        createCategory.AgeVerificationWithMin10Year();
       logout.Log_out_operation_portal();
    }




    @org.testng.annotations.Test(priority = 3)
    @Description("Modify current value of age verification with valid max value ")
    @Link("https://devops.paysky.io/DefaultCollection/MTN%20PRODUCT/_workitems/edit/65649")
    @Owner("Eman Mohamed")
    @Tag("End-To-End")

    public void checkAgeVerificationWithMaxAgeIs122() throws InterruptedException{
        onboardingPage.setUp();
        loginPage.Login_operation_user();
        createCategory.AgeVerificationWithMax122Year();
       logout.Log_out_operation_portal();
    }

    @org.testng.annotations.Test(priority = 4)
    @Description("Check that the use can't add age verification with Invalid min age ")
    @Link("https://devops.paysky.io/DefaultCollection/Infinity/_workitems/edit/65629")
    @Owner("Eman Mohamed")
    @Tag("End-To-End")
    public void checkAgeVerificationWithInvalidMinAge() throws Exception {
        onboardingPage.setUp();
        loginPage.Login_operation_user();
        createCategory.AgeVerificationWithInvalidMinValue();
       logout.Log_out_operation_portal();

    }
    @org.testng.annotations.Test(priority = 5)
    @Description("Check that the use can add age verification with Invalid max age ")
    @Link("https://devops.paysky.io/DefaultCollection/Infinity/_workitems/edit/65629")
    @Owner("Eman Mohamed")
    @Tag("End-To-End")
    public void checkAgeVerificationWithInvalidMaxAge() throws Exception {
        onboardingPage.setUp();
        loginPage.Login_operation_user();
        createCategory.AgeVerificationWithInvalidMaxValue();
        logout.Log_out_operation_portal();

    }

    @org.testng.annotations.Test(priority = 6)
    @Description("Create Category without adding Age Verification ")
    @Link("https://devops.paysky.io/DefaultCollection/Infinity/_workitems/edit/65631")
    @Owner("Eman Mohamed")
    @Tag("End-To-End")
    public void checkCreateCategoryWithoutAgeVerification() throws Exception {
        onboardingPage.setUp();
        loginPage.Login_operation_user();
        createCategory.CreateCategoryWithoutAgeVerification();
         logout.Log_out_operation_portal();

    }
    @org.testng.annotations.Test(priority = 7)
    @Description("Create Category without adding Age Verification ")
    @Link("https://devops.paysky.io/DefaultCollection/MTN%20PRODUCT/_workitems/edit/65651")
    @Owner("Eman Mohamed")
    @Tag("End-To-End")
    public void RemoveAgeRestrictionFromCategory() throws InterruptedException{
        onboardingPage.setUp();
        loginPage.Login_operation_user();
        createCategory.RemoveAgeRestrictionFromCategory();
        logout.Log_out_operation_portal();

    }







   @AfterTest
    public void CloseDriver() throws InterruptedException {
        logout.Close_driver();
    }








    }





