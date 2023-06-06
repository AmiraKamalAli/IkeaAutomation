package ikeaApp;


import org.testng.annotations.Test;
import base.Base;


import pageobject.Cart;

public class checkItemQuantityTest extends Base {

	@Test(priority = 1)
	public void getitemcount() {
		Cart cartitem = new Cart();
		cartitem.getItemQuantity();
	
			
	}
	
	
	@Test(priority = 2)
	public void OpenCart() {
		Cart cartitem = new Cart();
		cartitem.clickCart();
	
			
	}
	
	
}
