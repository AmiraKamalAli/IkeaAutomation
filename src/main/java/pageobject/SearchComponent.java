package pageobject;

import org.openqa.selenium.By;

import base.Base;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class SearchComponent extends Base {

	static String Price;
	static String Name;

	/**
	 * @param price the price to set
	 */
	public static void setPrice(String price) {
		Price = price;
	}

	/**
	 * @param name the name to set
	 */
	public static void setName(String name) {
		Name = name;
	}

	// 3) On the home page, search for “Table”.
	@AndroidFindBy(id = "com.ikea.egypt.store:id/search_products_text_view")
	private MobileElement Search;

	public void clickSearch() {
		Search.sendKeys("table");
	}

//  4)Select first product in table search (the first product from the list of products	displayed).	
	public MobileElement getMobileElement(By by) {
		return driver.findElements(by).get(0);
	}

	public void clickitemlist() {
		MobileElement weList = getMobileElement(By.className("android.widget.TextView"));
		weList.click();
	}

	
}
