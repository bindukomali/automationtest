package com.valuemomentum.retail.automationtests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	
		   
		
		System.setProperty("webdriver.chrome.driver", "C:\\testing\\chrome_driver\\chromedriver.exe");
        // calling web driver
	    // calling web driver
        WebDriver driver=new ChromeDriver();
        
        
        driver.get("https://www.medplusmart.com");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        Thread.sleep(3000);
        
        
        
        WebElement element = driver.findElement(By.xpath("/html/body/header/div[1]/nav[2]/ul/li[2]/a"));
        System.out.println("Text in page is"+element.getText());
        System.out.println(element.getAccessibleName());
        System.out.println(element.getAriaRole());
        driver.close();
        
    
        
	}

}
