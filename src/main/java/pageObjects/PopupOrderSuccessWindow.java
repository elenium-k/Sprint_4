package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PopupOrderSuccessWindow {

    private final By orderPlaced = By.xpath("//*[contains(text(), 'Заказ оформлен')]");


    private WebDriver driver;

    public PopupOrderSuccessWindow (WebDriver driver) {
        this.driver = driver;
    }

    public boolean isPopupOrderSuccessWindowDisplayed() {
        driver.findElement(orderPlaced).isDisplayed();
        return true;
    }

}
