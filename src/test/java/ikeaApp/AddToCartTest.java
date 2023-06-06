package ikeaApp;


import org.testng.annotations.Test;
import base.Base;


import pageobject.AddToCart;

public class AddToCartTest extends Base {

	@Test(priority = 1,invocationCount = 2)
	public void AddItemToCart() {
		AddToCart product = new AddToCart();
		product.AddTocart();
	
	}
	

}
