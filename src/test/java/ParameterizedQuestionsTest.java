import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.MainPage;
import java.time.Duration;
import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.assertTrue;

@RunWith(Parameterized.class)
public class ParameterizedQuestionsTest {

    private WebDriver driver;
    private MainPage mainPage;

    private By questionLocator;
    private By answerLocator;


    public ParameterizedQuestionsTest(By questionLocator, By answerLocator) {
        this.questionLocator = questionLocator;
        this.answerLocator = answerLocator;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {MainPage.getPriceQuestion(), MainPage.getPriceAnswer()},
                {MainPage.getSeveralScootersQuestion(), MainPage.getSeveralScootersAnswer()},
                {MainPage.getHowIsRentalPeriodCalculatedQuestion(), MainPage.getHowIsRentalPeriodCalculatedAnswer()}, // исправлено!
                {MainPage.getPossibleToOrderTodayQuestion(), MainPage.getPossibleToOrderTodayAnswer()},
                {MainPage.getExtendOrReturnOrderQuestion(), MainPage.getExtendOrReturnOrderAnswer()},
                {MainPage.getChargerForScooterQuestion(), MainPage.getChargerForScooterAnswer()},
                {MainPage.getCancelOrderQuestion(), MainPage.getCancelOrderAnswer()},
                {MainPage.getBringMeScooterQuestion(), MainPage.getBringMeScooterAnswer()}
        });
    }

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        mainPage = new MainPage(driver);
        mainPage.openPage();
    }

    @Test
    public void testQuestionDropdown() {
        mainPage.scrollToElement(questionLocator);
        mainPage.clickOnElement(questionLocator);
        assertTrue(mainPage.isElementDisplayed(answerLocator));
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
