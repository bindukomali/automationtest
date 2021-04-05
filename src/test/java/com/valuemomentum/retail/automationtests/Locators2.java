package com.valuemomentum.retail.automationtests;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Locators2{
    public static void main(String[] args) throws Exception {
    	System.setProperty("webdriver.chrome.driver", "C:\\testing\\chrome_driver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
          driver.get("http://www.amazon.in");
          Thread.sleep(10000);

          WebElement menueCustomerService = driver.findElement(By.xpath("//div/a[text()='Customer Service']"));
          
         
          Rectangle rect = driver.findElement(By.xpath("(//*[contains(text(),'Cart')])[1]")).getRect();
              System.out.println(" height value of "+ rect.getHeight());
              System.out.println(" Width value of "+ rect.getWidth());
              System.out.println(" X value of "+ rect.getX());
              System.out.println(" Y value of "+ rect.getY());
              System.out.println(" Dimensions value of "+ rect.getDimension());
              System.out.println(" Point value of "+ rect.getPoint());

          
          System.out.println(menueCustomerService.getText());
          System.out.println("Accessible name of the element "+menueCustomerService.getAccessibleName());
          System.out.println("Aria name of the element "+menueCustomerService.getAriaRole());
          System.out.println("Attributes of the element "+menueCustomerService.getAttribute("data-csa-c-id"));
          System.out.println("Value of the element "+menueCustomerService.getAttribute("value"));
          System.out.println("CSS - color Value of the element "+menueCustomerService.getCssValue("color"));
          System.out.println("CSS - font family value of the element "+menueCustomerService.getCssValue("font-family"));
          System.out.println("CSS - font size value of the element "+menueCustomerService.getCssValue("font-size"));
          System.out.println("DOM Attribute Value of the element "+menueCustomerService.getDomAttribute("data-csa-c-id"));
          System.out.println("DOM Attribute Value of the element "+menueCustomerService.getDomProperty("data-csa-c-id"));
          System.out.println("Tag of the element "+menueCustomerService.getTagName());
          
      
          driver.close();
          driver.quit();
          
      
         

 

}
}