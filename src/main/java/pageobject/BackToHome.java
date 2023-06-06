package pageobject;

import base.Base;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class BackToHome extends Base {

	@AndroidFindBy(id = "com.ikea.egypt.store:id/ic_back")
	private MobileElement back1;
	@AndroidFindBy(id = "com.ikea.egypt.store:id/iv_back")
	private MobileElement back2;
	@AndroidFindBy(id = "com.ikea.egypt.store:id/back_btn")
	private MobileElement back3;

	public void BackToSerachResult() {
		back1.click();
	}

	public void BackToSerach() {
		back2.click();
	}

	public void Backtohome() {
		back3.click();
	}
}
