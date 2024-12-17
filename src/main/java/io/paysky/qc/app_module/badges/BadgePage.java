package io.paysky.qc.app_module.badges;

import io.paysky.qc.utils.AbstractSeleniumActions;
import org.openqa.selenium.By;

public class BadgePage extends AbstractSeleniumActions {
    private final By badgeManagementOption = By.cssSelector("li.active.ng-star-inserted");
    private final By newButton = By.className("add-button");

    public void openBadgeManagementScreen() throws Exception{
        clickOnElement(badgeManagementOption, 25);
    }

    public void clickOnNewButton() throws Exception{
        clickOnElement(newButton, 25);
    }
}
