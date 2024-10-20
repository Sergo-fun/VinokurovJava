package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Шаг 1: Ввод числа и проверка
        System.out.print("Enter the number: ");
        double number = scanner.nextDouble();
        if (number > 7) {
            System.out.println("Hello");
        }
        scanner.nextLine(); // Очистка буфера

        // Шаг 2: Ввод имени и проверка
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        if (name.equals("John")) {
            System.out.println("Hello, John");
        } else {
            System.out.println("There is no such name");
        }

        // Шаг 3: Ввод чисел для массива
        List<Integer> numbers = new ArrayList<>();
        System.out.println("Enter numbers (enter 'end' to finish)):");
        while (true) {
            String userInput = scanner.nextLine();
            if (userInput.equalsIgnoreCase("end")) {
                break;
            }
            try {
                numbers.add(Integer.parseInt(userInput));
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
            }
        }

        // Шаг 4: Вывод элементов массива, кратных 3
        System.out.println("Array elements that are multiples of 3:");
        for (int num : numbers) {
            if (num % 3 == 0) {
                System.out.println(num);
            }
        }

        scanner.close();
    }
}