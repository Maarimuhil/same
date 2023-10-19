package org.selenium;

import java.util.List;

import org.checkerframework.checker.units.qual.s;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {
   public static void main(String[] arg) {
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver =new EdgeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		 
		 WebElement single =driver.findElement(By.xpath("//select[@class=\"col-lg-3\"]"));
		 Select s=new Select (single);
		// s.selectByIndex(2);
		// s.selectByValue("Apple");
		// s.selectByVisibleText("bing");
		 
		// boolean multiple=s.isMultiple();
		 //System.out.println(multiple);
		 
		 List<WebElement>options=s.getOptions();
		 for(int i=0;i<options.size();i++) {
			WebElement si= options.get(i);
			String  text=si.getText();
			System.out.println(text);
			 
		 }
		 
		 // s.index(1);
		// Thread.sleep(2000);
		 
		  
		 
		 
	
}
}
