package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
    public WebDriver ldriver;
    public Login(WebDriver rdriver){
    ldriver = rdriver;
        PageFactory.initElements(rdriver,this);
    }
    @FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")
    @CacheLookup
    WebElement userName;
    @FindBy(xpath ="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")
    @CacheLookup
    WebElement password;
    @FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
    @CacheLookup
    WebElement LoginButton;
    @FindBy(xpath="//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/i")
    @CacheLookup
    WebElement LogoutButton;
    @FindBy(xpath="//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[4]/a")
    @CacheLookup
    WebElement Logoutlink;

    public void setUsername(String user){
        userName.clear();
        userName.sendKeys(user);

    }
    public void setPassword(String pwd){
        password.clear();
        password.sendKeys(pwd);
    }
    public void loginButton(){
        LoginButton.click();
    }
    public void logoutButton(){
     LogoutButton.click();

    }
    public void logout(){
        Logoutlink.click();
    }

}
