package org.example.stepDefinitions;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

public class D06_homeSlidersStepDef {
    // First Slider
    @When("user clicks on first slider")
    public void user_push_slider() throws InterruptedException {
        Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[1]/div[2]/a[2]")).click();
    }

    @Then("relative product for first slider is displayed")
    public void product_displayed()
    {
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/nokia-lumia-1020");
    }

    // Second Slider
    @When("user clicks on second slider")
    public void user_press_second_slider()
    {
        Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[1]/div[2]/a[1]")).click();
    }

    @Then ("relative product for second slider is displayed")
    public void product_second_displayed()
    {
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/iphones6");
    }
}
