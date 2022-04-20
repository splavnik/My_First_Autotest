import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

    abstract public class BaseTest {

        public void setup() {
            WebDriverManager.chromedriver().setup();
            Configuration.browser = "chrome";
            Configuration.driverManagerEnabled = true;
            Configuration.browserSize = "1920x1080";
            Configuration.headless = false;
        }

        @BeforeTest
        public void init() {
            setup();
        }

        @AfterTest
        public void TearsDown() {
            Selenide.closeWebDriver();
        }
}
