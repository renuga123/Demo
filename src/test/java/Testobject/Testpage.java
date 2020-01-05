package Testobject;

   import org.testng.Assert;
	import org.testng.annotations.Test;

import pageobject.basepage;
import pageobject.objectpage;
	public class Testpage {
	
		public class dresstest {
			objectpage wc;
			basepage bc;
			

			public dresstest() {
			wc =new objectpage();
			bc=new basepage();
			}
			@Test
			public void dress() {
			wc.getdress().click();
			Assert.assertTrue(bc.getTitlte().contains("Dresses"));
			}
			@Test
			public void verifydisplayed() {
			Assert.assertTrue(wc.getsize().isDisplayed(), "failed");
			Assert.assertTrue(wc.getmedium().isDisplayed(), "failed");
			Assert.assertTrue(wc.getlarge().isDisplayed(), "failed");
			}
			@Test
			public void cart() {
			bc.movemouse(wc.getproduct());
			wc.getcart().click();
			wc.getcheckout().click();
			Assert.assertTrue(wc.getTxtAttribute(wc.getvalue()).contains("1"),"fail");

			}
			@Test
			public void verifycount() {
			String s= wc.getcount().getText();
			   int b = wc.getimg().size();
			   String c=Integer.toString(b);
			  Assert.assertTrue(s.contains(c),"failed");
			   

			}
		}
	}





