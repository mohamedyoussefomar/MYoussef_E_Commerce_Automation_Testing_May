package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import pages.P00_homePage;

public class D01_registrationStepDef
{
   @Given("guest user go to registration page")
   public void registration_page()
   {
      P00_homePage homePage = new P00_homePage(Hooks.driver);
      Hooks.driver.findElement(homePage.register_icon()).click();
   }
   @When("guest user fill registration data")
   public void personal_data()
   {
      // Gender Selection
      Hooks.driver.findElement(By.id("gender-male")).click();

      // User personal name (First, Last)
      Hooks.driver.findElement(By.id("FirstName")).sendKeys("Mohamed");
      Hooks.driver.findElement(By.id("LastName")).sendKeys("Youssef");

      // User date of Birth
      // select Day Field
      Select DayOfBirth = new Select(Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[1]")));
      DayOfBirth.selectByValue("5");
      // Select Month Field
      Select MonthOfBirth = new Select(Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[2]")));
      MonthOfBirth.selectByValue("1");
      //  Select Year Field
      Select YearOfBirth = new Select(Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[3]")));
      YearOfBirth.selectByValue("1993");
      // Fill Email Field
      Hooks.driver.findElement(By.id("Email")).sendKeys("mohamedyoussefomar@gmail.com");

      // Fill Company Field
      Hooks.driver.findElement(By.id("Company")).sendKeys("TesTCompany");

      // Fill Password
      Hooks.driver.findElement(By.id("Password")).sendKeys("MoYo@123");

      // Fill Confirm Password
      Hooks.driver.findElement(By.id("ConfirmPassword")).sendKeys("MoYo@123");
   }
   @And("guest user click on register button")
   public void click_register()
   {
      //click register
      Hooks.driver.findElement(By.id("register-button")).click();
   }
   @Then("registration success message should appear")
   // Expected result
   public void success_login() {
      String expectedResult = "Your registration completed";
      String expectedColor = "rgba(76, 177, 124, 1)";
      String actualResult = Hooks.driver.findElement(By.className("result")).getText();
      String actualColor = Hooks.driver.findElement(By.className("result")).getCssValue("color");
      System.out.println("color:  " + actualColor);
      Assert.assertTrue(actualResult.contains(expectedResult));
      Assert.assertEquals(actualResult.contains(expectedResult), true);
      Assert.assertTrue(actualColor.contains(expectedColor), "TrueColor");
   }
}
