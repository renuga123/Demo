package Testobject;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageobject.basepage;
import pageobject.homepageobject;

public class HomepageTest 1{


homepageobject homepage;
basepage dp;

public  HomepageTest() {
	homepage =new homepageobject();
	
		dp= new basepage();
}



@Test	
public void verifybutton() {
	Assert.assertTrue(dp.elementFound(homepage.getWomen()),"failed");
	Assert.assertTrue(dp.elementFound(homepage.getDresses()),"failed");
	Assert.assertTrue(dp.elementFound(homepage.getTshirts()),"failed");
}

@Test
    public void VerifyWoman() {
	homepage.getWomen().click();
	Assert.assertTrue(dp.getTitlte().contains("Woman"),"failed");
}
@Test   
    public void verifyDresses() {	
    homepage.getDresses().click();
	Assert.assertTrue(dp.getTitlte().contains("Dresses"),"failed");
}
@Test
    public void verifyTshirts() {
	homepage.getTshirts().click();
	Assert.assertTrue(dp.getTitlte().contains("T_Shirts"),"failed");	
	
	}
//@Test
//public void verifymail() {
	//dp.setText(dp.nwl(),"renuga9298@gmail.com");
	//dp.nwl().sendkeys(Keys.ENTER);
	//Assert.assertTrue(dp.elementFound(homepage.sub()),""failed");
//}

	
}