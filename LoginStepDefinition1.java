package StepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LoginStepDefinition1 {
    WebDriver driver;

    @Given("^User able to open a browser$")
    public void user_able_to_open_a_browser()  {
        WebDriverManager.edgedriver().setup();
        driver=new EdgeDriver();
        driver.manage().window().maximize();

    }

    @Given("^Click on url$")
    public void click_on_url()  {
        driver.get("https://www.iceland.co.uk/");

    }

    @Given("^User click on login button$")
    public void user_click_on_login_button()  {
        try {
            driver.findElement(By.xpath("//button[@id='onetrust-reject-all-handler']")).click();
            driver.findElement(By.xpath("//span[@class='_105qcvc3rl _105qcvc3sf _105qcvc3t3 _105qcvc3si _105qcvc3tr _105qcvc3xl _105qcvc3u6']")).click();
        }catch (Exception e){
            System.out.println("Cookies button is not clicked");
        }
    }

    @Given("^User on login page$")
    public void user_on_login_page()  {

    }

//    @When("^user enter \"([^\"]*)\" and \"([^\"]*)\" and click on login button$")
//    public void user_enter_and_and_click_on_login_button(String UserName, String Password)  {
//        driver.findElement(By.xpath("//input[@name='email']")).sendKeys(UserName);
//        driver.findElement(By.id("login-password-field")).sendKeys(Password);
//        driver.findElement(By.xpath("/html/body/div[2]/div/header/div[1]/div[1]/div[2]/div[2]/reach-portal/div[3]/div/div/div/div/div/div/div[2]/form/div/div/button/span")).click();
//
//    }

    @When("^user enter \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_enter_and(String UserName, String Password)  {
        try {
            driver.findElement(By.xpath("//input[@id='login-email-field']")).sendKeys(UserName);
            driver.findElement(By.xpath("//input[@id='login-password-field']")).sendKeys(Password);
        }catch (Exception e){
            System.out.println("Email locator is throwing exception no such element");
        }
    }

//    @When("^click on login button$")
//    public void click_on_login_button()  {
//        driver.findElement(By.xpath("/html/body/div[2]/div/header/div[1]/div[1]/div[2]/div[2]/reach-portal/div[3]/div/div/div/div/div/div/div[2]/form/div/div/button/span")).click();
//    }

//    @Then("^user is on home page$")
//    public void user_is_on_home_page()  {
//
//    }

    @Then("^use close the browser$")
    public void use_close_the_browser()  {
        driver.quit();

    }

}
