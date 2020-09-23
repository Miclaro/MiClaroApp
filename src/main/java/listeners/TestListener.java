package listeners;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.util.Map;


import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;


import main.BasePage;
import reports.ExtentReport;
import utils.TestUtils;


public class TestListener implements ITestListener {

    public AndroidDriver<MobileElement> driver;
    TestUtils utils = new TestUtils();

    @lombok.SneakyThrows
    public void onTestFailure(ITestResult result) {
        if (result.getThrowable() != null) {
            StringWriter sw = new StringWriter();
            PrintWriter pw = new PrintWriter(sw);
            result.getThrowable().printStackTrace(pw);
            utils.log().error(sw.toString());
        }

        BasePage base = new BasePage(driver);
        File file = base.getDriver().getScreenshotAs(OutputType.FILE);

        byte[] enconded = null;
        try {
            enconded = Base64.encodeBase64(FileUtils.readFileToByteArray(file));
        } catch (IOException e1) {
            e1.printStackTrace();
        }

        Map<String, String> params;
        params = result.getTestContext().getCurrentXmlTest().getAllParameters();

        String imagePath = "Screenshots" + File.separator + params.get("platformName")
                + "_" + params.get("deviceName") + File.separator + base.getDateTime() + File.separator
                + result.getTestClass().getRealClass().getSimpleName() + File.separator + result.getName() + ".png";

        String completeImagePath = System.getProperty("user.dir") + File.separator + imagePath;

        try {
            FileUtils.copyFile(file, new File(imagePath));
            Reporter.log("This is the sample screenshot");
            Reporter.log("<a href='" + completeImagePath + "'> <img src='" + completeImagePath + "' height='400' width='400'/> </a>");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


        try {
            ExtentReport.ExtentManager.getTest().fail("Test Failed",
                    MediaEntityBuilder.createScreenCaptureFromPath(completeImagePath).build());
            ExtentReport.ExtentManager.getTest().fail("details", MediaEntityBuilder.createScreenCaptureFromBase64String(new String(enconded, StandardCharsets.US_ASCII)).build());
        } catch (IOException e) {
            e.printStackTrace();
        }
        ExtentReport.ExtentManager.getTest().fail(result.getThrowable());
    }
    @Override
    public void onTestStart(ITestResult result) {
        ExtentReport.ExtentManager.startTest(result.getName(), result.getMethod().getDescription());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        ExtentReport.ExtentManager.getTest().log(Status.PASS, "Test passed");

    }

    @Override
    public void onTestSkipped(ITestResult result) {
        ExtentReport.ExtentManager.getTest().log(Status.SKIP, "Test skipped");


    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        // TODO Auto-generated method stub

    }

    @Override
    public void onStart(ITestContext context) {
        // TODO Auto-generated method stub

    }

    @Override
    public void onFinish(ITestContext context) {
        ExtentReport.ExtentManager.getReporter().flush();

    }

}