package playwrght.pages.profile;

import com.microsoft.playwright.Page;
import dto.AddExpectationsModal;
import dto.AddExperienceModal;
import dto.AddRolesModal;
import enums.*;
import playwrght.DropdownHelper;
import playwrght.locators.profile.ProfileLocators;
import playwrght.pages.BasePage;

public class ProfilePage extends BasePage {
    public ProfilePage(Page page) {
        super(page);
    }

    public ProfilePage addRole(AddRolesModal roles) {
        setPosition(roles.getPosition());
        setDesiredRoles(roles.getRole());
        setTechnicalSkills(roles.getTechnologies());
        acceptRoles();
        return this;
    }

    public ProfilePage addExpectations(AddExpectationsModal expectations) {
        setSalary(expectations.getSalary());
        setExperience(expectations.getExperience());
        setCity(expectations.getCity());
        setEnglish(expectations.getEnglish());
        acceptExpectations();
        return this;
    }

    public ProfilePage addExperience(AddExperienceModal experience) {
        addManually();
        addCompany(experience.getCompany());
        addMonth(experience.getMonth());
        addStartYear(experience.getYear());
        addDesiredRole(experience.getRole());
        acceptExperience();
        saveAndContinue();
        return this;
    }

    public ProfileContactsPage addBio(String comment) {
        page.fill(ProfileLocators.ACHIEVEMENTS_TEXTAREA_XPATH, comment);
        page.fill(ProfileLocators.WORK_EXPECTATIONS_TEXTAREA_XPATH, comment);
        page.click(ProfileLocators.SAVE_AND_CONTINUE);
        return new ProfileContactsPage(page);
    }

    public void setPosition(Position position) {
        page.fill(ProfileLocators.POSITION_FIELD_XPATH, position.getValue());
    }

    public void setDesiredRoles(DesiredRoles desiredRoles) {
        DropdownHelper.selectDropdown(page, ProfileLocators.PLUS_ICON_BTN_CSS, desiredRoles.getValue());
        page.click(ProfileLocators.MINUS_ICON_BTN_CSS);
    }

    public void setTechnicalSkills(Technologies technologies) {
        DropdownHelper.selectSearchDropdown(page,
                ProfileLocators.TECHNOLOGIES_DROPDOWN_XPATH, technologies.getJavaScript());
        DropdownHelper.selectSearchDropdown(page,
                ProfileLocators.TECHNOLOGIES_DROPDOWN_XPATH, technologies.getTypeScript());
        DropdownHelper.selectSearchDropdown(page,
                ProfileLocators.TECHNOLOGIES_DROPDOWN_XPATH, technologies.getDart());
        DropdownHelper.selectSearchDropdown(page,
                ProfileLocators.TECHNOLOGIES_DROPDOWN_XPATH, technologies.getSelenium());
        DropdownHelper.selectSearchDropdown(page,
                ProfileLocators.TECHNOLOGIES_DROPDOWN_XPATH, technologies.getMySql());
    }

    public void acceptRoles() {
        page.click(ProfileLocators.SAVE_BTN_XPATH);
    }

    public void setSalary(String salary) {
        page.locator(ProfileLocators.SALARY_FIELD_XPATH).pressSequentially(salary);
    }

    public void setExperience(Experience experience) {
        DropdownHelper.selectDropdown(page, ProfileLocators.JOB_EXPERIENCE_DROPDOWN_XPATH, experience.getValue());
    }

    public void setCity(City city) {
        DropdownHelper.selectByTextDropdown(page, ProfileLocators.CITY_DROPDOWN_XPATH, city.getValue());
    }

    public void setEnglish(EnglishLevel english) {
        DropdownHelper.selectDropdown(page, ProfileLocators.ENGLISH_LEVEL_DROPDOWN_XPATH, english.getValue());
    }

    public void acceptExpectations() {
        page.locator(ProfileLocators.SAVE_AND_CONTINUE).waitFor();
        page.click(ProfileLocators.SAVE_AND_CONTINUE_XPATH);
    }

    public void addManually() {
        page.click(ProfileLocators.ADD_MANUALLY_BTN_XPATH);
    }

    public void addCompany(String company) {
        page.fill(ProfileLocators.COMPANY_NAME_FIELD_XPATH, company);
    }

    public void addMonth(Month month) {
        DropdownHelper.selectDropdown(page, ProfileLocators.MONTH_DROPDOWN_XPATH, month.getValue());
    }

    public void addStartYear(String year) {
        page.fill(ProfileLocators.START_DATE_FIELD_XPATH, year);
    }

    public void addDesiredRole(DesiredRoles role) {
        page.fill(ProfileLocators.ROLE_FIELD_XPATH, role.getValue());
    }

    public void acceptExperience() {
        page.click(ProfileLocators.SAVE_EXPERIENCE_BTN_XPATH);
    }

    public void saveAndContinue() {
        page.click(ProfileLocators.SAVE_AND_CONTINUE);
    }
}
