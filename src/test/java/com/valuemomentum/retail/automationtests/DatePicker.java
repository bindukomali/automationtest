package com.valuemomentum.retail.automationtests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
 
public class DatePicker {
 
    public static void main(String[] args)  throws InterruptedException  {
        // TODO Auto-generated method stub
    	System.setProperty("webdriver.chrome.driver", "C:\\testing\\chrome_driver\\chromedriver.exe");
        // calling webdriver
 
        
        WebDriver driver=new ChromeDriver();
        driver.get("https://paytm.com/flights");
        driver.manage().window().maximize();
        Thread.sleep(5000);
       
      //  WebElement departureDate = driver.findElement(By.xpath("(//*[@class='_3jkx'])[1]"));
      //  departureDate.click();
       // driver.findElement(By.name("departure-Date")).sendKeys("12 Apr 2021");
        
        
        
        driver.close();
        driver.quit();
        
 
    }
 
}
 