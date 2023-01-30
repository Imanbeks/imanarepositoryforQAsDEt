package org.facebook.intro;

public class Faker {
    static com.github.javafaker.Faker faker = new com.github.javafaker.Faker();

    public static void main(String[] args) {
        System.out.println(genereteFakeName());
        System.out.println("Last name:" + genereteLastName());
        System.out.println("EMail addres: " + genereteMail());
        System.out.println("Chak:" + genereteFun());
    }

    public static String genereteFakeName(){
        return faker.name().firstName().toString();
    }

    public static String genereteLastName(){
        return faker.name().lastName();
    }
    public static String genereteMail(){
        return faker.internet().emailAddress();
    }
    public static String genereteFun(){
        return faker.chuckNorris().fact();
    }

    public static String generateFakeName() { return faker.name().firstName();}
}

