package ru.evant.learn_java_easy_way.chapter2_hilo;

// нужно угадать загаданное программой число от 1 до 100
// консольное приложение

import java.util.Scanner;

public class HiLo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String playAgain = "";

        int attempt = 1; // попытка

        do {
            int theNumber = (int) (Math.random() * 100 + 1);
            // генерация случайного числа от 1 до 100

            int guess = 0;

            while (guess != theNumber) {
                System.out.println("Угадайте число от 1 до 100:");
                guess = scanner.nextInt();
                if (guess < theNumber) {
                    System.out.println("Попытка № " + attempt + "\n" + guess + " меньше загаданного числа. Попробуйте еще раз.");
                    attempt++;
                } else if (guess > theNumber) {
                    System.out.println("Попытка № " + attempt + "\n" + guess + " больше загаданного числа. Попробуйте еще раз.");
                    attempt++;
                } else {
                    System.out.println("Вы угадали с " + attempt + " попытки\n" + guess + " правильно! ПОБЕДА!");
                }
            }

            System.out.println("Сыграем еще? (y/n)");
            playAgain = scanner.next();

        } while (playAgain.equalsIgnoreCase("y"));

        System.out.println("Спасибо за игру! Досвидания!");
        scanner.close();
    }
}
