package org.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Windows {
 public static void main(String[] args) {
	WebDriverManager.edgedriver().setup();
	WebDriver driver =new EdgeDriver();
	driver.manage().window().maximize();
	
	driver.get("");
	
	
	  
	
}

private static Object Manager() {
	// TODO Auto-generated method stub
	return null;
}

private static Object edgedriver() {
	// TODO Auto-generated method stub
	return null;
}
}
