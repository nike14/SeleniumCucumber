package test.java.steps;


import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import main.java.commons.Common;
import main.java.constants.Constant;
import main.java.utility.HooksHelper;
import main.java.utility.TestSuiteHelper;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogType;
import test.java.base.BaseUtil;

public class Hooks extends BaseUtil {

    private static boolean beforeFlag = false;

    @Before
    public void beforeAll() {
        if (!beforeFlag) {
            //Cucumber report folder
            HooksHelper.createFolder(Constant.HooksConstant.REPORTFOLDER);
            // Extent report folder
            HooksHelper.createFolder(Constant.HooksConstant.REPORTSFOLDER);
            // Screen shot folder
            HooksHelper.createFolder(Constant.HooksConstant.SCREENSHOTFOLDER);
            Common.HookClass.BROWSERNAME = System.getProperty(Constant.HooksConstant.BROWSERKEY, Constant.HooksConstant.BROWSERDEFAULTVALUE);
            switch (Common.HookClass.BROWSERNAME.toLowerCase()) {
                case Constant.HooksConstant.CHROMEBROWSER:
                    driver = HooksHelper.openChromeDriver();
                    break;
                case Constant.HooksConstant.FIREFOXBROWSER:
                    driver = HooksHelper.openFirefoxDriver();
                    break;

                default:
                    HooksHelper.openChromeDriver();
                    break;
            }
            driver.manage().window().maximize();
            beforeFlag = true;
        }

    }

    @After
    public void tearDown(Scenario scenario) {
        TestSuiteHelper.updateCount(scenario.getStatus());
        if (scenario.isFailed()) {
            LogEntries logEntries = driver.manage().logs().get(LogType.BROWSER);
            TestSuiteHelper.takeScreenShotHelper();
            TestSuiteHelper.extractLogs(logEntries);
        }

    }


    private static final Thread CLOSE_THREAD = new Thread() {
        @Override
        public void run() {
            HooksHelper.onFinish();
        }
    };

    static {
        Runtime.getRuntime().addShutdownHook(CLOSE_THREAD);
    }


}
