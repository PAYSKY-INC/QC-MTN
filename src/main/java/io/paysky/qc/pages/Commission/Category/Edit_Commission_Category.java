package io.paysky.qc.pages.Commission.Category;

import io.paysky.qc.utilities.DataFaker;
import io.paysky.qc.utilities.selenium.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;
import java.util.Random;

public class Edit_Commission_Category {

  private  WebDriver driver;


    DataFaker faker = new DataFaker();

    public Edit_Commission_Category() {
        driver = DriverFactory.getDriver();
    }

    public void check_Click_On_Edit_Icon() throws InterruptedException {
        Thread.sleep(2000);
        WebElement MarketPlaceCommission = driver.findElement(By.xpath("(//img[@alt='No Image'])[9]"));
        MarketPlaceCommission.click();
        Thread.sleep(5000);
        WebElement editIcon = driver.findElement(By.xpath("//table[@id='pr_id_2-table']/tbody/tr/td[6]/a/img"));
        editIcon.click();
        Thread.sleep(5000);
        String ExpectedUrl = "https://momomarketstg.africa/Admin/fees/manage-commissions/edit/";
        String ActualUrl = driver.getCurrentUrl();
        Assert.assertEquals(ActualUrl.contains(ExpectedUrl),true);


    }
    public void Check_Previous_Data_Saved_Before() throws InterruptedException {
        Thread.sleep(2000);
        WebElement MarketPlaceCommission = driver.findElement(By.xpath("(//img[@alt='No Image'])[9]"));
        MarketPlaceCommission.click();
        Thread.sleep(6000);
        WebElement AddCommission = driver.findElement(By.xpath("//button[contains(.,'Add Commission')]"));
        AddCommission.click();
        Thread.sleep(7000);
        WebElement CategoryDDL = driver.findElement(By.xpath("//p-treeselect/div/div[2]"));
        CategoryDDL.click();
        List<WebElement> checkBoxes = driver.findElements(By.className("p-checkbox-box"));
        Random random = new Random();
        int randomIndex = random.nextInt(checkBoxes.size());
        WebElement randomCheckbox = checkBoxes.get(randomIndex);
        randomCheckbox.click();
        WebElement labels = driver.findElement(By.className("text-base"));
        String Label = labels.getText();
        WebElement MarketPlaceToggle = driver.findElement(By.cssSelector("#mat-mdc-slide-toggle-1-button .mdc-switch__icon--off"));
        MarketPlaceToggle.click();
        WebElement CommissionPercentage = driver.findElement(By.xpath("//input[@id='minmaxfraction']"));
        CommissionPercentage.clear();
        String Value = faker.RandomNumber();
        CommissionPercentage.sendKeys(Value);
        WebElement AddCommissionButton = driver.findElement(By.xpath("//*[text()= 'Add Commission']"));
        AddCommissionButton.click();
        Thread.sleep(2000);
        WebElement OKButton = driver.findElement(By.xpath("//span[contains(.,'OK')]"));
        OKButton.click();
        Thread.sleep(5000);
        WebElement SearchBox = driver.findElement(By.xpath("//input[@type='text']"));
        SearchBox.sendKeys(Label);
        WebElement EditIcon = driver.findElement(By.xpath("//*[@src='assets/images/edit_icon.svg']"));
        EditIcon.click();
        Thread.sleep(17000);

        Boolean ExpectedState = true;
        Boolean ActualState = driver.findElement(By.cssSelector("#mat-mdc-slide-toggle-3-button .mdc-switch__icons")).isEnabled();
        Assert.assertEquals(ActualState,ExpectedState);

       //Assertion
        String ExpectedValue = Value;
        //String ActualValue = driver.findElement(By.id("minmaxfraction")).getAttribute("aria-valuenow");
        WebElement inputElement = driver.findElement(By.cssSelector(".ng-valid #minmaxfraction"));
        String ariaValueNow = inputElement.getAttribute("aria-valuenow");
        System.out.println("The value of aria-valuenow is: " + ariaValueNow);
        System.out.println("Element HTML: " + inputElement.getAttribute("outerHTML"));
        Assert.assertEquals(ariaValueNow,ExpectedValue);








    }

