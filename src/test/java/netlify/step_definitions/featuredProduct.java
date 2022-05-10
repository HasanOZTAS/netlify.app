package netlify.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import netlify.utilities.BrowserUtils;
import netlify.utilities.ConfigurationReader;
import netlify.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class featuredProduct {

    @Given("the user is on the main page")
    public void the_user_is_on_the_main_page() {
        Driver.get().get(ConfigurationReader.get("url"));
        BrowserUtils.waitForPageToLoad(3);

    }

    @When("the user clicks on the {string}")
    public void the_user_clicks_on_the(String page) {

        WebElement pageNumber = Driver.get().findElement(By.xpath("//li[text()='" + page + "']"));
        pageNumber.click();
        BrowserUtils.waitFor(1);

    }

    @Then("the user should be able to see the {string}")
    public void the_user_should_be_able_to_see_the(String featured) {

        WebElement bestSellerBadge = Driver.get().findElement(By.xpath("//p[text()='" + featured + "']/../..//p[text()='Best Seller']"));
        String bestSeller = "Best Seller";
        Assert.assertEquals(bestSellerBadge.getText(), bestSeller);
        BrowserUtils.waitFor(1);

    }
}
