package com.cicd.practicepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class BaseClass {
	
	public  WebDriver driver;
	@Test
	public void launchPage()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32_new\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
	}
	

}
