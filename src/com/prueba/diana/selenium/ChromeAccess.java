package com.prueba.diana.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//chrome
public class ChromeAccess {

	
	public static void main(String[] args) {
		//1. create driver object to connect with the chrome
		//2. we only can implement methods of webdriver(interface)
		//3. set de property web driver
		System.setProperty("webdriver.chrome.driver", "//Users//DSV//Downloads//chromedriver");
		WebDriver  driver= new ChromeDriver();
		//default a page in the browser
		driver.get("http://google.com");
	 	System.out.println(driver.getTitle());
	 	//con este metodo comprobamos en que url completa 
	 	//, cuenta con mayor seguridad
	 	System.out.println(driver.getCurrentUrl()); 
	 	
	 	//System.out.println(driver.getPageSource());
	 	driver.get("http://amazon.com");
	 	//navigate at the first web
	 	//driver.navigate().back();
	 	//driver.navigate().forward();
	 	//close de browser
		driver.close();
		//when you deal with child windows
		driver.quit();
	}


}
