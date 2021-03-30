package sel.OnlineSel2021.annonnation;

import org.testng.annotations.Test;

public class Ann1 extends Utility{
	
	@Test(groups= {"smoke"})
	public void signup() {
		
		System.out.println("This is first test");
		
	}

	@Test(dependsOnMethods="signUp",groups= {"Regression"})
	public void signIn() {
		
		System.out.println("This is second test");
		
	}
}
