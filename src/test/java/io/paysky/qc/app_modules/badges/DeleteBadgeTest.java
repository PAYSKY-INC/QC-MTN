package io.paysky.qc.app_modules.badges;

import io.paysky.qc.app_module.badges.BadgePage;
import io.paysky.qc.app_modules.general_scenarios.GeneralLogin;
import io.paysky.qc.utils.BaseTest;
import io.paysky.qc.utils.UserConfig;
import io.paysky.qc.utils.UserRouting;
import io.qameta.allure.*;
import org.testng.annotations.Test;

public class DeleteBadgeTest extends BaseTest {
    BadgePage badgePage = new BadgePage();

    @Test(description = "Delete Badge")
    @Epic("EPIC NAME AND ID")
    @Story("68079: [Backoffice] Delete Badge")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Delete an already created badge")
    @Link(value = "ID 69117",type = "Testcase",url ="https://devops.paysky.io/DefaultCollection/MTN%20PRODUCT/_workitems/edit/69117")
    @Owner("Nada")
    public void  deleteAnCreatedBadge() throws Exception {
        UserRouting.selectUserType(UserConfig.USERENUM.OPERATION);
        GeneralLogin.loginWithUser();

        badgePage.openBadgeManagementScreen();
        badgePage.clickOnDeleteBadgeIcon();
        badgePage.clickOnProceedDeleteButton();
        badgePage.clickOnSuccessPopupOkButton();
        Thread.sleep(5000);

    }
}
