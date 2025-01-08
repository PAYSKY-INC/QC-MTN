package io.paysky.qc.app_modules.tags;

import io.paysky.qc.app_modules.general_scenarios.GeneralLogin;
import io.paysky.qc.utils.BaseTest;
import io.paysky.qc.utils.UserConfig;
import io.paysky.qc.utils.UserRouting;
import io.qameta.allure.*;
import org.testng.annotations.Test;

public class TagsTests extends BaseTest {


    TagsPage tagsPage = new TagsPage();

    @Test(description = "Delete Role")
    @Epic("EPIC NAME AND ID")
    @Story("STORY NAME AND ID")
    @Severity(SeverityLevel.CRITICAL)
    @Description("DESCRIPTION")
    @Link(value = "ID FOR AZURE", type = "Testcase", url = "ISSUE URL")
    @Owner("Ayman")
    public void createTagWithValidData() throws Exception {
        UserRouting.selectUserType(UserConfig.USERENUM.OPERATION);
        GeneralLogin.loginWithUser();

        tagsPage
                .openTagsScreenFromSideMenu()
                .openCreateNewTagPopup()
                .writeTagName("Tag Fully Created by Automation")
                .selectTagClassification()
                .clickSaveButton()
                .closeSuccessCreatingTags();
    }





}
