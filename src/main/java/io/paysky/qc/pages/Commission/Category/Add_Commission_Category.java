package io.paysky.qc.pages.Commission.Category;


import io.paysky.qc.utilities.DataFaker;
import io.paysky.qc.utilities.selenium.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;


public class Add_Commission_Category {

    DataFaker faker = new DataFaker();


   private WebDriver driver;

    public Add_Commission_Category() {
        driver = DriverFactory.getDriver();
    }


    public void Check_That_Click_On_Category_Tab() throws InterruptedException{
        Thread.sleep(2000);
        WebElement MarketPlaceCommission = driver.findElement(By.xpath("(//img[@alt='No Image'])[9]"));
        MarketPlaceCommission.click();
        Thread.sleep(2000);
        WebElement CategoryTab = driver.findElement(By.xpath("//button[contains(.,'Category')]"));
        CategoryTab.click();

        WebElement AddCommissionButton = driver.findElement(By.xpath("//button[contains(.,'Add Commission')]"));
        Boolean ExpectedResult = true;
        Boolean ActualResult = AddCommissionButton.isDisplayed();
        Assert.assertEquals(ActualResult,ExpectedResult);
    }

     public void Add_Commission_Page_Open() throws InterruptedException{
        Thread.sleep(2000);
        WebElement MarketPlaceCommission = driver.findElement(By.xpath("(//img[@alt='No Image'])[9]"));
        MarketPlaceCommission.click();
        Thread.sleep(2000);
        WebElement AddCommission = driver.findElement(By.xpath("//button[contains(.,'Add Commission')]"));
        AddCommission.click();
        Thread.sleep(4000);

        // Assertion
        String ExpectedUrl = "https://momomarketstg.africa/Admin/fees/manage-commissions/add/%7B%22isCategory%22:true%7D";
        String ActualUrl = driver.getCurrentUrl();
        Assert.assertEquals(ActualUrl,ExpectedUrl);

    }

    public void Check_Toggles_Disabled_ByDefault() throws InterruptedException{
        Thread.sleep(2000);
        WebElement MarketPlaceCommission = driver.findElement(By.xpath("(//img[@alt='No Image'])[9]"));
        MarketPlaceCommission.click();
        Thread.sleep(2000);
        WebElement AddCommission = driver.findElement(By.xpath("//button[contains(.,'Add Commission')]"));
        AddCommission.click();
        Thread.sleep(4000);
        List<WebElement> ariaCheckedElements = driver.findElements(By.xpath("//*[@aria-checked]"));
            WebElement SecondElement = ariaCheckedElements.get(1);
            boolean toggleStateSecondElement = Boolean.parseBoolean(SecondElement.getAttribute("aria-checked"));
            System.out.println(toggleStateSecondElement);

            WebElement ThirdElement = ariaCheckedElements.get(2);
            boolean toggleStateThirdElement = Boolean.parseBoolean(ThirdElement.getAttribute("aria-checked"));
            System.out.println(toggleStateThirdElement);
            Boolean ExpectedState = false;

            // Assertion
            Assert.assertEquals(toggleStateSecondElement,ExpectedState);
            Assert.assertEquals(toggleStateThirdElement, ExpectedState);
    }

    public void Check_CategoryDDL_Clickable() throws InterruptedException {
        Thread.sleep(2000);
        WebElement MarketPlaceCommission = driver.findElement(By.xpath("(//img[@alt='No Image'])[9]"));
        MarketPlaceCommission.click();
        Thread.sleep(2000);
        WebElement AddCommission = driver.findElement(By.xpath("//button[contains(.,'Add Commission')]"));
        AddCommission.click();
        Thread.sleep(4000);
        WebElement CategoryDDL = driver.findElement(By.xpath("//p-treeselect/div/div[2]"));
        CategoryDDL.click();
        List<WebElement> options = driver.findElements(By.className("p-treenode-content"));
        Assert.assertTrue(options.size() > 0, "Dropdown is empty!");

    }

    public void Check_Search_Functionality_In_CategoryDDL() throws InterruptedException {
        Thread.sleep(2000);
        WebElement MarketPlaceCommission = driver.findElement(By.xpath("(//img[@alt='No Image'])[9]"));
        MarketPlaceCommission.click();
        Thread.sleep(2000);
        WebElement AddCommission = driver.findElement(By.xpath("//button[contains(.,'Add Commission')]"));
        AddCommission.click();
        Thread.sleep(4000);
        WebElement CategoryDDL = driver.findElement(By.xpath("//p-treeselect/div/div[2]"));
        CategoryDDL.click();
        WebElement SearchField = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
        SearchField.sendKeys("hidden Category");
        WebElement SelectCategory = driver.findElement(By.xpath("//li/div/div/div"));
        SelectCategory.click();

    }

