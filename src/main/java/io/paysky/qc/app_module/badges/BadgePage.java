package io.paysky.qc.app_module.badges;

import io.paysky.qc.utils.AbstractSeleniumActions;
import org.openqa.selenium.By;

import java.nio.file.Paths;

public class BadgePage extends AbstractSeleniumActions {
    private final By badgeManagementOption =  By.xpath("//span[normalize-space()='Badge Management']");;
    private final By newButton = By.xpath("//button[normalize-space()='New']");
    private final By badgeNameTextField = By.xpath("(//label[normalize-space(text())='Badge name:']/following::input)[1]");

    private final By badgeDesktopImageField = By.xpath("(//div[@class='image-upload-category']//img)[1]");
    private final By badgeMobileImageField = By.xpath("(//div[@class='image-upload-category']//img)[2]");
    private final By desktopImageSelector = By.xpath("(//input[@type='file'])[1]");
    private final By mobileImageSelector = By.xpath("(//input[@type='file'])[2]");
    private final String desktopImagePath = Paths.get("src/main/resources/new_arrivals_Desktop.png").toAbsolutePath().toString();
    private final String mobileImagePath = Paths.get("src/main/resources/new_arrivals_Mobile.png").toAbsolutePath().toString();

    private final By addNewTagButton = By.xpath("//button[normalize-space()='+ Add new tag']");
    private final By tagDropdownList = By.xpath("//div[@class='ng-select-container']");
    private final By selectTagOption = By.xpath("(//div[@role='option'])[1]");
    private final By saveButton = By.xpath("//button[normalize-space()='Save']");

    private final By successMsgOkButton = By.xpath("//span[normalize-space(text())='OK']");



    public void openBadgeManagementScreen() throws Exception{
        Thread.sleep(5000);
        clickOnElement(badgeManagementOption, 25);
        Thread.sleep(5000);
    }

    public void clickOnNewButton() throws Exception{
        Thread.sleep(5000);
        clickOnElement(newButton, 25);
    }

    public void clickOnBadgeNameTextField() throws Exception{
        Thread.sleep(5000);
        clickOnElement(badgeNameTextField, 25);
    }
    public void enterBadgeNameTextField(String badgeName) throws Exception{
        typeText(badgeNameTextField, badgeName,25);
    }
    public void clickOnBadgeDesktopImageField() throws Exception{
        Thread.sleep(5000);
        clickOnElement(badgeDesktopImageField, 25);
    }
    public void uploadDeskTopImage() throws Exception{
        uploadImage(desktopImageSelector, desktopImagePath,25);
    }
    public void clickOnBadgeMobileImageField() throws Exception{
        Thread.sleep(5000);
        clickOnElement(badgeMobileImageField, 25);
    }
    public void uploadMobileImage() throws Exception{
        uploadImage(mobileImageSelector, mobileImagePath,25);
    }
    public void clickOnAddNewTagButton() throws Exception{
        Thread.sleep(5000);
        clickOnElement(addNewTagButton, 25);
    }
    public void clickOnTagDropdownList() throws Exception{
        Thread.sleep(5000);
        clickOnElement(tagDropdownList, 25);
    }
    public void selectTag() throws Exception{
        Thread.sleep(5000);
        clickOnElement(selectTagOption, 25);
    }
    public void clickOnSaveButton() throws Exception{
        Thread.sleep(5000);
        clickOnElement(saveButton, 25);
    }
    public void clickOnSuccessPopupOkButton() throws Exception{
        Thread.sleep(5000);
        clickOnElement(successMsgOkButton, 25);
    }
}
