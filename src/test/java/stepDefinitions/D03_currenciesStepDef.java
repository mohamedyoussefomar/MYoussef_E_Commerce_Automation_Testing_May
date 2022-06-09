package stepDefinitions;

import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class D03_currenciesStepDef {
    @When("user clicks on dropdown list and select euro")
    public void select_currency() throws InterruptedException
    {
        Select selectCurrency = new Select(Hooks.driver.findElement(By.xpath("//*[@id=\"customerCurrency\"]")));
        selectCurrency.selectByValue("https://demo.nopcommerce.com/changecurrency/6?returnUrl=%2F");
        Thread.sleep(3000);
    }
}
