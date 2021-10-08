import Author.Auth;

import Ball.Ball;
public class Main {

    public static void main(String[] args) {
        System.out.println("Test Author: ");
        Auth a1 = new Auth("Alexandr Pushkin", "ShootMeIfUcan@gmail.com", 'M');
        Auth a2 = new Auth("Joan Roaling", "JenyaRoll@yandex.ru", 'F');
        a1.setEmail("DontShootMePlease@yandex.com");
        System.out.println(a1);
        System.out.println(a2);
        System.out.println();

        System.out.println("Test Ball: ");
        Ball b1 = new Ball(163.114, 52.7);
        b1.setY(102.7);
        b1.move(-143.11, 40);
        System.out.println(b1);
    }
}