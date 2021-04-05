package com.valuemomentum.retail.automationtests;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrames implements  IWebDriverHelper{
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\testing\\chrome_driver\\chromedriver.exe");
        //calling webDriver
    	WebDriver driver= new ChromeDriver();
    	driver.manage().window().fullscreen();
        driver.navigate().to("https://www.w3schools.com/html/html_iframe.asp");
        Thread.sleep(3000);
        int iframeSize = driver.findElements(By.tagName("iframe")).size();
        Thread.sleep(3000);
        System.out.println("total iframes in webpage" + iframeSize);
        
        Dimension size = driver.manage().window().getSize();
        int width1 = size.getWidth();
        int height1 = size.getHeight();
        driver.manage().window().setSize(new Dimension(1155,800));
        Thread.sleep(2000);
        driver.manage().window().setSize(new Dimension(900,800));
        Thread.sleep(2000);
        
        System.out.println("Width of the screen ="+width1);
       System.out.println("Height of the screen ="+height1);
       
       Point position = driver.manage().window().getPosition();
       int x1 = position.getX(); 
       int y1 = position.getY();
       System.out.println(x1);
       System.out.println(y1);
       
       driver.manage().window().setPosition(new Point(800,1000));
       
        
      /* driver.switchTo().frame(0);
       Thread.sleep(20000);
      driver.findElement(By.id("topnavbtn_tutorials")).click();
      driver.switchTo().parentFrame();
     
      driver.findElement(By.id("topnavbtn_tutorials")).click();
      */
        driver.switchTo().frame(0);
        Thread.sleep(5000);
       driver.findElement(By.id("topnavbtn_references")).click();
       driver.switchTo().parentFrame();
       Thread.sleep(5000);
       driver.findElement(By.id("topnavbtn_references")).click();
       Thread.sleep(5000);
 
      //  driver.findElement(By.id("topnavbtn_references")).click();
        Thread.sleep(1000);
        driver.close();
        driver.quit();
        
	}

	@Override
	public void iclick() {
		// TODO Auto-generated method stub
		
	}

}
