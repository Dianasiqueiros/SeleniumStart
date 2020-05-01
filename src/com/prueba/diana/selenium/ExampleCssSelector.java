   package com.prueba.diana.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ExampleCssSelector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "/Users//DSV//Downloads//geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://login.salesforce.com/?locale=mx");
	
		driver.findElement(By.cssSelector("[id='username']")).sendKeys("hola");
		driver.findElement(By.cssSelector("[id='password']")).sendKeys("123");
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		
	}

}
