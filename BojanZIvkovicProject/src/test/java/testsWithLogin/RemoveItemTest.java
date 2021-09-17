package testsWithLogin;

import org.junit.*;
import org.openqa.selenium.*;
import page.*;

public class RemoveItemTest extends BasicTestWithLogin{
    public HomePage homePage;
    public VerifyPage verifyPage;

    @Test

    public void RemoveItem() {
        homePage = new HomePage(driver);
        verifyPage = new VerifyPage(driver);

        homePage.clickItem1().clickAddToCartItem1().clickShoppingCartButton().clickRemoveButtonItem1();
        try {
            if(verifyPage.verifyElementPresent(By.className("removed_cart_item"))){
                System.out.print("Item is removed");
            }else{
                System.out.print("Item is NOT removed");
            }
        }catch (Exception e){
            Assert.fail("Test fail!");
        }




    }
}
