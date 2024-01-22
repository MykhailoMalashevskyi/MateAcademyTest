import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import dto.testData.UserDataModal;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import provider.ConfigProvider;

public abstract class BaseTest {
    protected static UserDataModal testData;
    protected Page page;

    @BeforeMethod
    public void setUp() {
        testData = ConfigProvider.TEST_DATA;

        Browser browser = Playwright
                .create()
                .chromium()
                .launch(new BrowserType.LaunchOptions().setHeadless(true));
        page = browser.newContext(new Browser.NewContextOptions()
                .setViewportSize(1600, 1024)).newPage();
    }

    @AfterMethod
    public void tearDown() {
        page.context().browser().close();
    }
}
