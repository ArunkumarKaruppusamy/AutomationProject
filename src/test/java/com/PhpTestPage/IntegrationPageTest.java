package com.PhpTestPage;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.PhpTravels.AnroidPage;
import com.PhpTravels.BasePage;
import com.PhpTravels.Integaratiionpage;
import com.PhpTravels.PhpHomePage;

@Test
public class IntegrationPageTest {
	PhpHomePage obj;
	BasePage bp;
	AnroidPage obj1;
	Integaratiionpage obj2;

	public IntegrationPageTest() {
		obj = new PhpHomePage();
		bp = new BasePage();
		obj1 = new AnroidPage();
		obj2 = new Integaratiionpage();
	}

	@Test
	public void checkingTXTsize() {
		obj.btnsearch();
		//obj2.Options();
		obj2.countWordsUsingSplit();
		Assert.assertTrue(obj2.countWordsUsingSplit() < 1000);
	}
}
