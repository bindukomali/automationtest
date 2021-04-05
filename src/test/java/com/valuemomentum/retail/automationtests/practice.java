package com.valuemomentum.retail.automationtests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\testing\\chrome_driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
        Thread.sleep(2000);
		 JavascriptExecutor js = (JavascriptExecutor) driver;
	  driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Poco F1");
	  Thread.sleep(3000);
	  driver.findElement(By.id("nav-search-submit-button")).click();
	  Thread.sleep(3000);
	  js.executeScript("window.scrollBy(0,300)");
	  driver.findElement(By.linkText("Oppo")).click();
	  Thread.sleep(3000);
	  driver.navigate().to("https://www.edureka.co/");
	  Thread.sleep(3000);
	  String at = driver.getTitle();
	  String et ="amazon";
	 if(at.equalsIgnoreCase(et)) 
	  {
		  System.out.println("Test Successful");
	  }
	  else
	  {
		  System.out.println("Test Failure");
	  }
	  
	  driver.navigate().back();
	  driver.quit();
	}

}
