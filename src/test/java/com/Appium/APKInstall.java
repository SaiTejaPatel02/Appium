package com.Appium;

import java.net.URI;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class APKInstall {

	public static void main(String[] args) throws Exception {

		// TODO Auto-generated method stub

		// Gather Desired capabilities
		// edited
		DesiredCapabilities capabilities = new DesiredCapabilities();

		capabilities.setCapability("deviceName", "OnePlus");
		capabilities.setCapability("platformname", "Android");
		capabilities.setCapability("automationName", "uiautomator2");
		capabilities.setCapability("app",
				"should provide the apk path example-C:\\Users\\ASUS\\Desktop\\Appium\\apkfiles\\sample Calculator_1.0_Apkpure.apk");
		capabilities.setCapability("platformversion", "12");

		URL url = URI.create("provide the URL from appium server").toURL();

		AndroidDriver driver = new AndroidDriver(url, capabilities);

		Thread.sleep(5000);
		System.out.println("Application Started");
		driver.quit();// CLOSE SESSION

	}

}
