package day2;

import com.github.javafaker.Faker;

import java.util.Locale;

public class DataGen {

    public static void main(String[] args) {
        Faker facker= new Faker(new Locale("en-IND"));
        String fn = facker.name().fullName();
        System.out.println(fn);
    }
}
