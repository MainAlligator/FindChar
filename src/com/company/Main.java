package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите любую букву: ");

        String s = scanner.nextLine();
        String upS = s.toUpperCase();

        char bukva = upS.charAt(0);


        if (bukva >= 0x0410 && bukva <= 0x044F || bukva == 0x0401) {
            System.out.println("Эта буква");
        } else {
            System.out.println("Ошибка ввода!");
            return;// закрывает программу
        }
        if (bukva == 'А' || bukva == 'У' || bukva ==  'Е'|| bukva == 'Ы' ||bukva == 'О'|| bukva == 'Э'|| bukva == 'Я' ||bukva == 'И' ||bukva == 'Ю' || bukva == 0x0401 ){
            System.out.println("Гласная!");
        } else {
            System.out.println(" Согласная !");
        }
    }
}
