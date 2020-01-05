package pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class shareobject extends basepage{
   @FindBy(xpath="//button[@class='btn btn-default btn-twitter']")
    private WebElement twitter;
   
   @FindBy(xpath="//button[@class='btn btn-default btn-facebook']']")
   private WebElement facebook;
   
  
}

