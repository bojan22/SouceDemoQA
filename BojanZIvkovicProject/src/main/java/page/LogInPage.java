package page;

import org.openqa.selenium.*;
import utilities.*;

public class LogInPage extends BasePage {
    public LogInPage(WebDriver driver) {
        super(driver);
    }

    By usernameFiled = By.id("user-name");
    By passwordFiled = By.id("password");
    By loginButton = By.id("login-button");

    public LogInPage loginUsernameEmpty() {
        writeText(usernameFiled, "");
        writeText(passwordFiled, PropertyManager.getInstance().getPassword());
        click(loginButton);
        return this;
    }

    public LogInPage loginPasswordEmpty() {
        writeText(usernameFiled, PropertyManager.getInstance().getUsername());
        writeText(passwordFiled, "");
        click(loginButton);
        return this;
    }

    public LogInPage failedLogin() {
        writeText(usernameFiled, PropertyManager.getInstance().getWrongUsername());
        writeText(passwordFiled, PropertyManager.getInstance().getWrongPassword());
        click(loginButton);
        return this;
    }

    public LogInPage login() {
        writeText(usernameFiled, PropertyManager.getInstance().getUsername());
        writeText(passwordFiled, PropertyManager.getInstance().getPassword());
        click(loginButton);
        return this;
    }

}
