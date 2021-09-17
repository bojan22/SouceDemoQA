package testSuites;

import org.junit.runner.*;
import org.junit.runners.*;
import tests.*;
import testsWithLogin.*;

 @RunWith(Suite.class)

//Regression Suite
@Suite.SuiteClasses({FailedLoginTest.class, LoginEmptyUserTest.class, LoginEmptyPasswordTest.class, LoginTest.class,
        LogoutTest.class, RemoveItemTest.class, SuccesfulPurchaseTest.class, VerifyItemPurchase.class})

public class TestSuites {
}

