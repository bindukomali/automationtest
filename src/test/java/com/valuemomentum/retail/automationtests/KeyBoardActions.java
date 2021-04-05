package com.valuemomentum.retail.automationtests;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class KeyBoardActions {
    
    public static void main(String[] args) throws InterruptedException {
        // TODO Auto-generated method stub
          //set the browser context
         //set the browser context
    	System.setProperty("webdriver.chrome.driver", "C:\\testing\\chrome_driver\\chromedriver.exe");
        WebDriver driver=  new ChromeDriver();
        driver.get("http://www.amazon.in");
        Thread.sleep(10000);
        
       // driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone"+ Keys.TAB+Keys.ENTER);
        //driver.findElement(By.id("nav-search-submit-button")).click();
        WebElement e=driver.findElement(By.id("//*[contains(@class,'gLFyf gsfi')]"));
       // e.sendKeys("iPhone"+Keys.ENTER);
        //e.sendKeys("iPhone"+Keys.TAB);
        //e.sendKeys("iPhone"+Keys.DOWN);
        e.sendKeys("iPhone"+Keys.UP);
        e.sendKeys(Keys.DOWN);
        e.sendKeys(Keys.DOWN);
        e.sendKeys(Keys.DOWN);
        e.sendKeys(Keys.UP);
        Thread.sleep(2000);
        e.sendKeys(Keys.ENTER);
        
        
        
        driver.close();
        driver.quit();
}
}
