package io.paysky.qc.app_module.badges;

import io.paysky.qc.utils.AbstractSeleniumActions;
import org.openqa.selenium.By;

import java.nio.file.Paths;

public class BadgePage extends AbstractSeleniumActions {
    private final By badgeManagementOption =  By.xpath("//span[normalize-space()='Badge Management']");;
    private final By newButton = By.xpath("//button[normalize-space()='New']");
    private final By badgeNameTextField = By.xpath("(//label[normalize-space(text())='Badge name:']/following::input)[1]");
    private final By badgeDesktopImageField = By.xpath("(//div[@class='image-upload-category'])[1]");
    private final By badgeMobileImageField = By.xpath("(//div[@class='image-upload-category'])[2]");
    private final By addNewTagButton = By.xpath("//button[normalize-space()='+ Add new tag']");
    private final By selectTagDropdown = By.xpath("//div[@class='ng-select-container']");
    private final By searchTagTextField = By.xpath("//input[@aria-autocomplete='list']");
    private final By selectTagField = By.xpath("//div[@class='ng-option ng-star-inserted ng-option-marked']");
    private final By saveButton = By.xpath("//button[normalize-space()='Save']");
    private final String desktopImagePath = Paths.get("src/main/resources/new_arrivals_Desktop.png").toAbsolutePath().toString();
    private final String mobileImagePath = Paths.get("src/main/resources/new_arrivals_Mobile.png").toAbsolutePath().toString();


    public void openBadgeManagementScreen() throws Exception{
        Thread.sleep(10000);
        clickOnElement(badgeManagementOption, 25);
        Thread.sleep(10000);
    }

    public void clickOnNewButton() throws Exception{
        Thread.sleep(10000);
        clickOnElement(newButton, 25);
        Thread.sleep(10000);
    }

    public void clickOnBadgeNameTextField() throws Exception{
        Thread.sleep(10000);
        clickOnElement(badgeNameTextField, 25);
        Thread.sleep(10000);
    }
    public void enterBadgeNameTextField(String badgeName) throws Exception{
        typeText(badgeNameTextField, badgeName,25);
    }
    public void clickOnBadgeDesktopImageField() throws Exception{
        Thread.sleep(10000);
        clickOnElement(badgeDesktopImageField, 25);
        Thread.sleep(10000);
    }
    public void uploadDeskTopImage() throws Exception{
        Thread.sleep(20000);
        uploadImage(badgeDesktopImageField, desktopImagePath,25);
        Thread.sleep(20000);
    }
    public void clickOnBadgeMobileImageField() throws Exception{
        Thread.sleep(10000);
        clickOnElement(badgeMobileImageField, 25);
        Thread.sleep(10000);
    }
    public void uploadMobileImage() throws Exception{
        uploadImage(badgeMobileImageField, mobileImagePath,25);
    }
    public void clickOnAddNewTagButton() throws Exception{
        Thread.sleep(10000);
        clickOnElement(addNewTagButton, 25);
        Thread.sleep(10000);
    }
    public void clickOnSelectTagDropdown() throws Exception{
        Thread.sleep(10000);
        clickOnElement(selectTagDropdown, 25);
        Thread.sleep(10000);
    }
    public void selectTagField() throws Exception{
        Thread.sleep(10000);
        clickOnElement(selectTagField, 25);
        Thread.sleep(10000);
    }
    public void clickOnSaveButton() throws Exception{
        Thread.sleep(10000);
        clickOnElement(saveButton, 25);
        Thread.sleep(10000);
    }
}
