package io.paysky.qc.pages.Purchase_Product;

import io.paysky.qc.utilities.selenium.DriverFactory;
import io.paysky.qc.utilities.testdata.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Purchase_Restricted_Product {

    private WebDriver driver;

    public Purchase_Restricted_Product() {
        driver = DriverFactory.getDriver();
    }

    public void PurchaseRestrictedProduct() throws InterruptedException {
        Thread.sleep(10000);
        driver.findElement((By.xpath("//div[@id='header-zoom-container']/div/div/app-mtn-navbar/section/div/div/ul/li/a/div/app-mtn-side-menu/div/em")));
        driver.findElement(By.cssSelector("d-inline-flex:nth-child(3) > .sidebar-categories__category__item"));
        Thread.sleep(5000);
        driver.findElement(By.cssSelector(".slide:nth-child(1) .mtn-product-card__card-buttons:nth-child(1)"));
    };
}
