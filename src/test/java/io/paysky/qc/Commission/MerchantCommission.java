package io.paysky.qc.Commission;

import io.paysky.qc.pages.Commission.Merchant.Add_Commission_Merchant;
import io.paysky.qc.pages.Login.LoginPage;
import io.paysky.qc.pages.Logout.Logout;
import io.paysky.qc.pages.OnboardingPage;
import io.qameta.allure.Description;
import io.qameta.allure.Link;
import io.qameta.allure.Owner;
import io.qameta.allure.testng.Tag;

public class MerchantCommission {

    Add_Commission_Merchant add = new Add_Commission_Merchant();
    OnboardingPage onboardingPage = new OnboardingPage();
    LoginPage loginPage = new LoginPage();
    Logout logout = new Logout();

    @org.testng.annotations.Test(priority = 1)
    @Description("Define Commission on Merchant: To verify user is selecting Merchant TAB")
    @Link("https://devops.paysky.io/DefaultCollection/MTN%20PRODUCT/_workitems/edit/17714")
    @Owner("Eman Mohamed")
    @Tag("End-To-End")

    public void CheckClickOnMerchantTab () throws Exception {
        onboardingPage.setUp();
        loginPage.Login_admin_user();
        add.Check_That_Click_On_Merchant_Tab();
        logout.Log_out_Admin_portal();

    }

    @org.testng.annotations.Test(priority = 2)
    @Description("Define Commission on Merchant: To verify user is clicking on Add Commission Button")
    @Link("https://devops.paysky.io/DefaultCollection/MTN%20PRODUCT/_workitems/edit/17716")
    @Owner("Eman Mohamed")
    @Tag("End-To-End")

    public void ClickOnAddButton() throws Exception {
        onboardingPage.setUp();
        loginPage.Login_admin_user();
        add.Click_On_ADD_Button();
        logout.Log_out_Admin_portal();

    }
    @org.testng.annotations.Test(priority = 3)
    @Description("Define Commission on Merchant: To verify user is selecting and searching the Merchant List")
    @Link("https://devops.paysky.io/DefaultCollection/MTN%20PRODUCT/_workitems/edit/17717")
    @Owner("Eman Mohamed")
    @Tag("End-To-End")

    public void SearchAndSelectFromMerchantDDL() throws Exception {
        onboardingPage.setUp();
        loginPage.Login_admin_user();
        add.Check_Search_And_Select_From_MerchantDDL();
        logout.Log_out_Admin_portal();
        

    }

    @org.testng.annotations.Test(priority = 4)
    @Description("Define Commission on Merchant: To verify user is searching merchant through Invalid Value")
    @Link("https://devops.paysky.io/DefaultCollection/MTN%20PRODUCT/_workitems/edit/17718")
    @Owner("Eman Mohamed")
    @Tag("End-To-End")

    public void SearchINMerchantDDLWithInvalidValue() throws Exception{
        onboardingPage.setUp();
        loginPage.Login_admin_user();
        add.Search_In_MerchantDDL_With_Invalid_Value();
        logout.Log_out_Admin_portal();

    }









}
