package org.example.stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class D09_shoppingCartStepDef {
    @When("user navigates to products page")
    public void user_nav_cart() throws InterruptedException {
        Hooks.driver.navigate().to("https://demo.nopcommerce.com/cell-phones");
        Thread.sleep(3000);
    }
    @Then("user presses on add to shopping cart button")
    public void user_add_to_cart() throws InterruptedException
    {
        Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[1]/div/div[2]/div[3]/div[2]/button[1]")).click();
        Thread.sleep(4000);
    }
}
