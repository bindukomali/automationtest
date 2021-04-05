package com.valuemomentum.retail.automationtests;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MedPlus {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\testing\\chrome_driver\\chromedriver.exe");
        //calling webDriver
		  WebDriver driver=new ChromeDriver();
	     
	        
	        driver.get("https://www.medplusmart.com");
	        driver.manage().window().maximize();
	        System.out.println(driver.getTitle());
	        
	        Thread.sleep(2000);
	        
	        WebElement category=driver.findElement(By.cssSelector("body > header > div.webNav.hidden-xs > nav.menubar > ul > li.static.shopByCategory > a"));
	        Actions action=new Actions(driver);
	        action.moveToElement(category).perform();
	        Thread.sleep(3000);
	        
	        WebElement personalcare=driver.findElement(By.linkText("Personal Care"));
	        action.moveToElement(personalcare).perform();
	        System.out.println(driver.findElement(By.linkText("personal Care")).getText());
	        Thread.sleep(3000);
	        
	        
	}
}