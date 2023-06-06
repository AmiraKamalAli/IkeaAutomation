package ikeaApp;


import org.testng.annotations.Test;
import base.Base;


import pageobject.Cart;

public class RemoveFromCartTest extends Base {

	@Test(priority = 1)
	public void RemoveItemfromCart() {
		Cart product = new Cart();
		product.removeFromCart();
	
	}
	

}
