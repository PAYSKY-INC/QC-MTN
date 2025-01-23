package io.paysky.qc.pages.Create_Email_Notification;

import io.paysky.qc.utilities.selenium.DriverFactory;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CreateEmailNotification {
    private final WebDriver driver;

    // Constructor to initialize WebDriver
    public CreateEmailNotification() {
        this.driver = DriverFactory.getDriver();
    }

    // Helper method to wait for an element to be visible
    private WebElement waitForElement(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    // Helper method to fill the Subject field
    private void fillSubjectField(String subject) {
        WebElement subjectField = waitForElement(By.xpath("//textarea[@title='Subject']"));
        subjectField.clear();
        subjectField.sendKeys(subject);
    }

    // Method to click the "Add" button to save the notification
    public void addNotification() {
        WebElement addButton = waitForElement(By.xpath("/html/body/app-root/app-notifications-details/app-sidebar/div/div[2]/div/div[3]/div/button"));
        addButton.click();
    }

    // Method to check if the success popup is displayed
    public boolean isPopupDisplayed() {
        try {
            WebElement popup = new WebDriverWait(driver, Duration.ofSeconds(10))
                    .until(ExpectedConditions.visibilityOfElementLocated(
                            By.xpath("/html/body/modal-container/div[2]/div/app-message-modal/div/div[2]")));
            return popup.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    // Method to create and save an email notification
    public void createAndSaveEmailNotification(String subject) throws InterruptedException {
        // Step 1: Navigate to the Notifications page
        driver.findElement(By.xpath("/html/body/app-root/app-fee-management/app-sidebar/div/div[1]/div/ul[8]/li/a/span")).click();
        Thread.sleep(10000);

        // Step 2: Click on "Add" to create a new notification
        driver.findElement(By.xpath("/html/body/app-root/app-notifications/app-sidebar/div/div[2]/div/div[1]/div[2]/button"))
                .click();
        Thread.sleep(2000);

        // Step 3: Select the "Email" channel
        driver.findElement(By.xpath("/html/body/app-root/app-notifications-details/app-sidebar/div/div[2]/div/div[2]/form/div/div[4]/app-select-dropdown/field-container/div/select"))
                .click();
        driver.findElement(By.xpath("/html/body/app-root/app-notifications-details/app-sidebar/div/div[2]/div/div[2]/form/div/div[4]/app-select-dropdown/field-container/div/select/option[2]"))
                .click();

        // Step 4: Fill the Subject field
        fillSubjectField(subject);

        // Step 5: Save the notification
        addNotification();

        // Step 6: Verify if the popup is displayed
        if (isPopupDisplayed()) {
            System.out.println("Success: Email notification created successfully.");
        } else {
            System.out.println("Fail: Email notification was not created.");
        }
    }
}
