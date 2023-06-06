package ikeaApp;


import org.testng.annotations.Test;
import base.Base;


import pageobject.Cart;

public class checkcartItemTest extends Base {

	@Test(priority = 1)
	public void checkcarthasAddedItemsTest() {
		Cart cartitem = new Cart();
		cartitem.getcartItemsCount();
	
			
	}
	
	
	@Test(priority = 2)
	public void OpenCart() {
		Cart cartitem = new Cart();
		cartitem.clickCart();
	
			
	}
	
	
}
