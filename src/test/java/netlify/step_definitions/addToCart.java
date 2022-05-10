package netlify.step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import netlify.pages.HomePage;
import netlify.utilities.BrowserUtils;
import netlify.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class addToCart {

    Actions mouseActions = new Actions(Driver.get());

    @When("the user clicks on the add to cart bar on the product on page {int}")
    public void the_user_clicks_on_the_add_to_cart_bar_on_the_product_on_page(Integer page, List<String> cartList) {

        WebElement pageNumber = Driver.get().findElement(By.xpath("//li[text()='" + page + "']"));
        pageNumber.click();
        BrowserUtils.waitFor(1);


        for (int i = 0; i < cartList.size(); i++) {

            WebElement productToAdd = Driver.get().findElement(By.xpath("//p[text()='" + cartList.get(i) + "']/../.."));
            mouseActions.moveToElement(productToAdd).perform();
            BrowserUtils.waitFor(2);
            WebElement addProductToCart = Driver.get().findElement(By.xpath("//p[text()='" + cartList.get(i) + "']/../..//button[text()='Add to Cart']"));
            addProductToCart.click();
            BrowserUtils.waitFor(2);

        }

    }

    @Then("the user should be able to see the products in the cart and the counter badge")
    public void the_user_should_be_able_to_see_the_products_in_the_cart_and_the_counter_badge() {

        List<String> cartProductList = new ArrayList<>();
        List<WebElement> cartList = new HomePage().cartList;


        for (int i = 0; i < cartList.size(); i++) {
            cartProductList.add(cartList.get(i).getText());
        }
        System.out.println("cartProductList = " + cartProductList);

        String numberOfCounterBadge = new HomePage().cartCounterBadge.getText();
        System.out.println("numberOfCounterBadge = " + numberOfCounterBadge);

        System.out.println("cartList.size() = " + cartList.size());
        BrowserUtils.waitFor(2);

    }

    @Then("the should be able to remove the items by clicking on the clear button")
    public void the_should_be_able_to_remove_the_items_by_clicking_on_the_clear_button() {

        mouseActions.sendKeys(Keys.PAGE_UP);
        new HomePage().basketIcon.click();
        BrowserUtils.waitFor(1);
        new HomePage().clearButton.click();
        BrowserUtils.waitFor(1);

        System.out.println("After clicking clear button");
        String  cartCounter = new HomePage().cartCounterBadge.getText();
        System.out.println("cartCounterBadge = " + cartCounter);
        Assert.assertEquals("0", cartCounter);

    }

}
