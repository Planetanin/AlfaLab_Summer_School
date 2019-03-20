import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
import java.util.concurrent.TimeUnit;


public class testLocators {
    private static WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.avito.ru/moskva/transport");

    }

    @Test
    public void test_FindMotorcycleNames() {
        WebElement motorcycleName = driver.findElement(By.xpath("//div[4][@class='recommendations-wrapper']//span[@itemprop='name']"));
    }


    @Test
    public void  test_TodaysAutoAnnouncement(){
       List todaysAutoAnnouncement = (List) driver.findElement(By.xpath("//div[1][@class='recommendations-wrapper']" +
               "//*[@class='created-date' and contains(translate(text(), 'С','с'), 'сегодня')]" +
               "|span[@itemprop='name']"));//нда это конечно же не работает и я с этим не разобрался

    }

    @Test
    public void test_FirstAudi(){
        WebElement firstAudi = driver.findElement(By.xpath("(//div[1][@class='recommendations-wrapper']//span[contains(translate(text(), 'A','a'),'audi')])[1]"));
        firstAudi.click();
    }

    @After
    public static void tearDown(){
        driver.quit();
    }

}