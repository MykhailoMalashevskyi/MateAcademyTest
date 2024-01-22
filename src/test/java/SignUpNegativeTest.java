import enums.invaliddata.SignUpData;
import io.qameta.allure.Step;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import playwrght.pages.HomePage;

import java.util.stream.Stream;

public class SignUpNegativeTest extends BaseTest {

    @DataProvider(name = "invalidValues")
    public static Object[][] provideInvalidValues() {
        return Stream.of(SignUpData.values())
                .map(data -> new Object[]
                        {data.getEmail(), data.getPassword(), data.getMessage()})
                .toArray(Object[][]::new);
    }

    @Step("registration")
    @Test(dataProvider = "invalidValues")
    public void testSignUpNegative(String email, String password, String expectedResult) {
        HomePage homePage = new HomePage(page);

        homePage.open()
                .openSignUp()
                .createUser(email, password)
                .verifyActionFailed(expectedResult);
    }
}


