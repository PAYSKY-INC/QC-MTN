package io.paysky.qc.pages.Approve_Product;

import io.paysky.qc.utilities.selenium.DriverFactory;
import io.paysky.qc.utilities.testdata.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ApproveProduct {

    private WebDriver driver;

    public ApproveProduct() {
        driver = DriverFactory.getDriver();
    }

    public void Approve_Product() throws InterruptedException {
        driver.findElement(By.xpath("(//img[@alt='No Image'])[4]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//span[contains(.,'Products')]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@type='text']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys(Constant.ProductName);
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//img[@alt='No Image'])[17]")).click();
        Thread.sleep(8000);
        driver.findElement(By.xpath("(//img[@alt='No Image'])[16]")).click();
        Thread.sleep(8000);
        driver.findElement(By.xpath("//span[contains(.,'Go to product list')]")).click();
        Thread.sleep(5000);
    }

}
