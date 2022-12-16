package Base_File;

//import java.awt.Dimension;
import java.io.File;

import java.io.IOException;
import java.lang.reflect.Method;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.Configurator;
import org.openqa.selenium.Dimension;
import static io.appium.java_client.touch.TapOptions.tapOptions;

import static io.appium.java_client.touch.offset.ElementOption.element;

import static io.appium.java_client.touch.LongPressOptions.longPressOptions;

import static io.appium.java_client.touch.offset.PointOption.point;

import static io.appium.java_client.touch.WaitOptions.waitOptions;

import static java.time.Duration.ofMillis;
//import org.openqa.selenium.Dimension;
//import org.openqa.selenium.interactions.internal.TouchAction;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Sreenshot.takeScreenshot;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.touch.offset.PointOption;
import io.appium.java_client.TouchAction;

public class TestBase {
	public static ExtentReports extent;
	public static ExtentTest extentTest;
	public static AppiumDriver<MobileElement> driver;
	
	static {
		String log4jConfigFile = System.getProperty("user.dir") + File.separator + "./Resources/log4j2.xml";

		Configurator.initialize(null, log4jConfigFile);
	}
	public static Logger logger = LogManager.getLogger(TestBase.class.getName());
	
	@BeforeMethod
	
	public void startTest(Method name) {

		String testname = name.getName();
		
		extentTest = extent.startTest(testname);
	}

	@AfterMethod
	public void endTest() {
		
		extent.endTest(extentTest);
	}
	
	public static void verticleswipebypercentage(double startpercentage, double endpercentage, double anchorpercentage) {



		Dimension size = driver.manage().window().getSize();
		
		int anchor = (int) (size.width * anchorpercentage);
		
		int startpoint = (int) (size.height * startpercentage);
		
		int endpoint = (int) (size.height * endpercentage);
		
		new TouchAction(driver).press(point(anchor, startpoint)).waitAction(waitOptions(ofMillis(1000)))
		.moveTo(point(anchor, endpoint)).release().perform();

		}


	@BeforeSuite
	public void setReports() {
		extent = new ExtentReports("./Reports/ExtentReport.html");
	}

	@AfterMethod
	public void atestCaseResult(ITestResult result) throws IOException {
		
		if (result.getStatus() == ITestResult.FAILURE) {
			
			String imagepath=takeScreenshot.captureScreenshot(driver, result.getName());
			
			extentTest.log(LogStatus.FAIL,extentTest.addScreenCapture(imagepath));
			
		} 
		else {
			
			if (result.getStatus() == ITestResult.SUCCESS) {
				
				extentTest.log(LogStatus.PASS, "Test case passed successfully");

			}
		}
	}

	@AfterSuite
	public void endReport() {
		extent.flush();
		extent.close();
	}
}
