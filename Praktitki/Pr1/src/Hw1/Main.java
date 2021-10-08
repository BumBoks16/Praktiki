package Hw1;

import Hw1.Class.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Test Dog");
        Dog d1 = new Dog("Sharik", 5);
        Dog d2 = new Dog("Pups");
        d2.setAge(10);
        d1.setName("Tuzik");
        System.out.println(d1);
        System.out.println(d2);
        d1.intoHumanAge();
        d2.intoHumanAge();
        System.out.println();

        System.out.println("Test Ball");
        Ball b1 = new Ball("Football", "White", 5);
        Ball b2 = new Ball("Basketball", "Orange");
        Ball b3 = new Ball("White");
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println();

        System.out.println("Test Book");
        Book bk1 = new Book("The Catcher in the Rye", 450, "Jerome Salinger" );
        Book bk2 = new Book("Virus", 66);
        Book bk3 = new Book(55);
        System.out.println(bk1);
        System.out.println(bk2);
        System.out.println(bk3);
    }
}