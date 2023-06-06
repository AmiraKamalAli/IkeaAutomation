package pageobject;

import base.Base;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class EmptyState extends Base {

	
	@AndroidFindBy(id = "com.ikea.egypt.store:id/tv_label")
	private MobileElement recommendation;

	public void CheckRecommendedSection() {
		// TODO Auto-generated method stub
		recommendation.isDisplayed();
		System.out.println(recommendation.getText());
	}

}
