package com.PhpTestPage;

import java.util.Random;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.PhpTravels.BasePage;
import com.PhpTravels.PhpHomePage;

@Test
public class PhpHomePageTest {
	PhpHomePage obj;
	BasePage bp;

	public PhpHomePageTest() {
		obj = new PhpHomePage();
		bp = new BasePage();
	}
	@Test
	public void verifyDemo() {
    obj.getLinkDemo();
    WebElement element = obj.getLinkDemo();
    Assert.assertTrue(bp.elementFound(element));
    Assert.assertTrue(obj.getTxtLinkDemo().equals("Demo"));
	}
    @Test
	public void verifyprice() {
	    obj.getLinkPricing();
	    WebElement element = obj.getLinkPricing();
	    Assert.assertTrue(bp.elementFound(element));
	    Assert.assertTrue(obj.getTxtLinkPricing().equals("Pricing"));
		}
    @Test
    public void getPriceFromAndroidtab() {
    	obj.getpricefromAnroidpage();
    	Assert.assertTrue(obj.getpricefromAnroidpage() < 1000);
    	obj.btnsearch();
    	//System.out.println(obj.getpricefromAnroidpage());
    }
  
}
