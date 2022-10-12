package StepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObject.AddEmployee;
import pageObject.Login;

import java.util.concurrent.TimeUnit;

public class Steps {
    public WebDriver driver;
    public Login lp;
    public AddEmployee emp;
    @Given("The user launch the chrome browser.")
    public void the_user_launch_the_chrome_browser() {
        // Write code here that turns the phrase above into concrete actions
        String chromeLocation = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver",chromeLocation+"/Driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
       // throw new io.cucumber.java.PendingException();
    }
    @When("User enters URL {string}")
    public void user_enters_url(String url) {
        // Write code here that turns the phrase above into concrete actions
        driver.get(url);
        lp = new Login(driver);
       // throw new io.cucumber.java.PendingException();
    }
    @When("User enters the Username {string} and Password {string}")
    public void user_enters_the_username_and_password(String user, String password) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions

        lp.setUsername(user);
        Thread.sleep(1000);
        lp.setPassword(password);
     //   throw new io.cucumber.java.PendingException();
    }
    @When("User Hits Login")
    public void user_hits_login() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        Thread.sleep(1000);
        lp.loginButton();
        //throw new io.cucumber.java.PendingException();
    }
    @Then("The page title should be {string}")
    public void the_page_title_should_be(String pageTitle) {
        // Write code here that turns the phrase above into concrete actions
        String title =driver.getTitle();
        Assert.assertEquals(pageTitle,title);
        System.out.println("Landed successfully");
       // throw new io.cucumber.java.PendingException();
    }
    @Then("The User clicks on Logout Button.")
    public void the_user_clicks_on_logout_button() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        lp.logoutButton();
        Thread.sleep(1000);
        lp.logout();
       // throw new io.cucumber.java.PendingException();
    }
    @Then("Close the browser.")
    public void close_the_browser() {
        // Write code here that turns the phrase above into concrete actions
        driver.close();
        //throw new io.cucumber.java.PendingException();
    }
    //add New employee
    @Then("User Clicks on Add Employee Tab")
    public void user_clicks_on_add_employee_tab() {
        // Write code here that turns the phrase above into concrete actions
        emp = new AddEmployee(driver);
        emp.addEmployeeTab();
        //throw new io.cucumber.java.PendingException();
    }

    @Then("User Fills the New Employee Detail")
    public void user_fills_the_new_employee_detail() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        emp.setFirstname("Dipen");
        Thread.sleep(2000);
        emp.setLastname("Shakya");
        Thread.sleep(2000);
        emp.setId("4323");
        Thread.sleep(3000);

        //throw new io.cucumber.java.PendingException();
    }

    @Then("User Saves the data of new employee")
    public void user_saves_the_data_of_new_employee() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        Thread.sleep(2000);
        emp.saveButton();
        //throw new io.cucumber.java.PendingException();
    }
}
