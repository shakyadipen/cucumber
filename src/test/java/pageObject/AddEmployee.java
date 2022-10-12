package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddEmployee {
    public WebDriver ldriver;
    public AddEmployee(WebDriver rdriver){
        ldriver =rdriver;
        PageFactory.initElements(rdriver,this);

    }
    @FindBy(linkText="Add Employee")
    @CacheLookup
    WebElement addTab;

    @FindBy(name="firstName")
    @CacheLookup
    WebElement firstName;

    @FindBy(name="lastName")
    @CacheLookup
    WebElement lastName;

    @FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/input")
    @CacheLookup
    WebElement empId;

    @FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]")
    @CacheLookup
    WebElement saveButton;
    public void addEmployeeTab(){
        addTab.click();
    }
    public void setFirstname(String fName){
        firstName.clear();
        firstName.sendKeys(fName);

    }
    public void setLastname(String lName){
        lastName.clear();
        lastName.sendKeys(lName);
    }
    public void setId(String val) throws InterruptedException {
        Thread.sleep(2000);
        empId.clear();
        empId.sendKeys(val);
    }
    public void saveButton(){
        saveButton.click();
    }



}

