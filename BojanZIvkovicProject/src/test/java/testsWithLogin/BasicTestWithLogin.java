package testsWithLogin;

import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.*;
import page.*;
import utilities.*;

import java.util.concurrent.*;

public class BasicTestWithLogin{

    public WebDriver driver;
    public ChromeOptions options;
    public LogInPage logInPage;
    public HomePage homePage;

    @Before

    public void setup(){
    //chose browser
        MozzilaBrowser();
       //ChromeBrowser();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(PropertyManager.getInstance().getUrl());
        homePage = new HomePage(driver);
        logInPage= new LogInPage(driver);
        logInPage.login();

    }

    public void ChromeBrowser() {
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

    public void teardown(){
        driver.quit();
    }
}
