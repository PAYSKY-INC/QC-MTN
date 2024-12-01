package io.paysky.qc.Commission;

import io.paysky.qc.pages.Commission.Category.Add_Commission_Category;
import io.paysky.qc.pages.Commission.Category.Edit_Commission_Category;
import io.paysky.qc.pages.Commission.Merchant.Add_Commission_Merchant;
import io.paysky.qc.pages.Login.LoginPage;
import io.paysky.qc.pages.Logout.Logout;
import io.paysky.qc.pages.OnboardingPage;
import io.qameta.allure.Description;
import io.qameta.allure.Link;
import io.qameta.allure.Owner;
import io.qameta.allure.testng.Tag;

public class CategoryCommission {



    Add_Commission_Category add = new Add_Commission_Category();
    Edit_Commission_Category edit = new Edit_Commission_Category();
    OnboardingPage onboardingPage = new OnboardingPage();
    LoginPage loginPage = new LoginPage();
    Logout logout = new Logout();


    @org.testng.annotations.Test(priority = 1)
    @Description("Check that the add commission page open ")
    @Link("https://devops.paysky.io/DefaultCollection/MTN%20PRODUCT/_workitems/edit/17660")
    @Owner("Eman Mohamed")
    @Tag("End-To-End")
    public void CheckClickOnCategoryTab() throws Exception{
        onboardingPage.setUp();
        loginPage.Login_admin_user();
        add.Check_That_Click_On_Category_Tab();
        logout.Log_out_Admin_portal();

    }


    @org.testng.annotations.Test(priority = 2)
    @Description("Check that the add commission page open ")
    @Link("https://devops.paysky.io/DefaultCollection/MTN%20PRODUCT/_workitems/edit/17661")
    @Owner("Eman Mohamed")
    @Tag("End-To-End")
    public void CheckThatAddCommissionPageOpen() throws Exception {
        onboardingPage.setUp();
        loginPage.Login_admin_user();
        add.Add_Commission_Page_Open();
        logout.Log_out_Admin_portal();
    }
    @org.testng.annotations.Test(priority = 3)
    @Description("Check that the category dropdown list is clickable and has options")
    @Link("https://devops.paysky.io/DefaultCollection/MTN%20PRODUCT/_workitems/edit/17664")
    @Owner("Eman Mohamed")
    @Tag("End-To-End")
    public void Check_That_Toggles_DisabledByDefault() throws Exception {
        onboardingPage.setUp();
        loginPage.Login_admin_user();
        add.Check_Toggles_Disabled_ByDefault();
        logout.Log_out_Admin_portal();
    }

    @org.testng.annotations.Test(priority = 4)
    @Description("Check that the category dropdown list is clickable and has options")
    @Link("https://devops.paysky.io/DefaultCollection/MTN%20PRODUCT/_workitems/edit/17661")
    @Owner("Eman Mohamed")
    @Tag("End-To-End")
    public void CheckThatCategoryDDLClickableAndHasData() throws Exception{
        onboardingPage.setUp();
        loginPage.Login_admin_user();
        add.Check_CategoryDDL_Clickable();
        logout.Log_out_Admin_portal();


    }

