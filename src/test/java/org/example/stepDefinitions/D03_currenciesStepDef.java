package org.example.stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class D03_currenciesStepDef {
    @When("user clicks on dropdown list and select euro")
    public void select_currency() throws InterruptedException
    {
        Select selectCurrency = new Select(Hooks.driver.findElement(By.xpath("//*[@id=\"customerCurrency\"]")));
        selectCurrency.selectByValue("https://demo.nopcommerce.com/changecurrency/6?returnUrl=%2F");
        Thread.sleep(2000);
    }
    @Then("user check that items price was changed to Euro")
    public void verify_currency() throws InterruptedException {
        SoftAssert currencyAssert = new SoftAssert();
        String expectedResult = "€";
        for (int i = 0; i < checkPrice().size(); i++) {
            currencyAssert.assertEquals(checkPrice().get(i).getText().substring(0, 1), expectedResult, "Error found different currency");
            currencyAssert.assertAll();
            System.out.println("Price: " + checkPrice().get(i).getText());
            Thread.sleep(2000);
        }
    }
    public List<WebElement> checkPrice() {
        return Hooks.driver.findElements(By.cssSelector("span[class=\"price actual-price\"]"));
    }
}