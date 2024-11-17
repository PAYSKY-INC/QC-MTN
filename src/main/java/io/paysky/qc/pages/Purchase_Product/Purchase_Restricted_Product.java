package io.paysky.qc.pages.Purchase_Product;

import io.paysky.qc.utilities.selenium.DriverFactory;
import io.paysky.qc.utilities.testdata.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

import static org.testng.Assert.assertEquals;

public class Purchase_Restricted_Product {


    private WebDriver driver;

    Constant constant = new Constant();


    public Purchase_Restricted_Product() {
        driver = DriverFactory.getDriver();
    }


    public void PurchaseRestrictedProductWithValidAge() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(200));
        WebElement SideMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='header-zoom-container']/div/div/app-mtn-navbar/section/div/div/ul/li/a/div/app-mtn-side-menu/div/em")));
       SideMenu.click();
        driver.findElement(By.xpath("//div[@id='header-zoom-container']/div/div/app-mtn-navbar/section/div/div/ul/li/a/div/app-mtn-side-menu/div/p-sidebar/div/div[2]/div/div[3]/span")).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Thread.sleep(10000);
        WebElement BuyItNow = driver.findElement(By.xpath("//*[@id=\"zoom-container\"]/div/app-main-landing/div/app-category-products/section/div[2]/div/div[2]/a[2]/app-mtn-product-card/div/div[4]/button[1]"));

        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
      //  js.executeScript("arguments[0].scrollIntoView(true);",BuyItNow);
        wait.until(ExpectedConditions.elementToBeClickable(BuyItNow));
     //   WebElement buyNowButton = driver.findElement(By.xpath("//button[text()='Buy Now']"));
        BuyItNow.click();
        WebElement Validation = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='zoom-container']/div/app-main-landing/div/app-category-products/section/div[2]/div/div[2]/a[2]/app-mtn-product-card/app-age-consent-modal/p-dialog/div/div/div[3]/div/button/span")));
        Validation.click();
        Thread.sleep(20000);
     //   String ExpectedResult = "Successfully added to cart";
      //   String ActualResult = driver.findElement(By.xpath("/*[@class= 'ng-tns-c3223181091-0 p-toast p-component p-toast-top-right']")).getText();
     //   assertEquals(ExpectedResult, ActualResult);




    }

    public void PurchaseRestrictedProductWithInvalidAge() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
        WebElement SideMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='header-zoom-container']/div/div/app-mtn-navbar/section/div/div/ul/li/a/div/app-mtn-side-menu/div/em")));
        SideMenu.click();
        driver.findElement(By.xpath("//div[@id='header-zoom-container']/div/div/app-mtn-navbar/section/div/div/ul/li/a/div/app-mtn-side-menu/div/p-sidebar/div/div[2]/div/div[3]/span")).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Thread.sleep(10000);
        WebElement BuyItNow = driver.findElement(By.xpath("//*[@id=\"zoom-container\"]/div/app-main-landing/div/app-category-products/section/div[2]/div/div[2]/a[2]/app-mtn-product-card/div/div[4]/button[1]"));
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
        wait.until(ExpectedConditions.elementToBeClickable(BuyItNow));
        BuyItNow.click();
        Thread.sleep(1000);
        WebElement Validation = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='zoom-container']/div/app-main-landing/div/app-category-products/section/div[2]/div/div[2]/a[2]/app-mtn-product-card/app-age-consent-modal/p-dialog/div/div/div[3]/div/button[2]/span")));
        Validation.click();
        String ExpectedResult = "Sorry, you're ineligible to purchase this product!";
        String ActualResult = driver.findElement(By.xpath("//div[@id='zoom-container']/div/app-main-landing/div/app-category-products/section/div[2]/div/div[2]/a[2]/app-mtn-product-card/app-ineligable-purchase-modal/p-dialog/div/div/div[2]/div/div[2]")).getText();
        assertEquals(ExpectedResult, ActualResult);
        driver.findElement(By.xpath("//*[text()= 'OK']")).click();



    }
    public void CheckThatTheConfirmationPoPuPAppearAgainToAllTheProductsWhenDeclinedOnce() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
        WebElement SideMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='header-zoom-container']/div/div/app-mtn-navbar/section/div/div/ul/li/a/div/app-mtn-side-menu/div/em")));
        SideMenu.click();
        driver.findElement(By.xpath("//div[@id='header-zoom-container']/div/div/app-mtn-navbar/section/div/div/ul/li/a/div/app-mtn-side-menu/div/p-sidebar/div/div[2]/div/div[3]/span")).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Thread.sleep(10000);
        WebElement BuyItNow = driver.findElement(By.xpath("//*[@id=\"zoom-container\"]/div/app-main-landing/div/app-category-products/section/div[2]/div/div[2]/a[2]/app-mtn-product-card/div/div[4]/button[1]"));
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
        wait.until(ExpectedConditions.elementToBeClickable(BuyItNow));
        BuyItNow.click();
        WebElement Validation = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='zoom-container']/div/app-main-landing/div/app-category-products/section/div[2]/div/div[2]/a[2]/app-mtn-product-card/app-age-consent-modal/p-dialog/div/div/div[3]/div/button[2]/span")));
        Validation.click();
        driver.findElement(By.xpath("//*[text()= 'OK']")).click();
        driver.findElement(By.xpath("//div[@id='zoom-container']/div/app-main-landing/div/app-category-products/section/div[2]/div/div[2]/a/app-mtn-product-card/div/div[4]/button")).click();
        Thread.sleep(1000);
        String ExpectedResult = "Please Verify your age to buy this product.";
        String ActualResult = driver.findElement(By.xpath("//*[text()= 'Please Verify your age to buy this product.']")).getText();
        assertEquals(ExpectedResult, ActualResult);
    }

    public void CheckWhenUserAcceptAgeRestrictionForAgeShouldNotShowPopupForAllItemsThatAgelessThanThisAge() throws InterruptedException{
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
        WebElement SideMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='header-zoom-container']/div/div/app-mtn-navbar/section/div/div/ul/li/a/div/app-mtn-side-menu/div/em")));
        SideMenu.click();
        driver.findElement(By.xpath("//div[@id='header-zoom-container']/div/div/app-mtn-navbar/section/div/div/ul/li/a/div/app-mtn-side-menu/div/p-sidebar/div/div[2]/div/div[2]/span")).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Thread.sleep(10000);
        WebElement BuyItNow = driver.findElement(By.xpath("//div[@id='zoom-container']/div/app-main-landing/div/app-category-products/section/div[2]/div/div[2]/a/app-mtn-product-card/div/div[4]/button"));
        js.executeScript("arguments[0].scrollIntoView(true);",BuyItNow);
        wait.until(ExpectedConditions.elementToBeClickable(BuyItNow)).click();
        Thread.sleep(5000);
        WebElement AcceptValidation = driver.findElement(By.xpath("//div[@id='zoom-container']/div/app-main-landing/div/app-category-products/section/div[2]/div/div[2]/a/app-mtn-product-card/app-age-consent-modal/p-dialog/div/div/div[3]/div/button/span"));
        wait.until(ExpectedConditions.elementToBeClickable(AcceptValidation)).click();
        Thread.sleep(2000);
        SideMenu.click();
        driver.findElement(By.xpath("//div[@id='header-zoom-container']/div/div/app-mtn-navbar/section/div/div/ul/li/a/div/app-mtn-side-menu/div/p-sidebar/div/div[2]/div/div[3]/span")).click();
        Thread.sleep(10000);
        WebElement BuyItNowBtn = driver.findElement(By.xpath("//*[@id=\"zoom-container\"]/div/app-main-landing/div/app-category-products/section/div[2]/div/div[2]/a[2]/app-mtn-product-card/div/div[4]/button[1]"));
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
        wait.until(ExpectedConditions.elementToBeClickable(BuyItNowBtn));
        BuyItNowBtn.click();
        Thread.sleep(1000);
        String ExpectedResult = "https://momomarketstg.africa/Portal/cart";
        String ActualResult = driver.getCurrentUrl();
        assertEquals(ActualResult,ExpectedResult);

    }

    public void CheckAgeRestrictionPopupNotAppearsToProductsThatNotContainAgeRestrictions() throws InterruptedException{
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
        WebElement SideMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='header-zoom-container']/div/div/app-mtn-navbar/section/div/div/ul/li/a/div/app-mtn-side-menu/div/em")));
        SideMenu.click();
        driver.findElement(By.xpath("//div[@id='header-zoom-container']/div/div/app-mtn-navbar/section/div/div/ul/li/a/div/app-mtn-side-menu/div/p-sidebar/div/div[2]/div/div[4]/span")).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Thread.sleep(10000);
        WebElement BuyItNow = driver.findElement(By.xpath("//div[@id='zoom-container']/div/app-main-landing/div/app-category-products/section/div[2]/div/div[2]/a/app-mtn-product-card/div/div[4]/button"));
        js.executeScript("arguments[0].scrollIntoView(true);",BuyItNow);
        wait.until(ExpectedConditions.elementToBeClickable(BuyItNow)).click();
        Thread.sleep(10000);
        String ExpectedResult = "https://momomarketstg.africa/Portal/cart";
        String ActualResult = driver.getCurrentUrl();
        assertEquals(ActualResult,ExpectedResult);


    }
    public void CheckSubCategoryExtendBehaviorFromTheParent() throws InterruptedException{
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
        WebElement SideMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='header-zoom-container']/div/div/app-mtn-navbar/section/div/div/ul/li/a/div/app-mtn-side-menu/div/em")));
        SideMenu.click();
        WebElement Category = driver.findElement(By.xpath("//div[@id='header-zoom-container']/div/div/app-mtn-navbar/section/div/div/ul/li/a/div/app-mtn-side-menu/div/p-sidebar/div/div[2]/div/div[6]/span"));
        Category.click();
        Thread.sleep(10000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement BuyItNow = driver.findElement(By.cssSelector(".slide:nth-child(1) .mtn-product-card__card-buttons:nth-child(1)"));
      //  js.executeScript("arguments[0].scrollIntoView(true);",BuyItNow);
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
        wait.until(ExpectedConditions.elementToBeClickable(BuyItNow)).click();
        Thread.sleep(10000);
        String CategoryExpectedResult = "https://momomarketstg.africa/Portal/cart";
        String CategoryActualResult = driver.getCurrentUrl();
        assertEquals(CategoryActualResult,CategoryExpectedResult);
        Thread.sleep(10000);
        SideMenu.click();
        Actions actions = new Actions(driver);
        // Perform the hover action
        actions.moveToElement(driver.findElement(By.xpath("//div[@id='header-zoom-container']/div/div/app-mtn-navbar/section/div/div/ul/li/a/div/app-mtn-side-menu/div/p-sidebar/div/div[2]/div/div[6]/span"))).perform();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@id='header-zoom-container']/div/div/app-mtn-navbar/section/div/div/ul/li/a/div/app-mtn-side-menu/div/p-sidebar/div/div[2]/div[2]/div/div/div/div/span")).click();
        Thread.sleep(5000);
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
        driver.findElement(By.xpath("//div[@id='zoom-container']/div/app-main-landing/div/app-category-products/section/div[2]/div/div[2]/a[2]/app-mtn-product-card/div/div[4]/button")).click();
        Thread.sleep(10000);
        String SubCategoryExpectedResult = "https://momomarketstg.africa/Portal/cart";
        String SubCategoryActualResult = driver.getCurrentUrl();
        assertEquals(SubCategoryActualResult,SubCategoryExpectedResult);


    }




    }


