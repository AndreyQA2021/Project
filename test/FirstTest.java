package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.InitializePage;

import java.io.IOException;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

public class FirstTest extends InitializePage {

    @BeforeTest
    public void setUp(){
        super.setUp();
    }

    @Test (priority = 1)
    public void searchWhetherInTelAviv(){
        homePage.searchInput("Tel Aviv");
        WebElement e = driver.findElement(By.xpath("//*[text()='Results of Search for \"Tel Aviv\" ']"));
        Assert.assertEquals(searchPage.TelAvivSearchResult(),e);
        //assertNotNull(utilities.waitForElement(searchPage.searchFlagLogo(), 20));
    }

    public void tearDown() throws IOException {
        // utilities.screenshot();
        super.tearDown();
    }
}