package pageobject;

import org.testng.Assert;

import base.Base;


public class CompareProductDescription extends Base {

	public void compare() {
		// TODO Auto-generated method stub
		String ActualNameList = ProductDescriptionInList.getProductName();
		String ActualPriceList = ProductDescriptionInList.getProductPrice();
		String ActualNameDetails = ProductDescriptionInDetails.getDetailsName();
		String ActualPriceDetails = ProductDescriptionInDetails.getDetailsPrice();
		
		Assert.assertEquals(ActualNameList, ActualNameDetails);
		Assert.assertEquals(ActualPriceList, ActualPriceDetails);

	}

}
