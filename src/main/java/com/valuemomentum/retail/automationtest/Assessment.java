package com.valuemomentum.retail.automationtest;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.Select;

public class Assessment {

	public static void main(String[] args) throws InterruptedException 
	{
		

		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
        // calling web driver
        WebDriver driver=new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        
        driver.get("https://www.medplusmart.com");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        
        Thread.sleep(2000);
        
        
        
        WebElement category=driver.findElement(By.cssSelector("body > header > div.webNav.hidden-xs > nav.menubar > ul > li.static.shopByCategory > a"));
        Actions action=new Actions(driver);
        action.moveToElement(category).perform();
       
        Thread.sleep(5000);
        
        
        WebElement personalcare=driver.findElement(By.linkText("Personal Care"));
       
        action.moveToElement(personalcare).perform();
        System.out.println(driver.findElement(By.linkText("Personal Care")).getText());
        Thread.sleep(5000);
        
        //Select Toothpaste & powder
        driver.findElement(By.cssSelector("body > header > div.webNav.hidden-xs > div.main-nav.sub-menu-hover > ul > li:nth-child(3) > div > div > div.col-md-9.padding-none > div > div > figure:nth-child(3) > ul > li:nth-child(2) > a")).click();
        System.out.println(driver.findElement(By.linkText("Tooth Paste & Powder")).getText());
        
        Thread.sleep(5000);
        
        WebElement slider = driver.findElement(By.xpath("//*[@id=\"PriceRange\"]/div[1]/div[1]/div[1]")); 
                       
        
         action.clickAndHold(slider);
         action.moveByOffset(-40, 0).build().perform();
         driver.findElement(By.cssSelector("#PriceRange > div.slider.slider-horizontal > div.slider-track > div:nth-child(3)")).click();
         
         
         Thread.sleep(5000);
         //scroll page
         js.executeScript("window.scrollBy(0,250)");
         
         Thread.sleep(2000);
         
         //select dropdown
         driver.findElement(By.linkText("140 grams")).click();
         Thread.sleep(5000);
         //change to 70gms
         driver.findElement(By.linkText("70 grams - Rs 55.00")).click();
         Thread.sleep(5000);
         //Add to cart
         driver.findElement(By.xpath("//*[@id=\"PEPS0032\"]/div[4]/div[4]/form/div[1]/div[2]/button")).click();
         Thread.sleep(5000);
         
         driver.findElement(By.linkText("150 grams")).click();
         Thread.sleep(5000);
         //change to 80gms
         driver.findElement(By.linkText("80 grams - Rs 50.00")).click();
         Thread.sleep(5000);
         //Add to cart
         driver.findElement(By.xpath("//*[@id=\"PEPS0054\"]/div[4]/div[4]/form/div[1]/div[2]/button")).click();
         Thread.sleep(5000);
         
         
     
	}

	

}

