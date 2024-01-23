# MateAcademyTest ReadMe

## Project Description
This project is designed for the automation testing of web applications using a modern technology stack. It includes comprehensive tests for checking the functionality of user authorization and registration. The tests are divided into positive and negative scenarios, allowing for a thorough assessment of web application performance and security.

## Technology Stack
- **Programming Language:** Java
- **Build System:** Maven
- **Testing Libraries:**
  - TestNG: A framework for organizing tests
  - Playwright: For automating browser actions
  - AssertJ: Enhanced assertions for testing
  - Lombok: Code simplification with annotations
  - Allure: A framework for visualizing test results

## Project Structure
The project contains four main tests, divided into authorization and registration categories:
1. **Authorization:**
   - Positive authorization test (checks the ability to log in with valid data).
   - Negative authorization test (uses invalid data for login/password or their absence).

2. **Registration:**
   - Positive registration test (checks the ability to register with valid data).
   - Negative registration test (uses invalid data or their absence).

Additionally, the project includes a `.gitignore` file to exclude unnecessary files from the repository and a `regression.xml` file for configuring TestNG test runs.

## Installation and Setup
### Requirements:
- Java installed (version 8 and above)
- Maven installed

### Steps to Run Tests:
1. Clone the project repository to your local machine.
2. Open the terminal and navigate to the project directory.
3. Execute the command `mvn clean test` to run the tests.
4. To generate an Allure report after the tests have finished, use the command `mvn allure:serve`.

## Test Results
After running the tests, the results will be available in an Allure report.
