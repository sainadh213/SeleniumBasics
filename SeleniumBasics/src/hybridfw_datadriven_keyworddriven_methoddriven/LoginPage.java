package hybridfw_datadriven_keyworddriven_methoddriven;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;
public class LoginPage {
	
	//@FindBy(id = "username")private WebElement untb;
    
   // @FindBy(name = "pwd")private WebElement pwtb;
    
    //@FindBy(xpath = "//div[text()='Login ']")private WebElement loginBtn;
	@FindBy(id="username")private WebElement untb;
	@FindBy(id="password")private WebElement pwtb;
	@FindBy(xpath="//button[text()='Sign in']")private WebElement loginBtn;
    
    
    public LoginPage() {
        PageFactory.initElements(BaseTest.driver,this);
    }
    
    public WebElement getuntb() {
        return untb;
    }
    
    public WebElement getpwtb() {
        return pwtb;
    }
    
    public WebElement getLoginBtn() {
        return loginBtn;
    }
    
    public void typeUn( String un) {
        untb.sendKeys( un);
    }
   
    public void typePw( String pwd) {
        pwtb.sendKeys(pwd);
    }
    
    public void clickLoginBtn() {
       loginBtn.click();
    }

}
