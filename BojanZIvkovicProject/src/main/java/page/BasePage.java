package page;

import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;


public class BasePage {

    public WebDriver driver;
    public WebDriverWait wait;

    public BasePage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, 10);
    }
    public void waitVisibility(By element){
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(element));
    }
    public void click(By element){
        waitVisibility(element);
        driver.findElement(element).click();
    }
    public void writeText (By element, String text){
        waitVisibility(element);
        driver.findElement(element).sendKeys(text);
    }
    public String readText (By element){
        waitVisibility(element);
        return driver.findElement(element).getText();
    }
    public void assertString(String text, String expectedText){
        Assert.assertEquals(text, expectedText);
    }

    public String readTextByAttribute(By element, String attributeValue){
        waitVisibility(element);
        String attribute = driver.findElement(element).getAttribute(attributeValue);
        return attribute;
    }

}
