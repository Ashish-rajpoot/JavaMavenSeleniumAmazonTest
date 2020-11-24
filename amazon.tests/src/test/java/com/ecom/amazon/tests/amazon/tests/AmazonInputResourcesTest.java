package com.ecom.amazon.tests.amazon.tests;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonInputResourcesTest {

	@Before
	public void startBrowser() {
		App.initWebDriver();
	}

	@Test
	public void verifyTheAmazonSite() {
		WebDriver drive = RunEnvironment.getWebDriver();
		final String siteUrl = "https://www.amazon.in/";
		drive.get(siteUrl);
		List<WebElement> allInputs = drive.findElements(By.tagName("input"));
		for (WebElement oneInput : allInputs) {
			System.out.println(oneInput.getAttribute("value"));
		}

	}

	@After
	public void closeBrowser() {
		App.shutDownDriver();
	}

}
