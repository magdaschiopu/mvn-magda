package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    private By myAccount = By.xpath("//*[@id=\"__next\"]/div[2]/div[1]/div/div/div[2]/div[3]/div[1]/a/div[3]/span");

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public LoginPage clickMyAccount(){
        driver.findElement(myAccount).click();
        return new LoginPage(driver);
    }
}
