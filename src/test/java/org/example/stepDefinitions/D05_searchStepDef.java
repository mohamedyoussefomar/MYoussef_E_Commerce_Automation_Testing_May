package org.example.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class D05_searchStepDef {
    // First Scenario
    @When("user navigates to homepage")
    public void user_navigate()
    {
        // Navigate to site homepage
        Hooks.driver.navigate().to("https://demo.nopcommerce.com/");
    }
    @And("user clicks on search field in homepage")
    public void user_search() throws InterruptedException {
        // search for a device
        Hooks.driver.findElement(By.id("small-searchterms")).sendKeys("Nokia Lumia 1020");
        Thread.sleep(2000);
    }
    @Then("search result appears on screen")
    public void user_click()
    {
        // user clicks search
        Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[2]/div[2]/form/button")).click();
    }

    // Second Scenario
    @When("user navigates to homepage to search SKU")
    public void user_navigates()
    {
        Hooks.driver.navigate().to("https://demo.nopcommerce.com/");
    }
    @And("user clicks on sku search field in homepage")
    public void user_search_sku() throws InterruptedException {
        Hooks.driver.findElement(By.id("small-searchterms")).sendKeys("AP_MBP_13");
        Thread.sleep(2000);
    }
    @Then("sku search result appears on screen")
    public void user_clicks()
    {
        Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[2]/div[2]/form/button")).click();
    }
}
