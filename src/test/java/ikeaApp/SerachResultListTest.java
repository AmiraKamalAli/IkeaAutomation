package ikeaApp;


import org.testng.annotations.Test;
import base.Base;
import pageobject.SearchComponent;
import pageobject.ProductDescriptionInList;

public class SerachResultListTest extends Base {

	
	

	//4)Select first product in table search (the first product from the list of products displayed).
	
	
	
	@Test(priority = 1)
	public void ClicksearchResult() {
		SearchComponent product = new SearchComponent();
		product.clickitemlist();
		
	}
	

	@Test(priority = 2)
	public void getProductNameListView() {
		ProductDescriptionInList product = new ProductDescriptionInList();
		product.getName();
		

		
	}

	@Test(priority = 3)
	public void getProductPriceListView() {
		ProductDescriptionInList product = new ProductDescriptionInList();
		
		product.getPrice();

	
		
		
	}
	
	
	@Test(priority = 4)
	public void ClickProduct() {
		ProductDescriptionInList product = new ProductDescriptionInList();
		

		product.clickProduct();
		
		
	}
	

}
