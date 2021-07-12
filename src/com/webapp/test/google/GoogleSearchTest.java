package com.webapp.test.google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {

	public static void main(String[] args) {

		// 1. formulate test url
		final String siteURL = "http://www.google.com/";
		final String driverPath = "driver\\chromedriver.exe";

		// 2. set selenium system property
		System.setProperty("webdriver.chrome.driver", driverPath);

		// 3. Instantiate selenium webdriver
		WebDriver driver = new ChromeDriver();

		// 4. Launch browser window
		driver.get(siteURL);
		
		// 5 . search data in search bar
		WebElement searchBar = driver.findElement(By.name("q"));
		searchBar.sendKeys("selenium documentation");
		searchBar.submit();

		// 5. perform test evaluation.
		String expectedTitle = "selenium documentation - Google Search";
		String actualTitle = driver.getTitle();

		if (actualTitle.equals(expectedTitle)) {
			System.out.println("Test is passed !");
		} else {
			System.out.println("Test is failed !");
		}
		System.out.println("Expected Title : " + expectedTitle);
		System.out.println("Actual Title : " + actualTitle);

		// 6. close driver.
		driver.close();

	}

}
