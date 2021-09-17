package tests;

import org.junit.*;
import page.*;

public class FailedLoginTest extends BasicTest{
    public VerifyPage verifyPage;
    public LogInPage logInPage;

    @Test

    public void FailedLogin(){
        verifyPage = new VerifyPage(driver);
        logInPage = new LogInPage(driver);

        logInPage.failedLogin();
        try {
            verifyPage.VerifyUserLogin("Epic sadface: Username and password do not match any user in this service");
            System.out.print("User is logged in");
        }catch (Exception e){
            Assert.fail("User in NOT logged in");
        }
    }




}

