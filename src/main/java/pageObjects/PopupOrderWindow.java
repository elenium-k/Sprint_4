package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PopupOrderWindow {

    private final By orderWindow = By.xpath("//*[contains(text(), 'Хотите оформить заказ?')]");
    private final By yesButton = By.xpath("//*[contains(text(), 'Да')]");
    private final By orderWindowSuccess = By.cssSelector("[class='Order_Form__17u6u']");
    private final By noButton = By.xpath("//*[contains(text(), 'Нет')]");

    private WebDriver driver;

    public PopupOrderWindow(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isPopupOrderWindowDisplayed() {
        driver.findElement(orderWindow).isDisplayed();
        return true;
    }

    public PopupOrderSuccessWindow clickOnYesButton() {
        driver.findElement(yesButton).click();
        driver.findElement(orderWindowSuccess).isDisplayed();
        return new PopupOrderSuccessWindow(driver);
    }

    public SecondOrderPage clickOnNoButton() {
        driver.findElement(noButton).click();
        driver.findElement(orderWindow).isDisplayed();
        return new SecondOrderPage(driver);
    }
}