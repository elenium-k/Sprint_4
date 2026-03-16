package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecondOrderPage {

    private final By orderHeader = By.cssSelector("[class='Order_Header__BZXOb']");
    private final By dateField = By.cssSelector("[class='react-datepicker__input-container']");
    private final By march27 = By.cssSelector("[aria-label='Choose пятница, 27-е марта 2026 г.']");
    private final By timeField = By.cssSelector("[class='Dropdown-placeholder']");
    private final By day = By.xpath("//*[contains(text(), 'сутки')]");
    private final By lowerOrderButton = By.cssSelector("[class='Button_Button__ra12g Button_Middle__1CSJM']");
    private final By orderWindow = By.xpath("//*[contains(text(), 'Хотите оформить заказ?')]");
    private final By upperOrderButton = By.cssSelector("[class='Button_Button__ra12g']");




    private WebDriver driver;

    public SecondOrderPage (WebDriver driver) {
        this.driver = driver;
    }

    public boolean isSecondOrderPageDisplayed() {
        driver.findElement(orderHeader).isDisplayed();
        return true;
    }

    public void clickOnDateField() {
        driver.findElement(dateField).click();
    }

    public void selectDate() {
        driver.findElement(march27).click();
    }

    public void clickOnTimeField() {
        driver.findElement(timeField).click();
    }

    public void chooseTime() {
        driver.findElement(day).click();
    }

    public PopupOrderWindow clickOnLowerOrderButton() {
        driver.findElement(lowerOrderButton).click();
        driver.findElement(orderWindow).isDisplayed();
        return new PopupOrderWindow(driver);
    }

}
