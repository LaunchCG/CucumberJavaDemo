package CucumberJavaDemo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.PageFactory;
import static java.lang.Thread.sleep;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class StepDefinitions {
    public WebDriver driver;
    public LaunchCareerPage careerPage;

    @Given("I navigate to the Launch Consulting careers website")
    public void i_navigate_to_the_launch_consulting_careers_website() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://careers.launchconsulting.com/");
    }

    @When("I search for a QA job")
    public void i_search_for_a_qa_job() throws InterruptedException {
        careerPage = new LaunchCareerPage();
        PageFactory.initElements(driver, careerPage);
        careerPage.searchKeyword("QA");
        sleep(5000);
    }

    @Then("I will find a QA Lead role available")
    public void i_will_find_a_qa_lead_role_available() {
        PageFactory.initElements(driver, careerPage);
        assertTrue(careerPage.jobSearchResults.getText().contains("QA Lead"));
        driver.quit();
    }
}
