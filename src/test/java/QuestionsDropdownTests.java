import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.MainPage;
import java.time.Duration;
public class QuestionsDropdownTests {


    private WebDriver driver;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }


    @Test
    public void questionsDropdownTests() {

        MainPage mainPage = new MainPage(driver);
        mainPage.openPage();

        mainPage.scrollToQuestionsButton1();
        mainPage.clickOnQuestionsButton1();
        mainPage.questionsText1IsDisplayed();

        mainPage.scrollToQuestionsButton2();
        mainPage.clickOnQuestionsButton2();
        mainPage.questionsText2IsDisplayed();

        mainPage.scrollToQuestionsButton3();
        mainPage.clickOnQuestionsButton3();
        mainPage.questionsText3IsDisplayed();

        mainPage.scrollToQuestionsButton4();
        mainPage.clickOnQuestionsButton4();
        mainPage.questionsText4IsDisplayed();

        mainPage.scrollToQuestionsButton5();
        mainPage.clickOnQuestionsButton5();
        mainPage.questionsText5IsDisplayed();

        mainPage.scrollToQuestionsButton6();
        mainPage.clickOnQuestionsButton6();
        mainPage.questionsText6IsDisplayed();

        mainPage.scrollToQuestionsButton7();
        mainPage.clickOnQuestionsButton7();
        mainPage.questionsText7IsDisplayed();

        mainPage.scrollToQuestionsButton8();
        mainPage.clickOnQuestionsButton8();
        mainPage.questionsText8IsDisplayed();

    }

    @After
    public void tearDown() {
        driver.quit();
    }

}
