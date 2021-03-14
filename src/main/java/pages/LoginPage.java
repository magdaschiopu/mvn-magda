package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    private By emailField = By.xpath("//*[@id=\"__next\"]/div[2]/div[1]/div/div/div[2]/div[3]/div[1]/div/div[2]/div/form/input[1]");
    private By passordField = By.xpath("//*[@id=\"__next\"]/div[2]/div[1]/div/div/div[2]/div[3]/div[1]/div/div[2]/div/form/input[2]");
    private By authenticateButton = By.xpath("//*[@id=\"__next\"]/div[2]/div[1]/div/div/div[2]/div[3]/div[1]/div/div[2]/div/form/div[3]/span/button/div/div/div");

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void setUserEmail(String useremail){
        driver.findElement(emailField).sendKeys("magdacadis@yahoo.com");
    }

    public void setUserPassword(String userpassword){
        driver.findElement(passordField).sendKeys("Altexparola");
    }

    public MyAccountPage clickAutenticateButton(){
        driver.findElement(authenticateButton).click();
        return new MyAccountPage(driver);
    }




}
