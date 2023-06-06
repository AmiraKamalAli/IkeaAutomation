package ikeaApp;


import org.testng.annotations.Test;
import base.Base;

import pageobject.HomePage;
import pageobject.SearchComponent;


public class SearchTest extends Base {

	
	
//	3) On the home page, search for “Table”.	
	@Test(priority = 1)
	public void ClickSearch() {
		HomePage serach = new HomePage();
		serach.clickSearch();
	}

	//3) On the home page, search for “Table”.
	@Test(priority = 2)
	public void SearchForProduct() {
		SearchComponent serachProduct = new SearchComponent();
		serachProduct.clickSearch();
	}
	
	
	
	

}
