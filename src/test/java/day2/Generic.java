package day2;

import com.github.javafaker.Faker;

import java.util.Locale;

public class Generic {


    public static String firstNme(){
        Faker facker= new Faker(new Locale("en-IND"));
        String fn = facker.name().firstName();
       return fn;
    }


    public static String genEmail(){
        Faker facker= new Faker(new Locale("en-IND"));
        String fn = facker.name().firstName();
        return fn+"@testmail.com";
    }
}
