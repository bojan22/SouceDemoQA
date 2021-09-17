package testsWithLogin;

import org.junit.*;
import page.*;

public class SuccesfulPurchaseTest extends BasicTestWithLogin{

    public PurchasePage purchasePage;
    public VerifyPage verifyPage;

    @Test

    public void purchaseTest(){
        purchasePage = new PurchasePage(driver);
        verifyPage = new VerifyPage(driver);

        purchasePage.purchaseItem1();
        try {
            verifyPage.verifyPurchaseItem1("THANK YOU FOR YOUR ORDER");
            System.out.print("Item is successfully purchased");
        }
        catch (Exception e){
            Assert.fail("Item is Not purchased");
        }

    }
}
