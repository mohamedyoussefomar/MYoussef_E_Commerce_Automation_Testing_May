package stepDefinitions;

import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class D08_wishListStepDef {

    @When("user adds a product to wishlist")
    public void addToWishlist()
    {
        Hooks.driver.findElements(By.cssSelector("button[class=\"button-2 add-to-wishlist-button\"]")).get(2).click();
    }
}
