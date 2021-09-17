package tests;

import org.junit.*;
import page.*;

public class LoginEmptyPasswordTest extends BasicTest {

    public VerifyPage verifyPage;
    public LogInPage logInPage;

    @Test

    public void EmptyPasswordTest() {

        verifyPage = new VerifyPage(driver);
        logInPage = new LogInPage(driver);

        logInPage.loginPasswordEmpty();
        try {
            verifyPage.VerifyUserLogin("Epic sadface: Password is required");
            System.out.print("User is not logged in");
        } catch (Exception e) {
            Assert.fail("User is logged in");
        }
    }
}