package io.paysky.qc.pages.Create_New_Product;

import io.paysky.qc.utilities.selenium.DriverFactory;
import io.paysky.qc.utilities.sharedComponent.SharedComponent;
import io.paysky.qc.utilities.testdata.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.nio.file.Paths;

public class CreateNewProduct {

    private WebDriver driver;

    public CreateNewProduct() {
        driver = DriverFactory.getDriver();
    }

    public void createNewProduct() throws InterruptedException {
        driver.findElement(By.xpath("//a[contains(@href, '/MA/products/catalog')]")).click();
        Thread.sleep(8000);
        driver.findElement(By.xpath("//button[contains(.,' Add Product')]")).click();
        Thread.sleep(8000);
        driver.findElement(By.cssSelector("input:nth-child(1)")).click();
        driver.findElement(By.xpath("//span[contains(.,'PaySky')]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//input[@type=\'text\'])[2]")).click();
        String Product_name = SharedComponent.getRandomNumberString();
        driver.findElement(By.xpath("(//input[@type=\'text\'])[2]")).sendKeys(Product_name);
        Constant.ProductName = Product_name;
        driver.findElement(By.xpath("(//input[@type=\'text\'])[3]")).click();
        driver.findElement(By.xpath("(//input[@type=\'text\'])[3]")).sendKeys(SharedComponent.getRandomNumberString());
        driver.findElement(By.xpath("//input[@type='number']")).click();
        driver.findElement(By.xpath("//input[@type='number']")).sendKeys("100");
        driver.findElement(By.xpath("(//input[@type='number'])[2]")).click();
        driver.findElement(By.xpath("(//input[@type='number'])[2]")).sendKeys("1");
        driver.findElement(By.xpath("(//input[@type='text'])[4]")).click();
        driver.findElement(By.xpath("/html/body/app-root/app-add-product/app-sidebar/div/div[2]/div[2]/form/div[1]/div[1]/div[2]/div[5]/div/div[2]/ng-select/div/div/div[3]")).click();
        driver.findElement(By.xpath("//span[contains(.,'g')]")).click();
        driver.findElement(By.xpath("(//input[@type='number'])[3]")).click();
        driver.findElement(By.xpath("(//input[@type='number'])[3]")).sendKeys("10");
        driver.findElement(By.xpath("(//input[@type='number'])[7]")).click();
        driver.findElement(By.xpath("(//input[@type='number'])[7]")).sendKeys("30000");
        driver.findElement(By.id("floatingTextarea")).click();
        driver.findElement(By.id("floatingTextarea")).sendKeys("Description");
        String absolutePath = Paths.get("src/main/resources/image.jpeg").toAbsolutePath().toString();
        driver.findElement(By.xpath("//input[@type='file']")).sendKeys(absolutePath);
        Thread.sleep(8000);
        driver.findElement(By.xpath("//button[contains(.,'Next')]")).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("#mat-mdc-slide-toggle-1-button .mdc-switch__icon--off")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[contains(.,'Confirm')]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[contains(.,'Ok')]")).click();
        Thread.sleep(5000);
    }
}
