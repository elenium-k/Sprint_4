import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.*;
import java.time.Duration;
import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.assertTrue;

@RunWith(Parameterized.class)
public class ParametrizedOrderTests {

    private WebDriver driver;
    private String name;
    private String surname;
    private String address;
    private String phone;


    public ParametrizedOrderTests(String name, String surname, String address, String phone) {
            this.name = name;
            this.surname = surname;
            this.address = address;
            this.phone = phone;
        }

        @Parameterized.Parameters
        public static Collection<Object[]> data() {
            return Arrays.asList(new Object[][] {
                    {"Елена", "Куксова", "ул. Победы, 3", "+79991234567"},
                    {"Иван", "Иванов", "пр. Мира, 15", "+79997654321"},
            });
        }


        @Before
        public void setUp() {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        }

        @Test
        public void OrderSuccessTest() {

            MainPage mainPage = new MainPage(driver);
            mainPage.openPage();
            mainPage.scrollToLowerOrderButton();
            FirstOrderPage firstOrderPage = mainPage.clickOnLowerOrderButton();
            assertTrue(firstOrderPage.isOrderContentDisplayed());

            firstOrderPage.clickOnNameField();
            firstOrderPage.typeInName(name);
            firstOrderPage.clickOnSurnameField();
            firstOrderPage.typeInSurname(surname);
            firstOrderPage.clickOnAddressField();
            firstOrderPage.typeInAddress(address);
            firstOrderPage.clickOnMetroStationField();
            firstOrderPage.scrollMetroStations();
            firstOrderPage.clickOnMetroStation();
            firstOrderPage.clickOnPhoneField();
            firstOrderPage.typeInPhone(phone);
            firstOrderPage.clickOnCookiesButton();
            SecondOrderPage secondOrderPage = firstOrderPage.clickOnNextButton();
            assertTrue(secondOrderPage.isSecondOrderPageDisplayed());

            secondOrderPage.clickOnDateField();
            secondOrderPage.selectDate();
            secondOrderPage.clickOnTimeField();
            secondOrderPage.chooseTime();

            PopupOrderWindow popupOrderWindow = secondOrderPage.clickOnLowerOrderButton();
            assertTrue(popupOrderWindow.isPopupOrderWindowDisplayed());
            PopupOrderSuccessWindow popupOrderSuccessWindow = popupOrderWindow.clickOnYesButton();
            assertTrue(popupOrderSuccessWindow.isPopupOrderSuccessWindowDisplayed());
        }


        @After
        public void tearDown() {
            driver.quit();
        }
    }
