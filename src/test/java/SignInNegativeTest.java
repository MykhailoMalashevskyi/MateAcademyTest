import enums.invaliddata.SignInData;
import io.qameta.allure.Step;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import playwrght.pages.HomePage;

import java.util.stream.Stream;

public class SignInNegativeTest extends BaseTest{
    @DataProvider(name = "invalidValues")
    private static Object[][] provideInvalidValues() {
        return Stream.of(SignInData.values())
                .map(data -> new Object[] {
                        data.getEmail(), data.getPassword(), data.getMessage() })
                .toArray(Object[][]::new);
    }

    @Step("authentication")
    @Test(dataProvider = "invalidValues")
    public void testSignInNegative(String email, String password, String expectedResult) {
        HomePage homePage = new HomePage(page);

        homePage.open()
                .openSignIn()
                .authorizeUser(email, password)
                .verifySignInFailed(expectedResult);
    }
}
