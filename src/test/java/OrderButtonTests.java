import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.*;
import java.time.Duration;
import static org.junit.Assert.assertTrue;


public class OrderButtonTests {

    private WebDriver driver;
    private MainPage mainPage;


        @Before
        public void setUp() {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        }

        @Test
        public void UpperOrderButtonTest() {

            MainPage mainPage = new MainPage(driver);
            mainPage.openPage();
            FirstOrderPage firstOrderPage = mainPage.clickOnUpperOrderButton();
            assertTrue(firstOrderPage.isOrderContentDisplayed());
        }

        @Test
        public void LowerOrderButtonTest() {

            MainPage mainPage = new MainPage(driver);
            mainPage.openPage();
            mainPage.scrollToLowerOrderButton();
            FirstOrderPage firstOrderPage = mainPage.clickOnLowerOrderButton();
            assertTrue(firstOrderPage.isOrderContentDisplayed());

        }


        @After
        public void tearDown() {
            driver.quit();
        }

    }

