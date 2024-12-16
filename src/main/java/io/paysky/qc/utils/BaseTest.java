package io.paysky.qc.utils;


import io.paysky.qc.GlobalProperties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Properties;


public class BaseTest {




    public BaseTest() {
     PageFactory.initElements(driver, BaseTest.this);
    }


    protected FileInputStream inputStream;
    protected static WebDriver driver;
    public Properties properties;
    private String browser;


 @AfterTest
 public void afterTest()
 {
     if (driver != null) {
         driver.quit();
     }

 }



    @BeforeSuite
    public void  setup(){
        propertiesFileReader();
    }






    private void propertiesFileReader() {
        File propFile = new File("src/main/resources/config.properties");
        try {
            inputStream = new FileInputStream(propFile);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        properties = new Properties();
        try {
            properties.load(inputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }







    @AfterSuite
    public void afterSuite()
    {
        driver.quit();
    }


    @Parameters("browser")
    @BeforeMethod
    public void beforeMethod(Method method, @Optional String browser)
    {
        if (browser==null){
            ChromeOptions options = new ChromeOptions();
           // options.addArguments("--headless=new");
            driver = new ChromeDriver(options);

        }else {
            this.browser = browser;
            if (browser.equalsIgnoreCase("chrome"))
            {
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--headless=new");
                driver = new ChromeDriver(options);
            }

            else if (browser.equalsIgnoreCase("edge"))
            {
                EdgeOptions options = new EdgeOptions();
                options.addArguments("--headless=new");
                driver = new EdgeDriver(options);
            }
        }

        //TODO: Should fix this part
          driver.get("https://rmooreblog.netlify.app/");
//        driver.get(EnvironmentConfig.getBaseUrl(GlobalProperties.globalUserType));
        driver.manage().window().maximize();

    }




}
