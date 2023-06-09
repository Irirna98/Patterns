package ru.netology.data;
import com.github.javafaker.Faker;
import lombok.Value;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DataGenerator {

    private DataGenerator() {
    }

    private static final Faker faker = new Faker(new Locale("ru"));


    public static String generateDate(int shift) {
        return LocalDate.now().plusDays(4).format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
    }


    public static String generateCity() {
        return faker.address().cityName();
    }


    public static String generateName() {
        return faker.name().fullName();
    }

    public static String generatePhone() {
        return faker.number().digits(11);
    }

    public static class Registration {
        private Registration() {
        }

        public void UserInfo(String generateCity, String generateName, String generatePhone) {
        }
    }
    @Value
    public static class UserInfo {
        String city;
        String name;
        String phone;
    }
}