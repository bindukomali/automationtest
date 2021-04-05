package com.valuemomentum.retail.automationtests;


import java.util.List;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

 

public class FindElementOfElement 
{
    public static void main(String [] args)throws InterruptedException
    {
    	System.setProperty("webdriver.chrome.driver", "C:\\testing\\chrome_driver\\chromedriver.exe");
        // calling web driver
        WebDriver driver=new ChromeDriver();
        
        driver.get("https://www.amazon.com");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        
        Thread.sleep(2000);
        
        WebElement menuItem=driver.findElement(By.id("nav-xshop"));
        //find Element of element
        WebElement values=menuItem.findElement(By.tagName("a"));
        
        //System.out.println("Get the value of the element: "+value.getText());
      
        //find Elements of elements
        List<WebElement> value=menuItem.findElements(By.tagName("a"));
        JavascriptExecutor js = (JavascriptExecutor)driver;
       

 

       //Executing JavaScript to click on element
         js.executeScript("arguments[0].click();", values);
       
        for(WebElement item : value)
        {
            System.out.println("Get the value of the element: "+item.getText());
        }
         
        
        
        
        driver.close();
    }
}