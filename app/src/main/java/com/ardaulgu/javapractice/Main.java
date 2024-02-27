package com.ardaulgu.javapractice;

public class Main {

    public static void main(String[] args) {

        //Variables

        //Integer - Long

        int age = 20;
        System.out.println(10*age);
        System.out.println(age/5);

        int x = 5;
        int y = 10;
        System.out.println(y/x);

        long myLong = 10;
        System.out.println(myLong/5);

        //Double - Float

        double z = 5.0;
        double a = 11.0;
        System.out.println(a/z);

        float myFloat = 10.0f;

        double pi =3.14;
        int r = 5;
        System.out.println(2*pi*r);

        // String

        String name = "Darth";
        String surname = "Vader";
        System.out.println(name);
        System.out.println(surname);

        String fullname = name + " " + surname;
        System.out.println(fullname);

        // Boolean

        boolean isAlive = true;
        isAlive = false;
        System.out.println(isAlive);

        // Final - deger sabit kalsın istiyorsak basina "final"

        final int myInteger = 5;
        System.out.println("myInteger: " + myInteger);
        /* myInteger = 4;
        System.out.println("myInteger: " + myInteger); */









    }

}
