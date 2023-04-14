package TestCases;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.An;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
    protected WebDriver webDriver;
    static String loginPageUrl= "https://www.trendyol.com/";
    static String email = "ornek@gmail.com";
    static String password = "123456";

    @Given("Trendyol sayfasina gidilir")
    public void tyPage(){
        System.setProperty("webdriver.chrome.driver", "src/test/java/Drivers/chromedriver.exe");
        webDriver= new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get(loginPageUrl);
    }
    @When("Cikan pop-up'dan kadin secilir")
    public void genderSelect(){
        webDriver.findElement(By.className("homepage-popup-gender")).click();
    }
    @And("Giris yap ikonuna tiklanir")
    public void loginIcon(){
        webDriver.findElement(By.className("link-text")).click();
    }
    @And("E-posta ve sifre girilir")
    public void emailAndPassword(){
        webDriver.findElement(By.id("login-email")).sendKeys(email);
        webDriver.findElement(By.id("login-password-input")).sendKeys(password);
    }
    @Then("Giris yap butonuna tiklanir")
    public void loginClick(){
        webDriver.findElement(By.cssSelector("button[type=submit]")).click();
    }
}
