package com.PhpTestPage;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.PhpTravels.AnroidPage;
import com.PhpTravels.BasePage;
import com.PhpTravels.Integaratiionpage;
import com.PhpTravels.Mobilepricelist;
import com.PhpTravels.PhpHomePage;
@Test
public class MobilepricelistTest {
	PhpHomePage obj;
	BasePage bp;
	AnroidPage obj1;
	Integaratiionpage obj2;
	Mobilepricelist obj3;
	
	public MobilepricelistTest() {
		obj = new PhpHomePage();
		bp = new BasePage();
		obj1 = new AnroidPage();
		obj2 = new Integaratiionpage();
		obj3 = new Mobilepricelist();
	}
public void PricePage() {
	obj3.selectDropDownSortBy("index(2)");
	obj3.getProductPrices();
	//Assert.assertTrue(obj3.getProductPrices());
	
	for(int i=0; i<20; i++) {
		
	}
}

}
