package com.valuemomentum.retail.automationtests;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

 

public class ScreenShotDemo {
    public static void main(String args[]) throws IOException, InterruptedException {
    	System.setProperty("webdriver.chrome.driver", "C:\\testing\\chrome_driver\\chromedriver.exe");

 

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.amazon.in");
        Thread.sleep(3000);
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("./ScreenShot/image.png"));
        Thread.sleep(3000);
        driver.close();
        driver.quit();
    }
}
 
