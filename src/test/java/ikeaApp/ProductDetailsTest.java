package ikeaApp;


import org.testng.annotations.Test;
import base.Base;


import pageobject.ProductDescriptionInDetails;

public class ProductDetailsTest extends Base {

	@Test(priority = 1)
	public void getNameInDetails() {
		ProductDescriptionInDetails product = new ProductDescriptionInDetails();
		product.GetProductNameInDetails();
			
	}
	
	@Test(priority = 2)
	public void getPriceInDetails() {
		ProductDescriptionInDetails product = new ProductDescriptionInDetails();
		product.GetProductPriceInDetails();
			
	}
}
