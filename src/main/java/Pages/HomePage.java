package main.java.Pages;

import main.java.utility.PagesHelper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import test.java.base.BaseUtil;

public class HomePage extends BaseUtil {

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "[data-click='profile_icon']")
    WebElement profileIcon;

    public boolean isProfileIconDisplayed() {
        return PagesHelper.isDisplayed(profileIcon);
    }
}
