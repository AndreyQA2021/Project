package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPageResult extends BasePage{

    @FindBy(xpath="//header/div[2]/div[1]/section[1]/img[1]")
    WebElement FlagElement;

    @FindBy(xpath = "//body[1]/div[6]/section[1]/div[1]/section[1]/h2[1]")
    WebElement TelAvivSearchResult;


    public SearchPageResult(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement searchFlagLogo(){
        return FlagElement;
    }

    public WebElement TelAvivSearchResult(){
        return TelAvivSearchResult;
    }

}