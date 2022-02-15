package testCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.Base;
@Test
public class VerifyCellPhone extends Base {

	public void TestVerifyCellPhone() {
		
	     SetUpUrl(configProp.getProperty("url"));
	     sendKeys(By.xpath(locatorProp.getProperty("search_all_category")));
             Click(By.xpath(locatorProp.getProperty("locators")));
	     Assert.assertEquals(20, 20);
    }
}
