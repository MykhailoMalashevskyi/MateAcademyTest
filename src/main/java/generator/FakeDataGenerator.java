package generator;

import com.github.javafaker.Faker;

import java.util.Random;

public class FakeDataGenerator {
    private static final Faker FAKER = new Faker();
    private static final Random RANDOM = new Random();

    public static String getFirstName() {
        return FAKER.name().firstName();
    }

    public static String getLastName() {
        return FAKER.name().lastName();
    }

    public static String getNumber(Integer numberLength) {
        return FAKER.number().digits(numberLength);
    }

    public static String getSalary() {
        Integer passportNumberLength = 5;
        return getNumber(passportNumberLength);
    }

    public static String getEmail() {
        String provider = "@gmail.com";
        return FAKER.internet().safeEmailAddress()
                .split("@")[0]
                .concat(provider);
    }

    public static String getPassword(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int index = RANDOM.nextInt(characters.length());
            password.append(characters.charAt(index));
        }

        return password.toString();
    }

    public static <E extends Enum<E>> E getRandomResourse(Class<E> enumClass) {
        int randomIndex = RANDOM.nextInt(enumClass.getEnumConstants().length);
        return enumClass.getEnumConstants()[randomIndex];
    }

    public static String getComment() {
        return FAKER.expression("#{Name.first_name} #{Name.first_name} #{Name.last_name} #{Address.city}");
    }

    public static String getCompany() {
        return FAKER.company().name();
    }
}
