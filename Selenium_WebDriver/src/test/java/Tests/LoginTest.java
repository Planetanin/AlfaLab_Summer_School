package Tests;

import Pages.LoginPage;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;


public class LoginTest {
    public static WebDriver driver;
    public static LoginPage loginPage;

    @BeforeClass
    public static void setup() {
            System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
            driver = new ChromeDriver();
            loginPage = new LoginPage(driver);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.get("https://www.survio.com/ru/");

        }

    @Test
        public void tes1_positive_loginTest(){
        loginPage.inputLogin("pupkin");
        loginPage.inputEmail(loginPage.getMail());
        loginPage.inputPassword("testpass");
        loginPage.clickLoginButton();
        Assert.assertTrue("true", loginPage.isNextPage());
        driver.navigate().back();
    }

    @Test
       public void test2_negative_existEmail(){
        loginPage.inputLogin("pupkin");
        loginPage.inputEmail(loginPage.getMail());
        loginPage.inputPassword("testpass");
        loginPage.clickLoginButton();
        Assert.assertTrue("true", loginPage.getEmailError());
    }

    @AfterClass
    public static void tearDown(){
        driver.close();
    }


}
