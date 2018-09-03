package main.java.constants;

public class Constant {

    public static final String PROJECTPATH = System.getProperty("user.dir");
    public static final String PROJECTOS = System.getProperty("os.name");


    public static class HooksConstant {
        public static final String CHROMEDRIVERLINUX = PROJECTPATH + java.io.File.separatorChar + "src" + java.io.File.separatorChar + "test" + java.io.File.separatorChar + "resources" + java.io.File.separatorChar + "Drivers" + java.io.File.separatorChar + "chromedriverlinux";
        public static final String CHROMEDRIVERWINDOWS = PROJECTPATH + java.io.File.separatorChar + "src" + java.io.File.separatorChar + "test" + java.io.File.separatorChar + "resources" + java.io.File.separatorChar + "Drivers" + java.io.File.separatorChar + "chromedriverwindows.exe";
        public static final String GECKODRIVERLINUX = PROJECTPATH + java.io.File.separatorChar + "src" + java.io.File.separatorChar + "test" + java.io.File.separatorChar + "resources" + java.io.File.separatorChar + "Drivers" + java.io.File.separatorChar + "geckodriverlinux";
        public static final String GECKODRIVERWINDOWS = PROJECTPATH + java.io.File.separatorChar + "src" + java.io.File.separatorChar + "test" + java.io.File.separatorChar + "resources" + java.io.File.separatorChar + "Drivers" + java.io.File.separatorChar + "geckodriverwindows.exe";
        public static final String BROWSERKEY = "browser";
        public static final String BROWSERDEFAULTVALUE = "chrome";
        public static final String PROPERTYKEYCHROME = "webdriver.chrome.driver";
        public static final String PROPERTYKRYFIREFOX = "webdriver.gecko.driver";
        public static final String CHROMEBROWSER = "chrome";
        public static final String FIREFOXBROWSER = "firefox";
        public static final String REPORTSFOLDER = Constant.PROJECTPATH + java.io.File.separatorChar + "Reports";
        public static final String REPORTFOLDER = Constant.PROJECTPATH + java.io.File.separatorChar + "Report";
        public static final String SCREENSHOTFOLDER = PROJECTPATH + java.io.File.separatorChar + "src" + java.io.File.separatorChar + "test" + java.io.File.separatorChar + "resources" + java.io.File.separatorChar + "ScreenShots";
    }

    public static class PagesHelperConstants {
        public static final String VISIBILITYOF = "visibilityof";
        public static final String VISIBILITYOFALLELEMENTS = "visibilityofallelements";
        public static final String ELEMENTTOBECLICKABLE = "elementtobeclickable";
        public static final String ELEMENTTOBESELECTED = "elementtobeselected";
        public static final String INVISIBILITYOF = "invisibilityof";
        public static final int TIME = 20;
    }

    public static class ExtentManagerConstant {
        public static final String TESTCASENAME = "ui-test";
        public static final String REPORTSPATH = PROJECTPATH + java.io.File.separatorChar + "Reports"
                + java.io.File.separatorChar;
    }

    public static class TakeScreenShotConstant {
        public static final String SCREENSHOTPATH = PROJECTPATH + java.io.File.separatorChar + "src" + java.io.File.separatorChar + "test" + java.io.File.separatorChar + "resources" + java.io.File.separatorChar + "ScreenShots" + java.io.File.separatorChar;
    }

    public static class SlackMessageConstants {
        public static final String TOKEN = "user token";
        public static final String CHANNEL = "#test";
        public static final String ENDPOINT = "report url";
    }

    public static class EXtentTestResult {
        public static final String PASSTEST = "passed";
        public static final String FAILTEST = "failed";
        public static final String SKIPTEST = "skiped";
    }

}