    public void add_Commission_Against_Market_Place() throws InterruptedException{
        Thread.sleep(2000);
        WebElement MarketPlaceCommission = driver.findElement(By.xpath("(//img[@alt='No Image'])[9]"));
        MarketPlaceCommission.click();
        Thread.sleep(2000);
        WebElement AddCommission = driver.findElement(By.xpath("//button[contains(.,'Add Commission')]"));
        AddCommission.click();
        Thread.sleep(4000);
        WebElement MarketPlaceToggle = driver.findElement(By.cssSelector("#mat-mdc-slide-toggle-1-button .mdc-switch__icon--off"));
        MarketPlaceToggle.click();
        WebElement CommissionPercentage = driver.findElement(By.xpath("//input[@id='minmaxfraction']"));
        CommissionPercentage.clear();
        CommissionPercentage.sendKeys("10");
    }

    public void add_Commission_For_Market_Place_When_ToggleDisabled() throws InterruptedException{
        Thread.sleep(2000);
        WebElement MarketPlaceCommission = driver.findElement(By.xpath("(//img[@alt='No Image'])[9]"));
        MarketPlaceCommission.click();
        Thread.sleep(2000);
        WebElement AddCommission = driver.findElement(By.xpath("//button[contains(.,'Add Commission')]"));
        AddCommission.click();
        Thread.sleep(4000);
        WebElement CommissionPercentage = driver.findElement(By.xpath("//input[@id='minmaxfraction']"));

        // Assertion
        Boolean ExpectedStatus = false;
        Assert.assertEquals(CommissionPercentage.isEnabled(),ExpectedStatus);
    }

