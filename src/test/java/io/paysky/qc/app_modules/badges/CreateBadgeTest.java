package io.paysky.qc.app_modules.badges;

import io.paysky.qc.app_module.badges.BadgePage;
import io.paysky.qc.app_modules.general_scenarios.GeneralLogin;
import io.paysky.qc.utilities.DataFaker;
import io.paysky.qc.utils.BaseTest;
import io.paysky.qc.utils.UserConfig;
import io.paysky.qc.utils.UserRouting;
import io.qameta.allure.*;
import org.testng.annotations.Test;

public class CreateBadgeTest extends BaseTest {

    BadgePage badgePage = new BadgePage();
    DataFaker faker = new DataFaker();

    @Test(description = "Create Badge")
    @Epic("EPIC NAME AND ID")
    @Story("68076: [Backoffice] Create Badge")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Create New Badge with Valid Data")
    @Link(value = "ID 69097",type = "Testcase",url ="https://devops.paysky.io/DefaultCollection/MTN%20PRODUCT/_testPlans/execute?planId=68943&suiteId=68948")
    @Owner("Nada")
    public void  addNewBadgeWithValidData() throws Exception {
        UserRouting.selectUserType(UserConfig.USERENUM.OPERATION);
        GeneralLogin.loginWithUser();

        badgePage.openBadgeManagementScreen();
        badgePage.clickOnNewButton();
        badgePage.clickOnBadgeNameTextField();
        badgePage.enterBadgeNameTextField(faker.badgeName());
        badgePage.clickOnBadgeDesktopImageField();
        badgePage.uploadDeskTopImage();
        badgePage.clickOnBadgeMobileImageField();
        badgePage.uploadMobileImage();
        badgePage.clickOnAddNewTagButton();
        badgePage.clickOnTagDropdownList();
        badgePage.selectTag();
        badgePage.clickOnSaveButton();
        badgePage.clickOnSuccessPopupOkButton();
        Thread.sleep(5000);
    }

    @Test(description = "Create Badge with inactive status")
    @Epic("EPIC NAME AND ID")
    @Story("68076: [Backoffice] Create Badge")
    @Severity(SeverityLevel.NORMAL)
    @Description("Create New Badge with Valid Data where its display status on product is inactive")
    @Link(value = "ID 71557",type = "Testcase",url ="https://devops.paysky.io/DefaultCollection/MTN%20PRODUCT/_workitems/edit/71557")
    @Owner("Nada")
    public void  addNewBadgeWithValidDataWithInActiveStatus() throws Exception {
        UserRouting.selectUserType(UserConfig.USERENUM.OPERATION);
        GeneralLogin.loginWithUser();

        badgePage.openBadgeManagementScreen();
        badgePage.clickOnNewButton();
        badgePage.clickOnBadgeNameTextField();
        badgePage.enterBadgeNameTextField(faker.badgeName());
        badgePage.clickOnBadgeDesktopImageField();
        badgePage.uploadDeskTopImage();
        badgePage.clickOnBadgeMobileImageField();
        badgePage.uploadMobileImage();
        badgePage.clickOnAddNewTagButton();
        badgePage.clickOnTagDropdownList();
        badgePage.selectTag();
        badgePage.clickOnDisplayOnProductToggle();
        badgePage.clickOnSaveButton();
        badgePage.clickOnSuccessPopupOkButton();
        Thread.sleep(5000);
    }



}
