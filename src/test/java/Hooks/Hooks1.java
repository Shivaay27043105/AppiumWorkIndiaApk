package Hooks;

import java.net.MalformedURLException;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import utility.CommonUtils;

public class Hooks1  {
	
	static AppiumDriverLocalService service;
	
	private static AppiumDriver<MobileElement> driver;
	
public static AppiumDriver<MobileElement> GetDriver(){
	
	return driver;
	
}
	@Before ("@appium")
	
	public void launchandinstallapp() throws MalformedURLException {
		
		service = AppiumDriverLocalService.buildDefaultService();
		
		service.start();
		
		CommonUtils objCommonUtils = new CommonUtils();
		
		objCommonUtils.setAndroidCapabilities();
		
		driver = objCommonUtils.getAndroidDriver();
		
	}
	
	@After("@appium")
	
	public void stopService() {
		
		service.stop();
	}
}
