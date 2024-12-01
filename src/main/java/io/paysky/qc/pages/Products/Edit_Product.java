package io.paysky.qc.pages.Products;

import io.paysky.qc.utilities.selenium.DriverFactory;
import io.paysky.qc.utilities.sharedComponent.SharedComponent;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Edit_Product {

    WebDriver driver;
    WebDriverWait wait;
    SharedComponent sharedComponent;

    public Edit_Product() {
        driver = DriverFactory.getDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(500));  // Initialize wait with a timeout
    }



    // Actions
    public void clickOnMarketPlace() {
        WebElement SideMenu_MarketPlace = driver.findElement(By.cssSelector(".ng-star-inserted:nth-child(3) > .ng-star-inserted > .d-flex > .ng-star-inserted"));
        wait.until(ExpectedConditions.elementToBeClickable(SideMenu_MarketPlace)).click();
    }

    public void clickOnProductsTab() {
        WebElement ProductsTab = driver.findElement(By.xpath("//span[contains(.,'Products')]"));
        wait.until(ExpectedConditions.elementToBeClickable(ProductsTab)).click();
    }

    public void openStatusSearchDD() {
        WebElement Status_Search = driver.findElement(By.xpath("//p-dropdown/div/div[2]"));
        wait.until(ExpectedConditions.elementToBeClickable(Status_Search)).click();
    }

    public void chooseUnderReviewStatus() {
        WebElement UnderReview_Option = driver.findElement(By.xpath("//ul[@id='pr_id_5_list']/p-dropdownitem[2]/li/div"));
        wait.until(ExpectedConditions.elementToBeClickable(UnderReview_Option)).click();
    }

    public void chooseRejectedStatus() {
        WebElement Rejected_Option = driver.findElement(By.xpath("//ul[@id='pr_id_5_list']/p-dropdownitem[4]/li/div"));
        wait.until(ExpectedConditions.elementToBeClickable(Rejected_Option)).click();
    }

    public void clickOnEditIconForUnderReviewProduct() {
        WebElement EditIcon_UnderReviewProduct = driver.findElement(By.xpath("//table[@id='pr_id_2-table']/tbody/tr[5]/td[10]/p-button/button/img"));
        wait.until(ExpectedConditions.elementToBeClickable(EditIcon_UnderReviewProduct)).click();
    }
    public void clickOnEditWeightIcon(){
        WebElement WeightEditIcon = driver.findElement(By.xpath("//div[7]/div/span/a/img"));
        wait.until(ExpectedConditions.elementToBeClickable(WeightEditIcon));
        Actions builder = new Actions(driver);
        builder.doubleClick(WeightEditIcon).perform();
    }

    public void enterWeight(){
        WebElement WeightField = driver.findElement(By.xpath("//p-inputnumber/span/input"));
        wait.until(ExpectedConditions.elementToBeClickable(WeightField)).clear();
        WeightField.click();
        WebElement inputElement = driver.findElement(By.cssSelector("input.p-inputtext.p-component.p-element.p-inputnumber-input"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].removeAttribute('disabled')", inputElement);
        inputElement.sendKeys("5");
    }

   public void enableBestSeller(){
        WebElement BestSellerToggle = driver.findElement(By.cssSelector("#mat-mdc-slide-toggle-2-button > .mdc-switch__track"));
        wait.until(ExpectedConditions.elementToBeClickable(BestSellerToggle)).click();
   }

    // Methods
    public void editUnderReviewProduct() throws InterruptedException {
        clickOnMarketPlace();
        Thread.sleep(10000);
        clickOnProductsTab();
        Thread.sleep(10000);
        openStatusSearchDD();
        chooseUnderReviewStatus();
        Thread.sleep(5000);
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        WebElement scrollableUpDown = driver.findElement(By.xpath("/html/body/app-root/app-marketplace/app-sidebar/div/div[2]"));
        jsExecutor.executeScript("arguments[0].scrollTop += arguments[1];", scrollableUpDown, 500);
        WebElement scrollableRightLeft = driver.findElement(By.className("p-datatable-wrapper"));
        jsExecutor.executeScript("arguments[0].scrollLeft += arguments[1];", scrollableRightLeft, 300);
        clickOnEditIconForUnderReviewProduct();
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement SalePriceLabel = driver.findElement(By.xpath("//label[contains(.,'Sale Price')]"));
      js.executeScript("arguments[0].scrollIntoView(true);",SalePriceLabel);
       jsExecutor.executeScript("window.scrollBy(0, arguments[0]);", 500);

       // js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
        clickOnEditWeightIcon();
        enterWeight();
      //  js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
      //  enableBestSeller();



    }
}