    @org.testng.annotations.Test(priority = 5)
    @Description("Check that can search in category dropdown")
    @Link("https://devops.paysky.io/DefaultCollection/MTN%20PRODUCT/_workitems/edit/17665")
    @Owner("Eman Mohamed")
    @Tag("End-To-End")
    public void CheckSearchInCategoryDDL() throws Exception{
        onboardingPage.setUp();
        loginPage.Login_admin_user();
        add.Check_Search_Functionality_In_CategoryDDL();
        logout.Log_out_Admin_portal();


    }
    @org.testng.annotations.Test(priority = 6)
    @Description("To verify User is adding commission against marketplace with Enable Toggle")
    @Link("https://devops.paysky.io/DefaultCollection/MTN%20PRODUCT/_workitems/edit/17666")
    @Owner("Eman Mohamed")
    @Tag("End-To-End")
    public void AddingCommissionToMarketPlace() throws Exception{
        onboardingPage.setUp();
        loginPage.Login_admin_user();
        add.add_Commission_Against_Market_Place();
       logout.Log_out_Admin_portal();
    }
    @org.testng.annotations.Test(priority = 6)
    @Description("To verify User is adding commission against Marketplace with Disable Toggle Button and Insert Commission")
    @Link("https://devops.paysky.io/DefaultCollection/MTN%20PRODUCT/_workitems/edit/17667")
    @Owner("Eman Mohamed")
    @Tag("End-To-End")
    public void AddingCommissionWhenMarketPlaceToggleDisabled() throws Exception {
        onboardingPage.setUp();
        loginPage.Login_admin_user();
        add.add_Commission_For_Market_Place_When_ToggleDisabled();
        logout.Log_out_Admin_portal();
    }
    @org.testng.annotations.Test(priority = 7)
    @Description("To verify user can't add commission against marketplace more then 100%")
    @Link("https://devops.paysky.io/DefaultCollection/MTN%20PRODUCT/_workitems/edit/17668")
    @Owner("Eman Mohamed")
    @Tag("End-To-End")
    public void AddingCommissionInMarketPlaceWithMore100() throws Exception {
        onboardingPage.setUp();
        loginPage.Login_admin_user();
        add.add_Commission_With_Value_MoreThan100_InMarketPlace();
        logout.Log_out_Admin_portal();
    }
    @org.testng.annotations.Test(priority = 8)
    @Description("To verify User is adding commission against Marketplace below then 0% ")
    @Link("https://devops.paysky.io/DefaultCollection/MTN%20PRODUCT/_workitems/edit/17672")
    @Owner("Eman Mohamed")
    @Tag("End-To-End")
    public void AddingCommissionInMarketPlaceWithLessThanZero() throws Exception {
        onboardingPage.setUp();
        loginPage.Login_admin_user();
        add.add_Commission_With_Value_LessThan0_InMarketPlace();
        logout.Log_out_Admin_portal();
    }
    @org.testng.annotations.Test(priority = 9)
    @Description("adding commission against Marketplace in between 0% to 100%.")
    @Link("https://devops.paysky.io/DefaultCollection/MTN%20PRODUCT/_workitems/edit/17670")
    @Owner("Eman Mohamed")
    @Tag("End-To-End")
    public void AddingCommissionInMarketPlaceBetween0and100() throws Exception{
        onboardingPage.setUp();
        loginPage.Login_admin_user();
        add.add_commission_With_Value_Between0and100_InMarketPlace();
        logout.Log_out_Admin_portal();
    }
    @org.testng.annotations.Test(priority = 10)
    @Description("verify User can't add commission against Marketplace like Alphabets A,b,x")
    @Link("https://devops.paysky.io/DefaultCollection/MTN%20PRODUCT/_workitems/edit/17673")
    @Owner("Eman Mohamed")
    @Tag("End-To-End")
    public void AddingCommissionInMarketPlaceUsingCharacters() throws Exception{
        onboardingPage.setUp();
        loginPage.Login_admin_user();
        add.add_commission_With_Characters_InMarketPlace();
        logout.Log_out_Admin_portal();

    }
    @org.testng.annotations.Test(priority = 11)
    @Description("verify User can't add commission against Marketplace like symbolic value (?<#@)" )
    @Link("https://devops.paysky.io/DefaultCollection/MTN%20PRODUCT/_workitems/edit/17674")
    @Owner("Eman Mohamed")
    @Tag("End-To-End")
    public void AddingCommissionInMarketPlaceUsingSpecialCharacters() throws Exception{
        onboardingPage.setUp();
        loginPage.Login_admin_user();
        add.add_commission_With_SpecialCharacters_InMarketPlace();
        logout.Log_out_Admin_portal();

    }
    @org.testng.annotations.Test(priority = 12)
    @Description("verify User add commission against Storefront with Enable Toggle")
    @Link("https://devops.paysky.io/DefaultCollection/MTN%20PRODUCT/_workitems/edit/17677")
    @Owner("Eman Mohamed")
    @Tag("End-To-End")
    public void CheckThatCanEnableStoreFrontToggle() throws Exception{
        onboardingPage.setUp();
        loginPage.Login_admin_user();
        add.Check_That_Can_Enable_StoreFront_Toggle();
        logout.Log_out_Admin_portal();
    }
    @org.testng.annotations.Test(priority = 13)
    @Description("verify User can't add commission against Storefront with Disable Toggle and Insert Commission")
    @Link("https://devops.paysky.io/DefaultCollection/MTN%20PRODUCT/_workitems/edit/17679")
    @Owner("Eman Mohamed")
    @Tag("End-To-End")
   public void addingCommissionWhenStoreFrontToggleDisabled() throws Exception{
        onboardingPage.setUp();
        loginPage.Login_admin_user();
        add.add_Commission_For_StoreFront_When_ToggleDisabled();
        logout.Log_out_Admin_portal();

    }
    @org.testng.annotations.Test(priority = 14)
    @Description("verify User can't add commission without select category")
    @Link("https://devops.paysky.io/DefaultCollection/MTN%20PRODUCT/_workitems/edit/17682")
    @Owner("Eman Mohamed")
    @Tag("End-To-End")
    public void addingCommissionWithoutSelectCategory() throws Exception{
        onboardingPage.setUp();
        loginPage.Login_admin_user();
        add.add_Commission_Without_Select_Category();
        logout.Log_out_Admin_portal();

    }
    @org.testng.annotations.Test(priority = 15)
    @Description("verify User can't add commission without applying commission in platform")
    @Link("https://devops.paysky.io/DefaultCollection/MTN%20PRODUCT/_workitems/edit/17682")
    @Owner("Eman Mohamed")
    @Tag("End-To-End")
    public void addingCommissionWithoutApplyingInPlatForm() throws Exception{
        onboardingPage.setUp();
        loginPage.Login_admin_user();
        add.add_Commission_Without_Applying_In_Platform();
        logout.Log_out_Admin_portal();

    }
    @org.testng.annotations.Test(priority = 16)
    @Description("To verify user is Editing commission for the specific category")
    @Link("https://devops.paysky.io/DefaultCollection/MTN%20PRODUCT/_workitems/edit/17696")
    @Owner("Eman Mohamed")
    @Tag("End-To-End")
    public void checkClickOnEditIcon() throws Exception{
        onboardingPage.setUp();
        loginPage.Login_admin_user();
        edit.check_Click_On_Edit_Icon();
    }

