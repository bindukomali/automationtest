package com.valuemomentum.retail.automationtest.pages;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class productDetailsPage extends BasePage {
   
   public productDetailsPage(WebDriver driver)
   {
       super(driver);
       
   }
   
   //element
   @FindBy(id="add-to-cart-button")
   private static  WebElement _btnAddToCart;
   
   
   //action
   public  void clickOnAddToCart() {
       _btnAddToCart.click();;
       
       }



}
