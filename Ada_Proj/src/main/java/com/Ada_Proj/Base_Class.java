package com.Ada_Proj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Base_Class {
	
	public static WebDriver driver; // null

	public static WebDriver getDriver(String type) {

	if (type.equalsIgnoreCase("chrome")) {

	System.setProperty

	("webdriver.chrome.driver",
	"C:\\Users\\Vijayakumar\\eclipse-workspace\\Ada_Proj\\Driver\\chromedriver.exe");

	driver = new ChromeDriver();

	}

	else if (type.equalsIgnoreCase("firefox")) {

	System.setProperty

	("webdriver.gecko.driver",
			"C:\\Users\\Vijayakumar\\eclipse-workspace\\Ada_Proj\\Driver\\chromedriver.exe");

	driver = new FirefoxDriver();

	}

	return driver;

	}

	public static void clickOnElement(WebElement element) {

	element.click();

	}

	public static void inputValueElement(WebElement element, String value) {

	element.sendKeys(value);

	}

	public static void getUrl(String url) {

	driver.get(url);

	}

	public static void dropdown(String type, WebElement element, String value) {

	Select s = new Select(element);

	if (type.equalsIgnoreCase("byvalue")) {

	s.selectByValue(value);

	}

	else if (type.equalsIgnoreCase("byVisibleText")) {

	s.selectByVisibleText(value);

	}

	else if (type.equalsIgnoreCase("byIndex")) {

	int data = Integer.parseInt(value);

	s.selectByIndex(data);

	}

	}

	public static void close() {

	driver.close();

	}

	public static void quit() {

	driver.quit();

	}

}
