package pages;

import Utilities.Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage{

    @FindBy(xpath = "//header/div[1]/div[1]/div[1]/div[1]/div[2]/a[1]/*[1]")
    WebElement searchInput;


    public HomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void searchInput(String Item){
        searchInput.click();
        driver.findElement(By.id("search-input")).sendKeys("BARCELONA");
        driver.findElement(By.xpath("//body/div[@id='__next']/div[@id='wrapper']/div[@id='content']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/*[1]"));
        searchInput.submit();



    }
}