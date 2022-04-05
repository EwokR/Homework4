package com.company;

public class Main {

    public static void main(String[] args) {
        // Задание №1
        {
            int i = 0;
            while (i < 11) {
                System.out.print(i + " ");
                i++;
            }
            System.out.println();
            for (int a = 10; a > 0; a--) {
                System.out.print(a + " ");
            }
        }
        // Задание №2
        {
        System.out.println();
        for (int friday = 1; friday < 32; friday = friday + 7) {
            System.out.println("Today is Friday," + friday + "th. Weekly report is needed.");
        }
            // Задание №3
            {
                System.out.println();
                for (int year = 0; year < 2100; year = year + 79) {
                    if (year > 1850) {
                        System.out.println(year);
                    }
                }
            }
        }
    }
}