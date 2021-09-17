package tests;

import org.junit.*;
import page.*;

public class LoginEmptyUserTest extends BasicTest{

    public VerifyPage verifyPage;
    public LogInPage logInPage;

    @Test

    public void UsernameLoginTest(){
        verifyPage = new VerifyPage(driver);
        logInPage = new LogInPage(driver);

        logInPage.loginUsernameEmpty();
        try {
            verifyPage.VerifyUserLogin("Epic sadface: Username is required");
            System.out.print("User is not logged in");
        }
        catch (Exception e){
            Assert.fail("User is logged in");
        }

    }
}
