package com.ecom.amazon.tests.amazon.tests;

import org.openqa.selenium.WebDriver;

public class RunEnvironment {
	
			private static WebDriver WebDriver;

			public static WebDriver getWebDriver() {
				return WebDriver;
			}

			public static void setWebDriver(WebDriver webDriver) {
				WebDriver = webDriver;
			}
	

	

}
