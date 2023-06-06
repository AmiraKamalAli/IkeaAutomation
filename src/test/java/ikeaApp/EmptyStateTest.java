package ikeaApp;


import org.testng.annotations.Test;
import base.Base;


import pageobject.EmptyState;

public class EmptyStateTest extends Base {

	@Test(priority = 1)
	public void CheckRecommedationSection() {
		EmptyState product = new EmptyState();
		product.CheckRecommendedSection();
	
	}
	

}
