package ikeaApp;


import org.testng.annotations.Test;
import base.Base;


import pageobject.BackToHome;

public class BackToHomeTest extends Base {

	@Test(priority = 1)
	public void BackToSearchResult() {
		BackToHome back = new BackToHome();
		back.BackToSerachResult();
	
			
	}
	
	@Test(priority = 2)
	public void BackToSearch() {
		BackToHome back = new BackToHome();
		back.BackToSerach();
			
	}
	
	@Test(priority = 3)
	public void BackToSearchHistory() {
		BackToHome back = new BackToHome();
		
		back.Backtohome();
			
	}
	@Test(priority = 4)
	public void BackToHome() {
		BackToHome back = new BackToHome();
		
		back.Backtohome();
			
	}
	
}
