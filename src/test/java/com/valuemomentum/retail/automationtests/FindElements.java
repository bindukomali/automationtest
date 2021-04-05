package com.valuemomentum.retail.automationtests;



import java.io.File;
import java.io.IOException;
import java.util.List;
 
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.Rectangle;
    import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.WebElement;
    import org.openqa.selenium.chrome.ChromeDriver;
 
    public class FindElements {
 
        public static void main(String[] args) throws InterruptedException {
            // TODO Auto-generated method stub
              //set the browser context
             //set the browser context
        	System.setProperty("webdriver.chrome.driver", "C:\\testing\\chrome_driver\\chromedriver.exe");
            WebDriver driver=  new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("http://www.amazon.in");
            Thread.sleep(10000);

            List<WebElement> a =driver.findElements(By.xpath(" //*[@id='nav-xshop']/a"));
            System.out.println("size of elements"+a.size());

            File scrFile =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            try {
                FileUtils.copyFile(scrFile, new File("./screenshot/image.png"));
            } catch (IOException e) {
                e.printStackTrace();
            }



         /*   //print all elements text value
            for(int i=1;i<=a.size();i++) {
                String textValue =a.get(i).getText();
                System.out.println("menu item value="+textValue);}
            */
                for(WebElement value : a) {
                    String textValue =value.getText();
                    System.out.println("menuvalue"+ value.getText());
                      File elementFile= value.getScreenshotAs(OutputType.FILE);
                      try
                      {
                           FileUtils.copyFile(elementFile, new File("./Screenshot/image_"+textValue+".png"));
                      }
                      catch(IOException e) {
                          e.printStackTrace();
                      }
                  }
                   driver.close();
                      driver.quit();


                }
      

            }



