package ru.ylab.karpov.Task2;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {5,6,3,2,5,1,4,9};
        for (int arr:numbers){
            System.out.print(arr);
        }
        int count;
        do{
        count = 0;
        for (int i = 0; i < numbers.length-1; i++) {
            if(numbers[i]>numbers[i+1]){
                int temp = numbers[i];
                numbers[i] = numbers[i+1];
                numbers[i+1] = temp;
                count++;

            }
        }
    }while (count > 0);
        System.out.println();
            for (int arr2:numbers){
                System.out.print(arr2);
       }
    }
}
