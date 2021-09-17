package testsWithLogin;

import org.junit.*;
import page.*;

public class LogoutTest extends BasicTestWithLogin{
    public HomePage homePage;
    public VerifyPage verifyPage;

    @Test

    public void LogoutTest(){
        homePage = new HomePage(driver);
        verifyPage = new VerifyPage(driver);
        homePage.clickMenuButton().clickLogoutButton();
        try {
            verifyPage.verifyLogout("Login");
        }
        catch (Exception e){
            Assert.fail("Logout not completed");
        }
    }


}
