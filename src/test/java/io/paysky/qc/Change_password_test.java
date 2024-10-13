package io.paysky.qc;

import io.paysky.qc.pages.Change_password.Change_password;
import io.paysky.qc.pages.Login.LoginPage;
import io.paysky.qc.pages.Logout.Logout;
import io.qameta.allure.Description;
import io.qameta.allure.Link;
import io.qameta.allure.Owner;
import io.qameta.allure.testng.Tag;

public class Change_password_test {

    final LoginPage loginPage = new LoginPage();
    final Logout logoutPage = new Logout();
    final Change_password ChangePassword = new Change_password();

    @org.testng.annotations.Test(priority = 1)
    @Description("check that the user can cancel the data enterd.")
    @Link("https://devops.paysky.io/DefaultCollection/Infinity/_workitems/edit/62758")
    @Owner("Mohamed Ehab")
    @Tag("End-To-End")

    public void ChanagePasswordCancelDataEntered() throws Exception {
        loginPage.Reload_page();
        loginPage.Valid_Login_with_admin_user();
        ChangePassword.Open_change_password();
        ChangePassword.Enter_change_password();
        ChangePassword.Cancel_Enter_change_password();
        logoutPage.Log_out();
    }

    @org.testng.annotations.Test(priority = 2)
    @Description("check that the user can change the old password (using merchant bank admin user for the first time)")
    @Link("https://devops.paysky.io/DefaultCollection/Infinity/_workitems/edit/62764")
    @Owner("Mohamed Ehab")
    @Tag("End-To-End")

    public void ChanageOldPassword() throws Exception {
        loginPage.Valid_Login_with_admin_user();
        ChangePassword.Open_change_password();
        ChangePassword.change_valid_password();
    }

}
