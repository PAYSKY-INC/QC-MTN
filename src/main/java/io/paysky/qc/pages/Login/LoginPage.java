package io.paysky.qc.pages.Login;

import io.paysky.qc.GlobalProperties;
import io.paysky.qc.utilities.selenium.DriverFactory;
import io.paysky.qc.utilities.testdata.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class LoginPage {

    private WebDriver driver;

    public LoginPage() {
        driver = DriverFactory.getDriver();
    }

    public void Login_merchant_user() throws InterruptedException {
        driver.get(GlobalProperties.getProperty("Merchant_Portal"));
        Thread.sleep(10000);
        driver.findElement(By.id("phone")).sendKeys(Constant.Merchant_user);
        driver.findElement(By.xpath("/html/body/app-root/app-mobile-verification/div/div/div/div[5]/div/app-button/div/button")).click();
        Thread.sleep(5000);
        driver.findElement(By.id("mat-input-0")).sendKeys(Constant.Merchant_password);
        driver.findElement(By.xpath("/html/body/app-root/app-login/div/div/div/div/form/div[2]/div[2]/app-button/div/button")).click();
        Thread.sleep(10000);
    }

    public void Login_operation_user() throws InterruptedException {
        driver.get(GlobalProperties.getProperty("Operation_Portal"));
        Thread.sleep(20000);
        driver.findElement(By.id("mat-input-0")).click();
        driver.findElement(By.cssSelector("#mat-option-3 .country-list-item")).click();
        driver.findElement(By.id("input")).sendKeys(Constant.Operation_user);
        driver.findElement(By.cssSelector(".input-group > #input")).sendKeys(Constant.Operation_password);
        Thread.sleep(5000);
        driver.findElement(By.cssSelector(".block")).click();
        Thread.sleep(5000);
    }

    public void Login_admin_user() throws InterruptedException {
        driver.get(GlobalProperties.getProperty("Admin_Portal"));
        Thread.sleep(10000);
        driver.findElement(By.id("mat-input-0")).click();
        driver.findElement(By.cssSelector("#mat-option-3 .country-list-item")).click();
        driver.findElement(By.id("input")).sendKeys(Constant.Admin_user);
        driver.findElement(By.cssSelector(".input-group > #input")).sendKeys(Constant.Admin_password);
        driver.findElement(By.cssSelector(".block")).click();
        Thread.sleep(5000);
    }

    public void Login_customer_user() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(500));
        driver.get(GlobalProperties.getProperty("Customer_Portal"));
        Thread.sleep(5000);
       WebElement element1=  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/modal-container/div[2]/div/app-cookie-modal/div/div/div[4]/button[1]")));
        element1.click();
        driver.findElement(By.xpath("/html/body/app-root/app-mtn-tenant-configuration/div/div[2]/div[2]/div/div/div[2]/div[3]/img")).click();
        Thread.sleep(20500);
        driver.get(GlobalProperties.getProperty("Customer_Portal_Login"));
        driver.get(GlobalProperties.getProperty("Customer_Portal_Login"));
        WebElement CustomerUser = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("phone")));
        Thread.sleep(10000);
      CustomerUser.sendKeys(Constant.Customer_user);
        driver.findElement(By.cssSelector(".p-inputtext")).sendKeys(Constant.Customer_password);
     /*   driver.findElement(By.cssSelector(".p-button-label")).click();
        Thread.sleep(10000);
        {
            WebElement element = driver.findElement(By.cssSelector(".p-button-label"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        {
            WebElement element = driver.findElement(By.tagName("body"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element, 0, 0).perform();
        }

      */
        Thread.sleep(20000);
    }

}