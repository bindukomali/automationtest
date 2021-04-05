package com.valuemomentum.retail.automationtests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators1 {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\testing\\chrome_driver\\chromedriver.exe");
        //calling webDriver
    	WebDriver driver= new ChromeDriver();
    	driver.manage().window().maximize();
        driver.navigate().to("https://www.amazon.in");
        Thread.sleep(1000);
        WebElement logo = driver.findElement(By.id("nav-logo-sprites"));
        
        WebElement Fashion=driver.findElement(By.xpath("//div/span[contains(text(),\"Fashion\")]"));
      //  driver.findElement(By.xpath("//div/a[contains(text(),\"Fashion\")]"));
        
	
		System.out.println("font family:"+Fashion.getCssValue("font-family"));
		   System.out.println("Accessible name of the element "+Fashion.getAccessibleName());
	          System.out.println("Aria name of the element "+Fashion.getAriaRole());
	          System.out.println("Attributes of the element "+Fashion.getAttribute("data-csa-c-id"));
	          System.out.println("Value of the element "+Fashion.getAttribute("value"));
	          System.out.println("CSS - color Value of the element "+Fashion.getCssValue("color"));
	          System.out.println("CSS - font family value of the element "+Fashion.getCssValue("font-family"));
	          System.out.println("CSS - font size value of the element "+Fashion.getCssValue("font-size"));
	          System.out.println("DOM Attribute Value of the element "+Fashion.getDomAttribute("data-csa-c-id"));
	          System.out.println("DOM Attribute Value of the element "+Fashion.getDomProperty("data-csa-c-id"));
	          System.out.println("Tag of the element "+Fashion.getTagName());
	          
      
        
        
	}
	
}
