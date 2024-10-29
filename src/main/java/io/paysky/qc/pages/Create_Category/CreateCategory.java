package io.paysky.qc.pages.Create_Category;

import io.paysky.qc.utilities.selenium.DriverFactory;
import io.paysky.qc.utilities.testdata.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class CreateCategory {

    private WebDriver driver;

    Constant constant = new Constant();


    public CreateCategory() {
        driver = DriverFactory.getDriver();
    }

     public void AgeVerificationWithMin10Year()throws InterruptedException{
         Thread.sleep(5000);
         driver.findElement(By.xpath("//span[contains(.,'Categories Managers')]")).click();
         Thread.sleep(10000);
         driver.findElement(By.xpath("//ng-select/div/div/div[2]/input")).sendKeys(constant.ExistingCategory);
         driver.findElement(By.xpath("//div[contains(@class, 'ng-option-marked')]")).click();
         Thread.sleep(1000);
         driver.findElement(By.xpath("//img[@alt='Some textual description of gear.svg']")).click();
         Actions move = new Actions(driver);
         Thread.sleep(1000);
         WebElement AgeVerification = driver.findElement(By.xpath("//*[text() =' Age verification ']"));
         JavascriptExecutor js = (JavascriptExecutor) driver;
         js.executeScript("arguments[0].scrollIntoView(true);", AgeVerification);
         Thread.sleep(1000);
         WebElement AgeVerificationToggle = driver.findElement(By.xpath("//*[@id='mat-mdc-slide-toggle-3']"));
         if (AgeVerificationToggle.isSelected()) {

             driver.findElement(By.xpath("//span/p-inputnumber/span/input")).clear();
             Thread.sleep(500);

         } else {

             AgeVerificationToggle.click();


         }


         driver.findElement(By.xpath("//span/p-inputnumber/span/input")).sendKeys(constant.MinAge);
         WebElement SaveButton = driver.findElement(By.xpath("//*[@class='save-btn-valid']"));
         js.executeScript("arguments[0].scrollIntoView(true);", SaveButton);
        Thread.sleep(1000);
        SaveButton.click();



     }

    public void AgeVerificationWithMax122Year()throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(By.xpath("//span[contains(.,'Categories Managers')]")).click();
        Thread.sleep(10000);
        driver.findElement(By.xpath("//ng-select/div/div/div[2]/input")).sendKeys(constant.ExistingCategory);
        driver.findElement(By.xpath("//div[contains(@class, 'ng-option-marked')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//img[@alt='Some textual description of gear.svg']")).click();
        Actions move = new Actions(driver);
        Thread.sleep(1000);
        WebElement AgeVerification = driver.findElement(By.xpath("//*[text() =' Age verification ']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", AgeVerification);
        Thread.sleep(1000);
        WebElement AgeVerificationToggle = driver.findElement(By.xpath("//*[@id='mat-mdc-slide-toggle-3']"));
        if (!AgeVerificationToggle.isEnabled()) {

            AgeVerificationToggle.click();

        } else {
            driver.findElement(By.xpath("//span/p-inputnumber/span/input")).clear();
            Thread.sleep(500);


        }
        driver.findElement(By.xpath("//span/p-inputnumber/span/input")).sendKeys(constant.MaxAge);
        WebElement SaveButton = driver.findElement(By.xpath("//*[@class='save-btn-valid']"));
        js.executeScript("arguments[0].scrollIntoView(true);", SaveButton);
        Thread.sleep(1000);
        SaveButton.click();

    }



}