    public void Check_That_Toggles_Clickable_In_EditPage() throws InterruptedException{
        Thread.sleep(2000);
        WebElement MarketPlaceCommission = driver.findElement(By.xpath("(//img[@alt='No Image'])[9]"));
        MarketPlaceCommission.click();
        Thread.sleep(6000);
        Thread.sleep(5000);
        WebElement editIcon = driver.findElement(By.xpath("//table[@id='pr_id_2-table']/tbody/tr/td[6]/a/img"));
        editIcon.click();
        Thread.sleep(17000);
        WebElement MarketPlaceToggle = driver.findElement(By.cssSelector("#mat-mdc-slide-toggle-1-button .mdc-switch__icon--off"));
        List<WebElement> ariaCheckedElements = driver.findElements(By.xpath("//*[@aria-checked]"));
        WebElement SecondElement = ariaCheckedElements.get(1);
        boolean toggleStateSecondElement = Boolean.parseBoolean(SecondElement.getAttribute("aria-checked"));


        if(toggleStateSecondElement){
            WebElement inputElement = driver.findElement(By.xpath("//input[@id='minmaxfraction']"));
            inputElement.clear();
            inputElement.sendKeys(faker.RandomNumber());

        }
        else{
            WebElement inputElement = driver.findElement(By.xpath("//input[@id='minmaxfraction']"));
            MarketPlaceToggle.click();
            inputElement.clear();
            inputElement.sendKeys(faker.RandomNumber());

        }

        WebElement UpdateCommission = driver.findElement(By.xpath("//span[contains(.,'Update Commission')]"));
        UpdateCommission.click();
        Thread.sleep(3000);

        //Assertion
        String ExpectedSuccessMsg = "Commission has been successfully updated";
        String ActualSuccessMsg = driver.findElement(By.xpath("//p[contains(.,'Commission has been successfully updated')]")).getText();


        WebElement OKButton = driver.findElement(By.xpath("//span[contains(.,'OK')]"));
        OKButton.click();


    }

       public void Click_On_Update_CommissionBtn_Without_Changes() throws InterruptedException{
           Thread.sleep(2000);
           WebElement MarketPlaceCommission = driver.findElement(By.xpath("(//img[@alt='No Image'])[9]"));
           MarketPlaceCommission.click();
           Thread.sleep(6000);
           Thread.sleep(5000);
           WebElement editIcon = driver.findElement(By.xpath("//table[@id='pr_id_2-table']/tbody/tr/td[6]/a/img"));
           editIcon.click();
           Thread.sleep(17000);
           WebElement ChosenCategory = driver.findElement(By.className("text-base"));
           String Category = ChosenCategory.getText();
           String MarketPlace = driver.findElement(By.xpath("//div[3]/div[2]/div")).getAttribute("aria-valuenow");
           String StoreFront = driver.findElement(By.xpath("(//input[@id='minmaxfraction'])[2]")).getAttribute("aria-valuenow");

           WebElement UpdateCommission = driver.findElement(By.xpath("//span[contains(.,'Update Commission')]"));
           UpdateCommission.click();
           Thread.sleep(3000);

           WebElement OKButton = driver.findElement(By.xpath("//span[contains(.,'OK')]"));
           OKButton.click();
           Thread.sleep(4000);

           WebElement SearchBox = driver.findElement(By.xpath("//input[@type='text']"));
           SearchBox.sendKeys(Category);

           WebElement SearchIcon = driver.findElement(By.cssSelector(".search > .mat-icon"));
           SearchIcon.click();
           Thread.sleep(4000);

           String ActualMarketPlace = driver.findElement(By.cssSelector(".p-element > .ng-star-inserted:nth-child(4) > .ng-star-inserted")).getText();
           String ActualStoreFront = driver.findElement(By.cssSelector(".p-element > .ng-star-inserted:nth-child(4) > .ng-star-inserted")).getText();

           //Assertion
           Assert.assertEquals(ActualMarketPlace,MarketPlace);
           Assert.assertEquals(ActualStoreFront,StoreFront);







       }

}
