package io.paysky.qc.app_modules.tags;

import io.paysky.qc.utils.AbstractSeleniumActions;
import org.openqa.selenium.By;

public class TagsPage extends AbstractSeleniumActions {

    private final By forgetPasswordButton=By.id("confirmation-dialog-confirm-btn");


    public void openForgetPasswordScreen() throws Exception {
        clickOnElement(forgetPasswordButton,25);

    }


}
