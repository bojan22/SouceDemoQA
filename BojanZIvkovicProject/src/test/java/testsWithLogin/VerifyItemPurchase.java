package testsWithLogin;


import org.junit.*;
import page.*;

public class VerifyItemPurchase extends BasicTestWithLogin{
    public HomePage homePage;
    public VerifyPage verifyPage;

    @Test

    public void VerifyItems(){
        homePage = new HomePage(driver);
        verifyPage = new VerifyPage(driver);
        homePage.clickItem1().clickAddToCartItem1();
        verifyPage.storeItem();
        homePage.clickShoppingCartButton();
        try {
            if(verifyPage.verifyItems() == true){
                System.out.print("Item is same");
            }else
            {
                System.out.print("Item is not same");
            }
        }
        catch (Exception e){
            Assert.fail(e.getMessage());
        }
    }
}
