package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v117.performance.Performance;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Action {
   public static void main(String[] args) {
	   WebDriverManager.edgedriver().setup();
		  WebDriver driver =new EdgeDriver();
		  driver.manage().window().maximize();
		  driver.get ("https://www.facebook.com/");
		  
		  WebElement findElement = driver.findElement(By.xpath("//input[@type='text']"));
		  findElement.sendKeys("maari") ;               
  //WebElement findElement1 = driver.findElement("//input[@type=\'password\']");
		  WebElement findElement1 = driver.findElement(By.xpath("//input[@type=\'password\']"));
		  findElement1.sendKeys("pannerselvam");
		  
		  //Action ac=new Action();
		 WebElement cl = driver.findElement(By.name("login"));
		// cl.click();
		 
		// WebElement findElement2 = driver.findElement(By.id(""));
		 
		 Actions a= new Actions(driver);
		 a.click(cl).perform();
		  
		  
		  
		  
}
}
