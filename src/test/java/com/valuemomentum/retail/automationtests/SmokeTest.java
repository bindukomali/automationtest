package com.valuemomentum.retail.automationtests;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
//import org.testng.annotations.AfterSuite;
//import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.valuemomentum.retail.automationtest.pages.HomePage;
import com.valuemomentum.retail.automationtest.pages.SearchResultsPage;
import com.valuemomentum.retail.automationtest.pages.productDetailsPage;
import com.valuemomentum.retail.automationtest.utils.BaseTest;
import com.valuemomentum.retail.automationtest.utils.DataUtility;

 


 

public class SmokeTest extends BaseTest {
     private static final Logger logger = (Logger) LogManager.getLogger(SmokeTest.class);
    WebDriver driver;
    HomePage homePage;
    SearchResultsPage searchResultsPage;
    productDetailsPage productDetailsPage ;

 

    @BeforeClass
    public void setup()
    {
        logger.info("Setup Method Called");
        homePage= new HomePage(getDriver());
    }
    @DataProvider(name="Search")
    public static Object[][] Credentials() throws Exception 
    {
        
        //return new Object[][] { {"iphone"}, {"iPad"}, {"Samsung"}, {"Honor"}, {"Motorola"}};
        
        
        
            return DataUtility.getTestData();
        
        
    }
    
    
    

 

    @Test(priority = 0, enabled = true)
    public void verifyMobilePurchaseAssertions() {
        
        System.out.println("Thread id: "+Thread.currentThread().getId());
        homePage.enterSearchText("Play Station");
        searchResultsPage=homePage.clickOnSearchButton();
        String extractedText=searchResultsPage.getItemText();
        Assert.assertEquals(extractedText, "PS4 1TB Slim Bundled with Spider-Man, GTaSport, Ratchet & Clank And PSN 3Month");
        productDetailsPage=searchResultsPage.clickOnPlayStation();
        productDetailsPage.clickOnAddToCart();
        
        
    }
    @Test(priority = 1, enabled = true)
    public void UnderstandingAssertions()
    {
        SoftAssert sAssert= new SoftAssert();
        System.out.println("Line 01");
        Assert.assertEquals("Hello", "Hello");
        System.out.println("Line 02");
        sAssert.assertFalse(false);
        System.out.println("Line 03");
        sAssert.assertAll();
        
        
    }
    
    @Test(priority = 1, enabled = false,dataProvider="Search")
    public void verifyMobilePurchase(String searchtext) {
        
        System.out.println("Thread id: "+Thread.currentThread().getId());
        homePage.enterSearchText(searchtext);
        //homePage.enterSearchText("iphone");
        searchResultsPage=homePage.clickOnSearchButton();
        productDetailsPage=searchResultsPage.clickOnItem();
        productDetailsPage.clickOnAddToCart();
        
    }
    
    @Test(priority = 2, enabled = false,dataProvider="Search")
    public void verifyMobilePurchase1(String searchtext) {
        
        System.out.println("Thread id: "+Thread.currentThread().getId());
        homePage.enterSearchText(searchtext);
        homePage.enterSearchText(searchtext);
        //homePage.enterSearchText("iphone");
        searchResultsPage=homePage.clickOnSearchButton();
        productDetailsPage=searchResultsPage.clickOnItem();
        productDetailsPage.clickOnAddToCart();
        
    }
}
        
        
    /*    
        //driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
        //driver.findElement(By.id("nav-search-submit-button")).click();

 

 
        //driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div/div[1]/div/span[3]/div[2]/div[2]/div/span/div/div/div/div/div[2]/div[2]/div/div[1]/div/div/div[1]/h2/a/span")).click();
        String currentWindow =  driver.getWindowHandle();
        Set<String> windows = driver.getWindowHandles();
        Iterator<String> ite = windows.iterator();
        while(ite.hasNext()) {
            String newWindow=ite.next();
            if(!currentWindow.equals(newWindow)) {
                driver.switchTo().window(newWindow);
            }
        }
        driver.findElement(By.id("add-to-cart-button")).click();
        
    }
}
        */