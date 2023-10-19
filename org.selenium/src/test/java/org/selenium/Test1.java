package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Test1 {
 public static void main(String[] args) {
		
			WebDriverManager.edgedriver().setup();
			WebDriver driver =new EdgeDriver();
			 driver.manage().window().maximize();
			 driver.get("http://www.facebook.com/");
			 
	      //driver.findElement(By.xpath("//span[@role=\"button\"]")).click();
		  //driver.findElements(By.xpath("(//div[@class=\"YBLJE4\"])[3]"));
		  WebElement user =driver.findElement(By.id("email"));
		  WebElement pass =driver.findElement(By.id("pass"));
		  WebElement login =driver .findElement(By.xpath("//input[@type=\"text\"]"));
		  
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		  
		  js.executeScript("arguments[0].setAttribute ('value','selenium')",user);
		  
		  js.executeScript("arguments[0].setAttribute('value','maari')", pass);
		  
		  js.executeScript("arguments[0].scrollIntoView(false);",user);
		  
		 // js.executeScript("arguments[0].scrollIntoview(fase)",user);
		  
		  
		  
		 
		 
		 
		 
 
 } 
}
