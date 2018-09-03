package test.java.base;

import main.java.Pages.HomePage;
import main.java.Pages.LoginPage;

public class PageObjectManager {

    private LoginPage loginPage;
    private HomePage homePage;

    public LoginPage getLoginPage() {
        if (loginPage == null) {
            loginPage = new LoginPage();
        }
        return loginPage;
    }

    public HomePage getHomePage() {
        if (homePage == null) {
            homePage = new HomePage();
        }
        return homePage;
    }
}
