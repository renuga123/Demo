package pageobject;

import java.sql.Driver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepageobject extends basepage {
	@FindBy(xpath="//a[@title='Women']")
	private WebElement Woman ;
	
	@FindBy(xpath="(//a[@title='Dresses'])[2]")
	private WebElement Dresses;
	
    @FindBy(xpath="(//a[@title='T-shirts'])[2]")
	private WebElement Tshirts ;
    
    public  homepageobject() {
    	PageFactory.initElements(driver , this);
    	
    }
    public WebElement getWomen() {
		return Woman;
    }
		public void movemouse(WebElement element){
			 new Actions (driver).moveToElement(element).perform();

    }
    public WebElement getDresses() {
    	return Dresses;
    
    }
    public WebElement getTshirts(){
    	return Tshirts;
    
}
    }
