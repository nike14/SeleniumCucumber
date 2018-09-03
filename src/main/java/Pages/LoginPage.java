package main.java.Pages;

import main.java.utility.PagesHelper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import test.java.base.BaseUtil;

public class LoginPage extends BaseUtil {


    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "[name='email']")
    WebElement emailBox;

    @FindBy(css = "[name='pass']")
    WebElement passwordBox;

    @FindBy(css = "[id='loginbutton']")
    WebElement loginButton;

    @FindBy(css = "[data-testid='undefined']>div>div>div")
    WebElement wrongPassword;

    public void sendEmail(String emailText) {
        PagesHelper.clearText(emailBox);
        PagesHelper.sendKeys(emailBox, emailText);
    }

    public void sendPassword(String password) {
        PagesHelper.clearText(passwordBox);
        PagesHelper.sendKeys(passwordBox, password);
    }

    public void clickOnLoginButton() {
        PagesHelper.click(loginButton);
    }

    public boolean isWrongPasswordErrorMessageDisplayed() {
        return PagesHelper.isDisplayed(wrongPassword);
    }
}
