package com.valuemomentum.retail.automationtests;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
//import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.annotations.Test;
import org.testng.annotations.Test;
public class Kotak
{
	
	
//public static void main(String[] args) throws InterruptedException
    @Test
   
    public void verifyLogin()
    {
    
    
    //doesnot run as java (below one)
    //public static void DriverInitiation()throws InterruptedException

    {
    	System.setProperty("webdriver.chrome.driver", "C:\\testing\\chrome_driver\\chromedriver.exe");
        // calling web driver
        WebDriver driver=new ChromeDriver();
        
        driver.get("https://netbanking.kotak.com/knb2/");
        driver.manage().window().maximize();
        
        WebElement userName=new WebDriverWait(driver,Duration.ofSeconds(5))
                .until(ExpectedConditions.visibilityOfElementLocated(By.id("userName")));
        userName.sendKeys("GoGO");
        //Thread.sleep(2000);
       /* WebElement next=new WebDriverWait(driver,Duration.ofSeconds(5))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@type='submit']")));
        next.click();;
       */ 
        
        Wait<WebDriver> wait=new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(5))
                .pollingEvery(Duration.ofMillis(1)).ignoring(NoSuchElementException.class);
        
        
        WebElement next = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(By.xpath("//*[@type='submit']"));
            }
        });
        next.click();
        
        //driver.findElement(By.xpath("//*[@id=\"crnForm\"]/div[6]/button")).click();;
        
        //Thread.sleep(2000);
        //driver.findElement(By.id("userName")).sendKeys("GoGO");;
        //driver.findElement(By.xpath("//*[@type='submit']")).click();
        WebElement mobileNumber=new WebDriverWait(driver,Duration.ofSeconds(5))
                .until(ExpectedConditions.visibilityOfElementLocated(By.id("mobileNo")));
        mobileNumber.sendKeys("1234239843");
        
        
        //Thread.sleep(2000);
        //driver.findElement(By.id(" credentialInputField")).sendKeys("123445");;
        driver.findElement(By.xpath("/html/body/app-root/div/app-login/div/div[3]/div/div/div/app-verify-mobile-number/app-card-layout/div/form/div[5]/button")).click();
        //Thread.sleep(2000);
        
    /*    
        
        WebElement firstResult=new WebDriverWait(driver,Duration.ofSeconds(5))
                .until(ExpectedConditions.elementToBeClickable(By.id("userName")));
        firstResult.sendKeys("GoGO");
        
        driver.findElement(By.xpath("//*[@id=\"crnForm\"]/div[6]/button")).click();;
        
      */ 
  /*      
        Thread.sleep(2000);
        
        System.out.println("Active element is: "+driver.switchTo().activeElement().getTagName());
       // System.out.println("Active element is: "+driver.switchTo().activeElement().getText());
        System.out.println("Accessable name is: "+driver.switchTo().activeElement().getAccessibleName());
       // System.out.println("Active element is: "+driver.switchTo().activeElement().get());

 

    */    
        
    /*    
        
        WebElement btnNext=driver.findElement(By.xpath("//*[@type='submit']"));

 

        System.out.println("Displays the Next button: "+btnNext.isDisplayed());
        System.out.println("Next button enabled: "+btnNext.isEnabled());
        System.out.println("Next button selected: "+btnNext.isSelected());
    */    
       //driver.findElement(By.id("userName")).sendKeys("GoGO");;
/*
        System.out.println("Displays the Next button: "+btnNext.isDisplayed());
        System.out.println("Next button enabled: "+btnNext.isEnabled());
        System.out.println("Next button selected: "+btnNext.isSelected());
    
    */    
        //driver.findElement(By.xpath("//*[@id=\"crnForm\"]/div[6]/button")).sendKeys("GoGO");;

 

      
        
        
       driver.close();
        
    }
    }
}