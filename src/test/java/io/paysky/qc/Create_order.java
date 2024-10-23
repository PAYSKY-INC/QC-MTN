package io.paysky.qc;

import io.paysky.qc.pages.*;
import io.paysky.qc.pages.Approve_Product.ApproveProduct;
import io.paysky.qc.pages.Create_New_Product.CreateNewProduct;
import io.paysky.qc.pages.Create_Order.CreateOrder;
import io.paysky.qc.pages.Dispatch_Order.DispatchOrder;
import io.paysky.qc.pages.Login.LoginPage;
import io.paysky.qc.pages.Logout.Logout;
import io.qameta.allure.Description;
import io.qameta.allure.Link;
import io.qameta.allure.Owner;
import io.qameta.allure.testng.Tag;
import org.testng.annotations.AfterTest;

public class Create_order {

    final OnboardingPage onboardingPage = new OnboardingPage();
    final LoginPage loginPage = new LoginPage();
    final ApproveProduct  approveProduct= new ApproveProduct();
    final CreateNewProduct createNewProduct = new CreateNewProduct();
    final CreateOrder createOrder = new CreateOrder();
    final DispatchOrder dispatchOrder = new DispatchOrder();
    final Logout logoutPage = new Logout();

    @org.testng.annotations.Test(priority = 1)
    @Description("Check that the user can login with valid credentials")
    @Link("https://devops.paysky.io/DefaultCollection/Infinity/_workitems/edit/62811")
    @Owner("Mohamed Ehab")
    @Tag("End-To-End")

    public void LoginWithMerchant() throws Exception {
        onboardingPage.setUp();
        loginPage.Login_merchant_user();
    }

    @org.testng.annotations.Test(priority = 2)
    @Description("Check that the user can login with valid credentials")
    @Link("https://devops.paysky.io/DefaultCollection/Infinity/_workitems/edit/62811")
    @Owner("Mohamed Ehab")
    @Tag("End-To-End")

    public void CreateNewProduct() throws Exception {
        createNewProduct.createNewProduct();
        logoutPage.Log_out_merchant_portal();
    }

    @org.testng.annotations.Test(priority = 3)
    @Description("Check that the user can login with valid credentials")
    @Link("https://devops.paysky.io/DefaultCollection/Infinity/_workitems/edit/62811")
    @Owner("Mohamed Ehab")
    @Tag("End-To-End")

    public void LoginWithOperation() throws Exception {
        onboardingPage.setUp();
        loginPage.Login_operation_user();
    }

    @org.testng.annotations.Test(priority = 4)
    @Description("Check that the user can login with valid credentials")
    @Link("https://devops.paysky.io/DefaultCollection/Infinity/_workitems/edit/62811")
    @Owner("Mohamed Ehab")
    @Tag("End-To-End")

    public void ApproveProduct() throws Exception {
        approveProduct.Approve_Product();
        logoutPage.Log_out_operation_portal();
    }

    @org.testng.annotations.Test(priority = 5)
    @Description("Check that the user can login with valid credentials")
    @Link("https://devops.paysky.io/DefaultCollection/Infinity/_workitems/edit/62811")
    @Owner("Mohamed Ehab")
    @Tag("End-To-End")

    public void LoginWithCustomer() throws Exception {
        onboardingPage.setUp();
        loginPage.Login_customer_user();
    }

    @org.testng.annotations.Test(priority = 6)
    @Description("Check that the user can login with valid credentials")
    @Link("https://devops.paysky.io/DefaultCollection/Infinity/_workitems/edit/62811")
    @Owner("Mohamed Ehab")
    @Tag("End-To-End")

    public void CreateOrder() throws Exception {
        createOrder.Create_Order();
    }

    @org.testng.annotations.Test(priority = 7)
    @Description("Check that the user can login with valid credentials")
    @Link("https://devops.paysky.io/DefaultCollection/Infinity/_workitems/edit/62811")
    @Owner("Mohamed Ehab")
    @Tag("End-To-End")

    public void DispatchOrder() throws Exception {
        onboardingPage.setUp();
        loginPage.Login_merchant_user();
        dispatchOrder.Dispatch_Order();
        logoutPage.Log_out_merchant_portal();
    }

    @AfterTest
    public void CloseDriver() throws InterruptedException {
        logoutPage.Close_driver();
    }
}
