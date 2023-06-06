package ikeaApp;


import org.testng.annotations.Test;
import base.Base;
import pageobject.CompareProductDescription;

public class CompareProduct_ListAndDetailsTest extends Base {

	

	@Test(priority = 1)
	public void compareProduct() {
		CompareProductDescription product = new CompareProductDescription();
		product.compare();
				
	}
}
