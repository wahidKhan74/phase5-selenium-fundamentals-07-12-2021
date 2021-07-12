package com.webapp.test.amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonProductSearchTest {

	public static void main(String[] args) {
		
		// 1. formulate test url
		final String siteURL = "http://www.amazon.in/";
		final String driverPath = "driver\\chromedriver.exe";

		// 2. set selenium system property
		System.setProperty("webdriver.chrome.driver", driverPath);

		// 3. Instantiate selenium webdriver
		WebDriver driver = new ChromeDriver();

		// 4. Launch browser window
		driver.get(siteURL);
		
		// 5. product search on amazon webapp
		WebElement searchBar = driver.findElement(By.id("twotabsearchtextbox"));
		searchBar.sendKeys("Iphone 12 max pro");
		searchBar.submit();
		
		
		// 5. test evaluation
		String expectedTitle = "Amazon.in : Iphone 12 max pro";
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
