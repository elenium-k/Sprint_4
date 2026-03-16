package pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertTrue;


public class MainPage {

    private final By upperOrderButton = By.cssSelector("[class='Button_Button__ra12g']");
    private final By lowerOrderButton = By.cssSelector("[class='Button_Button__ra12g Button_Middle__1CSJM']");
    private final static By priceQuestion = By.cssSelector("[id='accordion__heading-0']");
    private final static By priceAnswer = By.xpath("//p[contains(text(), 'Сутки — 400 рублей. Оплата курьеру — наличными или картой.')]");
    private final static By severalScootersQuestion = By.cssSelector("[id='accordion__heading-1']");
    private final static By severalScootersAnswer = By.xpath("//p[contains(text(), 'Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.')]");
    private final static By howIsRentalPeriodCalculatedQuestion = By.cssSelector("[id='accordion__heading-2']");
    private final static By howIsRentalPeriodCalculatedAnswer = By.xpath("//p[contains(text(), 'Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.')]");
    private final static By possibleToOrderTodayQuestion = By.cssSelector("[id='accordion__heading-3']");
    private final static By possibleToOrderTodayAnswer = By.xpath("//p[contains(text(), 'Только начиная с завтрашнего дня. Но скоро станем расторопнее.')]");
    private final static By extendOrReturnOrderQuestion = By.cssSelector("[id='accordion__heading-4']");
    private final static By extendOrReturnOrderAnswer = By.xpath("//p[contains(text(), 'Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.')]");
    private final static By chargerForScooterQuestion = By.cssSelector("[id='accordion__heading-5']");
    private final static By chargerForScooterAnswer = By.xpath("//p[contains(text(), 'Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.')]");
    private final static By cancelOrderQuestion = By.cssSelector("[id='accordion__heading-6']");
    private final static By cancelOrderAnswer = By.xpath("//p[contains(text(), 'Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.')]");
    private final static By bringMeScooterQuestion = By.cssSelector("[id='accordion__heading-7']");
    private final static By bringMeScooterAnswer = By.xpath("//p[contains(text(), 'Да, обязательно. Всем самокатов! И Москве, и Московской области.')]");

    private WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openPage() {
        driver.get("https://qa-scooter.praktikum-services.ru/");
    }

    public FirstOrderPage clickOnUpperOrderButton() {
        driver.findElement(upperOrderButton).click();
        return new FirstOrderPage(driver);
    }

    public void scrollToLowerOrderButton() {
        WebElement element = driver.findElement(lowerOrderButton);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
    }

    public FirstOrderPage clickOnLowerOrderButton() {
        driver.findElement(lowerOrderButton).click();
        return new FirstOrderPage(driver);
    }


    public void scrollToElement(By locator) {
        WebElement element = driver.findElement(locator);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
    }

    public void clickOnElement(By locator) {
        driver.findElement(locator).click();
    }

    public boolean isElementDisplayed(By locator) {
        return driver.findElement(locator).isDisplayed();
    }

    public static By getPriceQuestion() { return priceQuestion; }
    public static By getPriceAnswer() { return priceAnswer; }

    public static By getSeveralScootersQuestion() { return severalScootersQuestion; }
    public static By getSeveralScootersAnswer() { return severalScootersAnswer; }

    public static By getHowIsRentalPeriodCalculatedQuestion() { return howIsRentalPeriodCalculatedQuestion; }
    public static By getHowIsRentalPeriodCalculatedAnswer() { return howIsRentalPeriodCalculatedAnswer; }

    public static By getPossibleToOrderTodayQuestion() { return possibleToOrderTodayQuestion; }
    public static By getPossibleToOrderTodayAnswer() { return possibleToOrderTodayAnswer; }

    public static By getExtendOrReturnOrderQuestion() { return extendOrReturnOrderQuestion; }
    public static By getExtendOrReturnOrderAnswer() { return extendOrReturnOrderAnswer; }

    public static By getChargerForScooterQuestion() { return chargerForScooterQuestion; }
    public static By getChargerForScooterAnswer() { return chargerForScooterAnswer; }

    public static By getCancelOrderQuestion() { return cancelOrderQuestion; }
    public static By getCancelOrderAnswer() { return cancelOrderAnswer; }

    public static By getBringMeScooterQuestion() { return bringMeScooterQuestion; }
    public static By getBringMeScooterAnswer() { return bringMeScooterAnswer; }

}