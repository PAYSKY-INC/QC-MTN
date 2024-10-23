package io.paysky.qc.pages.Dispatch_Order;

import io.paysky.qc.utilities.selenium.DriverFactory;
import io.paysky.qc.utilities.testdata.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class DispatchOrder {

    private WebDriver driver;

    public DispatchOrder() {
        driver = DriverFactory.getDriver();
    }

    public void Dispatch_Order() throws InterruptedException {
        driver.findElement(By.xpath("//a[contains(@href, '/MA/orders')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//input[@type='undefined'])[2]")).sendKeys(Constant.OrderNumber);
        Thread.sleep(5000);
        driver.findElement(By.cssSelector(".ng-dirty:nth-child(2)")).sendKeys(Keys.ENTER);
        Thread.sleep(5000);
        driver.findElement(By.xpath("//span/span")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("(//img[@alt='No Image'])[12]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[2]/app-button/div/button")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//button[contains(.,'Confirm dispatch')]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//button[contains(.,'OK')]")).click();
        Thread.sleep(5000);
    }

}
