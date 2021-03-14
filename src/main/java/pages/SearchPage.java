package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage {
    private WebDriver driver;
    private By searchField = By.xpath("//*[@id=\"__next\"]/div[2]/div[1]/div/div/div[2]/div[4]/form/div/div[1]/input");
    private By searchButton = By.xpath("//*[@id=\"__next\"]/div[2]/div[1]/div/div/div[2]/div[4]/form/div/div[2]/button/div/div");

    public SearchPage(WebDriver driver){
        this.driver = driver;
    }

    public void setSearchWord(String searchword){
        driver.findElement(searchField).sendKeys("smart");
    }

    public SearchResultsPage clickSearchButton(){
        driver.findElement(searchButton).click();
        return new SearchResultsPage(driver);
    }
}
