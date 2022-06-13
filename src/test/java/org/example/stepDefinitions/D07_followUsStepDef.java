package org.example.stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import java.util.ArrayList;

public class D07_followUsStepDef
{
    @When("user clicks on facebook icon")
    public void user_hover() throws InterruptedException {
        // Locating the Main Menu (Parent element)
        WebElement followUs = Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[4]/div[1]/div[4]/div[1]/div/strong"));
        //Instantiating Actions class
        Actions actions = new Actions(Hooks.driver);
        //Hovering on Follow us
        actions.moveToElement(followUs);
        // Locating the element from page
        WebElement faceBook = Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[4]/div[1]/div[4]/div[1]/ul/li[1]/a"));
        //To move over on facebook icon
        actions.moveToElement(faceBook);
        //build()- used to compile all the actions into a single step
        actions.click().build().perform();
        System.out.println(Hooks.driver.getCurrentUrl());
        System.out.println(Hooks.driver.getTitle());
        Thread.sleep(5000);
    }

    @Then("facebook is opened in new tab")
    public void open_facebook_new_tab()
    {
        ArrayList<String> tabs = new ArrayList<> (Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(tabs.get(1));
        System.out.println(Hooks.driver.getCurrentUrl());
        System.out.println(Hooks.driver.getTitle());
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://www.facebook.com/nopCommerce");
        Hooks.driver.close();
        Hooks.driver.switchTo().window(tabs.get(0));
    }

    @When("user clicks on twitter icon")
    public void user_twitter_hover() throws InterruptedException {
        // Locating the Main Menu (Parent element)
        WebElement followUs = Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[4]/div[1]/div[4]/div[1]/div/strong"));
        //Instantiating Actions class
        Actions actions = new Actions(Hooks.driver);
        //Hovering on Follow us
        actions.moveToElement(followUs);
        // Locating the element from page
        WebElement twitter = Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[4]/div[1]/div[4]/div[1]/ul/li[2]/a"));
        //To move over on twitter icon
        actions.moveToElement(twitter);
        //build()- used to compile all the actions into a single step
        actions.click().build().perform();
        System.out.println(Hooks.driver.getCurrentUrl());
        System.out.println(Hooks.driver.getTitle());
        Thread.sleep(5000);
    }

    @Then("twitter is opened in new tab")
    public void face_twitter_new_tab()
    {
        ArrayList<String> tabs = new ArrayList<> (Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(tabs.get(1));
        System.out.println(Hooks.driver.getCurrentUrl());
        System.out.println(Hooks.driver.getTitle());
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://twitter.com/nopCommerce");
        Hooks.driver.close();
        Hooks.driver.switchTo().window(tabs.get(0));
    }

    @When("user clicks on rss icon")
    public void user_rss_hover() throws InterruptedException {
        // Locating the Main Menu (Parent element)
        WebElement followUs = Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[4]/div[1]/div[4]/div[1]/div/strong"));
        //Instantiating Actions class
        Actions actions = new Actions(Hooks.driver);
        //Hovering on Follow us
        actions.moveToElement(followUs);
        // Locating the element from page
        WebElement rss = Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[4]/div[1]/div[4]/div[1]/ul/li[3]/a"));
        //To move over on rss icon
        actions.moveToElement(rss);
        //build()- used to compile all the actions into a single step
        actions.click().build().perform();
        System.out.println(Hooks.driver.getCurrentUrl());
        Thread.sleep(5000);
    }

    @Then("provided link is opened in new tab")
    public void open_rss_new_tab()
    {
        ArrayList<String> tabs = new ArrayList<> (Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(tabs.get(0));
        System.out.println(Hooks.driver.getCurrentUrl());
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/new-online-store-is-open");
        Hooks.driver.close();
        Hooks.driver.switchTo().window(tabs.get(0));
    }

    @When("user clicks on youtube icon")
    public void user_youtube_hover() throws InterruptedException {
        // Locating the Main Menu (Parent element)
        WebElement followUs = Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[4]/div[1]/div[4]/div[1]/div/strong"));
        //Instantiating Actions class
        Actions actions = new Actions(Hooks.driver);
        //Hovering on Follow us
        actions.moveToElement(followUs);
        // Locating the element from page
        WebElement youtube = Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[4]/div[1]/div[4]/div[1]/ul/li[4]/a"));
        //To move over on YouTube icon
        actions.moveToElement(youtube);
        //build()- used to compile all the actions into a single step
        actions.click().build().perform();
        System.out.println(Hooks.driver.getCurrentUrl());
        System.out.println(Hooks.driver.getTitle());
        Thread.sleep(5000);
    }

    @Then("youtube is opened in new tab")
    public void open_youtube_new_tab() {
        String url = Hooks.driver.getWindowHandle();
        ArrayList<String> tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(tabs.get(1));
        System.out.println(Hooks.driver.getCurrentUrl());
        System.out.println(Hooks.driver.getTitle());
        Assert.assertEquals(Hooks.driver.getCurrentUrl(), "https://www.youtube.com/user/nopCommerce");
        Hooks.driver.close();
        Hooks.driver.switchTo().window(tabs.get(0));
    }
}
