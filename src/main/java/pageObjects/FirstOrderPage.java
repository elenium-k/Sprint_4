package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertEquals;

public class FirstOrderPage {

    private final By nameField = By.cssSelector("[placeholder='* Имя']");
    private final By surnameField = By.cssSelector("[placeholder='* Фамилия']");
    private final By addressField = By.cssSelector("[placeholder='* Адрес: куда привезти заказ']");
    private final By metroField = By.cssSelector("[placeholder='* Станция метро']");
    private final By stationTropareva = By.xpath("//*[contains(text(), 'Тропарёво')]");
    private final By phoneField = By.cssSelector("[placeholder='* Телефон: на него позвонит курьер']");
    private final By cookiesButton = By.cssSelector("[class='App_CookieButton__3cvqF']");
    private final By nextButton = By.xpath("//*[contains(text(), 'Далее')]");




    private WebDriver driver;

    public FirstOrderPage (WebDriver driver) {
        this.driver = driver;
    }

    public boolean isOrderContentDisplayed() {
        driver.findElement(By.cssSelector("[class='Order_Content__bmtHS']")).isDisplayed();
        return true;
    }

    public void clickOnNameField () {
        driver.findElement(nameField).click();

    }

    public void typeInName (String name) {
        driver.findElement(nameField).sendKeys(name);
    }

    public void clickOnSurnameField () {
        driver.findElement(surnameField).click();
    }

    public void typeInSurname (String surname) {
        driver.findElement(surnameField).sendKeys(surname);
    }

    public void clickOnAddressField() {
        driver.findElement(addressField).click();
    }

    public void typeInAddress(String address) {
        driver.findElement(addressField).sendKeys(address);
    }

    public void clickOnMetroStationField() {
        driver.findElement(metroField).click();
    }

    public void scrollMetroStations() {
        WebElement element1 = driver.findElement(stationTropareva);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",element1);
    }

    public void clickOnMetroStation() {
        driver.findElement(stationTropareva).click();
    }

    public void clickOnPhoneField() {
        driver.findElement(phoneField).click();
    }

    public void typeInPhone(String phone) {
        driver.findElement(phoneField).sendKeys(phone);
    }

    public void clickOnCookiesButton() {
        driver.findElement(cookiesButton).click();
    }

    public SecondOrderPage clickOnNextButton() {
        driver.findElement(nextButton).click(); // кликнуть кнопку далее
        return new SecondOrderPage(driver);
    }

}
