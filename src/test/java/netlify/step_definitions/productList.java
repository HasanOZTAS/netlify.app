package netlify.step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import netlify.pages.HomePage;
import netlify.utilities.BrowserUtils;
import netlify.utilities.ConfigurationReader;
import netlify.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class productList {

    @When("the user hovers over the images")
    public void the_user_hovers_over_the_images() {

        List<WebElement> productsList = new HomePage().products;

        Actions mouseActions = new Actions(Driver.get());
        mouseActions.sendKeys(Keys.PAGE_DOWN);

        for (int i = 0; i < productsList.size(); i++) {
            mouseActions.moveToElement(productsList.get(i)).perform();
            BrowserUtils.waitFor(2);

        }

    }

    @Then("the user should be able to see {string} bar")
    public void the_user_should_be_able_to_see_bar(String addToCart) {

        addToCart = new HomePage().addToCartBar.getText().toUpperCase();

        Assert.assertEquals("ADD TO CART", addToCart);


    }


}