    @org.testng.annotations.Test(priority = 17)
    @Description("To verify Data of saved Category is loaded on page")
    @Link("https://devops.paysky.io/DefaultCollection/MTN%20PRODUCT/_workitems/edit/17698")
    @Owner("Eman Mohamed")
    @Tag("End-To-End")
    public void CheckDataOfSavedCommission () throws Exception{
        onboardingPage.setUp();
        loginPage.Login_admin_user();
        edit.Check_Previous_Data_Saved_Before();
    }

    @org.testng.annotations.Test(priority = 18)
    @Description("To verify user is updating commission against Marketplace or Storefront with toggle button")
    @Link("https://devops.paysky.io/DefaultCollection/MTN%20PRODUCT/_workitems/edit/17703")
    @Owner("Eman Mohamed")
    @Tag("End-To-End")
    public void CheckTogglesClickableInEditPage() throws Exception{
        onboardingPage.setUp();
        loginPage.Login_admin_user();
        edit.Check_That_Toggles_Clickable_In_EditPage();
    }

    @org.testng.annotations.Test(priority = 19)
    @Description("To verify updated commission is reflecting in the Marketplace and/or Storefront with No changes")
    @Link("https://devops.paysky.io/DefaultCollection/MTN%20PRODUCT/_workitems/edit/17709")
    @Owner("Eman Mohamed")
    @Tag("End-To-End")

    public void UpdateCommissionWithoutChanges() throws Exception{
        onboardingPage.setUp();
        loginPage.Login_admin_user();
        edit.Click_On_Update_CommissionBtn_Without_Changes();
    }
















}
