package Pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dashboardpage {
	WebDriver driver;
	
	public Dashboardpage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
	
	@FindBy(xpath="//p[text()='Top Secret Links']")
	private WebElement TopSecretLinks;
	
	@FindBy(xpath="//p[text()='Secret Links']")
	private WebElement ClickSecretLinks;
	
	@FindBy(xpath="//input[@name='price']")
	private WebElement ClickSetPrice;
	
	@FindBy(xpath="//button[text()='25']")
	private WebElement select25;
	
	@FindBy(xpath="//p[contains(text(),'Continue')]")
	private WebElement clickcontiune1;
	
	@FindBy(xpath="//button[text()='Link']")
	private WebElement clickLink;
	
	@FindBy(xpath="//input[@class='text-sm w-[90%] outline-none border-none p-1 m-0 bg-transparent']")
	private WebElement EnterLink;

	
	@FindBy(xpath = "//input[@name='contentTitle']")
	private WebElement clickcontentTitle;
	
	@FindBy(xpath = "//p[text()='Preview']")
	private WebElement previewButton;
	
	

	public WebElement getTopSecretLinks() {
		return TopSecretLinks;
	}

	public WebElement getClickSecretLinks() {
		return ClickSecretLinks;
	}

	public WebElement getClickSetPrice() {
		return ClickSetPrice;
	}

	public WebElement getSelect25() {
		return select25;
	}

	public WebElement getClickcontiune() {
		return clickcontiune1;
	}

	public WebElement getClickLink() {
		return clickLink;
	}

	public WebElement getEnterLink() {
		return EnterLink;
	}
	
	public WebElement getClickcontentTitle() {
		return clickcontentTitle;
	}

	public void topSecretclick() throws InterruptedException {
		TopSecretLinks.click();
		ClickSecretLinks.click();
		ClickSetPrice.click();
		select25.click();
		clickcontiune1.click();

	}
	
	public void createLink(String Linkcreated1) {
		clickLink.click();
		clickcontiune1.click();
		EnterLink.sendKeys(Linkcreated1);
		clickcontiune1.click();
	}
	
	public void setTitle(String title) {
		clickcontentTitle.sendKeys(title);
		previewButton.click();
	}

}
