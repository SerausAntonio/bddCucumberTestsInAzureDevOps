package cucumber.azure.devops.stepDefinitions;

import cucumber.azure.devops.factory.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class MyStepdefs {
   private WebDriver driver;

    @Given("I am on the google homepage")
    public void iAmOnTheGoogleHomepage() {

         //   driver = DriverFactory.getDriver();
         //   driver.get("https://www.google.com");
         //   driver.manage().window().maximize();
         //   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
         //   driver.findElement(By.xpath("//*[text()='Alles accepteren']")).click();
        System.out.printf("I am on the %s","Google homepage");
        }

        @When("I enter {string} in the search box")
        public void iEnterInTheSearchBox (String searchText){
            System.out.printf("I enter %n ", searchText);
          //  driver.findElement(By.name("q")).sendKeys(searchText);

        }

        @And("I click on search")
        public void iClickOnSearch () {
            System.out.printf("I click on the %n ", "search");
          //  driver.findElement(By.name("btnK")).click();
        }

        @Then("I should see the links containig the word bdd")
        public void iShouldSeeTheLinksContainigTheWordBdd () {
            System.out.printf("I see the links with %s", "BDD");
        }
    }
