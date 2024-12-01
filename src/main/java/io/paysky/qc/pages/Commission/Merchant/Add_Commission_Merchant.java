package io.paysky.qc.pages.Commission.Merchant;

import io.paysky.qc.utilities.DataFaker;
import io.paysky.qc.utilities.selenium.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;
import java.util.Random;

public class Add_Commission_Merchant {

    DataFaker faker = new DataFaker();


    private WebDriver driver;

    public Add_Commission_Merchant() {
        driver = DriverFactory.getDriver();
    }

    public void Check_That_Click_On_Merchant_Tab() throws InterruptedException{
        Thread.sleep(2000);
        WebElement MarketPlaceCommission = driver.findElement(By.xpath("(//img[@alt='No Image'])[9]"));
        MarketPlaceCommission.click();
        Thread.sleep(2000);
        WebElement MerchantTab = driver.findElement(By.xpath("//button[contains(.,'Merchant')]"));
        MerchantTab.click();

        WebElement AddCommissionButton = driver.findElement(By.xpath("//button[contains(.,'Add Commission')]"));
        Boolean ExpectedResult = true;
        Boolean ActualResult = AddCommissionButton.isDisplayed();
        Assert.assertEquals(ActualResult,ExpectedResult);
    }

    public void Click_On_ADD_Button() throws InterruptedException{
        Thread.sleep(2000);
        WebElement MarketPlaceCommission = driver.findElement(By.xpath("(//img[@alt='No Image'])[9]"));
        MarketPlaceCommission.click();
        Thread.sleep(2000);
        WebElement MerchantTab = driver.findElement(By.xpath("//button[contains(.,'Merchant')]"));
        MerchantTab.click();
        Thread.sleep(2000);
        WebElement AddCommission = driver.findElement(By.xpath("//button[contains(.,'Add Commission')]"));
        AddCommission.click();
        Thread.sleep(4000);

        // Assertion
        String ExpectedUrl = "https://momomarketstg.africa/Admin/fees/manage-commissions/add/%7B%22isCategory%22:false%7D";
        String ActualUrl = driver.getCurrentUrl();
        Assert.assertEquals(ActualUrl,ExpectedUrl);
    }

    public void Check_Search_And_Select_From_MerchantDDL() throws InterruptedException{
        Thread.sleep(2000);
        WebElement MarketPlaceCommission = driver.findElement(By.xpath("(//img[@alt='No Image'])[9]"));
        MarketPlaceCommission.click();
        Thread.sleep(2000);
        WebElement MerchantTab = driver.findElement(By.xpath("//button[contains(.,'Merchant')]"));
        MerchantTab.click();
        Thread.sleep(2000);
        WebElement AddCommission = driver.findElement(By.xpath("//button[contains(.,'Add Commission')]"));
        AddCommission.click();
        Thread.sleep(4000);

        WebElement MerchantDDL = driver.findElement(By.xpath("//p-dropdown/div"));
        MerchantDDL.click();

        WebElement SearchField = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
        SearchField.sendKeys("p");

        List<WebElement> Merchants = driver.findElements(By.className("ng-star-inserted"));
        Random random = new Random();
        int randomIndex = random.nextInt(Merchants.size());
        WebElement randomMerchant = Merchants.get(randomIndex);
        randomMerchant.click();

    }

    public void Search_In_MerchantDDL_With_Invalid_Value () throws InterruptedException {
        WebElement MarketPlaceCommission = driver.findElement(By.xpath("(//img[@alt='No Image'])[9]"));
        MarketPlaceCommission.click();
        Thread.sleep(2000);
        WebElement MerchantTab = driver.findElement(By.xpath("//button[contains(.,'Merchant')]"));
        MerchantTab.click();
        Thread.sleep(2000);
        WebElement AddCommission = driver.findElement(By.xpath("//button[contains(.,'Add Commission')]"));
        AddCommission.click();
        Thread.sleep(4000);

        WebElement MerchantDDL = driver.findElement(By.xpath("//p-dropdown/div"));
        MerchantDDL.click();

        WebElement SearchField = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
        SearchField.sendKeys("pppppppppppppppppppp");

        String ActualValidation = driver.findElement(By.xpath("//*[@id=\"pr_id_4_list\"]/li")).getText();
        String ExpectedValidation = "No results found";

        Assert.assertEquals(ActualValidation,ExpectedValidation);


    }



}
