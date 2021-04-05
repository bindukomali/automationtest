package com.valuemomentum.retail.automationtest.utils;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

 

public class WebDriverHelper {

 

     static WebDriver driver;
    @BeforeTest
    public void test_beforesuite() {
        System.out.println(" Before Suite");
        System.setProperty("webdriver.chrome.driver", "C:\\testing\\chrome_driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

 

    public WebDriver getDriver() {
        return driver;
    }

 

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }
    
    @AfterTest
    public void test_aftersuite() {
        System.out.println(" After Suite");
        driver.close();
        driver.quit();
}

 

     public static void captureScreenshot(String methodName) {
         File scrFile =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            try {
                 FileUtils.copyFile(scrFile, new File("./screenshot/image"+methodName+".png"));
            } catch (IOException e) {
                e.printStackTrace();
            }
            
     }
     public static void switchToWindow() {
     String currentWindow =  driver.getWindowHandle(); 
     
     Set<String> windows = driver.getWindowHandles(); 
     
     Iterator<String> ite = windows.iterator();
     while(ite.hasNext()) 
     {
         String newWindow=ite.next();
         if(!currentWindow.equals(newWindow))
         {
             driver.switchTo().window(newWindow);
         }
     }
     driver.findElement(By.id("add-to-cart-button")).click();
     
 }
}
 