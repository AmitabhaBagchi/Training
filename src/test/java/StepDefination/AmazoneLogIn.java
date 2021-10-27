package StepDefination;


import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class AmazoneLogIn {

    WebDriver driver;

    @Given("^user entered the amazone url$")
    public void user_entered_the_amazone_url()  {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\sumit\\Desktop\\chrom\\chromedriver_win32\\chromedriver.exe");
         driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");


    }

    @When("^user click on login$")
    public void user_click_on_login() throws Throwable {
        throw new PendingException();
    }

    @Then("^user should be on login page$")
    public void user_should_be_on_login_page() throws Throwable {
        throw new PendingException();
    }

    @When("^user enter valid mobile as number (.+) and click on continue btn$")
    public void user_enter_valid_mobile_as_number_and_click_on_continue_btn(String mobile) throws Throwable {
        throw new PendingException();
    }

    @When("^user enter valid password (.+) and click on sign in btn$")
    public void user_enter_valid_password_and_click_on_sign_in_btn(String password) throws Throwable {
        throw new PendingException();
    }

    @Then("^user should be on the homepage$")
    public void user_should_be_on_the_homepage() throws Throwable {
        throw new PendingException();
    }
    @Then("^user should close the browser$")
    public void user_should_close_the_browser() throws Throwable {
        driver.close();

    }





















}
