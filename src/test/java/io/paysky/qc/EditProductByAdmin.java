package io.paysky.qc;
import io.paysky.qc.pages.Create_Category.CreateCategory;
import io.paysky.qc.pages.Login.LoginPage;
import io.paysky.qc.pages.Logout.Logout;
import io.paysky.qc.pages.OnboardingPage;
import io.paysky.qc.pages.Products.Edit_Product;
import io.qameta.allure.Description;
import io.qameta.allure.Link;
import io.qameta.allure.Owner;
import org.testng.annotations.Test;

public class EditProductByAdmin {

    OnboardingPage onboardingPage = new OnboardingPage();
    LoginPage loginPage = new LoginPage();
    Edit_Product edit = new Edit_Product();
    Logout logout = new Logout();

    @Test(priority = 1, groups = {"End-To-End"})
    @Description("Operation Admin can edit Under Review and Rejected Items only")
    @Link("https://devops.paysky.io/DefaultCollection/MTN%20PRODUCT/_workitems/edit/66160")
    @Owner("Eman Mohamed")
    public void editUnderReviewProduct() throws InterruptedException {
        onboardingPage.setUp();
        loginPage.Login_operation_user();
        edit.editUnderReviewProduct();
        logout.Log_out_operation_portal();
    }
}