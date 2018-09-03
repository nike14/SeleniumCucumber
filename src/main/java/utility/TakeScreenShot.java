package main.java.utility;

import com.cucumber.listener.Reporter;
import main.java.constants.Constant;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;
import test.java.base.BaseUtil;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.util.Date;

public class TakeScreenShot extends BaseUtil {

    public static String takeScreenShot() {

        Date dateObj = new Date();
        String fileName = dateObj.toString().replace(":", "_").replace(" ", "_") + Thread.currentThread().getStackTrace()[2].getMethodName() + ".png";
        String filePath = Constant.TakeScreenShotConstant.SCREENSHOTPATH + fileName;

        Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(100))
                .takeScreenshot(driver);

        //File scrFile = ((org.openqa.selenium.TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            //FileUtils.copyFile(scrFile, new File(filePath));
            ImageIO.write(screenshot.getImage(), "PNG",
                    new File(filePath));
        } catch (IOException e) {
            Reporter.addStepLog("---------------Exception-------------" + e);
        }

        return filePath;
    }
}
