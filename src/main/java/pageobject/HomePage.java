package pageobject;

import base.Base;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class HomePage extends Base {

	@AndroidFindBy(id = "com.ikea.egypt.store:id/textView7")
	private MobileElement Search;

	public void clickSearch() {
		Search.click();
	}

}