    public void add_Commission_With_Value_MoreThan100_InMarketPlace() throws InterruptedException {
        Thread.sleep(2000);
        WebElement MarketPlaceCommission = driver.findElement(By.xpath("(//img[@alt='No Image'])[9]"));
        MarketPlaceCommission.click();
        Thread.sleep(2000);
        WebElement AddCommission = driver.findElement(By.xpath("//button[contains(.,'Add Commission')]"));
        AddCommission.click();
        Thread.sleep(4000);
        WebElement CategoryDDL = driver.findElement(By.xpath("//p-treeselect/div/div[2]"));
        CategoryDDL.click();
        WebElement SearchField = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
        SearchField.sendKeys("hidden Category");
        WebElement SelectCategory = driver.findElement(By.xpath("//li/div/div/div"));
        SelectCategory.click();
        WebElement MarketPlaceToggle = driver.findElement(By.cssSelector("#mat-mdc-slide-toggle-1-button .mdc-switch__icon--off"));
        MarketPlaceToggle.click();
        WebElement CommissionPercentage = driver.findElement(By.xpath("//input[@id='minmaxfraction']"));
        CommissionPercentage.clear();
        CommissionPercentage.sendKeys("101");
        WebElement AddCommissionButton = driver.findElement(By.xpath("//*[text()= 'Add Commission']"));
        AddCommissionButton.click();
        Thread.sleep(2000);
        String ExpectedValidation= "Commission should be between 0 to 100";
        String ActualValidation = driver.findElement(By.xpath("//*[text()= 'Commission should be between 0 to 100']")).getText();
        Assert.assertEquals(ActualValidation,ExpectedValidation);



    }
    public void add_Commission_With_Value_LessThan0_InMarketPlace() throws InterruptedException {
        Thread.sleep(2000);
        WebElement MarketPlaceCommission = driver.findElement(By.xpath("(//img[@alt='No Image'])[9]"));
        MarketPlaceCommission.click();
        Thread.sleep(2000);
        WebElement AddCommission = driver.findElement(By.xpath("//button[contains(.,'Add Commission')]"));
        AddCommission.click();
        Thread.sleep(4000);
        WebElement MarketPlaceToggle = driver.findElement(By.cssSelector("#mat-mdc-slide-toggle-1-button .mdc-switch__icon--off"));
        MarketPlaceToggle.click();
        WebElement CommissionPercentage = driver.findElement(By.xpath("//input[@id='minmaxfraction']"));
        CommissionPercentage.clear();
        CommissionPercentage.sendKeys("-1");
        String ExpectedValue = "1";
        String ActualValue=  CommissionPercentage.getAttribute("aria-valuenow");
        Assert.assertEquals(ActualValue,ExpectedValue);


    }
    public void add_commission_With_Value_Between0and100_InMarketPlace() throws InterruptedException{
        Thread.sleep(2000);
        WebElement MarketPlaceCommission = driver.findElement(By.xpath("(//img[@alt='No Image'])[9]"));
        MarketPlaceCommission.click();
        Thread.sleep(2000);
        WebElement AddCommission = driver.findElement(By.xpath("//button[contains(.,'Add Commission')]"));
        AddCommission.click();
        Thread.sleep(4000);
        WebElement CategoryDDL = driver.findElement(By.xpath("//p-treeselect/div/div[2]"));
        CategoryDDL.click();
        WebElement SearchField = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
        SearchField.sendKeys("hidden Category");
        WebElement SelectCategory = driver.findElement(By.xpath("//li/div/div/div"));
        SelectCategory.click();
        WebElement MarketPlaceToggle = driver.findElement(By.cssSelector("#mat-mdc-slide-toggle-1-button .mdc-switch__icon--off"));
        MarketPlaceToggle.click();
        WebElement CommissionPercentage = driver.findElement(By.xpath("//input[@id='minmaxfraction']"));
        CommissionPercentage.clear();
        CommissionPercentage.sendKeys(faker.RandomNumber());
        WebElement AddCommissionButton = driver.findElement(By.xpath("//*[text()= 'Add Commission']"));
        AddCommissionButton.click();
        Thread.sleep(2000);
        String ExpectedSuccessMessage = "Commission has been successfully added";
        String ActualSuccessMessage = driver.findElement(By.xpath("/html/body/app-root/app-add-update/app-sidebar/div/div[2]/app-success-modal/p-dialog/div/div/div[2]/div/p")).getText();
        Assert.assertEquals(ActualSuccessMessage,ExpectedSuccessMessage);
        WebElement OkButton = driver.findElement(By.xpath("//span[contains(.,'OK')]"));
        OkButton.click();
    }
    public void add_commission_With_Characters_InMarketPlace() throws InterruptedException{
        Thread.sleep(2000);
        WebElement MarketPlaceCommission = driver.findElement(By.xpath("(//img[@alt='No Image'])[9]"));
        MarketPlaceCommission.click();
        Thread.sleep(2000);
        WebElement AddCommission = driver.findElement(By.xpath("//button[contains(.,'Add Commission')]"));
        AddCommission.click();
        Thread.sleep(4000);
        WebElement CategoryDDL = driver.findElement(By.xpath("//p-treeselect/div/div[2]"));
        CategoryDDL.click();
        WebElement SearchField = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
        SearchField.sendKeys("hidden Category");
        WebElement SelectCategory = driver.findElement(By.xpath("//li/div/div/div"));
        SelectCategory.click();
        WebElement MarketPlaceToggle = driver.findElement(By.cssSelector("#mat-mdc-slide-toggle-1-button .mdc-switch__icon--off"));
        MarketPlaceToggle.click();
        WebElement CommissionPercentage = driver.findElement(By.xpath("//input[@id='minmaxfraction']"));
        CommissionPercentage.clear();
        CommissionPercentage.sendKeys("asgbg");
        String ExpectedValue = "null";
        String ActualValue = CommissionPercentage.getAttribute("aria-valuenow");
        Assert.assertEquals(ActualValue,ExpectedValue);


    }
    public void add_commission_With_SpecialCharacters_InMarketPlace() throws InterruptedException {
        Thread.sleep(2000);
        WebElement MarketPlaceCommission = driver.findElement(By.xpath("(//img[@alt='No Image'])[9]"));
        MarketPlaceCommission.click();
        Thread.sleep(2000);
        WebElement AddCommission = driver.findElement(By.xpath("//button[contains(.,'Add Commission')]"));
        AddCommission.click();
        Thread.sleep(4000);
        WebElement CategoryDDL = driver.findElement(By.xpath("//p-treeselect/div/div[2]"));
        CategoryDDL.click();
        WebElement SearchField = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
        SearchField.sendKeys("hidden Category");
        WebElement SelectCategory = driver.findElement(By.xpath("//li/div/div/div"));
        SelectCategory.click();
        WebElement MarketPlaceToggle = driver.findElement(By.cssSelector("#mat-mdc-slide-toggle-1-button .mdc-switch__icon--off"));
        MarketPlaceToggle.click();
        WebElement CommissionPercentage = driver.findElement(By.xpath("//input[@id='minmaxfraction']"));
        CommissionPercentage.clear();
        CommissionPercentage.sendKeys("*&@$");
        String ExpectedValue = "null";
        String ActualValue = CommissionPercentage.getAttribute("aria-valuenow");
        Assert.assertEquals(ActualValue, ExpectedValue);

    }
    public void Check_That_Can_Enable_StoreFront_Toggle() throws InterruptedException{
        Thread.sleep(2000);
        WebElement MarketPlaceCommission = driver.findElement(By.xpath("(//img[@alt='No Image'])[9]"));
        MarketPlaceCommission.click();
        Thread.sleep(2000);
        WebElement AddCommission = driver.findElement(By.xpath("//button[contains(.,'Add Commission')]"));
        AddCommission.click();
        Thread.sleep(5000);
        WebElement StoreFrontToggle = driver.findElement(By.xpath("//*[@id=\"mat-mdc-slide-toggle-2-button\"]"));
        StoreFrontToggle.click();
        Boolean ExpectedState = true;
        Boolean ActualState = StoreFrontToggle.isEnabled();
        Assert.assertEquals(ActualState,ExpectedState);
    }

