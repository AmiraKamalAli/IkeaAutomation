package pageobject;


import base.Base;
import io.appium.java_client.MobileElement;

public class ProductDescriptionInList extends Base {

	static String productPrice;
	static String productName;

	/**
	 * @return the productPrice
	 */
	public static String getProductPrice() {
		return productPrice;
	}

	/**
	 * @param productPrice the productPrice to set
	 */
	public static void setProductPrice(String productPrice) {
		ProductDescriptionInList.productPrice = productPrice;
	}

	/**
	 * @return the productName
	 */
	public static String getProductName() {
		return productName;
	}

	/**
	 * @param productName the productName to set
	 */
	public static void setProductName(String productName) {
		ProductDescriptionInList.productName = productName;
	}

	/**
	 * @param price the price to set
	 */
	public static void setPrice(String price) {
		productPrice = price;
	}

	/**
	 * @param name the name to set
	 */
	public static void setName(String name) {
		productName = name;
	}

	
	public void clickProduct() {
		MobileElement elementsTwo = (MobileElement) driver.findElementsByClassName("android.widget.ImageView").get(1);
		elementsTwo.click();
	}

	public void getName() {
		// TODO Auto-generated method stub
		MobileElement Name = (MobileElement) driver.findElementsByClassName("android.widget.TextView").get(5);
		productName=Name.getText();
		System.out.println(productName);
		
	}

	public void getPrice() {
		// TODO Auto-generated method stub
		MobileElement Price = (MobileElement) driver.findElementsByClassName("android.widget.TextView").get(7);
		productPrice=Price.getText();
		System.out.println(productPrice);
		
	}

	
}
