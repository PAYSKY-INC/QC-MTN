package io.paysky.qc.app_modules.tags;

import io.paysky.qc.utils.AbstractSeleniumActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class TagsPage extends AbstractSeleniumActions {


    private final By tagsButtonFromSideMenu = By.xpath("//span[normalize-space()='Tag Management']");
    private final By createNewTagPopupButton = By.xpath("//button[normalize-space()='New']");
    private final By tagNameTextField = By.xpath("//input[@class='add-update-modal__product-tags__tag-border__input__label-input ng-untouched ng-pristine ng-valid']");
    private final By tagClassificationRadioButton = By.xpath("//div[@class='add-update-modal__field-checkbox']//div[3]//p-radiobutton[1]//div[1]//div[2]");
    private final By saveButton = By.xpath("//button[normalize-space()='Save']");
    private final By SuccessAddTagButton = By.xpath("//span[@class='p-button-label']");


    public TagsPage openTagsScreenFromSideMenu() throws Exception {
        Thread.sleep(5000);
        clickOnElement(tagsButtonFromSideMenu, 25);
        Thread.sleep(3000);
        return this;
    }

    public TagsPage openCreateNewTagPopup() throws Exception {
        clickOnElement(createNewTagPopupButton, 20);
        Thread.sleep(3000);
        return this;

    }


    public TagsPage writeTagName(String tagName) throws Exception {
        typeText(tagNameTextField, tagName, 20);
        return this;
    }


    public TagsPage selectTagClassification() throws Exception {
        clickOnElement(tagClassificationRadioButton,20);
//        Thread.sleep(10000);
        return this;
    }

    public TagsPage clickSaveButton() throws Exception {
        clickOnElement(saveButton,10);
        Thread.sleep(3000);
        return this;
    }

    public TagsPage closeSuccessCreatingTags() throws Exception {
        clickOnElement(SuccessAddTagButton,10);
        return this;
    }


}
