package ru.netology.data;

import com.github.javafaker.Faker;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DataGenerator {
    private DataGenerator() {
    }

    public static String generateDate(int days) {
        return LocalDate.now().plusDays(days).format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
    }

    public static String generateCity() {
        return Cities.getRandomCity();
    }

    public static String generateName() {
        Faker faker = new Faker(new Locale("RU"));
        return faker.name().fullName();
    }

    public static String generatePhone() {
        Faker faker = new Faker(new Locale("RU"));
        return faker.phoneNumber().phoneNumber();
    }
}
