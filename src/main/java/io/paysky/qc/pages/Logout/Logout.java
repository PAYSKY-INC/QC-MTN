package io.paysky.qc.pages.Logout;

import io.paysky.qc.utilities.selenium.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Logout {

    private WebDriver driver;

    public Logout() {
        driver = DriverFactory.getDriver();
    }

    public void Log_out_merchant_portal() throws InterruptedException {
        driver.findElement(By.xpath("//a[contains(@href, '#')]")).click();
        Thread.sleep(5000);
    }

    public void Log_out_operation_portal() throws InterruptedException {
        driver.findElement(By.xpath("//a[contains(@href, '#')]")).click();
        Thread.sleep(5000);
    }

    public void Close_driver() throws InterruptedException {
        driver.close();
    }

}