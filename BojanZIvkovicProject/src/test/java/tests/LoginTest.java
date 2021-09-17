package tests;

import org.junit.*;
import page.*;

public class LoginTest extends BasicTest{
    public VerifyPage verifyPage;
    public LogInPage logInPage;

    @Test

    public void LoginTest(){
        verifyPage = new VerifyPage(driver);
        logInPage = new LogInPage(driver);

        logInPage.login();
        try {
            verifyPage.verifyLogin("LOGOUT");
            System.out.print("User is logged in");
        }
        catch (Exception e){
            Assert.fail("User is NOT logged in");
        }
    }
}
