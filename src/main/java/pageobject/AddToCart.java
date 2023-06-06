package pageobject;

import base.Base;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class AddToCart extends Base {

	@AndroidFindBy(id = "com.ikea.egypt.store:id/bt_add_to_cart")
	private MobileElement cart;

	public void AddTocart() {

		cart.click();
	
	}

}
