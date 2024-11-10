package io.paysky.qc.pages.Create_Category;

import io.paysky.qc.utilities.DataFaker;
import io.paysky.qc.utilities.selenium.DriverFactory;
import io.paysky.qc.utilities.testdata.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.nio.file.Paths;
import java.time.Duration;
import java.util.List;

import static org.testng.Assert.assertEquals;

public class CreateCategory {

    private WebDriver driver;

    Constant constant = new Constant();
    DataFaker faker = new DataFaker();
    WebDriverWait wait ;


    public CreateCategory() {
        driver = DriverFactory.getDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(200));

    }

    // Locators
    By Categories_Managers = By.xpath("//span[contains(.,'Categories Managers')]");
    By SearchField = By.xpath("//ng-select/div/div/div[2]/input");


    public void AgeVerificationWithMin10Year() throws InterruptedException {
        wait.until(ExpectedConditions.elementToBeClickable(Categories_Managers)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(SearchField)).sendKeys(constant.ExistingCategory);
        Thread.sleep(5000);
        driver.findElement(By.xpath("//div[contains(@class, 'ng-option-marked')]")).click();
        Thread.sleep(10000);
        driver.findElement(By.xpath("//img[@alt='Some textual description of gear.svg']")).click();

        Actions move = new Actions(driver);
        Thread.sleep(1000);

        WebElement AgeVerification = driver.findElement(By.xpath("//*[text() =' Age verification ']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", AgeVerification);
        Thread.sleep(1000);

        // Find all elements with aria-checked
        List<WebElement> ariaCheckedElements = driver.findElements(By.xpath("//*[@aria-checked]"));

        // Check if there are at least 8 occurrences
        if (ariaCheckedElements.size() >= 8) {
            // Get the eighth element (index 7)
            WebElement eighthElement = ariaCheckedElements.get(7);
            boolean toggleState = Boolean.parseBoolean(eighthElement.getAttribute("aria-checked"));

            if (toggleState) {
                driver.findElement(By.xpath("//span/p-inputnumber/span/input")).clear();
                Thread.sleep(5000);
            } else {
                eighthElement.click();
            }
        } else {
            System.out.println("Less than 8 occurrences of aria-checked found.");
        }

        driver.findElement(By.xpath("//span/p-inputnumber/span/input")).sendKeys(constant.MinAge);
        WebElement SaveButton = driver.findElement(By.xpath("//*[@class='save-btn-valid']"));
        js.executeScript("arguments[0].scrollIntoView(true);", SaveButton);
        Thread.sleep(1000);
        SaveButton.click();
        Thread.sleep(1000);
    }

    public void AgeVerificationWithMax122Year()throws InterruptedException {
        Thread.sleep(10000);
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

        // Find all elements with aria-checked
        List<WebElement> ariaCheckedElements = driver.findElements(By.xpath("//*[@aria-checked]"));

        // Check if there are at least 8 occurrences
        if (ariaCheckedElements.size() >= 8) {
            // Get the eighth element (index 7)
            WebElement eighthElement = ariaCheckedElements.get(7);
            boolean toggleState = Boolean.parseBoolean(eighthElement.getAttribute("aria-checked"));

            if (toggleState) {
                driver.findElement(By.xpath("//span/p-inputnumber/span/input")).clear();
                Thread.sleep(5000);
            } else {
                eighthElement.click();
            }
        } else {
            System.out.println("Less than 8 occurrences of aria-checked found.");
        }

        driver.findElement(By.xpath("//span/p-inputnumber/span/input")).sendKeys(constant.MaxAge);
        WebElement SaveButton = driver.findElement(By.xpath("//*[@class='save-btn-valid']"));
        js.executeScript("arguments[0].scrollIntoView(true);", SaveButton);
        Thread.sleep(1000);
        SaveButton.click();
    }

   public void AgeVerificationWithInvalidMinValue() throws Exception {
       Thread.sleep(10000);
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

       // Find all elements with aria-checked
       List<WebElement> ariaCheckedElements = driver.findElements(By.xpath("//*[@aria-checked]"));

       // Check if there are at least 8 occurrences
       if (ariaCheckedElements.size() >= 8) {
           // Get the eighth element (index 7)
           WebElement eighthElement = ariaCheckedElements.get(7);
           boolean toggleState = Boolean.parseBoolean(eighthElement.getAttribute("aria-checked"));

           if (toggleState) {
               driver.findElement(By.xpath("//span/p-inputnumber/span/input")).clear();
               Thread.sleep(5000);
           } else {
               eighthElement.click();
           }
       } else {
           System.out.println("Less than 8 occurrences of aria-checked found.");
       }

       driver.findElement(By.xpath("//span/p-inputnumber/span/input")).sendKeys(constant.InvalidMinAge);
       WebElement SaveButton = driver.findElement(By.xpath("//*[@class='save-btn-valid']"));
       js.executeScript("arguments[0].scrollIntoView(true);", SaveButton);
       Thread.sleep(1000);
       SaveButton.click();

       String ExpectedValidation = "Please enter a valid age from 10 to 122";
       String ActualValidation = driver.findElement(By.xpath("//*[text()= 'Please enter a valid age from 10 to 122']")).getText();
       assertEquals(ExpectedValidation, ActualValidation);

   }

   public void AgeVerificationWithInvalidMaxValue() throws Exception{
       Thread.sleep(10000);
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

       // Find all elements with aria-checked
       List<WebElement> ariaCheckedElements = driver.findElements(By.xpath("//*[@aria-checked]"));

       // Check if there are at least 8 occurrences
       if (ariaCheckedElements.size() >= 8) {
           // Get the eighth element (index 7)
           WebElement eighthElement = ariaCheckedElements.get(7);
           boolean toggleState = Boolean.parseBoolean(eighthElement.getAttribute("aria-checked"));

           if (toggleState) {
               driver.findElement(By.xpath("//span/p-inputnumber/span/input")).clear();
               Thread.sleep(5000);
           } else {
               eighthElement.click();
           }
       } else {
           System.out.println("Less than 8 occurrences of aria-checked found.");
       }

       driver.findElement(By.xpath("//span/p-inputnumber/span/input")).sendKeys(constant.InvalidMaxAge);
       WebElement SaveButton = driver.findElement(By.xpath("//*[@class='save-btn-valid']"));
       js.executeScript("arguments[0].scrollIntoView(true);", SaveButton);
       Thread.sleep(1000);
       SaveButton.click();

       String ExpectedValidation = "Please enter a valid age from 10 to 122";
       String ActualValidation = driver.findElement(By.xpath("//*[text()= 'Please enter a valid age from 10 to 122']")).getText();
       assertEquals(ExpectedValidation, ActualValidation);

   }

   public void CreateCategoryWithoutAgeVerification() throws Exception{
       Thread.sleep(10000);
       driver.findElement(By.xpath("//span[contains(.,'Categories Managers')]")).click();
       Thread.sleep(10000);
       driver.findElement(By.xpath("//ng-select/div/div/div[2]/input")).sendKeys(faker.buisnessName());
       Thread.sleep(100);
       driver.findElement(By.xpath("//ng-dropdown-panel/div/div[2]/div")).click();
       Thread.sleep(500);
       driver.findElement(By.xpath("//img[@alt='Some textual description of gear.svg']")).click();
       driver.findElement(By.xpath("//form/div/div[2]/app-textbox/field-container/div/input")).sendKeys(faker.buisnessName());
       Thread.sleep(500);
       driver.findElement(By.cssSelector(".w-33 > .ng-select-container")).click();
       driver.findElement(By.xpath("//span[contains(.,'Default Template')]")).click();

       String ImageAbsolutePath = Paths.get("C:/Users/EmanMohamedAli/IdeaProjects/QC-MTN/src/main/resources/test.svg").toAbsolutePath().toString();
       driver.findElement(By.xpath("(//img[@alt='No Image'])[12]")).sendKeys(ImageAbsolutePath);





   }
}
