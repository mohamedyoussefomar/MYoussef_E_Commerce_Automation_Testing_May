package org.example.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.example.pages.P02_loginPage;


public class D02_loginStepDef {
        P02_loginPage login;
// Positive Test Scenario
    @When("user navigates to login page")
    public void user_navigate() {
        Hooks.driver.findElement(By.className("ico-login")).click();
        login = new P02_loginPage(Hooks.driver);
    }

    @And("^user enters \"(.*)\" and \"(.*)\"$")
    public void valid_data(String username, String password) throws InterruptedException {
        login.loginPage(username, password);
        Thread.sleep(3000);
        String expectedResult = "https://demo.nopcommerce.com/";
        String actualResult = Hooks.driver.getCurrentUrl();
        Assert.assertEquals(actualResult.contains(expectedResult), true);
    }

    @Then("user clicks login then login is successful")
    public void login_button() throws InterruptedException {
        Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")).click();
        Thread.sleep(3000);
        // My account menu should be visible
        String expectedmyAccount = "/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a";
        String actualmyAccount = String.valueOf(Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")));
        System.out.println(actualmyAccount);
        Assert.assertTrue(actualmyAccount.contains(expectedmyAccount));
        Thread.sleep(3000);
    }
}
