package com.prueba.diana.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

	public static void main(String[] args) {
		// 1. create driver object to connect with the chrome
		// 2. we only can implement methods of webdriver(interface)
		// 3. set de property web driver

		System.setProperty("webdriver.chrome.driver", "//Users//DSV//Downloads//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		System.out.println(driver.getTitle());

	}
}
