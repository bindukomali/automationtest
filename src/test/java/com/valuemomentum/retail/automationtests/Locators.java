package com.valuemomentum.retail.automationtests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\testing\\chrome_driver\\chromedriver.exe");
        //calling webDriver
    	WebDriver driver= new ChromeDriver();
    	driver.manage().window().maximize();
        driver.navigate().to("https://www.amazon.in");
        
        Thread.sleep(2000);
        
        driver.findElement(By.linkText("Fashion")).click();
        Thread.sleep(2000);
        driver.findElement(By.partialLinkText("Men's t - shirts & polos")).click();
        driver.close();
        driver.quit();
        
	}

}
