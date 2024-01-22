import io.qameta.allure.Step;
import org.testng.annotations.Test;
import playwrght.pages.HomePage;

public class SignInTest extends BaseTest{

    @Test
    @Step("authentication")
    public void testSignIn() {
        HomePage homePage = new HomePage(page);

        homePage.open()
                .openSignIn()
                .authorizeUser(testData.getEmail(), testData.getPassword())
                .verifyUserAuthorized();
    }
}
