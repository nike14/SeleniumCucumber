package test.java.steps;

import cucumber.api.java8.En;
import main.java.Pages.HomePage;
import main.java.Pages.LoginPage;
import org.testng.Assert;
import test.java.base.BaseUtil;
import test.java.base.PageObjectManager;

public class FacebookTest extends BaseUtil implements En {

    LoginPage loginPage;
    HomePage homePage;
    PageObjectManager pageObjectManager = new PageObjectManager();

    public FacebookTest() {
        Given("^Navigate to \"([^\"]*)\"$", (String url) -> {
            driver.get(url);
            loginPage = pageObjectManager.getLoginPage();
        });
        When("^I enter the username \"([^\"]*)\"$", (String emailText) -> {
            loginPage.sendEmail(emailText);
        });
        And("^I enter the password \"([^\"]*)\"$", (String passwordText) -> {
            loginPage.sendPassword(passwordText);
        });
        And("^I click on the login button$", () -> {
            loginPage.clickOnLoginButton();
        });
        Then("^I should see the error message$", () -> {
            Assert.assertTrue(loginPage.isWrongPasswordErrorMessageDisplayed());
        });
        Given("^User is already navigate to facebook url$", () -> {
            driver.navigate().back();
            loginPage = pageObjectManager.getLoginPage();
        });
        Then("^I should see profile icon on home page$", () -> {
            homePage = pageObjectManager.getHomePage();
            Assert.assertTrue(homePage.isProfileIconDisplayed());
        });

    }
}
