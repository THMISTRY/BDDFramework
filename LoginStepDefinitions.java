package StepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LoginStepDefinitions {

    WebDriver driver;

    @Given("^User able to open a browser$")
    public void user_able_to_open_a_browser()  {
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        driver.manage().window().maximize();

    }

    @Given("^Enter the Url$")
    public void enter_the_Url()  {
        driver.get("https://www.tesco.com/groceries/");

    }

    @When("^User click on login link$")
    public void user_click_on_login_link()  {
        driver.findElement(By.id("app-bar-sign-in")).click();

    }

    @Then("^User on login page$")
    public void user_on_login_page()  {

    }

    @Then("^User on login page and verify the login page title$")
    public void user_on_login_page_and_verify_the_login_page_title() {
        try {
            String pagetitle = driver.getTitle();
            System.out.println("Page title= " + pagetitle);
            Assert.assertEquals(pagetitle, "Tesco");
        }catch (Exception e){
            System.out.println("Pagetitle is not matching");
        }
    }

//    @When("^User enter valid username and password and click on login in button$")
//    public void user_enter_valid_username_and_password_and_click_on_login_in_button()  {
//        driver.findElement(By.id("email")).sendKeys("xyz@gmail.com");
//        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("India123");
//        driver.findElement(By.id("signin-button")).click();
//
//    }

    @When("^User enter valid username and password and$")
    public void user_enter_valid_username_and_password_and()  {
        driver.findElement(By.id("email")).sendKeys("xyz@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("India123");
        driver.manage().deleteAllCookies();
    }

    @When("^click on login in button$")
    public void click_on_login_in_button() {
        driver.findElement(By.xpath("//span[@class='base-components__BaseElement-sc-1mosoyj-0 styled__TextSpan-rsekm1-4 fCISLV jDTUbo beans-button__text']")).click();
        
    }


    @Then("^User is on home page$")
    public void user_is_on_home_page()  {

    }

    @Then("^User close the browser$")
    public void user_close_the_browser()  {
        driver.quit();

    }

}
