package com.cicd.practicepackage;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Logintobrowser extends BaseClass {
	
	
	@Test
	public Logintobrowser(WebDriver driver) 
    {
		
		System.out.println("Logged in--TestClass");
	}
	

}
