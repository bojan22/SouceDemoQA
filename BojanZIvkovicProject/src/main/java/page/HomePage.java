package page;

import org.openqa.selenium.*;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }
    By menuButton = By.id("react-burger-menu-btn");
    By logOutButton = By.id("logout_sidebar_link");
    By item1 = By.id("item_4_title_link");
    By addtocartItem1 = By.id("add-to-cart-sauce-labs-backpack");
    By shoppingCartButton = By.className("shopping_cart_link");
    By removeButtonItem1 = By.id("remove-sauce-labs-backpack");
    By checkOutButton = By.id("checkout");
    By continueButton = By.id("continue");
    By finishButton = By.id("finish");

    //all click methods in page

    public HomePage clickMenuButton(){
        click(menuButton);
        return this;
    }
    public HomePage clickLogoutButton(){
        click(logOutButton);
        return this;
    }
    public HomePage clickItem1(){
        click(item1);
        return this;
    }
    public HomePage clickAddToCartItem1(){
        click(addtocartItem1);
        return this;
    }
    public HomePage clickShoppingCartButton(){
        click(shoppingCartButton);
        return this;
    }
    public HomePage clickRemoveButtonItem1(){
        click(removeButtonItem1);
        return this;
    }
    public HomePage clickCheckOutButton(){
        click(checkOutButton);
        return this;
    }
    public HomePage clickContinueButton(){
        click(continueButton);
        return this;
    }
    public HomePage clickFinishButton(){
        click(finishButton);
        return this;
    }



}
