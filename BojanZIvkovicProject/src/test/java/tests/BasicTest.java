package tests;

import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.*;
import utilities.*;

import java.util.concurrent.*;


public class BasicTest {

    public WebDriver driver;
    public ChromeOptions options;

    @Before

    public void settings() {
    //chose browser
        //MozzilaBrowser();
        ChromeBrowser();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(PropertyManager.getInstance().getUrl());

    }

    public void ChromeBrowser(){
        options = new ChromeOptions();
        //disables popups on browser
         options.addArguments("--disable-notifications");
        //driver path
        System.setProperty("webdriver.chrome.driver", PropertyManager.getInstance().getDriverPathChrome());
        driver = new ChromeDriver(options);
    }

    public void MozzilaBrowser(){
        System.setProperty("webdriver.gecko.driver", PropertyManager.getInstance().getDriverPathGecko());
        driver = new FirefoxDriver();
    }

    @After

    public void quit(){
        driver.quit();
    }
}

