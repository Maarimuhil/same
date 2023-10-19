package org.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Autoit {
	public static void main(String[] args) throws Exception {
		WebDriverManager.edgedriver().setup();
		WebDriver driver =new EdgeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		
	      WebElement dropdown = driver.findElement(By.tagName("select"));
	     Select select=new Select(dropdown);
	     List<WebElement> options = select.getOptions();
	     for(WebElement value:options) {
	    	 String text = value.getText();
	    	 System.out.println(text);
	     }
		
		 
		 
		// dropdown.deselectByIndex(1);
		
		 
		 
		 
          //JavascriptExecutor js=(JavascriptExecutor)driver;
          
         // js.executeScript("arguments[0].sendkeys(false);js");
          

}
}
