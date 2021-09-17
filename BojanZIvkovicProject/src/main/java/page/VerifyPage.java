package page;

import org.junit.*;
import org.openqa.selenium.*;
import utilities.*;

public class VerifyPage extends BasePage {
    public VerifyPage(WebDriver driver) {
        super(driver);
    }

    By errorNotification = By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3");
    By menuButton = By.id("react-burger-menu-btn");
    By logOutButton = By.id("logout_sidebar_link");
    By loginButton = By.id("login-button");
    By purchaseText = By.xpath("//*[@id=\"checkout_complete_container\"]/h2");
    By purchasedItem = By.className("inventory_item_name");
    By itNames = By.xpath("/html/body/div/div/div/div[2]/div/div/div[2]/div[1]");


    public VerifyPage VerifyUserLogin(String expectedText) {
        String error = readText(errorNotification);
        assertString(error, expectedText);
        return this;

    }

    public VerifyPage verifyLogin(String expectedText) {
        click(menuButton);
        String login = readText(logOutButton);
        assertString(login, expectedText);
        return this;
    }

    public VerifyPage verifyLogout(String expectedText) {
        String logout = readTextByAttribute(loginButton, "value");
        assertString(logout, expectedText);
        return this;
    }

    public boolean verifyElementPresent(By element) {
        if (driver.findElements(element).size() != 0) {//if this div is present artical is removed
            return true;
        } else {
            return false;
        }
    }

    public VerifyPage verifyPurchaseItem1(String expectedText) {
        String text = readText(purchaseText);
        assertString(text, expectedText);
        return this;
    }
    public VerifyPage storeItem(){
        //store in configuration.properties purchasered item name
        String itName = readText(itNames);
        PropertyManager.editProperty("itemName", itName);
        return this;

    }
    public boolean verifyItems() {
        //verify if purchased item name is same as name in shopingcart
        String item = readText(By.className("inventory_item_name"));
        String itText = PropertyManager.getInstance().getItemName();
       if (item.equals(itText)) {
           return true;

       }
       else {
           return false;
       }

    }

}


