import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;


public class SeleniumTest {
    private static WebDriver driver;

    private String getRandomMail(){
        String symbols = "abcdefghijklmnopqrstuvwxyz";
        String random = new Random().ints(9, 0, symbols.length())
                .mapToObj(symbols::charAt)
                .map(Object::toString)
                .collect(Collectors.joining());
        String randomMail = new String(random + "@gmail.com");
        return randomMail;
    }

    private boolean existsElement(String id) {
        try {
            driver.findElement(By.id(id));
        } catch (NoSuchElementException e) {
            return false;
        }
        return true;
    }

    @BeforeClass
    public static void setup(){
        System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.survio.com/ru/");

    }

    @Test
    public void test1_positive_userLogin(){
        WebElement loginField = driver.findElement(By.name("reg_name"));
        loginField.sendKeys("pupkin");
        WebElement emailField = driver.findElement(By.id("reg_email"));
        emailField.clear();
        emailField.sendKeys(getRandomMail());
        WebElement passwordField = driver.findElement(By.name("reg_passwd"));
        passwordField.sendKeys("testpass");
      WebElement loginButton = driver.findElement(By.xpath("//a[@class='create-survey']"));
       loginButton.click();
       Assert.assertTrue("true", existsElement("wizard"));
       driver.navigate().back();
   }

   @Test
    public void test2_negative_existEmail(){
        WebElement loginField = driver.findElement(By.name("reg_name"));
       loginField.sendKeys("pupkin");
        WebElement emailField = driver.findElement(By.id("reg_email"));
        emailField.clear();
        emailField.sendKeys(getRandomMail()); // Регистрируемся с уже зарегистрированныйм email
       WebElement passwordField = driver.findElement(By.name("reg_passwd"));
       passwordField.sendKeys("testpass");
       WebElement loginButton = driver.findElement(By.xpath("//a[@class='create-survey']"));
        loginButton.click();
        Assert.assertTrue("true", existsElement("reg_email-error") );

    }

   @AfterClass
    public static void tearDown(){
        driver.close();
    }

}
