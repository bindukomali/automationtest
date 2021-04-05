package com.valuemomentum.retail.automationtests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleTest3 {

	public static void main(String[] args) throws InterruptedException {
	
		        // TODO Auto-generated method stub
		        //set the browser context
		    	System.setProperty("webdriver.chrome.driver", "C:\\testing\\chrome_driver\\chromedriver.exe");
		        //calling webDriver
		    	WebDriver driver= new ChromeDriver();
		    	driver.manage().window().maximize();
		        driver.navigate().to("https://www.amazon.in");
		        
		        Thread.sleep(2000);
		        
		        driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[3]")).click();
		        Thread.sleep(2000);
		        driver.findElement(By.xpath("//*[@id=\"widgetFilters\"]/div[1]/div[2]/span[8]/div/label/span")).click();
		        Thread.sleep(2000);
		        
		        driver.findElement(By.xpath("//*[@id=\"dealTitle\"]")).click();
		        Thread.sleep(5000);
		        driver.findElement(By.id("100 99d76279-announce")).click();
		        Thread.sleep(3000);
		        driver.close();
		        driver.quit();

	}

}
