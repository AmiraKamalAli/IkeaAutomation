package pageobject;

import org.testng.Assert;

import base.Base;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class Cart extends Base {

	@AndroidFindBy(id = "com.ikea.egypt.store:id/tab_badge")
	private MobileElement count;
	@AndroidFindBy(id = "com.ikea.egypt.store:id/product_qty")
	private MobileElement itemQuantity;
	@AndroidFindBy(id = "com.ikea.egypt.store:id/iv_remove")
	private MobileElement remove;
	@AndroidFindBy(id = "com.ikea.egypt.store:id/popup_btn")
	private MobileElement confirmremove;
	public void getcartItemsCount() {
		// TODO Auto-generated method stub
		String Count = count.getText();
		System.out.println(Count);

	}

	public void clickCart() {
		// TODO Auto-generated method stub
		count.click();
	}

	public void getItemQuantity() {
		// TODO Auto-generated method stub
		String ItemQuantity = itemQuantity.getText();
		Assert.assertEquals("2", ItemQuantity);

	}

	public void removeFromCart() {
		// TODO Auto-generated method stub
		remove.click();
	}

	public void ConfirmRemoveFromCart() {
		// TODO Auto-generated method stub
		confirmremove.click();
	}	
	
}
