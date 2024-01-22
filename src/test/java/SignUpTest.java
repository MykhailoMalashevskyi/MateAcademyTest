import dto.AddExpectationsModal;
import dto.AddExperienceModal;
import dto.AddRolesModal;
import enums.*;
import generator.FakeDataGenerator;
import io.qameta.allure.Step;
import org.testng.annotations.Test;
import playwrght.pages.HomePage;

import java.time.Year;

public class SignUpTest extends BaseTest{
    private final String password = FakeDataGenerator.getPassword(8);
    private final String email = FakeDataGenerator.getEmail();
    private final String comment = FakeDataGenerator.getComment();
    private final String firstName = FakeDataGenerator.getFirstName();
    private final String lastName = FakeDataGenerator.getLastName();

    private final AddExperienceModal experience = AddExperienceModal.builder()
            .company(FakeDataGenerator.getCompany())
            .month(FakeDataGenerator.getRandomResourse(Month.class))
            .year(Year.now().toString())
            .role(FakeDataGenerator.getRandomResourse(DesiredRoles.class))
            .build();

    private final AddRolesModal roles = AddRolesModal.builder()
            .position(FakeDataGenerator.getRandomResourse(Position.class))
            .role(FakeDataGenerator.getRandomResourse(DesiredRoles.class))
            .technologies(FakeDataGenerator.getRandomResourse(Technologies.class))
            .build();

    private final AddExpectationsModal expectations = AddExpectationsModal.builder()
            .salary(FakeDataGenerator.getSalary())
            .city(FakeDataGenerator.getRandomResourse(City.class))
            .english(FakeDataGenerator.getRandomResourse(EnglishLevel.class))
            .experience(FakeDataGenerator.getRandomResourse(Experience.class))
            .build();

    @Step("registration")
    @Test
    public void testSignUp() {
        HomePage homePage = new HomePage(page);

        homePage.open()
                .openSignUp()
                .createUser(email, password)
                .chooseProfile()
                .addRole(roles)
                .addExpectations(expectations)
                .addExperience(experience)
                .addBio(comment)
                .addContactInfo(firstName, lastName)
                .verifySignUpPassed();
    }
}