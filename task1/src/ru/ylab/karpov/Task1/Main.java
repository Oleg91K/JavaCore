package ru.ylab.karpov.Task1;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //Заполняем массив из 25 элементов радомными значения
        int[][] numbers = new int[5][5];
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                numbers[i][j] = random.nextInt(100);
            }
        }
        //Выводим двухмерныймассив на экран
        System.out.println("Двухмерный массив:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(numbers[i][j] + "\t");
            }
            System.out.println();
        }
        //Поиск макисмального значения в массиве
        int maxValue = numbers[0][0];
        for (int j = 0; j < numbers.length; j++) {
            for (int i = 0; i < numbers[j].length; i++) {
                if (numbers[j][i] > maxValue) {
                    maxValue = numbers[j][i];
                }
            }
        }
        System.out.println("Максимальное значение в двухмерном массиве: " + maxValue);

        //Поиск минимального значения в массиве
        int minValue = numbers[0][0];
        for (int j = 0; j < numbers.length; j++) {
            for (int i = 0; i < numbers[j].length; i++) {
                if (numbers[j][i] < minValue) {
                    minValue = numbers[j][i];
                }
            }
        }
        System.out.println("Минимальное значение в двухмерном массиве: " + minValue);

        //Поиск среднего арифметического значения в массиве
        int sum = 0;
        double average = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                sum +=  numbers[i][j];
            }
        }
        average = (double) sum / 25;
        System.out.println("Среднее арифметическое значение в двухмерном массиве:" + average);

        //Поиск среднего значения в массиве
        int averageElements = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                averageElements = (maxValue-minValue)/2 + minValue;
            }
        }
        System.out.println("Приближенное среднее значение из элементов в двухмерном массиве: " + averageElements);
    }
}







