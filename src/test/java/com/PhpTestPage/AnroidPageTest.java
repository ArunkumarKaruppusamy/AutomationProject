package com.PhpTestPage;

import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.PhpTravels.AnroidPage;
import com.PhpTravels.BasePage;
import com.PhpTravels.PhpHomePage;

@Test
public class AnroidPageTest {
	PhpHomePage obj;
	BasePage bp;
	AnroidPage obj1;

	public AnroidPageTest() {
		obj = new PhpHomePage();
		bp = new BasePage();
		obj1 = new AnroidPage();
	}
	
	@BeforeMethod
	public void clickBuynow() {
		obj1.ClickBuynow();	
	}

	@Test
	public void verify_Androidpage_and_PopupPage() {
		int actual = obj1.getpricefromAnroidpage();
		int expected= obj1.PopPrice();
		Assert.assertTrue(actual == expected);
		obj1.Popwindow();
	}
	
	@Test
	public void webPage() {
	ArrayList<String> lst = obj1.getWebPage();
		Assert.assertTrue(lst.contains("Web"));
	}
	
	
}
