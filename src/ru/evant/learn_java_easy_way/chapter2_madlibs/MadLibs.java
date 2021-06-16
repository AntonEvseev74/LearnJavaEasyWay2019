package ru.evant.learn_java_easy_way.chapter2_madlibs;

// стр 73
// Игра в чепуху

// The ... dragon ... at the ... knight, who rode in on a sturdy, giant ... .
// The green dragon fly at the stupid knight, who rode in on a sturdy, giant hours.
// ... дракон ... на ... рыцаря, который въехал на крепком, гигантском ... .
// Зеленый дракон налетел на глупого рыцаря, который въехал на крепком, гигантском коне.

import java.util.Scanner;

public class MadLibs {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String color;           // Цвет
        String pastTenseVerb;   // Глагол прошедшего Времени
        String adjective;       // Прилагательное
        String noun;            // Существительное

        System.out.print("Введиет цвет\\:");
        color = scan.nextLine();

        System.out.print("Введите глагол прошедшего Времени(Что сделал(на)? (положил на)\\:");
        pastTenseVerb = scan.nextLine();

        System.out.print("Введите прилагательное(Какого?)\\:");
        adjective = scan.nextLine();

        System.out.print("Введите существительное(На ком? На чём?)\\:");
        noun = scan.nextLine();

        /*
        System.out.print("The" + color + " dragon " + pastTenseVerb + " at the " + adjective);
        System.out.println(" knight, who rode in on a sturdy, giant " + noun + "+");
         */
        System.out.print(color + " дракон " + pastTenseVerb + " на " + adjective + " рыцаря,");
        System.out.println(" который въехал на крепком, гигантском " + noun + ".");
    }
}
