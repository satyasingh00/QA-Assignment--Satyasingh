package Pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Loginpage {
	

	WebDriver driver;

    public Loginpage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//p[text()='Login']")  // Adjust the XPath according to the actual button text
    private WebElement clickLoginButton;

    @FindBy(xpath = "//*[text()='Continue with Google']")
    private WebElement ContiuneWithGoogle;
    
    @FindBy(id="identifierId")
    private WebElement Registeremail;
    
    @FindBy(xpath="(//span[@class='VfPpkd-vQzf8d'])[2]")
    private WebElement NextButton;
    
    @FindBy(xpath="//input[@name='Passwd']")
    private WebElement EnterPassword;
    
    @FindBy(xpath="(//span[@jsname=\"V67aGc\"])[2]")
    private WebElement NextPassword;
    
    @FindBy(xpath="(//span[@class='VfPpkd-vQzf8d'])[2]")
    private WebElement ClickContiune;
    
   

    public WebElement getUsername() {
        return clickLoginButton;
    }

    public WebElement getPassword() {
        return ContiuneWithGoogle;
    }
    
    public WebElement getRegisteremail() {
		return Registeremail;
	}

    public WebElement getNextButton() {
		return NextButton;
	}
   
	public WebElement getEnterPassword() {
		return EnterPassword;
	}
	
	
	public WebElement getNextPassword() {
		return NextPassword;
	}
	
	
	public WebElement getClickContiune() {
		return ClickContiune;
	}


	public void loginUser() throws InterruptedException {
        clickLoginButton.click();
        Thread.sleep(3000);
        ContiuneWithGoogle.click();
        
    
    }
    
    public void enterusername(String uname) throws InterruptedException {
    	Registeremail.sendKeys(uname);
    	Thread.sleep(2000);
    	NextButton.click();
    	
    }
    
    public void enterpassword(String pass) throws InterruptedException {
    	EnterPassword.sendKeys(pass);
    	Thread.sleep(2000);
    	
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(NextPassword)).click();
        
        wait.until(ExpectedConditions.elementToBeClickable(ClickContiune)).click();
//    	NextPassword.click();
//    	ClickContiune.click();
    	
    	
 
    	
    
    }
	

}
