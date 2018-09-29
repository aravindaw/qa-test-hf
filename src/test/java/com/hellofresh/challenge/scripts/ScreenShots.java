package com.hellofresh.challenge.scripts;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;

public class ScreenShots extends StartDriver {

    public static void takeSnapShot(String screenshotName) throws Exception {
        TakesScreenshot scrShot = ((TakesScreenshot) driver);
        File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
        File DestFile = new File(config.getProperty("IMAGE_PATH").toString() + screenshotName + "Failed.png");
        FileUtils.copyFile(SrcFile, DestFile);
    }
}
