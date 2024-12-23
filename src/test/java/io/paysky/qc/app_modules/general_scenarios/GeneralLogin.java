package io.paysky.qc.app_modules.general_scenarios;


import io.paysky.qc.GlobalProperties;
import io.paysky.qc.general_scenarios.login.LoginPage;
import io.paysky.qc.utilities.testdata.Constant;
import io.paysky.qc.utils.BaseTest;
import io.paysky.qc.utils.UserConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class GeneralLogin extends BaseTest {


    public static void loginWithUser () throws Exception {

        LoginPage loginPage = new LoginPage();
       UserConfig userConfig=new UserConfig();
       String userName= userConfig.returnUserData(GlobalProperties.globalUserType).get("email");
       String password= userConfig.returnUserData(GlobalProperties.globalUserType).get("password");
//        System.out.println(userConfig.userDataFromConfigFile.get("email"));
//        System.out.println(userConfig.userDataFromConfigFile.get("password"));
//
//        //TODO: Should handle different routing for different user

        /*

        if(merchant )
        should view pages(onboarding and login) and actions for merchant
         */


        if(GlobalProperties.globalUserType== UserConfig.USERENUM.OPERATION)
        {
//            driver.get(GlobalProperties.getProperty("Operation_Portal"));
//            Thread.sleep(20000);
//            driver.findElement(By.id("mat-input-0")).click();
//            driver.findElement(By.cssSelector("#mat-option-3 .country-list-item")).click();
//            driver.findElement(By.id("input")).sendKeys(userName);
//            driver.findElement(By.cssSelector(".input-group > #input")).sendKeys(password);
//            Thread.sleep(5000);
//            driver.findElement(By.cssSelector(".block")).click();
//            Thread.sleep(5000);

            loginPage.clickCountryDropdown();
            loginPage.selectCountry();
            loginPage.writeEmail(userName);
            loginPage.writePassword(password);
            loginPage.clickLoginButton();
        }

        else if (GlobalProperties.globalUserType== UserConfig.USERENUM.ADMIN){
            loginPage.clickCountryDropdown();
            loginPage.selectCountry();
            loginPage.writeEmail(userName);
            loginPage.writePassword(password);
            loginPage.clickLoginButton();
        }

        else if (GlobalProperties.globalUserType==UserConfig.USERENUM.CONSUMER)
        {

            loginPage.clickCountryButton();
            loginPage.openSignInPage();
            loginPage.writePhoneNumber(userName);
            loginPage.CONSUMERWritePassword(password);


//
//            WebElement CustomerUser = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("phone")));
//            Thread.sleep(10000);
//            CustomerUser.sendKeys(userName);
//            driver.findElement(By.cssSelector(".p-inputtext")).sendKeys(password);
        }

    }



}
