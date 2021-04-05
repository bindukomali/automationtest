package com.valuemomentum.retail.automationtest.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);

	}

	@FindBy(id = "twotabsearchtextbox")
	private WebElement _txtSearchBox;

	@FindBy(id = "nav-search-submit-button")
	private WebElement _btnSearch;

	public void enterSearchText(String text) {
		_txtSearchBox.sendKeys(text);

	}

	public SearchResultsPage clickOnSearchButton() {
		_btnSearch.click();
		return new SearchResultsPage(driver);

	}

}

