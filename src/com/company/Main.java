package com.company;

public class Main {

    public static void main(String[] args) {
        task4();
    }

    public static int[] generateRandomArray () {
        java.util.Random random = new java.util.Random();
        int [] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr [i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {

        int[] expense = generateRandomArray();
        int sum = 0;
        for (int i = 0; i < expense.length; i++) {
            sum += expense[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
        System.out.println();
    }


    public static void task2() {

        int[] expense = generateRandomArray();
        int min = expense[0];
        int max = 0;

        for (int i = 0; i < expense.length; i++) {
            if (min > expense[i]) {
                min = expense[i];
            }

            if (max < expense[i]) {
                max = expense[i];
            }

        }
        System.out.println("Минимальная сумма трат за день составила " +min + " рублей. Максимальная сумма трат за день составила " + max + " рублей.");


    }

    public static void task3() {

        int[] expenses = generateRandomArray();
        int sum = 0;

        for (int expense : expenses) {
            sum += expense;
        }

        int average = sum / expenses.length;

        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей.");
    }

    public static void task4() {

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length -1 ; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
        System.out.println();
    }
}
