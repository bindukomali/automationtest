package com.valuemomentum.retail.automationtest.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.valuemomentum.retail.automationtest.utils.WebDriverHelper;

 

 

public class SearchResultsPage extends BasePage {
    
    // constructor
    public SearchResultsPage(WebDriver driver)
    {
        super(driver);
        
    }
    
    //element
    @FindBy(id="//*[@id=\"search\"]/div[1]/div/div[1]/div/span[3]/div[2]/div[2]/div/span/div/div/div/div/div[2]/div[2]/div/div[1]/div/div/div[1]/h2/a/span")
    private WebElement _lblItem;
    
    //element
        @FindBy(xpath="//*[@id=\"search\"]/div[1]/div/div[1]/div/span[3]/div[2]/div[3]/div/span/div/div/div[2]/div[2]/div/div[1]/div/div/div[1]/h2/a/span")
    private WebElement _lblPlayStation;
    
    public productDetailsPage clickOnItem() 
    {
        _lblItem.click();
        WebDriverHelper.switchToWindow();
        return new productDetailsPage(getDriver());
        
    }
    
    public productDetailsPage clickOnPlayStation() 
    {
        _lblPlayStation.click();
        WebDriverHelper.switchToWindow();
        return new productDetailsPage(getDriver());
        
    }
    public String getItemText1() {
        
        return _lblPlayStation.getText() ;
        
    }

	public String getItemText() {
		// TODO Auto-generated method stub
		return null;
	}
    

 

}