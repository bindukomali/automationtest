package com.valuemomentum.retail.automationtests;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SampleTest {

 

    public static void main(String[] args) throws InterruptedException {
        // TODO Auto-generated method stub
        //set the browser context
    	System.setProperty("webdriver.chrome.driver", "C:\\testing\\chrome_driver\\chromedriver.exe");
        //calling webDriver
    	WebDriver driver= new ChromeDriver();
    	driver.manage().window().maximize();
        driver.navigate().to("https://www.amazon.in");
       // Thread.sleep(10000);
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        System.out.println(" Current URL = "+ driver.getCurrentUrl());
        System.out.println(" Windows details "+ driver.getWindowHandle());
        WebElement firstResult = new WebDriverWait(driver,Duration.ofSeconds(10))
        		.until(ExpectedConditions.elementToBeClickable(By.id("twotabsearchtextbox")));
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
        driver.findElement(By.id("nav-search-submit-button")).click();
        //opens a new tab and switches to new tab
        //driver.switchTo().newWindow(WindowType.TAB);
        
        //Opens a new window and switches to new window
       // driver.switchTo().newWindow(WindowType.WINDOW);
        
       // driver.close();
       // driver.close();
        
        driver.navigate().back();
        driver.navigate().forward();
        driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[2]/div/span[3]/div[2]/div[2]/div/span/div/div/div/div/div[2]/div[2]/div/div[1]/div/div/div[1]/h2/a/span")).click();
        
        String currentWindow =  driver.getWindowHandle();
        Set<String> windows = driver.getWindowHandles();
        Iterator<String> ite = windows.iterator();
        while(ite.hasNext()) {
            String newWindow=ite.next();
            if(!currentWindow.equals(newWindow)) {
                driver.switchTo().window(newWindow);
            }
        }
        driver.findElement(By.id("add-to-cart-button")).click();
        Thread.sleep(4000);
        //driver.findElement(By.id("dropdownLangauge")).click();
        //Thread.sleep(5000);
        //driver.findElement(By.xpath("//*[@id=\"fr\"]")).click();
        driver.close();
        driver.quit();
       
    }

 

}