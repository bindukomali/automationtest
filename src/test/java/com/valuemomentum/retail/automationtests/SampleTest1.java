package com.valuemomentum.retail.automationtests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class SampleTest1 {

	
		// TODO Auto-generated method stub
		   public static void main(String[] args) throws InterruptedException {
		        // TODO Auto-generated method stub
		        //set the browser context
		    	System.setProperty("webdriver.chrome.driver", "C:\\testing\\chrome_driver\\chromedriver.exe");
		        //calling webDriver
		    	WebDriver driver= new ChromeDriver();
		        driver.navigate().to("https://www.amazon.in");
		        Thread.sleep(2000);

		        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Home and kitchen");
		        driver.findElement(By.id("nav-search-submit-button")).click();
		        driver.findElement(By.id("n/976442031")).click();
		        driver.findElement(By.xpath("//*[@id=\"n/1380374031\"]/span/a/span")).click();
		        driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[2]/div/span[3]/div[2]/div[7]/div/span/div/div/div[2]/h2")).click();
		        driver.findElement(By.id("add-to-cart-button")).click();
		        Thread.sleep(2000);
		       
		        
		        
		        driver.close();
		        driver.quit();
		        
	}

}
