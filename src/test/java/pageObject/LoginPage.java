package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	

	@FindBy(id = "Email")
	private WebElement email;
	
	@FindBy(id = "Password")
	private WebElement password;
	
	@FindBy(xpath = "//button[@class='button-1 login-button']")
	private WebElement loginBtn;
	
	@FindBy(linkText = "Logout")
	private WebElement logoutLink;
	
	@FindBy(xpath="//div[@class='title']")
	private WebElement loginPageMessage;
	
	@FindBy(xpath = "//div[@class='content-header']")
	private WebElement dashboardPageHeaderText;
	
	public void enterEmail(String emailId) {
		email.clear();
		email.sendKeys(emailId);
	}
	
	public void enterPassword(String pwd) {
		password.clear();
		password.sendKeys(pwd);
	}
	
	public void clickOnLoginButton() {
		loginBtn.click();
		
	}
	
	public void clickOnLogoutLink() {
		logoutLink.click();
	}
	
	public boolean getDisplayStatusOfLoginPageTitle() {
		return loginPageMessage.isDisplayed();
	}
	
	public boolean getDisplayStatusOfDashboardPageTitle() {
		return dashboardPageHeaderText.isDisplayed();
	}
}
