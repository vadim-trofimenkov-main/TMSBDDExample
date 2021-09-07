package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TMSSteps {
    String name;
    protected WebDriver driver;

    @Given("Course name {string}")
    public void courseName(String courseName) {
        name = courseName;
    }

    @When("User opens course")
    public void userOpensCourse() {
        driver.get("https://teachmeskills.by/kursy-programmirovaniya/kursy-programmirovaniya-minsk");
        driver.findElement(By.xpath(String.format("//strong[contains(text(),'%s')]", name))).click();
    }

    @Then("Page title is {string}")
    public void checkPageTitle(String pageTitle) {
        Assert.assertEquals(driver.getTitle(), pageTitle);
    }

    @Before
    public void init() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
