package pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertTrue;


public class MainPage {

    private final By upperOrderButton = By.cssSelector("[class='Button_Button__ra12g']");
    private final By lowerOrderButton = By.cssSelector("[class='Button_Button__ra12g Button_Middle__1CSJM']");
    private final By questionsButton1 = By.cssSelector("[id='accordion__heading-0']");
    private final By questionsText1 = By.xpath("//p[contains(text(), 'Сутки — 400 рублей. Оплата курьеру — наличными или картой.')]");
    private final By questionsButton2 = By.cssSelector("[id='accordion__heading-0']");
    private final By questionsText2 = By.xpath("//p[contains(text(), 'Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.')]");
    private final By questionsButton3 = By.cssSelector("[id='accordion__heading-2']");
    private final By questionsText3 = By.xpath("//p[contains(text(), 'Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.')]");
    private final By questionsButton4 = By.cssSelector("[id='accordion__heading-3']");
    private final By questionsText4 = By.xpath("//p[contains(text(), 'Только начиная с завтрашнего дня. Но скоро станем расторопнее.')]");
    private final By questionsButton5 = By.cssSelector("[id='accordion__heading-4']");
    private final By questionsText5 = By.xpath("//p[contains(text(), 'Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.')]");
    private final By questionsButton6 = By.cssSelector("[id='accordion__heading-5']");
    private final By questionsText6 = By.xpath("//p[contains(text(), 'Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.')]");
    private final By questionsButton7 = By.cssSelector("[id='accordion__heading-6']");
    private final By questionsText7 = By.xpath("//p[contains(text(), 'Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.')]");
    private final By questionsButton8 = By.cssSelector("[id='accordion__heading-7']");
    private final By questionsText8 = By.xpath("//p[contains(text(), 'Да, обязательно. Всем самокатов! И Москве, и Московской области.')]");





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


    public void scrollToQuestionsButton1() {
        WebElement element1 = driver.findElement(questionsButton1);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element1);
    }

    public void clickOnQuestionsButton1() {
        driver.findElement(questionsButton1).click();
    }

    public void questionsText1IsDisplayed() {
        driver.findElement(questionsText1).isDisplayed();
    }

    public void scrollToQuestionsButton2() {
        WebElement element2 = driver.findElement(questionsButton2);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element2);
    }

    public void clickOnQuestionsButton2() {
        driver.findElement(questionsButton2).click();
    }

    public void questionsText2IsDisplayed() {
        driver.findElement(questionsText2).isDisplayed();
    }

    public void scrollToQuestionsButton3() {
        WebElement element3 = driver.findElement(questionsButton3);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element3);
    }

    public void clickOnQuestionsButton3() {
        driver.findElement(questionsButton3).click();
    }

    public void questionsText3IsDisplayed() {
        driver.findElement(questionsText3).isDisplayed();
    }

    public void scrollToQuestionsButton4() {
        WebElement element4 = driver.findElement(questionsButton4);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element4);
    }

    public void clickOnQuestionsButton4() {
        driver.findElement(questionsButton4).click();
    }

    public void questionsText4IsDisplayed() {
        driver.findElement(questionsText4).isDisplayed();
    }

    public void scrollToQuestionsButton5() {
        WebElement element5 = driver.findElement(questionsButton5);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element5);
    }

    public void clickOnQuestionsButton5() {
        driver.findElement(questionsButton5).click();
    }

    public void questionsText5IsDisplayed() {
        driver.findElement(questionsText5).isDisplayed();
    }

    public void scrollToQuestionsButton6() {
        WebElement element6 = driver.findElement(questionsButton6);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element6);
    }

    public void clickOnQuestionsButton6() {
        driver.findElement(questionsButton6).click();
    }

    public void questionsText6IsDisplayed() {
        driver.findElement(questionsText6).isDisplayed();
    }

    public void scrollToQuestionsButton7() {
        WebElement element7 = driver.findElement(questionsButton7);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element7);
    }

    public void clickOnQuestionsButton7() {
        driver.findElement(questionsButton7).click();
    }

    public void questionsText7IsDisplayed() {
        driver.findElement(questionsText7).isDisplayed();
    }

    public void scrollToQuestionsButton8() {
        WebElement element8 = driver.findElement(questionsButton8);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element8);
    }

    public void clickOnQuestionsButton8() {
        driver.findElement(questionsButton8).click();
    }

    public void questionsText8IsDisplayed() {
        driver.findElement(questionsText8).isDisplayed();
    }

}
