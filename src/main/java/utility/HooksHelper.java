package main.java.utility;

import main.java.constants.Constant;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import test.java.base.BaseUtil;

import java.io.File;

public class HooksHelper extends BaseUtil {

    public static WebDriver openChromeDriver() {
        /*ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");*/
        if (Constant.PROJECTOS.contains("Linux")) {
            System.setProperty(Constant.HooksConstant.PROPERTYKEYCHROME, Constant.HooksConstant.CHROMEDRIVERLINUX);
            driver = new ChromeDriver();
            //driver = new MyChromeDriver();  //Remove comment when user want to run script slowly.
        } else {
            System.setProperty(Constant.HooksConstant.PROPERTYKEYCHROME, Constant.HooksConstant.CHROMEDRIVERWINDOWS);
            //driver = new ChromeDriver(options); //Add comment when running on local.
            driver = new ChromeDriver();  //Remove comment when running on local.
            //driver = new MyChromeDriver();//Remove comment when user want to run script slowly.
        }
        return driver;
    }

    public static WebDriver openFirefoxDriver() {
        if (Constant.PROJECTOS.contains("windows")) {
            System.setProperty(Constant.HooksConstant.PROPERTYKRYFIREFOX, Constant.HooksConstant.GECKODRIVERWINDOWS);
            driver = new FirefoxDriver();
        } else {
            System.setProperty(Constant.HooksConstant.PROPERTYKRYFIREFOX, Constant.HooksConstant.GECKODRIVERLINUX);
            driver = new FirefoxDriver();
        }
        return driver;
    }

    public static void onFinish() {
       /* SlackMessageHelper slackMessage = new SlackMessageHelper();
        String environment = "your environment name";
        int totalTestsCount = Common.TestCount.PASSCOUNT + Common.TestCount.FAILCOUNT + Common.TestCount.SKIPCOUNT;
        String reportLink = Constant.SlackMessageConstants.ENDPOINT + TestSuiteHelper.getFileName();
        String message = "[" + environment + "] " + Constant.ExtentManagerConstant.TESTCASENAME.toLowerCase() + ": " + Common.TestCount.PASSCOUNT + "/" + totalTestsCount + " scenarios passed | " + reportLink;
        try {
            slackMessage.sendMessage(Constant.SlackMessageConstants.CHANNEL, message, Constant.SlackMessageConstants.TOKEN);
        } catch (IOException e) {
            e.printStackTrace();
        }*/
        driver.quit();
    }

    public static void createFolder(String path) {
        File file = new File(path);
        if (!file.exists()) {
            file.mkdir();
        }
    }


}
