package com.PhpTravels;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Integaratiionpage extends BasePage {
	@FindBy(xpath = "/html/body/header/div/nav/a[3]")
	private WebElement searchBtn;
	@FindBy(xpath = "//*[@id=\"Main\"]/div[2]/div/p/text()")
	private WebElement getString;
	//@FindBy(xpath = "/html/body/header/div/nav/div[2]/div/a[2]")
	//private WebElement DropDown;

	public Integaratiionpage() {
		PageFactory.initElements(driver, this);
	}

	public void btnsearch() {
		Actions action = new Actions(driver);
		action.moveToElement(searchBtn).click();
	}
	
    //public void Options() {
	//	DropDown.click();
    //}

	public int countWordsUsingSplit() {
		String[] word = getString.getText().split(" ");
		int count = word.length;
		return count;
	}

}
