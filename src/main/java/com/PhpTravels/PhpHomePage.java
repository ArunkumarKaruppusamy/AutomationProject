package com.PhpTravels;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PhpHomePage extends BasePage {
	@FindBy(xpath = "*//div[@class='cards']/div[2]/div/div[4]/span")
	private WebElement getpriceFromAndroidtab;
	@FindBy(linkText = "Demo")
	private WebElement lnkDemo;
	@FindBy(linkText = "Pricing")
	private WebElement lnkPricing;
	@FindBy(xpath = "/html/body/header/div/nav/a[3]")
	private WebElement searchBtn;
	
	public PhpHomePage() {
		PageFactory.initElements(driver, this);
	}
	public int getpricefromAnroidpage() {
		return Integer.parseInt(getpriceFromAndroidtab.getText());
	}
	public WebElement getLinkDemo() {
		return lnkDemo;
	}

	public String getTxtLinkDemo() {
		return lnkDemo.getText();
	}

	public WebElement getLinkPricing() {
		return lnkPricing;
	}

	public String getTxtLinkPricing() {
		return lnkPricing.getText();
	}
	
	public WebElement btnsearch() {
		Actions action = new Actions(driver);
		action.moveToElement(searchBtn).perform();
		searchBtn.click();
		 return btnsearch();
	}
	
}
