package page;

import org.openqa.selenium.*;

public class PurchasePage extends BasePage{
    public PurchasePage(WebDriver driver) {
        super(driver);
    }
    public HomePage homePage;

    By firstNameform = By.id("first-name");
    By lastNameForm = By.id("last-name");
    By zipCodeForm = By.id("postal-code");


    public PurchasePage filInform(){
        writeText(firstNameform, "Test");
        writeText(lastNameForm, "TestTest");
        writeText(zipCodeForm, "12345");
        return this;
    }
    public PurchasePage purchaseItem1(){
        homePage = new HomePage(driver);
        homePage.clickItem1().clickAddToCartItem1().clickShoppingCartButton().clickCheckOutButton();
        filInform();
        homePage.clickContinueButton().clickFinishButton();
        return this;
    }
}
