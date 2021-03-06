package com.ecom.amazon.tests.amazon.tests;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class AmazonSiteTest {
	
		@Before
		public void startBrowser() {
			App.initWebDriver();
		}
		
		@Test
		public void verifyTheAmazonSite() {
		WebDriver drive =RunEnvironment.getWebDriver();
		final String siteUrl = "https://www.amazon.in/";
		drive.get(siteUrl);		
		assertEquals(siteUrl,drive.getCurrentUrl());
		}
		@After
		public void closeBrowser() {
			App.shutDownDriver();
		}

}
