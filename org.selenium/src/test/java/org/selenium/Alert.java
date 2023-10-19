package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert {
  public static void main(String[]args) throws Throwable {
	 WebDriverManager.edgedriver().setup();
	  WebDriver driver=new EdgeDriver();
	  driver.navigate().to("https://www.flipkart.com/");
	  
	  
	  driver.findElement(By.id("alertButton")).click();
	  Thread.sleep(2000);
	  Alert a=(Alert) driver.switchTo().alert();
	  String text =a.getText();
	  System.out.println(text);
	  a.accept();
	  
	  driver.findElement(By.id("confirm Button")).click();
	  String text1=a.getText();
	  System.out.println(text1);
	  a.dismiss();
	  
	  driver.findElement(By.id("promptButton")).click();
	  String text2=a.getText();
	  System.out.println(text2);
	  a.accept()
	  
			  
	  
	  
	  
	  
	  


	    
	    
	    
	  
  }

private void sendKeys(String string) {
	// TODO Auto-generated method stub
	
}

private void dismiss() {
	// TODO Auto-generated method stub
	
}

void accept() {
	// TODO Auto-generated method stub
	
}

String getText() {
	// TODO Auto-generated method stub
	return null;
}
  

}