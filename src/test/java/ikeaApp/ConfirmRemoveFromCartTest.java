package ikeaApp;


import org.testng.annotations.Test;
import base.Base;


import pageobject.Cart;

public class ConfirmRemoveFromCartTest extends Base {

	@Test(priority = 1)
	public void Confirm() {
		Cart product = new Cart();
		product.ConfirmRemoveFromCart();
	
	}
	

}
