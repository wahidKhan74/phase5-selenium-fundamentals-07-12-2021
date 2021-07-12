package com.webapp.test.google;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSourceURLTest {

	public static void main(String[] args) {

		// 1. formulate test url
		final String siteURL = "https://www.google.com/?gws_rd=ssl";
		final String driverPath = "driver\\chromedriver.exe";

		// 2. set selenium system property
		System.setProperty("webdriver.chrome.driver", driverPath);

		// 3. Instantiate selenium webdriver
		WebDriver driver = new ChromeDriver();

		// 4. Launch browser window
		driver.get(siteURL);

		// 5. perform test evaluation.
		if (siteURL.equals(driver.getCurrentUrl())) {
			System.out.println("Test is passed !");
		} else {
			System.out.println("Test is failed !");
		}
		System.out.println("Expected URL : " + siteURL);
		System.out.println("Actual URL : " + driver.getCurrentUrl());

		// 6. close driver.
		driver.close();

	}

}
