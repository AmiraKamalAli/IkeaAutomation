package pageobject;


import base.Base;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ProductDescriptionInDetails extends Base {

	static String DetailsPrice;
	static String DetailsName;

	/**
	 * @return the detailsPrice
	 */
	public static String getDetailsPrice() {
		return DetailsPrice;
	}

	/**
	 * @param detailsPrice the detailsPrice to set
	 */
	public static void setDetailsPrice(String detailsPrice) {
		DetailsPrice = detailsPrice;
	}

	/**
	 * @return the detailsName
	 */
	public static String getDetailsName() {
		return DetailsName;
	}

	/**
	 * @param detailsName the detailsName to set
	 */
	public static void setDetailsName(String detailsName) {
		DetailsName = detailsName;
	}

	/**
	 * @param price the price to set
	 */
	public static void setPrice(String price) {
		DetailsPrice = price;
	}

	/**
	 * @param name the name to set
	 */
	public static void setName(String name) {
		DetailsName = name;
	}
	@AndroidFindBy(id = "com.ikea.egypt.store:id/tv_product_name")
	private MobileElement Name;

	public void GetProductNameInDetails() {

		 DetailsName=Name.getText();
         System.out.println(DetailsName);
	}
	
	@AndroidFindBy(id = "com.ikea.egypt.store:id/tv_regular_price")
	private MobileElement price;

	public void GetProductPriceInDetails() {

		 DetailsPrice=price.getText();
         System.out.println(DetailsPrice);
	}


}
