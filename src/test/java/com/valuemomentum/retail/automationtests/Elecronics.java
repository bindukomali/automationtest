package com.valuemomentum.retail.automationtests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Elecronics {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\testing\\chrome_driver\\chromedriver.exe");
        //calling webDriver
    	WebDriver driver= new ChromeDriver();
    	driver.manage().window().maximize();
        driver.navigate().to("https://www.amazon.in");
        
        Thread.sleep(2000);
        driver.findElement(By.linkText("Mobiles")).click();
        Thread.sleep(2000);
        driver.findElement(By.partialLinkText("Noise")).click();
        Thread.sleep(2000);
        
        driver.navigate().back();
        driver.findElement(By.partialLinkText("Spigen India")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("low-price")).sendKeys("1000");
        driver.findElement(By.id("high-price")).sendKeys("5000");
        driver.close();
        driver.quit();
	}
}
