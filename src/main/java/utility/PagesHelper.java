package main.java.utility;

import com.google.common.base.Function;
import main.java.constants.Constant;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import test.java.base.BaseUtil;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.*;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static java.util.concurrent.TimeUnit.SECONDS;

public class PagesHelper extends BaseUtil {

    public static void clearText(WebElement element) {
        waitExplicit(element, Constant.PagesHelperConstants.ELEMENTTOBECLICKABLE, Constant.PagesHelperConstants.TIME);
        element.clear();
    }

    //get text.
    public static String getText(WebElement element) {
        waitExplicit(element, Constant.PagesHelperConstants.ELEMENTTOBECLICKABLE, Constant.PagesHelperConstants.TIME);
        String value = element.getText().toLowerCase();
        return value;
    }

    //click element.
    public static void click(WebElement element) {
        waitExplicit(element, Constant.PagesHelperConstants.ELEMENTTOBECLICKABLE, Constant.PagesHelperConstants.TIME);
        element.click();
    }

    //Using java script click on element.
    public static void javaScriptClick(WebElement element) {
        waitExplicit(element, Constant.PagesHelperConstants.ELEMENTTOBECLICKABLE, Constant.PagesHelperConstants.TIME);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", element);
    }

    //Send data.
    public static void sendKeys(WebElement element, String text) {
        waitExplicit(element, Constant.PagesHelperConstants.ELEMENTTOBECLICKABLE, Constant.PagesHelperConstants.TIME);
        element.sendKeys(text);
    }

    //Wait explicit for single element the element to load.
    public static void waitExplicit(WebElement element, String type, long waittime) {
        driver.manage().timeouts().implicitlyWait(0, SECONDS);
        System.out.println("Inside WaitExplicit " + element);
        WebDriverWait wait = new WebDriverWait(driver, waittime);
        String CaseType = type;
        switch (CaseType.toLowerCase()) {
            case Constant.PagesHelperConstants.VISIBILITYOF:
                wait.until(ExpectedConditions.visibilityOf(element));
                break;
            case Constant.PagesHelperConstants.ELEMENTTOBECLICKABLE:
                wait.until(ExpectedConditions.elementToBeClickable(element));
                break;
            case Constant.PagesHelperConstants.ELEMENTTOBESELECTED:
                wait.until(ExpectedConditions.elementToBeSelected(element));
                break;
            case Constant.PagesHelperConstants.INVISIBILITYOF:
                wait.until(ExpectedConditions.invisibilityOf(element));
                break;

            default:
                System.out.println("Method Name: waitexplicit-->Wrong Method Passed");
                break;
        }
    }

    //Wait explicit for more than one element.
    public static void waitExplicitElements(List<WebElement> elements, String type, long waittime) {
        driver.manage().timeouts().implicitlyWait(0, SECONDS);
        System.out.println("Inside waitExplicitElements ");
        WebDriverWait wait = new WebDriverWait(driver, waittime);
        String CaseType = type;
        switch (CaseType.toLowerCase()) {

            case Constant.PagesHelperConstants.VISIBILITYOFALLELEMENTS:
                wait.until(ExpectedConditions.visibilityOfAllElements(elements));
                break;

            default:
                System.out.println("Method Name: waitExplicitElements-->Wrong Method Passed");
                break;
        }
    }

    //Is element displayed.
    public static boolean isDisplayed(WebElement element) {
        waitExplicit(element, Constant.PagesHelperConstants.ELEMENTTOBECLICKABLE, Constant.PagesHelperConstants.TIME);
        boolean flag = element.isDisplayed();
        return flag;
    }
}
