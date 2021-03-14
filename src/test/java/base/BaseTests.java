package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.HomePage;
import pages.LoginPage;
import pages.MyAccountPage;
import pages.SearchPage;

public class BaseTests {
    private WebDriver driver;
    protected HomePage homePage;
    protected LoginPage loginPage;
    protected SearchPage searchPage;
    protected MyAccountPage myAccountPage;

   @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:/Users/maschiopu/Workspace/ProjectMagdalenaSchiopu/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://altex.ro/");
        driver.manage().window().maximize();

        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);
        searchPage = new SearchPage(driver);

    }

    @AfterClass
    public void tearDown(){
       // driver.quit();
    }


}
