package sel.OnlineSel2021.annonnation;

import org.testng.annotations.Test;

public class Ann2 extends Utility{
	
	@Test(groups= {"smoke"})
	public void test3() {
		
		System.out.println("This is 3 test");
		
	}

	@Test(groups= {"Regression"})
	public void test4() {
		
		System.out.println("This is 4 test");
		
	}
}
