package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.NoSuchElementException;
import java.util.Random;
import java.util.stream.Collectors;

public class LoginPage {

    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public String getMail(){
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

    public WebDriver driver;
    @FindBy(name = "reg_name")
    private WebElement loginfield;

    @FindBy(id = "reg_email")
    private WebElement emailField;

    @FindBy(name = "reg_passwd")
    private WebElement passwordField;

    @FindBy(xpath = "//a[@class='create-survey']")
    private WebElement loginButton;

    @FindBy(id = "wizard")
    private String nextPage;

    @FindBy(id = "reg_email-error")
    private String emailError;

    public void inputLogin(String login){
        loginfield.sendKeys(login);
    }

    public void inputEmail(String email){
        emailField.clear();
        emailField.sendKeys(email);
    }

    public void inputPassword(String password){
        passwordField.sendKeys(password);
    }
    public void clickLoginButton(){
        loginButton.click();
    }

    public boolean isNextPage(){
        return existsElement(nextPage);
    }
    public boolean getEmailError(){
        return existsElement(emailError);
    }
}
