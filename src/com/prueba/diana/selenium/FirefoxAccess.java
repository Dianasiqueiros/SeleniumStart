package com.prueba.diana.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//firefox
public class FirefoxAccess {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "/Users//DSV//Downloads//geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		
	}
}
