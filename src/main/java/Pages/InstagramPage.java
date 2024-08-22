package Pages;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InstagramPage {
    WebDriver driver;
    WebDriverWait wait;

    public InstagramPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@name='username']")
    private WebElement usernameField;

    @FindBy(xpath = "//input[@name='password']")
    private WebElement passwordField;

    @FindBy(xpath = "//div[text()='Log in']")
    private WebElement loginButton;

    @FindBy(xpath = "//span[text()='Profile']")
    private WebElement profileLink;

    @FindBy(xpath = "//a[text()='Edit profile']")
    private WebElement editProfileButton;

    @FindBy(xpath = "//textarea[@id='pepBio']")
    private WebElement bioField;

    @FindBy(xpath = "//div[text()='Submit']")
    private WebElement submitButton;

    @FindBy(xpath = "//a[@class='bio-link']")
    private List<WebElement> bioLinks;

   
    public void login(String username, String password) {
        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
        loginButton.click();
    }

    public void navigateToProfile() {
        wait.until(ExpectedConditions.visibilityOf(profileLink));
        profileLink.click();
    }

    public void editProfile() {
        editProfileButton.click();
    }
    
    public void clickOnProfileSection() {
    	profileLink.click();
    }

    public void updateBioSequentially(String[] links) {
        bioField.clear();
        for (String link : links) {
            bioField.sendKeys(link + "\n");
        }
    }

    public void saveProfile() {
        submitButton.click();
    }

    public boolean verifyBioUpdate(String expectedBio) {
        return bioField.getAttribute("value").trim().equals(expectedBio.trim());
    }

    public void clickEachBioLink() {
        String originalWindow = driver.getWindowHandle();

        for (WebElement link : bioLinks) {
            link.click();
            
            
            for (String windowHandle : driver.getWindowHandles()) {
                if (!windowHandle.equals(originalWindow)) {
                    driver.switchTo().window(windowHandle);
                    break;
                }
            }
            
            driver.close();
            driver.switchTo().window(originalWindow);
        }
    }
}
