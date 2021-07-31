package com.PhpTravels;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AnroidPage extends BasePage{
    @FindBy (xpath = "*//div[@class='cards']/div[2]/div/div[4]/span")
    private WebElement getpriceFromAndroidtab;
	@FindBy (xpath = "*//div[@class ='pricing']/a/span")
	private WebElement ClickAnroidBuynowTab;
	@FindBy (xpath = "/html/body/div[2]/main/div[3]/div/div/div[2]/h4/span/strong")
	private WebElement txtpricefromPopupwindow;
	@FindBy (xpath = "*//div[@id = 'android']/div/div/div/button")
	private WebElement ClosePopupWindow;
	@FindBy (xpath = "//*[@id=\"Main\"]/div[6]/div/div[1]/section/div[2]/div[5]/div[1]/div/span[2]")
	private List<WebElement> webApp;
	
	public AnroidPage() {
		PageFactory.initElements(driver, this);
	}
	public int getpricefromAnroidpage() {
		return Integer.parseInt(getpriceFromAndroidtab.getText());
	}
	public void ClickBuynow() {
		ClickAnroidBuynowTab.click();
	}
	public int PopPrice() {
		String element = (txtpricefromPopupwindow.getText().replace("$","").trim());
		return Integer.parseInt (element);
	}		
	public void Popwindow(){
		ClosePopupWindow.click();
	}
	public ArrayList<String>  getWebPage(){
		ArrayList<String> lst = new ArrayList<String>();
		for(WebElement element : webApp ) {
			lst.add( element.getText());
		}
		return lst;
	}
}
