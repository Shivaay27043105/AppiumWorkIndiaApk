package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class CommonUtils {
	
	public static File file;
	
	public static Properties prop;
	
	public static FileInputStream fis;
	
	static AppiumDriverLocalService service;

	DesiredCapabilities capabilities = new DesiredCapabilities();
	
	AppiumDriver<MobileElement> driver;

	public void setAndroidCapabilities() {
		
		File appdir = new File("App");
		
		File app = new File(appdir, "in.workindia.apk");
		
		capabilities.setCapability("platformName", "Android");
		
		capabilities.setCapability("platformVersion", "8.1");
		
		capabilities.setCapability("appPackage", "in.workindia.nileshdungarwal.workindiaandroid");
		
		capabilities.setCapability("appActivity", "in.workindia.nileshdungarwal.workindiaandroid.RegisterActivity");
		
		capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		
		capabilities.setCapability("deviceName", "Android");


	}
	
	
	public AppiumDriver<MobileElement> getAndroidDriver() throws MalformedURLException{
		
		return driver =  new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
		
	}
}
