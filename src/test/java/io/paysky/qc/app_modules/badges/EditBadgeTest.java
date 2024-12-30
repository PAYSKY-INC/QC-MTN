package io.paysky.qc.app_modules.badges;

import io.paysky.qc.app_module.badges.BadgePage;
import io.paysky.qc.app_modules.general_scenarios.GeneralLogin;
import io.paysky.qc.utilities.DataFaker;
import io.paysky.qc.utils.BaseTest;
import io.paysky.qc.utils.UserConfig;
import io.paysky.qc.utils.UserRouting;
import io.qameta.allure.*;
import org.testng.annotations.Test;

public class EditBadgeTest extends BaseTest {
    BadgePage badgePage = new BadgePage();
    DataFaker faker = new DataFaker();

    @Test(description = "Edit badge")
    @Epic("EPIC NAME AND ID")
    @Story("68077: [Backoffice] Edit Badge")
    @Severity(SeverityLevel.NORMAL)
    @Description("Edit badge an old created badge Name to a new name")
    @Link(value = "ID 69208",type = "Testcase",url ="https://devops.paysky.io/DefaultCollection/MTN%20PRODUCT/_workitems/edit/69208")
    @Owner("Nada")
    public void editBadgeName()throws Exception{
        UserRouting.selectUserType(UserConfig.USERENUM.OPERATION);
        GeneralLogin.loginWithUser();

        badgePage.openBadgeManagementScreen();
        badgePage.clickOnEditBadgeIcon();
        badgePage.clickOnBadgeNameTextField();
        badgePage.clearBadgeNameText();
        badgePage.enterBadgeNameTextField(faker.badgeName());
        badgePage.clickOnSaveButton();
        badgePage.clickOnSuccessPopupOkButton();
        Thread.sleep(5000);

    }
}