    public void add_Commission_For_StoreFront_When_ToggleDisabled() throws InterruptedException{
        Thread.sleep(2000);
        WebElement MarketPlaceCommission = driver.findElement(By.xpath("(//img[@alt='No Image'])[9]"));
        MarketPlaceCommission.click();
        Thread.sleep(2000);
        WebElement AddCommission = driver.findElement(By.xpath("//button[contains(.,'Add Commission')]"));
        AddCommission.click();
        Thread.sleep(4000);
        WebElement CommissionPercentage = driver.findElement(By.xpath("(//input[@id='minmaxfraction'])[2]"));

        // Assertion
        Boolean ExpectedStatus = false;
        Assert.assertEquals(CommissionPercentage.isEnabled(),ExpectedStatus);
    }

    public void add_Commission_Without_Select_Category() throws InterruptedException{
        Thread.sleep(2000);
        WebElement MarketPlaceCommission = driver.findElement(By.xpath("(//img[@alt='No Image'])[9]"));
        MarketPlaceCommission.click();
        Thread.sleep(2000);
        WebElement AddCommission = driver.findElement(By.xpath("//button[contains(.,'Add Commission')]"));
        AddCommission.click();
        Thread.sleep(4000);
        WebElement AddCommissionButton = driver.findElement(By.xpath("//*[text()= 'Add Commission']"));
        AddCommissionButton.click();
        Thread.sleep(2000);
        String ExpectedValidation = "Please select a category";
        String ActualValidation = driver.findElement(By.xpath("//*[text()='Please select a category']")).getText();
        Assert.assertEquals(ActualValidation,ExpectedValidation);
        WebElement OkButton = driver.findElement(By.xpath("//span[contains(.,'OK')]"));
        OkButton.click();


    }

    public void add_Commission_Without_Applying_In_Platform() throws InterruptedException{
        Thread.sleep(2000);
        WebElement MarketPlaceCommission = driver.findElement(By.xpath("(//img[@alt='No Image'])[9]"));
        MarketPlaceCommission.click();
        Thread.sleep(2000);
        WebElement AddCommission = driver.findElement(By.xpath("//button[contains(.,'Add Commission')]"));
        AddCommission.click();
        Thread.sleep(4000);
        WebElement CategoryDDL = driver.findElement(By.xpath("//p-treeselect/div/div[2]"));
        CategoryDDL.click();
        WebElement SearchField = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
        SearchField.sendKeys("hidden Category");
        WebElement SelectCategory = driver.findElement(By.xpath("//li/div/div/div"));
        SelectCategory.click();
        WebElement AddCommissionButton = driver.findElement(By.xpath("//*[text()= 'Add Commission']"));
        AddCommissionButton.click();
        Thread.sleep(2000);
        String ExpectedValidation = "Apply commission at least in one platform";
        String ActualValidation = driver.findElement(By.xpath("//*[text()='Apply commission at least in one platform']")).getText();
        Assert.assertEquals(ActualValidation,ExpectedValidation);
        WebElement OkButton = driver.findElement(By.xpath("//span[contains(.,'OK')]"));
        OkButton.click();

    }







}
